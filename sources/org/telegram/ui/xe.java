package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class xe implements Runnable {
    public final int f39906a;
    public final wn f39907b;
    public final org.telegram.ui.Components.mm0 f39908c;
    public final String d;

    public xe(wn wnVar, org.telegram.ui.Components.mm0 mm0Var, String str, int i10) {
        this.f39906a = i10;
        this.f39907b = wnVar;
        this.f39908c = mm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f39906a) {
            case 0:
                this.f39908c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39907b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39908c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39907b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f39908c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39907b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.ok.o(i10, a02);
    }
}
