package shi.fxsol.vo;


public class Event {
	
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
	
	public Event(
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
			String revisions){
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
	}
}
