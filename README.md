# grails-docker-bootbuildimage

Sample app for the apache/grails-static-website guide [grails-docker-bootbuildimage/v8](https://grails.apache.org/guides/grails-docker-bootbuildimage/8/guide/index.html) (Grails 8 / Spring Boot 4 / Paketo Buildpacks).

The default branch (`grails8`) demonstrates two complementary paths to a production OCI image:

1. `./gradlew bootBuildImage` - Spring Boot 4's built-in Paketo wrapper. **Canonical / recommended.** No Dockerfile.
2. `docker build -f Dockerfile .` - hand-rolled multi-stage Dockerfile with non-root user. Alternative for teams that need explicit layer control.

A `compose.yml` orchestrates the resulting image plus a real PostgreSQL service so the production datasource wiring is exercised in development.

`initial/` is a vanilla Grails 8 starter from `https://prev-snapshot.grails.org` (web type, postgres + testcontainers + database-migration features). `complete/` is the same starter with all Docker-related customisations applied.

## Quick start

```bash
git clone -b grails8 https://github.com/grails-guides/grails-docker-bootbuildimage.git
cd grails-docker-bootbuildimage/complete
./gradlew bootBuildImage
docker compose up
# http://localhost:8080/actuator/health/readiness -> {"status":"UP"}
```

## Earlier Grails versions

Older `grails3`, `grails4`, and `grails5` branches are preserved on this repo for the corresponding versions of the [Grails as a Docker Container](https://grails.apache.org/guides/grails-as-docker-container/3/guide/index.html) guide.
