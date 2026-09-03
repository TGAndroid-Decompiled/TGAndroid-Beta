package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f38159a;
    public final zn f38160b;
    public final String f38161c;

    public se(zn znVar, String str, int i10) {
        this.f38159a = i10;
        this.f38160b = znVar;
        this.f38161c = str;
    }

    @Override
    public final void run() {
        switch (this.f38159a) {
            case 0:
                zn.W0(this.f38160b, this.f38161c);
                return;
            case 1:
                zn.h1(this.f38160b, this.f38161c);
                return;
            case 2:
                n4.f(this.f38161c, r1.currentAccount, r1.U0, null, this.f38160b.f40534ba);
                return;
            case 3:
                zn znVar = this.f38160b;
                String str = this.f38161c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f40575f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f38160b.la(this.f38161c);
                return;
            case 5:
                this.f38160b.da(this.f38161c, false);
                return;
            case 6:
                Activity parentActivity = this.f38160b.getParentActivity();
                ze.d.s(parentActivity, "tel:" + this.f38161c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f38161c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.f38160b));
                return;
            case 8:
                zn.u1(this.f38160b, this.f38161c);
                return;
            case 9:
                Activity parentActivity2 = this.f38160b.getParentActivity();
                ze.d.s(parentActivity2, "tel:" + this.f38161c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f38161c);
                b.m(R.string.PhoneCopied, org.telegram.ui.Components.qc.a0(this.f38160b));
                return;
            default:
                Activity parentActivity3 = this.f38160b.getParentActivity();
                ze.d.s(parentActivity3, "https://fragment.com/username/" + this.f38161c);
                return;
        }
    }
}
