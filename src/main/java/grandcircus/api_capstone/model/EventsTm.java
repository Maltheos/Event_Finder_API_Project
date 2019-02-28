package grandcircus.api_capstone.model;

public class EventsTm {

	private String name;
//	private String id;
//	private String url;
    private Dates dates;
	private String info;
//	private Prices priceRanges; to add later
//	private Classifications classifcations; to add later
//	@JsonProperty("_embedded")
//	private Embedded embedded; to add later

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}

//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getUrl() {
//		return url;
//	}
//	public void setUrl(String url) {
//		this.url = url;
//	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
//	
//	@Override
//	public String toString() {
//		return "EventsTm [name=" + name + ", id=" + id + ", url=" + url + ", info=" + info + "]";
//	}
	
}
