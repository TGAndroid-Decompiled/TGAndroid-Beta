package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ze implements Runnable {
    public final int f40224a;
    public final bo f40225b;
    public final org.telegram.ui.Components.bm0 f40226c;
    public final String d;

    public ze(bo boVar, org.telegram.ui.Components.bm0 bm0Var, String str, int i10) {
        this.f40224a = i10;
        this.f40225b = boVar;
        this.f40226c = bm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vc a02;
        int i10;
        switch (this.f40224a) {
            case 0:
                this.f40226c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f40225b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f40226c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f40225b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f40226c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f40225b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.wl.o(i10, a02);
    }
}
