package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ww {
    public final int f44389a;
    public final xw f44390b;
    public final View f44391c;

    public ww(xw xwVar, View view, int i10) {
        this.f44389a = i10;
        this.f44390b = xwVar;
        this.f44391c = view;
    }

    public final void a(boolean z10) {
        switch (this.f44389a) {
            case 0:
                View view = this.f44391c;
                if (view instanceof lh.o) {
                    this.f44390b.K0.A0.i((lh.o) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f44391c;
                if (view2 instanceof lh.o) {
                    this.f44390b.K0.A0.i((lh.o) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(22), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
