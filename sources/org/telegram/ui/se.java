package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f37718a;
    public final wn f37719b;
    public final String f37720c;

    public se(wn wnVar, String str, int i10) {
        this.f37718a = i10;
        this.f37719b = wnVar;
        this.f37720c = str;
    }

    @Override
    public final void run() {
        switch (this.f37718a) {
            case 0:
                wn.l1(this.f37719b, this.f37720c);
                return;
            case 1:
                wn.p1(this.f37719b, this.f37720c);
                return;
            case 2:
                i4.f(this.f37720c, r1.currentAccount, r1.X0, null, this.f37719b.f39470ea);
                return;
            case 3:
                wn wnVar = this.f37719b;
                String str = this.f37720c;
                if (str != null) {
                    wnVar.getClass();
                    if (str.length() != 0) {
                        wnVar.getMessagesController().sendBotStart(wnVar.f39472f, str);
                        return;
                    }
                }
                wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", wnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37719b.la(this.f37720c);
                return;
            case 5:
                this.f37719b.da(this.f37720c, false);
                return;
            case 6:
                Activity parentActivity = this.f37719b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37720c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37720c);
                org.telegram.messenger.ok.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37719b));
                return;
            case 8:
                wn.R0(this.f37719b, this.f37720c);
                return;
            case 9:
                Activity parentActivity2 = this.f37719b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37720c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37720c);
                org.telegram.messenger.ok.o(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f37719b));
                return;
            default:
                Activity parentActivity3 = this.f37719b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37720c);
                return;
        }
    }
}
