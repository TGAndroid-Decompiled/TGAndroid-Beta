package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class uw {
    public final int f42035a;
    public final vw f42036b;
    public final View f42037c;

    public uw(vw vwVar, View view, int i10) {
        this.f42035a = i10;
        this.f42036b = vwVar;
        this.f42037c = view;
    }

    public final void a(boolean z10) {
        switch (this.f42035a) {
            case 0:
                View view = this.f42037c;
                if (view instanceof ci.q) {
                    this.f42036b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sc(21), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f42037c;
                if (view2 instanceof ci.q) {
                    this.f42036b.O0.E0.i((ci.q) view2, false);
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
