package org.telegram.ui;

import android.view.ViewGroup;
public final class x11 extends w7.d6 {
    public final int f43424a;
    public final ViewGroup f43425b;

    public x11(ViewGroup viewGroup, int i10) {
        this.f43424a = i10;
        this.f43425b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f43424a) {
            case 0:
                ((i31) this.f43425b).f38165x1 = false;
                return;
            case 1:
                ((qh.g0) this.f43425b).f45726w = false;
                return;
            default:
                ((vh.b1) this.f43425b).f50941i3 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f43424a) {
            case 0:
                ((i31) this.f43425b).f38165x1 = true;
                return;
            case 1:
            default:
                return;
            case 2:
                ((vh.b1) this.f43425b).f50941i3 = true;
                return;
        }
    }
}
