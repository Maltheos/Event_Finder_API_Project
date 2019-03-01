package grandcircus.api_capstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {

	@JsonProperty("_embedded")
	private Embedded embedded;
	private String keyword;

	public Embedded getEmbedded() {
		return embedded;
	}

	public void setEmbedded(Embedded embedded) {
		this.embedded = embedded;
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
