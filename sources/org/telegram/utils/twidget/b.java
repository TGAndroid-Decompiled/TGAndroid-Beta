package org.telegram.utils.twidget;

import android.content.Context;
public abstract class b {
    public void a(long j, long j2, int i, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j, j2, i, bArr);
    }

    public abstract long b(Context context, String str, String str2, float f, float f2, int i, String str3, String str4, String str5, String str6, boolean z, WidgetSandboxBackend widgetSandboxBackend);

    public void c(long j, byte[] bArr) {
        WidgetSandboxNative.data(j, bArr);
    }

    public void d(long j) {
        WidgetSandboxNative.destroy(j);
    }

    public void e(long j, int i, float f, float f2, int i2) {
        WidgetSandboxNative.hover(j, i, f, f2, i2);
    }

    public void g(long j) {
        WidgetSandboxNative.repaint(j);
    }

    public void h(long j, byte[] bArr) {
        WidgetSandboxNative.safeArea(j, bArr);
    }

    public void i(long j, byte[] bArr) {
        WidgetSandboxNative.theme(j, bArr);
    }

    public void j(long j, float f, boolean z, boolean z2, boolean z3) {
        WidgetSandboxNative.tick(j, f, z, z2, z3);
    }

    public void k(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        WidgetSandboxNative.touch(j, i, f, f2, i2, z, z2, i3, i4);
    }

    public void l(long j, boolean z) {
        WidgetSandboxNative.visible(j, z);
    }

    public void m(long j, float f) {
        WidgetSandboxNative.width(j, f);
    }

    public void f(long j) {
    }
}
