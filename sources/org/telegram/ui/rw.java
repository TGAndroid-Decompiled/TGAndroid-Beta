package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rw {
    public final int f43182a;
    public final sw f43183b;
    public final View f43184c;

    public rw(sw swVar, View view, int i10) {
        this.f43182a = i10;
        this.f43183b = swVar;
        this.f43184c = view;
    }

    public final void a(boolean z10) {
        switch (this.f43182a) {
            case 0:
                View view = this.f43184c;
                if (view instanceof di.q) {
                    this.f43183b.O0.E0.i((di.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f43184c;
                if (view2 instanceof di.q) {
                    this.f43183b.O0.E0.i((di.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
