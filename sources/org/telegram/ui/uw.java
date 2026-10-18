package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class uw {
    public final int f42077a;
    public final vw f42078b;
    public final View f42079c;

    public uw(vw vwVar, View view, int i10) {
        this.f42077a = i10;
        this.f42078b = vwVar;
        this.f42079c = view;
    }

    public final void a(boolean z10) {
        switch (this.f42077a) {
            case 0:
                View view = this.f42079c;
                if (view instanceof ci.q) {
                    this.f42078b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f42079c;
                if (view2 instanceof ci.q) {
                    this.f42078b.O0.E0.i((ci.q) view2, false);
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
