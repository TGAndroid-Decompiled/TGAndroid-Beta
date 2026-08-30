package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ve implements Runnable {
    public final int f39151a;
    public final xn f39152b;
    public final org.telegram.ui.Components.im0 f39153c;
    public final String d;

    public ve(xn xnVar, org.telegram.ui.Components.im0 im0Var, String str, int i10) {
        this.f39151a = i10;
        this.f39152b = xnVar;
        this.f39153c = im0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        switch (this.f39151a) {
            case 0:
                this.f39153c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f39152b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39153c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f39152b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f39153c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f39152b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        b.m(i10, a02);
    }
}
