package org.telegram.ui;

import android.graphics.Point;
public final class t81 extends w7.y5 {
    public final int f41584a;
    public final org.telegram.messenger.vs f41585b;

    public t81(org.telegram.messenger.vs vsVar, int i10) {
        this.f41584a = i10;
        this.f41585b = vsVar;
    }

    @Override
    public void a() {
        switch (this.f41584a) {
            case 1:
                ((zd1) this.f41585b).f43975w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f41584a) {
            case 0:
                Point point = org.telegram.messenger.i0.f16172q;
                boolean z11 = false;
                if (point.x <= point.y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 <= i11) {
                    z11 = true;
                }
                if (z10 == z11) {
                    ((k91) this.f41585b).f38778y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
