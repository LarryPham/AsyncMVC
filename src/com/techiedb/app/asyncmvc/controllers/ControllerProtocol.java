package com.techiedb.app.asyncmvc.controllers;

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
public class ControllerProtocol {
    public static final int FINISH_APPLICATION = 101;
    public static final int REQUEST_TO_UPDATE_VALUE = 102;
    public static final int REQUEST_TO_GET_DATA_RESULT = 103;
    public static final int REQUEST_TO_CLEAR_DATA= 104;

    public static final int REQUEST_TO_GET_DATA_RESULT_COMPLETED = 203;
    public static final int REQUEST_TO_STARTED_COMPLETED = 202;
    public static final int REQUEST_TO_CLEAR_DATA_COMPLETED = 204;
    public static final int REQUEST_TO_RETURN_DATA = 201;
}
