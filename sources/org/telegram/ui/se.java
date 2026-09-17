package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f40422a;
    public final co f40423b;
    public final String f40424c;

    public se(co coVar, String str, int i10) {
        this.f40422a = i10;
        this.f40423b = coVar;
        this.f40424c = str;
    }

    @Override
    public final void run() {
        switch (this.f40422a) {
            case 0:
                co.W0(this.f40423b, this.f40424c);
                return;
            case 1:
                co.h1(this.f40423b, this.f40424c);
                return;
            case 2:
                i4.f(this.f40424c, r1.currentAccount, r1.X0, null, this.f40423b.f35248ea);
                return;
            case 3:
                co coVar = this.f40423b;
                String str = this.f40424c;
                if (str != null) {
                    coVar.getClass();
                    if (str.length() != 0) {
                        coVar.getMessagesController().sendBotStart(coVar.f35250f, str);
                        return;
                    }
                }
                coVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", coVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f40423b.la(this.f40424c);
                return;
            case 5:
                this.f40423b.da(this.f40424c, false);
                return;
            case 6:
                Activity parentActivity = this.f40423b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f40424c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f40424c);
                org.telegram.messenger.vl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f40423b));
                return;
            case 8:
                co.u1(this.f40423b, this.f40424c);
                return;
            case 9:
                Activity parentActivity2 = this.f40423b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f40424c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f40424c);
                org.telegram.messenger.vl.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f40423b));
                return;
            default:
                Activity parentActivity3 = this.f40423b.getParentActivity();
                of.f.s(parentActivity3, "https://fragment.com/username/" + this.f40424c);
                return;
        }
    }
}
