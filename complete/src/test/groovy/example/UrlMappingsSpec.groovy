package example

import grails.testing.web.UrlMappingsUnitTest
import spock.lang.Specification

/**
 * Unit-level verification that URL mappings resolve correctly.
 */
class UrlMappingsSpec extends Specification implements UrlMappingsUnitTest<UrlMappings> {

    void "index path '/' maps to the index view"() {
        expect:
        verifyUrlMapping('/', view: '/index')
    }
}
