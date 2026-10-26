package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ve implements Runnable {
    public final int f44778a;
    public final un f44779b;
    public final org.telegram.ui.Components.hn0 f44780c;
    public final String d;

    public ve(un unVar, org.telegram.ui.Components.hn0 hn0Var, String str, int i10) {
        this.f44778a = i10;
        this.f44779b = unVar;
        this.f44780c = hn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        switch (this.f44778a) {
            case 0:
                this.f44780c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44779b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f44780c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44779b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f44780c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44779b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f44780c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                b02 = org.telegram.ui.Components.wc.b0(this.f44779b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.vh.m(i10, b02);
    }
}
