package pojo.searchChalet;

public class GetCityResponse{
    private int id;
    private String value;
    private int lookupTypeId;
    private int rank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLookupTypeId() {
        return lookupTypeId;
    }

    public void setLookupTypeId(int lookupTypeId) {
        this.lookupTypeId = lookupTypeId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
