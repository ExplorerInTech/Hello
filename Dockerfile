FROM open-liberty as server-setup
COPY --chown=1001:0  /target/testservice.war /config/dropins/
EXPOSE 9080 9443