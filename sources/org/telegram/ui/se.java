package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f37813a;
    public final wn f37814b;
    public final String f37815c;

    public se(wn wnVar, String str, int i10) {
        this.f37813a = i10;
        this.f37814b = wnVar;
        this.f37815c = str;
    }

    @Override
    public final void run() {
        switch (this.f37813a) {
            case 0:
                wn.l1(this.f37814b, this.f37815c);
                return;
            case 1:
                wn.p1(this.f37814b, this.f37815c);
                return;
            case 2:
                i4.f(this.f37815c, r1.currentAccount, r1.X0, null, this.f37814b.f39562ea);
                return;
            case 3:
                wn wnVar = this.f37814b;
                String str = this.f37815c;
                if (str != null) {
                    wnVar.getClass();
                    if (str.length() != 0) {
                        wnVar.getMessagesController().sendBotStart(wnVar.f39564f, str);
                        return;
                    }
                }
                wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", wnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37814b.la(this.f37815c);
                return;
            case 5:
                this.f37814b.da(this.f37815c, false);
                return;
            case 6:
                Activity parentActivity = this.f37814b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37815c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37815c);
                org.telegram.messenger.ok.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f37814b));
                return;
            case 8:
                wn.R0(this.f37814b, this.f37815c);
                return;
            case 9:
                Activity parentActivity2 = this.f37814b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37815c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37815c);
                org.telegram.messenger.ok.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f37814b));
                return;
            default:
                Activity parentActivity3 = this.f37814b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37815c);
                return;
        }
    }
}
