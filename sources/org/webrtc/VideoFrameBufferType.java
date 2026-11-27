package org.webrtc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
public @interface VideoFrameBufferType {
    public static final int I010 = 5;
    public static final int I210 = 6;
    public static final int I410 = 7;
    public static final int I420 = 1;
    public static final int I420A = 2;
    public static final int I422 = 3;
    public static final int I444 = 4;
    public static final int NATIVE = 0;
    public static final int NV12 = 8;
}
