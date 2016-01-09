package shi.fxsol.domain.eventdef;

public enum EMU {
	european, monetary, union;
	public static String EMUname = "European Monetary Union";
	public static String None = "None is fucking none.";
	/*
	public static Event III_EC_Economic_Sentiment = new Event(
			EMUname, 
			"EC Economic Sentiment", 
			"Conducted by the European Commission, the index is a broad measure of both business and consumer sentiment. ", 
			"The survey offers key sentiment data across the European Union and the European Monetary Union. Data are available for each country and are aggregated for both the EMU and EU. It is conducted by the European Commission rather than Eurostat, the compiler of most other EMU data. The index is a broad measure of both business and consumer sentiment in the EU members. Because of its coverage of all the EU countries it is highly regarded in the financial markets as a good indicator of the mood of consumers and industry in each country. It is also normally a good indicator of quarterly GDP.\nConfidence indicators are calculated for industry, services, construction, retail trade and consumers. In turn, they are combined into an overall composite number, the economic sentiment indicator (ESI). The data are seasonally adjusted and defined as the difference (in percentage points of total answers) between positive and negative answers. The survey also covers other areas of the economy that are not explicitly included in the ESI. In particular, responses to questions about the inflation outlook are used by the ECB as one means of measuring inflationary expectations.", 
			None, 
			None, 
			"Monthly", 
			"European Commission", 
			"Last week of the month", 
			"Same month", 
			"Yes");
	
	public static Event III_ECB_Announcement = new Event(
			EMUname, 
			"ECB Announcement", 
			"The European Central Bank meets every six weeks to determine the appropriate stance of monetary policy.", 
			"The European Central Bank determines interest rate policy at their Governing Council meetings. The Council is composed of the six members of the Executive Council and 17 presidents of member central banks (Bank of France, Bundesbank, etc). The Governing Council meets now meets every six weeks. The European Central Bank has an established inflation ceiling of just less than 2 percent. The ECB's measure of inflation is the harmonized index of consumer prices (HICP). Each member of the Governing Council has one vote and decisions are reached by simple majority. In the event of a tie, the President has the casting vote. No minutes are released so how individual members voted is not known.\nAs in the United States, European market participants speculate about the possibility of an interest rate change at these meetings. If the outcome is different from expectations, the impact on European markets can be dramatic and far-reaching. The rate set by the ECB serves as a benchmark for all other interest rates in the Eurozone.\nThe level of interest rates affects the economy. Higher interest rates tend to slow economic activity; lower interest rates stimulate economic activity. Either way, interest rates influence the sales environment. In the consumer sector, few homes or cars will be purchased when interest rates rise. Furthermore, interest rate costs are a significant factor for many businesses, particularly for companies with high debt loads or who have to finance high inventory levels. This interest cost has a direct impact on corporate profits. The bottom line is that higher interest rates are bearish for the stock market, while lower interest rates are bullish.", 
			None, 
			None, 
			"Monthly", 
			"European Central Bank", 
			"Monthly", 
			None, 
			"Not applicable.");
	
	public static Event III_GDP_Flash = new Event(
			EMUname, 
			"GDP Flash", 
			"Gross domestic product (GDP) is the broadest measure of aggregate economic activity and encompasses every sector of the economy. This preliminary estimate is based on all the available information at the time but while this will include the majority of member states, it usually excludes some where local figures have yet to be compiled. ", 
			"GDP is the all-inclusive measure of economic activity. Investors need to closely track the economy because it usually dictates how investments will perform. Stock market Investors like to see healthy economic growth because robust business activity translates to higher corporate profits. The GDP report contains information which not only paints an image of the overall economy, but tells investors about important trends within the big picture. These data, which follow the international classification system (SNA93), are readily comparable to other industrialized countries. GDP components such as consumer spending, business and residential investment illuminate the economy's undercurrents, which can translate to investment opportunities and guidance in managing a portfolio.\nEach financial market reacts differently to GDP data because of their focus. For example, equity market participants cheer healthy economic growth because it improves the corporate profit outlook while weak growth generally means anemic earnings. Equities generally drop on disappointing growth and climb on good growth prospects. \nBond or fixed income markets are contrarians. They prefer weak growth so that there is less of a chance of higher central bank interest rates and inflation. When GDP growth is poor or negative it indicates anaemic or negative economic activity. Bond prices will rise and interest rates will fall. When growth is positive and good, interest rates will be higher and bond prices lower. Currency traders prefer healthy growth and higher interest rates. Both lead to increased demand for a local currency. However, inflationary pressures put pressure on a currency regardless of growth. ", 
			None, 
			None, 
			"Quarterly", 
			"Eurostat", 
			"Quarterly", 
			"Previous quarter", 
			"Yes");
	
	public static Event III_HICP_Flash = new Event(
			EMUname, 
			"HICP Flash", 
			"The harmonized index of consumer prices (HICP) is an internationally comparable measure of inflation calculated by each member of the European Union using a specific formula. Since January 1999, the European Central Bank has used the HICP as its target measure of inflation. The early, or flash, estimate based on incomplete data is released about two weeks before the detailed release. This contains only a limited breakdown but still provides some early insights into underlying developments. ", 
			"The measure of choice in the European Monetary Union (EMU) is the harmonized index of consumer prices which has been constructed to allow cross member state comparisons. An investor who understands how inflation influences the markets will benefit over those investors that do not understand the impact. In the European Monetary Union, where monetary policy decisions rest on the ECB's inflation target, the rate of inflation directly affects all interest rates charged to business and the consumer.\nInflation is an increase in the overall prices of goods and services. The relationship between inflation and interest rates is the key to understanding how indicators such as the CPI influence the markets - and your investments.\nInflation (along with various risks) basically explains how interest rates are set on everything from your mortgage and auto loans to Treasury bills, notes and bonds. As the rate of inflation changes and as expectations on inflation change, the markets adjust interest rates. The effect ripples across stocks, bonds, commodities, and your portfolio, often in a dramatic fashion.\nBy tracking inflation, whether high or low, rising or falling, investors can anticipate how different types of investments will perform. Over the long run, the bond market will rally (fall) when increases in the HICP are small (large). The equity market rallies with the bond market because low inflation promises low interest rates and is good for profits. ", 
			None, 
			None, 
			"Monthly", 
			"Eurostat", 
			"Around the turn of the month", 
			"If released late in the month, the same month. If released early in the month, the previous month. ", 
			"Any revision to the flash estimate is usually no greater than 0.1 percentage points.");
	
	public static Event III_Industrial_Production = new Event(
			EMUname, 
			"Industrial Production", 
			"This indicator measures the physical output of factories, mines and utilities for the 19 EMU members. The measure preferred by the ECB excludes construction which is released a few days later. ", 
			"Industrial production measures changes in the volume of output for the EMU's member states. The industrial production index provides a measure of the volume trend in value added at factor cost over a given reference period, excluding VAT and other similar deductible taxes. The preferred number is industrial production excluding construction. As with other EMU statistics, the data are provided by the national statistics offices to Eurostat (the European Union statistical agency) where it is combined to produce an overall output measure.\nInvestors want to keep their finger on the pulse of the economy because it usually dictates how various types of investments will perform. The stock market likes to see healthy economic growth because that translates to higher corporate profits. The bond market prefers more subdued growth that will not lead to inflationary pressures. By tracking economic data such as industrial production, investors will know what the economic backdrop is for these markets and their portfolios. ", 
			None, 
			None, 
			"Monthly", 
			"Eurostat", 
			"Normally released late in the second week of each month", 
			"Two months previous. Data for June are released in August.", 
			"Yes");
	
	public static Event III_PMI_Composite = new Event(
			EMUname, 
			"PMI Composite", 
			"The Eurozone Composite PMI is produced by Markit and is based on original survey data collected from a representative panel of around 5,000 manufacturing and services firms. National manufacturing data are included for Germany, France, Italy, Spain, the Netherlands, Austria, the Republic of Ireland and Greece. National services data are included for Germany, France, Italy, Spain and the Republic of Ireland.\nThe Eurozone Services PMI (Purchasing Managers' Index) is produced by Markit and is based on original survey data collected from a representative panel of around 2,000 private service sector firms. National data are included for Germany, France, Italy, Spain and the Republic of Ireland. These countries together account for an estimated 80% of Eurozone private sector services output.", 
			"Investors need to keep their fingers on the pulse of the economy because it dictates how various types of investments will perform. By tracking economic data such as the purchasing managers' manufacturing indexes, investors will know what the economic backdrop is for the various markets. The stock market likes to see healthy economic growth because that translates to higher corporate profits. The bond market prefers less rapid growth and is extremely sensitive to whether the economy is growing too quickly and causing potential inflationary pressures. ", 
			None, 
			None, 
			"Monthly", 
			"Markit",
			"The third working day of the following month.", 
			"The previous month.", 
			"Markit do not revise underlying survey data after first publication, but seasonal adjustment factors may be revised from time to time as appropriate which will affect the seasonally adjusted data series. Historical data relating to the underlying (unadjusted) numbers, first published seasonally adjusted series and subsequently revised data are available to subscribers from Markit. ");
	
	public static Event III_PMI_Composite_FLASH = new Event(
			EMUname, 
			"PMI Composite FLASH", 
			"The Eurozone PMI is produced by Markit and is based on original survey data collected from a representative panel of around 5,000 companies based in the euro area manufacturing and service sectors. National manufacturing data are included for Germany, France, Italy, Spain, the Netherlands, Austria, the Republic of Ireland and Greece. National services data are included for Germany, France, Italy, Spain and the Republic of Ireland. The flash estimate is typically based on approximately 85 percent to 90 percent of total PMI survey responses each month and is designed to provide an accurate advance indication of the final PMI data. ", 
			"Investors need to keep their fingers on the pulse of the economy because it dictates how various types of investments will perform. By tracking economic data such as the purchasing managers' manufacturing indexes, investors will know what the economic backdrop is for the various markets. The stock market likes to see healthy economic growth because that translates to higher corporate profits. The bond market prefers less rapid growth and is extremely sensitive to whether the economy is growing too quickly and causing potential inflationary pressures. ", 
			None, 
			None, 
			"Monthly", 
			"Markit", 
			"Second half of the month.", 
			"Current month", 
			"Markit do not revise underlying survey data after first publication, but seasonal adjustment factors may be revised from time to time as appropriate which will affect the seasonally adjusted data series. Historical data relating to the underlying (unadjusted) numbers, first published seasonally adjusted series and subsequently revised data are available to subscribers from Markit. ");
	*/		
}
