package com.automate.cherrypick.service;

public interface IncomeVerification {

    boolean isEmployeeWorkingFromHome();

    /** This method is to check if employee holds
    multiple W2**/

    boolean isDoingMultipleJob();

}
