package example

import grails.testing.web.UrlMappingsUnitTest
import spock.lang.Specification

/**
 * Index page rendering is verified via the functional Geb spec (DockerSpec).
 * This unit test confirms the application boots with the expected profile.
 */
class IndexPageSpec extends Specification implements UrlMappingsUnitTest<UrlMappings> {

    void "application is configured as web profile"() {
        expect:
        grailsApplication.config.getProperty('grails.profile') == 'web'
    }
}
