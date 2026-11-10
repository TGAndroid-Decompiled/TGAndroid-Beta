package org.telegram.utils.twidget;

import android.graphics.Bitmap;
final class WidgetClientNative {
    public static native void arbiterCancel(long j3);

    public static native long arbiterCreate();

    public static native void arbiterDestroy(long j3);

    public static native int arbiterDown(long j3, double d, double d2, double d10, boolean z9, boolean z10, boolean z11, boolean z12, int i7);

    public static native double arbiterHoldDeadline(long j3);

    public static native int arbiterMove(long j3, double d, double d2, double d10);

    public static native int arbiterTick(long j3, double d);

    public static native int arbiterUp(long j3, double d, double d2, double d10);

    public static native void filterPixels(Bitmap bitmap, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr2, float f10);
}
