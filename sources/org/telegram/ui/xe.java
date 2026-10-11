package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xe implements Runnable {
    public final int f44050a;
    public final zn f44051b;
    public final org.telegram.ui.Components.in0 f44052c;
    public final String d;

    public xe(zn znVar, org.telegram.ui.Components.in0 in0Var, String str, int i10) {
        this.f44050a = i10;
        this.f44051b = znVar;
        this.f44052c = in0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ad a02;
        int i10;
        switch (this.f44050a) {
            case 0:
                this.f44052c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44051b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f44052c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44051b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f44052c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44051b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f44052c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.ad.a0(this.f44051b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.ai.p(i10, a02);
    }
}
