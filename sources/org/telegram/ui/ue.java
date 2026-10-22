package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ue implements Runnable {
    public final int f41944a;
    public final qn f41945b;
    public final org.telegram.ui.Components.zm0 f41946c;
    public final String d;

    public ue(qn qnVar, org.telegram.ui.Components.zm0 zm0Var, String str, int i10) {
        this.f41944a = i10;
        this.f41945b = qnVar;
        this.f41946c = zm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f41944a) {
            case 0:
                this.f41946c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41945b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f41946c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41945b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f41946c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41945b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f41946c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f41945b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.ok.p(i10, a02);
    }
}
