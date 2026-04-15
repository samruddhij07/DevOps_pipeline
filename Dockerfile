FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copy the entire lib folder (this includes your JAR and dependencies)
COPY lib/ lib/

# Run the app
# Path is lib/office_mngt.jar because that is where it sits now
ENTRYPOINT ["java", "-cp", "lib/office_mngt.jar:lib/*", "OfficeManager"]