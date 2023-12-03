package pojo.searchChalet;

import java.util.ArrayList;

public class SearchCriterion{
    private int lookupTypeId;
    private ArrayList<Integer> lookupId;

    public SearchCriterion(int lookupTypeId, ArrayList<Integer> lookupId) {
        this.lookupTypeId = lookupTypeId;
        this.lookupId = lookupId;
    }

    public void setLookupTypeId(int lookupTypeId) {
        this.lookupTypeId = lookupTypeId;
    }

    public void setLookupId(ArrayList<Integer> lookupId) {
        this.lookupId = lookupId;
    }

    public int getLookupTypeId() {
        return lookupTypeId;
    }

    public ArrayList<Integer> getLookupId() {
        return lookupId;
    }
}
