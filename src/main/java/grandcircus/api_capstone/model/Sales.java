package grandcircus.api_capstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sales {
	
	@JsonProperty("public")
	private Public publicSales;

	public Public getPublicSales() {
		return publicSales;
	}

	public void setPublicSales (Public publicSales) {
		this.publicSales = publicSales;
	}

	
	

}
