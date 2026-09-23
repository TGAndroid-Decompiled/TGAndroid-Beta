package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class re implements Runnable {
    public final int f36802a;
    public final xn f36803b;
    public final String f36804c;

    public re(xn xnVar, String str, int i10) {
        this.f36802a = i10;
        this.f36803b = xnVar;
        this.f36804c = str;
    }

    @Override
    public final void run() {
        switch (this.f36802a) {
            case 0:
                xn.W0(this.f36803b, this.f36804c);
                return;
            case 1:
                xn.h1(this.f36803b, this.f36804c);
                return;
            case 2:
                i4.f(this.f36804c, r1.currentAccount, r1.X0, null, this.f36803b.f39370ea);
                return;
            case 3:
                xn xnVar = this.f36803b;
                String str = this.f36804c;
                if (str != null) {
                    xnVar.getClass();
                    if (str.length() != 0) {
                        xnVar.getMessagesController().sendBotStart(xnVar.f39372f, str);
                        return;
                    }
                }
                xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f36803b.la(this.f36804c);
                return;
            case 5:
                this.f36803b.da(this.f36804c, false);
                return;
            case 6:
                Activity parentActivity = this.f36803b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f36804c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f36804c);
                org.telegram.messenger.ul.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f36803b));
                return;
            case 8:
                xn.u1(this.f36803b, this.f36804c);
                return;
            case 9:
                Activity parentActivity2 = this.f36803b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f36804c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f36804c);
                org.telegram.messenger.ul.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f36803b));
                return;
            default:
                Activity parentActivity3 = this.f36803b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f36804c);
                return;
        }
    }
}
