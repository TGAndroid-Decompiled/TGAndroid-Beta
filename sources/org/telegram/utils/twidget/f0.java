package org.telegram.utils.twidget;
public final class f0 {
    public long f54726a;

    public final void a() {
        long j3 = this.f54726a;
        if (j3 != 0) {
            WidgetClientNative.arbiterCancel(j3);
        }
    }

    public final int b(double d, double d2, double d10, boolean z10, boolean z11, boolean z12, boolean z13, int i7) {
        if (this.f54726a == 0) {
            this.f54726a = WidgetClientNative.arbiterCreate();
        }
        return WidgetClientNative.arbiterDown(this.f54726a, d, d2, d10, z10, z11, z12, z13, i7);
    }

    public final double c() {
        long j3 = this.f54726a;
        if (j3 == 0) {
            return -1.0d;
        }
        return WidgetClientNative.arbiterHoldDeadline(j3);
    }

    public final int d(double d, double d2, double d10) {
        long j3 = this.f54726a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterMove(j3, d, d2, d10);
    }

    public final void e() {
        long j3 = this.f54726a;
        if (j3 == 0) {
            return;
        }
        WidgetClientNative.arbiterDestroy(j3);
        this.f54726a = 0L;
    }

    public final int f(double d) {
        long j3 = this.f54726a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterTick(j3, d);
    }

    public final int g(double d, double d2, double d10) {
        long j3 = this.f54726a;
        if (j3 == 0) {
            return -1;
        }
        return WidgetClientNative.arbiterUp(j3, d, d2, d10);
    }
}
