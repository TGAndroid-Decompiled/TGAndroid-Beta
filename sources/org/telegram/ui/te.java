package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class te implements Runnable {
    public final int f37735a;
    public final zn f37736b;
    public final String f37737c;

    public te(zn znVar, String str, int i10) {
        this.f37735a = i10;
        this.f37736b = znVar;
        this.f37737c = str;
    }

    @Override
    public final void run() {
        switch (this.f37735a) {
            case 0:
                zn.l1(this.f37736b, this.f37737c);
                return;
            case 1:
                zn.p1(this.f37736b, this.f37737c);
                return;
            case 2:
                h4.f(this.f37737c, r1.currentAccount, r1.X0, null, this.f37736b.f40303ea);
                return;
            case 3:
                zn znVar = this.f37736b;
                String str = this.f37737c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f40305f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37736b.la(this.f37737c);
                return;
            case 5:
                this.f37736b.da(this.f37737c, false);
                return;
            case 6:
                Activity parentActivity = this.f37736b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37737c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37737c);
                org.telegram.messenger.rk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37736b));
                return;
            case 8:
                zn.S0(this.f37736b, this.f37737c);
                return;
            case 9:
                Activity parentActivity2 = this.f37736b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37737c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37737c);
                org.telegram.messenger.rk.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37736b));
                return;
            default:
                Activity parentActivity3 = this.f37736b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37737c);
                return;
        }
    }
}
