package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xe implements Runnable {
    public final int f40004a;
    public final wn f40005b;
    public final org.telegram.ui.Components.pm0 f40006c;
    public final String d;

    public xe(wn wnVar, org.telegram.ui.Components.pm0 pm0Var, String str, int i10) {
        this.f40004a = i10;
        this.f40005b = wnVar;
        this.f40006c = pm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yc a02;
        int i10;
        switch (this.f40004a) {
            case 0:
                this.f40006c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f40005b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f40006c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f40005b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f40006c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f40005b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.ok.o(i10, a02);
    }
}
