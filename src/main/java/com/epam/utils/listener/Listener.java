package com.epam.utils.listener;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    private static Logger LOG = Logger.getLogger(Listener.class.getName());

    @Override
    public void onTestStart(ITestResult iTestResult) {
        LOG.info("Teststarted running:" + iTestResult.getMethod().getMethodName()
                + " at:" + iTestResult.getStartMillis());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        LOG.info("Result success" + iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        LOG.warn(String.format("Test : %s , Method : %s failed in", iTestResult.getName(), iTestResult.getMethod()));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        LOG.info(String.format("Test : %s , Method : %s was skipped ", iTestResult.getName(), iTestResult.getMethod()));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        LOG.warn(String.format("Test : %s , Method : %s failed  within success precentage: %s  ",
                iTestResult.getName(), iTestResult.getMethod(), iTestResult.getTestContext().getFailedButWithinSuccessPercentageTests().getAllResults().toString()));
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        LOG.info(String.format("Starting tests : %s, Output directory : %s, Test Suite : %s",
                iTestContext.getName(), iTestContext.getOutputDirectory(), iTestContext.getSuite()));
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        LOG.info(String.format("Finish tests : %s, Output directory : %s, Test Suite : %s",
                iTestContext.getName(), iTestContext.getOutputDirectory(), iTestContext.getSuite()));
    }
}
