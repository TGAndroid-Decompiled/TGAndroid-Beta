package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ye implements Runnable {
    public final int f43088a;
    public final co f43089b;
    public final org.telegram.ui.Components.am0 f43090c;
    public final String d;

    public ye(co coVar, org.telegram.ui.Components.am0 am0Var, String str, int i10) {
        this.f43088a = i10;
        this.f43089b = coVar;
        this.f43090c = am0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.yc a02;
        int i10;
        switch (this.f43088a) {
            case 0:
                this.f43090c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f43089b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f43090c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f43089b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f43090c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.yc.a0(this.f43089b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        org.telegram.messenger.wl.o(i10, a02);
    }
}
