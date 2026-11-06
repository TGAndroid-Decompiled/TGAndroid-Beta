package org.telegram.utils.twidget;
public final class h {
    public long f52796a;

    public final void a() {
        long j3 = this.f52796a;
        if (j3 != 0) {
            WidgetSandboxNative.arbiterCancel(j3);
        }
    }

    public final int b(double d, double d2, double d10, boolean z9, boolean z10, boolean z11, boolean z12, int i7) {
        if (this.f52796a == 0) {
            this.f52796a = WidgetSandboxNative.arbiterCreate();
        }
        return WidgetSandboxNative.arbiterDown(this.f52796a, d, d2, d10, z9, z10, z11, z12, i7);
    }

    public final double c() {
        long j3 = this.f52796a;
        if (j3 == 0) {
            return -1.0d;
        }
        return WidgetSandboxNative.arbiterHoldDeadline(j3);
    }

    public final int d(double d, double d2, double d10) {
        long j3 = this.f52796a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterMove(j3, d, d2, d10);
    }

    public final void e() {
        long j3 = this.f52796a;
        if (j3 == 0) {
            return;
        }
        WidgetSandboxNative.arbiterDestroy(j3);
        this.f52796a = 0L;
    }

    public final int f(double d) {
        long j3 = this.f52796a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterTick(j3, d);
    }

    public final int g(double d, double d2, double d10) {
        long j3 = this.f52796a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetSandboxNative.arbiterUp(j3, d, d2, d10);
    }
}
