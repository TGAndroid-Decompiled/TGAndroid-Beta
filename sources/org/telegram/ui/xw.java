package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class xw {

    public final int f44629a;

    public final yw f44630b;

    public final View f44631c;

    public xw(yw ywVar, View view, int i10) {
        this.f44629a = i10;
        this.f44630b = ywVar;
        this.f44631c = view;
    }

    public final void a(boolean z10) {
        switch (this.f44629a) {
            case 0:
                View view = this.f44631c;
                if (view instanceof jh.o) {
                    this.f44630b.K0.A0.i((jh.o) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(19), 500L);
                    }
                }
                break;
            default:
                View view2 = this.f44631c;
                if (view2 instanceof jh.o) {
                    this.f44630b.K0.A0.i((jh.o) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(19), 500L);
                    }
                }
                break;
        }
    }
}
