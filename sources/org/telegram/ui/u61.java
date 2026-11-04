package org.telegram.ui;

import android.graphics.Point;
public final class u61 extends b8.jf {
    public final int f49994a;
    public final org.telegram.messenger.cs f49995b;

    public u61(org.telegram.messenger.cs csVar, int i3) {
        this.f49994a = i3;
        this.f49995b = csVar;
    }

    @Override
    public void a() {
        switch (this.f49994a) {
            case 1:
                ((zb1) this.f49995b).f52645w.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void b(int i3, int i10) {
        boolean z10;
        switch (this.f49994a) {
            case 0:
                Point point = org.telegram.messenger.g0.f22608q;
                boolean z11 = false;
                if (point.x <= point.y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i3 <= i10) {
                    z11 = true;
                }
                if (z10 == z11) {
                    ((l71) this.f49995b).f47210z0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
