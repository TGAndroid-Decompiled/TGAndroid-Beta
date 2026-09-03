package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xe implements Runnable {
    public final int f39964a;
    public final zn f39965b;
    public final org.telegram.ui.Components.hm0 f39966c;
    public final String d;

    public xe(zn znVar, org.telegram.ui.Components.hm0 hm0Var, String str, int i10) {
        this.f39964a = i10;
        this.f39965b = znVar;
        this.f39966c = hm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        switch (this.f39964a) {
            case 0:
                this.f39966c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f39965b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39966c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f39965b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f39966c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f39965b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        b.m(i10, a02);
    }
}
