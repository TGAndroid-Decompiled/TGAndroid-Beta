package org.telegram.ui;

import android.view.View;
public final class qv {
    public final int f49198a;
    public final rv f49199b;
    public final View f49200c;

    public qv(rv rvVar, View view, int i7) {
        this.f49198a = i7;
        this.f49199b = rvVar;
        this.f49200c = view;
    }

    public final void a(boolean z9) {
        switch (this.f49198a) {
            case 0:
                View view = this.f49200c;
                if (view instanceof di.p) {
                    this.f49199b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vs(16), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f49200c;
                if (view2 instanceof di.p) {
                    this.f49199b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vs(16), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
