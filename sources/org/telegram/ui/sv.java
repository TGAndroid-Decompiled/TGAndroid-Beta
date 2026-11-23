package org.telegram.ui;

import android.view.View;
public final class sv {
    public final int f52139a;
    public final tv f52140b;
    public final View f52141c;

    public sv(tv tvVar, View view, int i7) {
        this.f52139a = i7;
        this.f52140b = tvVar;
        this.f52141c = view;
    }

    public final void a(boolean z10) {
        switch (this.f52139a) {
            case 0:
                View view = this.f52141c;
                if (view instanceof fi.p) {
                    this.f52140b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.me(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f52141c;
                if (view2 instanceof fi.p) {
                    this.f52140b.P0.F0.i((fi.p) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.me(22), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
