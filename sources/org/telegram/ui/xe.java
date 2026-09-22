package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xe implements Runnable {
    public final int f39600a;
    public final bo f39601b;
    public final org.telegram.ui.Components.am0 f39602c;
    public final String d;

    public xe(bo boVar, org.telegram.ui.Components.am0 am0Var, String str, int i10) {
        this.f39600a = i10;
        this.f39601b = boVar;
        this.f39602c = am0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vc a02;
        int i10;
        switch (this.f39600a) {
            case 0:
                this.f39602c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f39601b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39602c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f39601b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f39602c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f39601b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.vl.p(i10, a02);
    }
}
