package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ye implements Runnable {
    public final int f39793a;
    public final zn f39794b;
    public final org.telegram.ui.Components.nm0 f39795c;
    public final String d;

    public ye(zn znVar, org.telegram.ui.Components.nm0 nm0Var, String str, int i10) {
        this.f39793a = i10;
        this.f39794b = znVar;
        this.f39795c = nm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f39793a) {
            case 0:
                this.f39795c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39794b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39795c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39794b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f39795c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39794b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.wh.n(i10, a02);
    }
}
