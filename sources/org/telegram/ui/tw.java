package org.telegram.ui;

import android.view.View;
public final class tw {
    public final int f41954a;
    public final uw f41955b;
    public final View f41956c;

    public tw(uw uwVar, View view, int i10) {
        this.f41954a = i10;
        this.f41955b = uwVar;
        this.f41956c = view;
    }

    public final void a(boolean z10) {
        switch (this.f41954a) {
            case 0:
                View view = this.f41956c;
                if (view instanceof th.l) {
                    this.f41955b.O0.E0.i((th.l) view, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(2), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f41956c;
                if (view2 instanceof th.l) {
                    this.f41955b.O0.E0.i((th.l) view2, false);
                    if (z10) {
                        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(2), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
