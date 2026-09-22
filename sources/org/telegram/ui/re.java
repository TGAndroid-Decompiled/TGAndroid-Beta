package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class re implements Runnable {
    public final int f37110a;
    public final bo f37111b;
    public final String f37112c;

    public re(bo boVar, String str, int i10) {
        this.f37110a = i10;
        this.f37111b = boVar;
        this.f37112c = str;
    }

    @Override
    public final void run() {
        switch (this.f37110a) {
            case 0:
                bo.W0(this.f37111b, this.f37112c);
                return;
            case 1:
                bo.h1(this.f37111b, this.f37112c);
                return;
            case 2:
                h4.f(this.f37112c, r1.currentAccount, r1.X0, null, this.f37111b.f32293ea);
                return;
            case 3:
                bo boVar = this.f37111b;
                String str = this.f37112c;
                if (str != null) {
                    boVar.getClass();
                    if (str.length() != 0) {
                        boVar.getMessagesController().sendBotStart(boVar.f32295f, str);
                        return;
                    }
                }
                boVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", boVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37111b.la(this.f37112c);
                return;
            case 5:
                this.f37111b.da(this.f37112c, false);
                return;
            case 6:
                Activity parentActivity = this.f37111b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37112c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37112c);
                org.telegram.messenger.vl.p(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(this.f37111b));
                return;
            case 8:
                bo.u1(this.f37111b, this.f37112c);
                return;
            case 9:
                Activity parentActivity2 = this.f37111b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37112c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37112c);
                org.telegram.messenger.vl.p(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(this.f37111b));
                return;
            default:
                Activity parentActivity3 = this.f37111b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37112c);
                return;
        }
    }
}
