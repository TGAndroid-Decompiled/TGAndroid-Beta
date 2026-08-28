package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class uw {
    public final int f43325a;
    public final vw f43326b;
    public final View f43327c;

    public uw(vw vwVar, View view, int i9) {
        this.f43325a = i9;
        this.f43326b = vwVar;
        this.f43327c = view;
    }

    public final void a(boolean z10) {
        switch (this.f43325a) {
            case 0:
                View view = this.f43327c;
                if (view instanceof ih.q) {
                    this.f43326b.K0.A0.i((ih.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(20), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f43327c;
                if (view2 instanceof ih.q) {
                    this.f43326b.K0.A0.i((ih.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(20), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
