package org.telegram.utils.twidget;

import android.graphics.Bitmap;
final class WidgetSandboxNative {
    private WidgetSandboxNative() {
    }

    public static native void answerRequest(long j3, long j10, int i7, byte[] bArr);

    public static native void arbiterCancel(long j3);

    public static native long arbiterCreate();

    public static native void arbiterDestroy(long j3);

    public static native int arbiterDown(long j3, double d, double d2, double d10, boolean z9, boolean z10, boolean z11, boolean z12, int i7);

    public static native double arbiterHoldDeadline(long j3);

    public static native int arbiterMove(long j3, double d, double d2, double d10);

    public static native int arbiterTick(long j3, double d);

    public static native int arbiterUp(long j3, double d, double d2, double d10);

    public static native void attackScan(boolean z9);

    public static native void conformance(boolean z9);

    public static native long create(byte[] bArr, byte[] bArr2, byte[] bArr3, float f10, float f11, int i7, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, boolean z9, WidgetSandboxBackend widgetSandboxBackend);

    public static native void data(long j3, byte[] bArr);

    public static native void destroy(long j3);

    public static native void filterPixels(Bitmap bitmap, byte[] bArr, float f10);

    public static native void hover(long j3, int i7, float f10, float f11, int i10);

    public static native void limits(byte[] bArr);

    public static native void repaint(long j3);

    public static native void safeArea(long j3, byte[] bArr);

    public static native void theme(long j3, byte[] bArr);

    public static native void tick(long j3, float f10, boolean z9, boolean z10, boolean z11);

    public static native void touch(long j3, int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12);

    public static native void visible(long j3, boolean z9);

    public static native void width(long j3, float f10);
}
