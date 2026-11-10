package org.telegram.ui;

import android.view.View;
public final class rv {
    public final int f49579a;
    public final sv f49580b;
    public final View f49581c;

    public rv(sv svVar, View view, int i7) {
        this.f49579a = i7;
        this.f49580b = svVar;
        this.f49581c = view;
    }

    public final void a(boolean z9) {
        switch (this.f49579a) {
            case 0:
                View view = this.f49581c;
                if (view instanceof di.p) {
                    this.f49580b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.us(16), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f49581c;
                if (view2 instanceof di.p) {
                    this.f49580b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.us(16), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
