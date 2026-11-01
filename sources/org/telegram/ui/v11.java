package org.telegram.ui;

import android.view.ViewGroup;
public final class v11 extends w7.d6 {
    public final int f42385a;
    public final ViewGroup f42386b;

    public v11(ViewGroup viewGroup, int i10) {
        this.f42385a = i10;
        this.f42386b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f42385a) {
            case 0:
                ((g31) this.f42386b).f37341x1 = false;
                return;
            case 1:
                ((qh.g0) this.f42386b).f45737w = false;
                return;
            default:
                ((vh.c1) this.f42386b).f51036i3 = false;
                return;
        }
    }

    @Override
    public void b() {
        switch (this.f42385a) {
            case 0:
                ((g31) this.f42386b).f37341x1 = true;
                return;
            case 1:
            default:
                return;
            case 2:
                ((vh.c1) this.f42386b).f51036i3 = true;
                return;
        }
    }
}
