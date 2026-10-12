package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ye implements Runnable {
    public final int f44464a;
    public final eo f44465b;
    public final String f44466c;

    public ye(eo eoVar, String str, int i10) {
        this.f44464a = i10;
        this.f44465b = eoVar;
        this.f44466c = str;
    }

    @Override
    public final void run() {
        switch (this.f44464a) {
            case 0:
                eo.q1(this.f44465b, this.f44466c);
                return;
            case 1:
                eo.u1(this.f44465b, this.f44466c);
                return;
            case 2:
                i4.f(this.f44466c, r1.currentAccount, r1.X0, null, this.f44465b.f37256ea);
                return;
            case 3:
                eo eoVar = this.f44465b;
                String str = this.f44466c;
                if (str != null) {
                    eoVar.getClass();
                    if (str.length() != 0) {
                        eoVar.getMessagesController().sendBotStart(eoVar.f37258f, str);
                        return;
                    }
                }
                eoVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", eoVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f44465b.qa(this.f44466c);
                return;
            case 5:
                this.f44465b.ia(this.f44466c, false);
                return;
            case 6:
                Activity parentActivity = this.f44465b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f44466c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f44466c);
                org.telegram.messenger.am.p(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.f44465b));
                return;
            case 8:
                eo.d1(this.f44465b, this.f44466c);
                return;
            case 9:
                Activity parentActivity2 = this.f44465b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f44466c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f44466c);
                org.telegram.messenger.am.p(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.f44465b));
                return;
            case 11:
                eo eoVar2 = this.f44465b;
                eoVar2.getClass();
                eoVar2.presentFragment(new org.telegram.ui.Wallet.l8(this.f44466c));
                return;
            case 12:
                eo eoVar3 = this.f44465b;
                String str2 = eoVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = eoVar3.getParentActivity();
                StringBuilder v = a1.g.v(str2);
                v.append(Uri.encode(this.f44466c));
                of.f.u(parentActivity3, v.toString());
                return;
            default:
                Activity parentActivity4 = this.f44465b.getParentActivity();
                of.f.s(parentActivity4, "https://fragment.com/username/" + this.f44466c);
                return;
        }
    }
}
