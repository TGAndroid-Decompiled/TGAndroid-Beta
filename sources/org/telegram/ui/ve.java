package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ve implements Runnable {
    public final int f44323a;
    public final wn f44324b;
    public final org.telegram.ui.Components.in0 f44325c;
    public final String d;

    public ve(wn wnVar, org.telegram.ui.Components.in0 in0Var, String str, int i10) {
        this.f44323a = i10;
        this.f44324b = wnVar;
        this.f44325c = in0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        switch (this.f44323a) {
            case 0:
                this.f44325c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44324b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f44325c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44324b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f44325c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44324b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f44325c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44324b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.wh.m(i10, b02);
    }
}
