package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sw {
    public final int f41537a;
    public final tw f41538b;
    public final View f41539c;

    public sw(tw twVar, View view, int i10) {
        this.f41537a = i10;
        this.f41538b = twVar;
        this.f41539c = view;
    }

    public final void a(boolean z10) {
        switch (this.f41537a) {
            case 0:
                View view = this.f41539c;
                if (view instanceof ci.q) {
                    this.f41538b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sc(21), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f41539c;
                if (view2 instanceof ci.q) {
                    this.f41538b.O0.E0.i((ci.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sc(21), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
