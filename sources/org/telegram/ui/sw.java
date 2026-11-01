package org.telegram.ui;

import android.view.View;
public final class sw {
    public final int f41474a;
    public final tw f41475b;
    public final View f41476c;

    public sw(tw twVar, View view, int i10) {
        this.f41474a = i10;
        this.f41475b = twVar;
        this.f41476c = view;
    }

    public final void a(boolean z10) {
        switch (this.f41474a) {
            case 0:
                View view = this.f41476c;
                if (view instanceof th.l) {
                    this.f41475b.O0.E0.i((th.l) view, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(2), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f41476c;
                if (view2 instanceof th.l) {
                    this.f41475b.O0.E0.i((th.l) view2, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(2), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
