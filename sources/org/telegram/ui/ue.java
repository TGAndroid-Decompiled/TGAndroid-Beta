package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ue implements Runnable {
    public final int f37244a;
    public final eo f37245b;
    public final String f37246c;

    public ue(eo eoVar, String str, int i10) {
        this.f37244a = i10;
        this.f37245b = eoVar;
        this.f37246c = str;
    }

    @Override
    public final void run() {
        switch (this.f37244a) {
            case 0:
                eo.W0(this.f37245b, this.f37246c);
                return;
            case 1:
                eo.h1(this.f37245b, this.f37246c);
                return;
            case 2:
                j4.f(this.f37246c, r1.currentAccount, r1.X0, null, this.f37245b.f32316ea);
                return;
            case 3:
                eo eoVar = this.f37245b;
                String str = this.f37246c;
                if (str != null) {
                    eoVar.getClass();
                    if (str.length() != 0) {
                        eoVar.getMessagesController().sendBotStart(eoVar.f32318f, str);
                        return;
                    }
                }
                eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f37245b.la(this.f37246c);
                return;
            case 5:
                this.f37245b.da(this.f37246c, false);
                return;
            case 6:
                Activity parentActivity = this.f37245b.getParentActivity();
                nf.f.s(parentActivity, "tel:" + this.f37246c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f37246c);
                org.telegram.messenger.em.o(R.string.PhoneCopied, org.telegram.ui.Components.wc.a0(this.f37245b));
                return;
            case 8:
                eo.u1(this.f37245b, this.f37246c);
                return;
            case 9:
                Activity parentActivity2 = this.f37245b.getParentActivity();
                nf.f.s(parentActivity2, "tel:" + this.f37246c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f37246c);
                org.telegram.messenger.em.o(R.string.PhoneCopied, org.telegram.ui.Components.wc.a0(this.f37245b));
                return;
            default:
                Activity parentActivity3 = this.f37245b.getParentActivity();
                nf.f.s(parentActivity3, "https://fragment.com/username/" + this.f37246c);
                return;
        }
    }
}
