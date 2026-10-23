package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ue implements Runnable {
    public final int f42390a;
    public final sn f42391b;
    public final org.telegram.ui.Components.cn0 f42392c;
    public final String d;

    public ue(sn snVar, org.telegram.ui.Components.cn0 cn0Var, String str, int i10) {
        this.f42390a = i10;
        this.f42391b = snVar;
        this.f42392c = cn0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f42390a) {
            case 0:
                this.f42392c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42391b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f42392c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42391b);
                i10 = R.string.WalletAddressCopiedBulletin;
                break;
            case 2:
                this.f42392c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42391b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f42392c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f42391b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.sl.p(i10, a02);
    }
}
