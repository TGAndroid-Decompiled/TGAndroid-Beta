package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ye implements Runnable {
    public final int f44324a;
    public final zn f44325b;
    public final org.telegram.ui.Components.gn0 f44326c;
    public final String d;

    public ye(zn znVar, org.telegram.ui.Components.gn0 gn0Var, String str, int i10) {
        this.f44324a = i10;
        this.f44325b = znVar;
        this.f44326c = gn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ad a02;
        int i10;
        switch (this.f44324a) {
            case 0:
                this.f44326c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44325b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f44326c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44325b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f44326c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44325b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f44326c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44325b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.bi.p(i10, a02);
    }
}
