package com.automate.cherrypick.service;

public class IncomeVerificationImpl implements IncomeVerification{
    @Override
    public boolean isEmployeeWorkingFromHome() {
        return false;
    }


    @Override
    public boolean isDoingMultipleJob() {
        return false;
    }
}
