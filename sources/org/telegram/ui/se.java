package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f40421a;
    public final co f40422b;
    public final String f40423c;

    public se(co coVar, String str, int i10) {
        this.f40421a = i10;
        this.f40422b = coVar;
        this.f40423c = str;
    }

    @Override
    public final void run() {
        switch (this.f40421a) {
            case 0:
                co.W0(this.f40422b, this.f40423c);
                return;
            case 1:
                co.h1(this.f40422b, this.f40423c);
                return;
            case 2:
                i4.f(this.f40423c, r1.currentAccount, r1.X0, null, this.f40422b.f35247ea);
                return;
            case 3:
                co coVar = this.f40422b;
                String str = this.f40423c;
                if (str != null) {
                    coVar.getClass();
                    if (str.length() != 0) {
                        coVar.getMessagesController().sendBotStart(coVar.f35249f, str);
                        return;
                    }
                }
                coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f40422b.la(this.f40423c);
                return;
            case 5:
                this.f40422b.da(this.f40423c, false);
                return;
            case 6:
                Activity parentActivity = this.f40422b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f40423c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f40423c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f40422b));
                return;
            case 8:
                co.u1(this.f40422b, this.f40423c);
                return;
            case 9:
                Activity parentActivity2 = this.f40422b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f40423c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f40423c);
                org.telegram.messenger.wl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f40422b));
                return;
            default:
                Activity parentActivity3 = this.f40422b.getParentActivity();
                of.f.s(parentActivity3, "https://fragment.com/username/" + this.f40423c);
                return;
        }
    }
}
