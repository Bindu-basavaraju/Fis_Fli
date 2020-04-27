package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

    public class Retry implements IRetryAnalyzer {
        private int minretryCount = 0;

        public Retry() {
        }

        public boolean retry(ITestResult result) {
            int maxretryCount = 3;
            if (this.minretryCount <= maxretryCount) {
                System.out.println("Following tests is failed ==== " + result.getName());
                System.out.println("Retry the tests " + result.getName() + " === " + (this.minretryCount + 1));
                ++this.minretryCount;
                return true;
            } else {
                return false;
            }
        }
    }


