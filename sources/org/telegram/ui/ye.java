package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ye implements Runnable {
    public final int f39893a;
    public final zn f39894b;
    public final org.telegram.ui.Components.mm0 f39895c;
    public final String d;

    public ye(zn znVar, org.telegram.ui.Components.mm0 mm0Var, String str, int i10) {
        this.f39893a = i10;
        this.f39894b = znVar;
        this.f39895c = mm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f39893a) {
            case 0:
                this.f39895c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39894b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39895c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39894b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f39895c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39894b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.rk.o(i10, a02);
    }
}
