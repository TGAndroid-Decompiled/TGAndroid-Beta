package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sw {
    public final int f41542a;
    public final tw f41543b;
    public final View f41544c;

    public sw(tw twVar, View view, int i10) {
        this.f41542a = i10;
        this.f41543b = twVar;
        this.f41544c = view;
    }

    public final void a(boolean z10) {
        switch (this.f41542a) {
            case 0:
                View view = this.f41544c;
                if (view instanceof ci.q) {
                    this.f41543b.O0.E0.i((ci.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(22), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f41544c;
                if (view2 instanceof ci.q) {
                    this.f41543b.O0.E0.i((ci.q) view2, false);
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
