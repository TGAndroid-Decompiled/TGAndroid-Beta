package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ye implements Runnable {
    public final int f44368a;
    public final zn f44369b;
    public final org.telegram.ui.Components.hn0 f44370c;
    public final String d;

    public ye(zn znVar, org.telegram.ui.Components.hn0 hn0Var, String str, int i10) {
        this.f44368a = i10;
        this.f44369b = znVar;
        this.f44370c = hn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ad a02;
        int i10;
        switch (this.f44368a) {
            case 0:
                this.f44370c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44369b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f44370c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44369b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f44370c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44369b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f44370c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44369b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.bi.p(i10, a02);
    }
}
