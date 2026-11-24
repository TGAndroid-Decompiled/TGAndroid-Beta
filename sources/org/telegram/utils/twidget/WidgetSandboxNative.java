package org.telegram.utils.twidget;
final class WidgetSandboxNative {
    private static final boolean LOADED = load();

    private WidgetSandboxNative() {
    }

    public static native void answerRequest(long j, long j2, int i, byte[] bArr);

    public static native void attackScan(boolean z);

    public static boolean available() {
        return LOADED;
    }

    public static native void conformance(boolean z);

    public static native long create(byte[] bArr, byte[] bArr2, byte[] bArr3, float f, float f2, int i, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, boolean z, Object obj);

    public static native void data(long j, byte[] bArr);

    public static native void destroy(long j);

    public static native void hover(long j, int i, float f, float f2, int i2);

    public static native void limits(byte[] bArr);

    private static boolean load() {
        try {
            System.loadLibrary("twidget");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static native void prepare(byte[] bArr, boolean z);

    public static native void registerResources(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6);

    public static native void repaint(long j);

    public static native int reserveThreads(int i);

    public static native void safeArea(long j, byte[] bArr);

    public static native void theme(long j, byte[] bArr);

    public static native void tick(long j, float f, boolean z, boolean z2, boolean z3);

    public static native void touch(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4);

    public static native void visible(long j, boolean z);

    public static native void width(long j, float f);
}
