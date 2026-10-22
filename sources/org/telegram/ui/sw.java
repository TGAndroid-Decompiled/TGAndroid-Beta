package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sw {
    public final int f41545a;
    public final tw f41546b;
    public final View f41547c;

    public sw(tw twVar, View view, int i10) {
        this.f41545a = i10;
        this.f41546b = twVar;
        this.f41547c = view;
    }

    public final void a(boolean z10) {
        switch (this.f41545a) {
            case 0:
                View view = this.f41547c;
                if (view instanceof ci.q) {
                    this.f41546b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f41547c;
                if (view2 instanceof ci.q) {
                    this.f41546b.O0.E0.i((ci.q) view2, false);
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
