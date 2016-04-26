package org.codingwater.service;

import org.codingwater.model.LagouJobInfo;

import java.util.List;

/**
 * Created by water on 4/14/16.
 */

public interface IJobSpiderService {

  List<LagouJobInfo> fetchJobInfosFromLagou(String city, String keyword,
      int pageNumber, String monthlySalary, String workYears);

  void fetchYesterdayDataFromLagou(String keyword);

  void multiThreadFetch(String keyword);


  String fetchWithCondition(String queryUrl);

  List<LagouJobInfo> getJobListFromJson(String resultData);

  void saveToDataBase(List<LagouJobInfo> filtedList);
}
