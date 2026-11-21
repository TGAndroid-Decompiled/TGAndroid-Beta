package org.telegram.ui;

import android.view.View;
public final class sv {
    public final int f52135a;
    public final tv f52136b;
    public final View f52137c;

    public sv(tv tvVar, View view, int i7) {
        this.f52135a = i7;
        this.f52136b = tvVar;
        this.f52137c = view;
    }

    public final void a(boolean z10) {
        switch (this.f52135a) {
            case 0:
                View view = this.f52137c;
                if (view instanceof fi.p) {
                    this.f52136b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.me(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f52137c;
                if (view2 instanceof fi.p) {
                    this.f52136b.P0.F0.i((fi.p) view2, false);
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
