package grandcircus.api_capstone.model;

public class EventsTm {

	private String name;
	private String id;
	private String url;
    private Sales sales;
	private String info;
//	private Prices priceRanges; to add later
//	private Classifications classifications; to add later

	public EventsTm() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "EventsTm [name=" + name + ", id=" + id + ", url=" + url + ", info=" + info + "]";
	}
	
}
