package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ue implements Runnable {
    public final int f41935a;
    public final qn f41936b;
    public final org.telegram.ui.Components.ym0 f41937c;
    public final String d;

    public ue(qn qnVar, org.telegram.ui.Components.ym0 ym0Var, String str, int i10) {
        this.f41935a = i10;
        this.f41936b = qnVar;
        this.f41937c = ym0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f41935a) {
            case 0:
                this.f41937c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41936b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f41937c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41936b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f41937c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41936b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f41937c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41936b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.kk.p(i10, a02);
    }
}
