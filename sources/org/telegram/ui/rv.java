package org.telegram.ui;

import android.view.View;
public final class rv {
    public final int f51896a;
    public final sv f51897b;
    public final View f51898c;

    public rv(sv svVar, View view, int i7) {
        this.f51896a = i7;
        this.f51897b = svVar;
        this.f51898c = view;
    }

    public final void a(boolean z10) {
        switch (this.f51896a) {
            case 0:
                View view = this.f51898c;
                if (view instanceof fi.p) {
                    this.f51897b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ne(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f51898c;
                if (view2 instanceof fi.p) {
                    this.f51897b.P0.F0.i((fi.p) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ne(22), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
