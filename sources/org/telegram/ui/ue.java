package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ue implements Runnable {
    public final int f41218a;
    public final yn f41219b;
    public final String f41220c;

    public ue(yn ynVar, String str, int i10) {
        this.f41218a = i10;
        this.f41219b = ynVar;
        this.f41220c = str;
    }

    @Override
    public final void run() {
        switch (this.f41218a) {
            case 0:
                yn.V0(this.f41219b, this.f41220c);
                return;
            case 1:
                yn.h1(this.f41219b, this.f41220c);
                return;
            case 2:
                i4.f(this.f41220c, r1.currentAccount, r1.V0, null, this.f41219b.f43300ca);
                return;
            case 3:
                yn ynVar = this.f41219b;
                String str = this.f41220c;
                if (str != null) {
                    ynVar.getClass();
                    if (str.length() != 0) {
                        ynVar.getMessagesController().sendBotStart(ynVar.f43327f, str);
                        return;
                    }
                }
                ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f41219b.ka(this.f41220c);
                return;
            case 5:
                this.f41219b.ca(this.f41220c, false);
                return;
            case 6:
                Activity parentActivity = this.f41219b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f41220c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f41220c);
                org.telegram.messenger.bi.n(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f41219b));
                return;
            case 8:
                yn.v1(this.f41219b, this.f41220c);
                return;
            case 9:
                Activity parentActivity2 = this.f41219b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f41220c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f41220c);
                org.telegram.messenger.bi.n(R.string.PhoneCopied, org.telegram.ui.Components.yc.a0(this.f41219b));
                return;
            default:
                Activity parentActivity3 = this.f41219b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f41220c);
                return;
        }
    }
}
