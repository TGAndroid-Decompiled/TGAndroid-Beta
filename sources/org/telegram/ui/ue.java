package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ue implements Runnable {
    public final int f42396a;
    public final sn f42397b;
    public final org.telegram.ui.Components.bn0 f42398c;
    public final String d;

    public ue(sn snVar, org.telegram.ui.Components.bn0 bn0Var, String str, int i10) {
        this.f42396a = i10;
        this.f42397b = snVar;
        this.f42398c = bn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vc a02;
        int i10;
        switch (this.f42396a) {
            case 0:
                this.f42398c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f42397b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f42398c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f42397b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f42398c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f42397b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f42398c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.vc.a0(this.f42397b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.tl.p(i10, a02);
    }
}
