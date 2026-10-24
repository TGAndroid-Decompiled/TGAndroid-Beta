package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class uw {
    public final int f42501a;
    public final vw f42502b;
    public final View f42503c;

    public uw(vw vwVar, View view, int i10) {
        this.f42501a = i10;
        this.f42502b = vwVar;
        this.f42503c = view;
    }

    public final void a(boolean z10) {
        switch (this.f42501a) {
            case 0:
                View view = this.f42503c;
                if (view instanceof ci.q) {
                    this.f42502b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f42503c;
                if (view2 instanceof ci.q) {
                    this.f42502b.O0.E0.i((ci.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
