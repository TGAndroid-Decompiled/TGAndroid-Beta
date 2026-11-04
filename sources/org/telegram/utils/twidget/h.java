package org.telegram.utils.twidget;
public final class h {
    public long f52863a;

    public final void a() {
        long j10 = this.f52863a;
        if (j10 != 0) {
            WidgetSandboxNative.arbiterCancel(j10);
        }
    }

    public final int b(double d, double d10, double d11, boolean z10, boolean z11, boolean z12, boolean z13, int i3) {
        if (this.f52863a == 0) {
            this.f52863a = WidgetSandboxNative.arbiterCreate();
        }
        return WidgetSandboxNative.arbiterDown(this.f52863a, d, d10, d11, z10, z11, z12, z13, i3);
    }

    public final double c() {
        long j10 = this.f52863a;
        if (j10 == 0) {
            return -1.0d;
        }
        return WidgetSandboxNative.arbiterHoldDeadline(j10);
    }

    public final int d(double d, double d10, double d11) {
        long j10 = this.f52863a;
        if (j10 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterMove(j10, d, d10, d11);
    }

    public final void e() {
        long j10 = this.f52863a;
        if (j10 == 0) {
            return;
        }
        WidgetSandboxNative.arbiterDestroy(j10);
        this.f52863a = 0L;
    }

    public final int f(double d) {
        long j10 = this.f52863a;
        if (j10 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterTick(j10, d);
    }

    public final int g(double d, double d10, double d11) {
        long j10 = this.f52863a;
        if (j10 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterUp(j10, d, d10, d11);
    }
}
