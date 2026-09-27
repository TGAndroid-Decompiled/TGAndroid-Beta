package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ve implements Runnable {
    public final int f38558a;
    public final xn f38559b;
    public final String f38560c;

    public ve(xn xnVar, String str, int i10) {
        this.f38558a = i10;
        this.f38559b = xnVar;
        this.f38560c = str;
    }

    @Override
    public final void run() {
        switch (this.f38558a) {
            case 0:
                xn.l1(this.f38559b, this.f38560c);
                return;
            case 1:
                xn.p1(this.f38559b, this.f38560c);
                return;
            case 2:
                j4.f(this.f38560c, r1.currentAccount, r1.X0, null, this.f38559b.f39750ea);
                return;
            case 3:
                xn xnVar = this.f38559b;
                String str = this.f38560c;
                if (str != null) {
                    xnVar.getClass();
                    if (str.length() != 0) {
                        xnVar.getMessagesController().sendBotStart(xnVar.f39752f, str);
                        return;
                    }
                }
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f38559b.la(this.f38560c);
                return;
            case 5:
                this.f38559b.da(this.f38560c, false);
                return;
            case 6:
                Activity parentActivity = this.f38559b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f38560c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f38560c);
                org.telegram.messenger.qk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f38559b));
                return;
            case 8:
                xn.R0(this.f38559b, this.f38560c);
                return;
            case 9:
                Activity parentActivity2 = this.f38559b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f38560c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f38560c);
                org.telegram.messenger.qk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f38559b));
                return;
            default:
                Activity parentActivity3 = this.f38559b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f38560c);
                return;
        }
    }
}
