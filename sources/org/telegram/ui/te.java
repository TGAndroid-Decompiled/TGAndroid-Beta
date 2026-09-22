package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class te implements Runnable {
    public final int f37759a;
    public final zn f37760b;
    public final String f37761c;

    public te(zn znVar, String str, int i10) {
        this.f37759a = i10;
        this.f37760b = znVar;
        this.f37761c = str;
    }

    @Override
    public final void run() {
        switch (this.f37759a) {
            case 0:
                zn.l1(this.f37760b, this.f37761c);
                return;
            case 1:
                zn.p1(this.f37760b, this.f37761c);
                return;
            case 2:
                h4.f(this.f37761c, r1.currentAccount, r1.X0, null, this.f37760b.f40324ea);
                return;
            case 3:
                zn znVar = this.f37760b;
                String str = this.f37761c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f40326f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37760b.la(this.f37761c);
                return;
            case 5:
                this.f37760b.da(this.f37761c, false);
                return;
            case 6:
                Activity parentActivity = this.f37760b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37761c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37761c);
                org.telegram.messenger.rk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37760b));
                return;
            case 8:
                zn.S0(this.f37760b, this.f37761c);
                return;
            case 9:
                Activity parentActivity2 = this.f37760b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37761c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37761c);
                org.telegram.messenger.rk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37760b));
                return;
            default:
                Activity parentActivity3 = this.f37760b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37761c);
                return;
        }
    }
}
