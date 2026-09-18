package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class te implements Runnable {
    public final int f37701a;
    public final zn f37702b;
    public final String f37703c;

    public te(zn znVar, String str, int i10) {
        this.f37701a = i10;
        this.f37702b = znVar;
        this.f37703c = str;
    }

    @Override
    public final void run() {
        switch (this.f37701a) {
            case 0:
                zn.l1(this.f37702b, this.f37703c);
                return;
            case 1:
                zn.p1(this.f37702b, this.f37703c);
                return;
            case 2:
                h4.f(this.f37703c, r1.currentAccount, r1.X0, null, this.f37702b.f40261ea);
                return;
            case 3:
                zn znVar = this.f37702b;
                String str = this.f37703c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f40263f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37702b.la(this.f37703c);
                return;
            case 5:
                this.f37702b.da(this.f37703c, false);
                return;
            case 6:
                Activity parentActivity = this.f37702b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37703c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37703c);
                org.telegram.messenger.wh.n(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37702b));
                return;
            case 8:
                zn.S0(this.f37702b, this.f37703c);
                return;
            case 9:
                Activity parentActivity2 = this.f37702b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37703c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37703c);
                org.telegram.messenger.wh.n(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37702b));
                return;
            default:
                Activity parentActivity3 = this.f37702b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37703c);
                return;
        }
    }
}
