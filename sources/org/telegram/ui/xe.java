package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xe implements Runnable {
    public final int f39251a;
    public final xn f39252b;
    public final org.telegram.ui.Components.bm0 f39253c;
    public final String d;

    public xe(xn xnVar, org.telegram.ui.Components.bm0 bm0Var, String str, int i10) {
        this.f39251a = i10;
        this.f39252b = xnVar;
        this.f39253c = bm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f39251a) {
            case 0:
                this.f39253c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39252b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39253c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39252b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f39253c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39252b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.ul.p(i10, a02);
    }
}
