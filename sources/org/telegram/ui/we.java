package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class we implements Runnable {
    public final int f42497a;
    public final sn f42498b;
    public final org.telegram.ui.Components.ym0 f42499c;
    public final String d;

    public we(sn snVar, org.telegram.ui.Components.ym0 ym0Var, String str, int i10) {
        this.f42497a = i10;
        this.f42498b = snVar;
        this.f42499c = ym0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f42497a) {
            case 0:
                this.f42499c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42498b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f42499c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42498b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f42499c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42498b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f42499c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42498b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.wh.p(i10, a02);
    }
}
