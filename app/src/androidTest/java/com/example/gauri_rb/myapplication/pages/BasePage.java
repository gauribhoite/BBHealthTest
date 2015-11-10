package com.example.gauri_rb.myapplication.pages;

import com.example.gauri_rb.myapplication.steps.HelperSteps;

/**
 * Created by gauri_rb on 11/10/15.
 */

public class BasePage {

    protected static final String SCREENSHOT_TAG = "invalid-page";

    public <T extends BasePage> T is(Class<T> type) {
        if (type.isInstance(this)) {
            return type.cast(this);
        } else {
            //HelperSteps.takeScreenshot(SCREENSHOT_TAG);
            throw new InvalidPageException("Invalid page type. Expected: " + type.getSimpleName() + ", but got: " + this.getClass().getSimpleName());
        }
    }

    public static class InvalidPageException extends RuntimeException {

        public InvalidPageException(final String message) {
            super(message);
        }
    }
}

