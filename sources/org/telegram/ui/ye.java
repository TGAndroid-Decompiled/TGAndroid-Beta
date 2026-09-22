package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ye implements Runnable {
    public final int f39913a;
    public final zn f39914b;
    public final org.telegram.ui.Components.om0 f39915c;
    public final String d;

    public ye(zn znVar, org.telegram.ui.Components.om0 om0Var, String str, int i10) {
        this.f39913a = i10;
        this.f39914b = znVar;
        this.f39915c = om0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        switch (this.f39913a) {
            case 0:
                this.f39915c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39914b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f39915c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39914b);
                i10 = R.string.CardNumberCopied;
                break;
            default:
                this.f39915c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.xc.a0(this.f39914b);
                i10 = R.string.UsernameCopied;
                break;
        }
        org.telegram.messenger.rk.o(i10, a02);
    }
}
