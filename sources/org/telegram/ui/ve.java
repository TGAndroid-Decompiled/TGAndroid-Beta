package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ve implements Runnable {
    public final int f42212a;
    public final xn f42213b;
    public final org.telegram.ui.Components.jm0 f42214c;
    public final String d;

    public ve(xn xnVar, org.telegram.ui.Components.jm0 jm0Var, String str, int i10) {
        this.f42212a = i10;
        this.f42213b = xnVar;
        this.f42214c = jm0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        switch (this.f42212a) {
            case 0:
                this.f42214c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f42213b);
                i10 = R.string.RelativeDateCopied;
                break;
            case 1:
                this.f42214c.dismiss();
                AndroidUtilities.addToClipboard("@" + this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f42213b);
                i10 = R.string.UsernameCopied;
                break;
            default:
                this.f42214c.dismiss();
                AndroidUtilities.addToClipboard(this.d);
                a02 = org.telegram.ui.Components.qc.a0(this.f42213b);
                i10 = R.string.CardNumberCopied;
                break;
        }
        b.m(i10, a02);
    }
}
