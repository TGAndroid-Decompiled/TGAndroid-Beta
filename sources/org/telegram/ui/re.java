package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class re implements Runnable {
    public final int f41138a;
    public final qn f41139b;
    public final String f41140c;

    public re(qn qnVar, String str, int i10) {
        this.f41138a = i10;
        this.f41139b = qnVar;
        this.f41140c = str;
    }

    @Override
    public final void run() {
        switch (this.f41138a) {
            case 0:
                qn.q1(this.f41139b, this.f41140c);
                return;
            case 1:
                qn.u1(this.f41139b, this.f41140c);
                return;
            case 2:
                l4.f(this.f41140c, r1.currentAccount, r1.X0, null, this.f41139b.f40677ea);
                return;
            case 3:
                qn qnVar = this.f41139b;
                String str = this.f41140c;
                if (str != null) {
                    qnVar.getClass();
                    if (str.length() != 0) {
                        qnVar.getMessagesController().sendBotStart(qnVar.f40680f, str);
                        return;
                    }
                }
                qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f41139b.qa(this.f41140c);
                return;
            case 5:
                this.f41139b.ia(this.f41140c, false);
                return;
            case 6:
                Activity parentActivity = this.f41139b.getParentActivity();
                pf.d.r(parentActivity, "tel:" + this.f41140c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f41140c);
                org.telegram.messenger.nk.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f41139b));
                return;
            case 8:
                qn.d1(this.f41139b, this.f41140c);
                return;
            case 9:
                Activity parentActivity2 = this.f41139b.getParentActivity();
                pf.d.r(parentActivity2, "tel:" + this.f41140c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f41140c);
                org.telegram.messenger.nk.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f41139b));
                return;
            case 11:
                qn qnVar2 = this.f41139b;
                qnVar2.getClass();
                qnVar2.presentFragment(new org.telegram.ui.Wallet.i9(this.f41140c));
                return;
            case 12:
                qn qnVar3 = this.f41139b;
                String str2 = qnVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = qnVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f41140c));
                pf.d.t(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f41139b.getParentActivity();
                pf.d.r(parentActivity4, "https://fragment.com/username/" + this.f41140c);
                return;
        }
    }
}
