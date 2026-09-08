package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f40448a;
    public final co f40449b;
    public final String f40450c;

    public se(co coVar, String str, int i10) {
        this.f40448a = i10;
        this.f40449b = coVar;
        this.f40450c = str;
    }

    @Override
    public final void run() {
        switch (this.f40448a) {
            case 0:
                co.W0(this.f40449b, this.f40450c);
                return;
            case 1:
                co.h1(this.f40449b, this.f40450c);
                return;
            case 2:
                i4.f(this.f40450c, r1.currentAccount, r1.X0, null, this.f40449b.f35274ea);
                return;
            case 3:
                co coVar = this.f40449b;
                String str = this.f40450c;
                if (str != null) {
                    coVar.getClass();
                    if (str.length() != 0) {
                        coVar.getMessagesController().sendBotStart(coVar.f35276f, str);
                        return;
                    }
                }
                coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f40449b.la(this.f40450c);
                return;
            case 5:
                this.f40449b.da(this.f40450c, false);
                return;
            case 6:
                Activity parentActivity = this.f40449b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f40450c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f40450c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f40449b));
                return;
            case 8:
                co.u1(this.f40449b, this.f40450c);
                return;
            case 9:
                Activity parentActivity2 = this.f40449b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f40450c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f40450c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f40449b));
                return;
            default:
                Activity parentActivity3 = this.f40449b.getParentActivity();
                of.f.s(parentActivity3, "https://fragment.com/username/" + this.f40450c);
                return;
        }
    }
}
