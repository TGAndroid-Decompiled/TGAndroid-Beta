package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sw {
    public final int f41546a;
    public final tw f41547b;
    public final View f41548c;

    public sw(tw twVar, View view, int i10) {
        this.f41546a = i10;
        this.f41547b = twVar;
        this.f41548c = view;
    }

    public final void a(boolean z10) {
        switch (this.f41546a) {
            case 0:
                View view = this.f41548c;
                if (view instanceof ci.q) {
                    this.f41547b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f41548c;
                if (view2 instanceof ci.q) {
                    this.f41547b.O0.E0.i((ci.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
