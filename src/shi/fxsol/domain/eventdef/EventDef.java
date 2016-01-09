package shi.fxsol.domain.eventdef;


public class EventDef {
	
	private String country;
	private String name;
	private String definition;
	private String whyInvestorsCare;
	private String importance;
	private String interpretation;
	private String frequency;
	private String source;
	private String availability;
	private String coverage;
	private String revisions; 
	private String timeOfDay;
	
	public EventDef(
			String country,
			String name,
			String definition,
			String whyInvestorsCare,
			String importance,
			String interpretation,
			String frequency,
			String source,
			String availability,
			String coverage,
			String revisions,
			String timeOfDay){
		this.country = country;
		this.name = name;
		this.definition = definition;
		this.whyInvestorsCare = whyInvestorsCare;
		this.importance = importance;
		this.interpretation = interpretation;
		this.frequency = frequency;
		this.source = source;
		this.availability = availability;
		this.coverage = coverage;
		this.revisions = revisions;
		this.timeOfDay = timeOfDay;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getWhyInvestorsCare() {
		return whyInvestorsCare;
	}

	public void setWhyInvestorsCare(String whyInvestorsCare) {
		this.whyInvestorsCare = whyInvestorsCare;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getInterpretation() {
		return interpretation;
	}

	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getRevisions() {
		return revisions;
	}

	public void setRevisions(String revisions) {
		this.revisions = revisions;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	@Override
	public String toString() {
		return "EventDef [country=" + country + ", name=" + name
				+ ", definition=" + definition + ", whyInvestorsCare="
				+ whyInvestorsCare + ", importance=" + importance
				+ ", interpretation=" + interpretation + ", frequency="
				+ frequency + ", source=" + source + ", availability="
				+ availability + ", coverage=" + coverage + ", revisions="
				+ revisions + ", timeOfDay=" + timeOfDay + "]";
	}
	
}
