package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ue implements Runnable {
    public final int f41150a;
    public final yn f41151b;
    public final String f41152c;

    public ue(yn ynVar, String str, int i10) {
        this.f41150a = i10;
        this.f41151b = ynVar;
        this.f41152c = str;
    }

    @Override
    public final void run() {
        switch (this.f41150a) {
            case 0:
                yn.V0(this.f41151b, this.f41152c);
                return;
            case 1:
                yn.h1(this.f41151b, this.f41152c);
                return;
            case 2:
                i4.f(this.f41152c, r1.currentAccount, r1.V0, null, this.f41151b.f43299ca);
                return;
            case 3:
                yn ynVar = this.f41151b;
                String str = this.f41152c;
                if (str != null) {
                    ynVar.getClass();
                    if (str.length() != 0) {
                        ynVar.getMessagesController().sendBotStart(ynVar.f43326f, str);
                        return;
                    }
                }
                ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f41151b.ka(this.f41152c);
                return;
            case 5:
                this.f41151b.ca(this.f41152c, false);
                return;
            case 6:
                Activity parentActivity = this.f41151b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f41152c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f41152c);
                org.telegram.messenger.ok.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f41151b));
                return;
            case 8:
                yn.v1(this.f41151b, this.f41152c);
                return;
            case 9:
                Activity parentActivity2 = this.f41151b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f41152c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f41152c);
                org.telegram.messenger.ok.o(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f41151b));
                return;
            default:
                Activity parentActivity3 = this.f41151b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f41152c);
                return;
        }
    }
}
