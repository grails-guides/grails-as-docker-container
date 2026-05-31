package example

import grails.plugin.geb.ContainerGebSpec
import grails.testing.mixin.integration.Integration

/**
 * Functional browser-level test using Geb with Testcontainers Selenium.
 * Verifies the welcome page renders correctly - the first thing a
 * user sees after building/pulling the Docker image.
 *
 * See https://grails.apache.org/docs/latest/guide/testing.html#functionalTesting
 * and https://groovy.apache.org/geb/manual/current/ for more details.
 */
@Integration
class DockerSpec extends ContainerGebSpec {

    void 'should display the correct title on the home page'() {
        when: 'visiting the home page'
            go('/')

        then: 'the page title is correct'
            title == 'Welcome to Grails'
    }
}
