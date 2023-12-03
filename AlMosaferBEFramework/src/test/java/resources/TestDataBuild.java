package resources;

import pojo.searchChalet.SearchCriterion;
import pojo.searchChalet.SearchRequest;

import java.util.ArrayList;


public class TestDataBuild {

    public SearchRequest searchChaletRequest(int cityId , String checkInDate , String checkOutDate){

        int searchedCityId = cityId;
        String checkIn = checkInDate;
        String checkOut = checkOutDate;

        ArrayList<SearchCriterion> searchCriteria = new ArrayList<>();
        int lookupTypeId = 2;
        ArrayList<Integer> lookupId = new ArrayList<>();
        lookupId.add(searchedCityId);
        SearchCriterion additionalCriterion = new SearchCriterion(lookupTypeId, lookupId);
        searchCriteria.add(additionalCriterion);

        SearchRequest searchRequestData = new SearchRequest( searchCriteria , checkIn ,checkOut , "rank" , "DESC" , "dynamic" , 1 , 10);


        return searchRequestData;
    }
}
