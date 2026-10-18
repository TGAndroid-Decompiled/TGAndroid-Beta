package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class we implements Runnable {
    public final int f42521a;
    public final sn f42522b;
    public final org.telegram.ui.Components.ym0 f42523c;
    public final String d;

    public we(sn snVar, org.telegram.ui.Components.ym0 ym0Var, String str, int i10) {
        this.f42521a = i10;
        this.f42522b = snVar;
        this.f42523c = ym0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f42521a) {
            case 0:
                this.f42523c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42522b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f42523c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42522b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f42523c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42522b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f42523c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42522b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.kk.p(i10, a02);
    }
}
