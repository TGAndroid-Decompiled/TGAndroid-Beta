package org.telegram.ui;

import android.graphics.Point;
public final class v81 extends w7.y5 {
    public final int f42681a;
    public final org.telegram.messenger.us f42682b;

    public v81(org.telegram.messenger.us usVar, int i10) {
        this.f42681a = i10;
        this.f42682b = usVar;
    }

    @Override
    public void a() {
        switch (this.f42681a) {
            case 1:
                ((be1) this.f42682b).f36236w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        boolean z10;
        switch (this.f42681a) {
            case 0:
                Point point = org.telegram.messenger.i0.f16026q;
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
                    ((m91) this.f42682b).f39603y0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
