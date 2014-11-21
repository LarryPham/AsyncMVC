package com.techiedb.app.asyncmvc.activities;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.techiedb.app.asyncmvc.Properties;
import com.techiedb.app.asyncmvc.controllers.BaseController;

/**
 * Copyright (C) 2014 Techie Digital Benchwork Inc. All rights reserved.
 * Mobile UX Promotion Division.
 * This software and its documentation are confidential and proprietary
 * information of Techie Digital Benchwork Inc.  No part of the software and
 * documents may be copied, reproduced, transmitted, translated, or reduced to
 * any electronic medium or machine-readable form without the prior written
 * consent of Techie Digital Benchwork.
 * Techie Digital Benchwork makes no representations with respect to the contents,
 * and assumes no responsibility for any errors that might appear in the
 * software and documents. This publication and the contents hereof are subject
 * to change without notice.
 * History
 *
 * @author Larry Pham(larrypham.vn@gmail.com)
 * @since November.11.2014
 */
public abstract class BaseActivity extends FragmentActivity{
    protected static final String TAG = Properties.APP_TAG + BaseActivity.class.getSimpleName();

    protected BaseController mController = null;

    public void onResume(){

    }

    public void onDestroy(){

    }

    public abstract void invalidate();
    public abstract void invalidate(Object... params);

}
