package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class te implements Runnable {
    public final int f41665a;
    public final sn f41666b;
    public final String f41667c;

    public te(sn snVar, String str, int i10) {
        this.f41665a = i10;
        this.f41666b = snVar;
        this.f41667c = str;
    }

    @Override
    public final void run() {
        switch (this.f41665a) {
            case 0:
                sn.q1(this.f41666b, this.f41667c);
                return;
            case 1:
                sn.u1(this.f41666b, this.f41667c);
                return;
            case 2:
                l4.f(this.f41667c, r1.currentAccount, r1.X0, null, this.f41666b.f41205ea);
                return;
            case 3:
                sn snVar = this.f41666b;
                String str = this.f41667c;
                if (str != null) {
                    snVar.getClass();
                    if (str.length() != 0) {
                        snVar.getMessagesController().sendBotStart(snVar.f41208f, str);
                        return;
                    }
                }
                snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f41666b.qa(this.f41667c);
                return;
            case 5:
                this.f41666b.ia(this.f41667c, false);
                return;
            case 6:
                Activity parentActivity = this.f41666b.getParentActivity();
                pf.d.r(parentActivity, "tel:" + this.f41667c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f41667c);
                org.telegram.messenger.wh.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f41666b));
                return;
            case 8:
                sn.d1(this.f41666b, this.f41667c);
                return;
            case 9:
                Activity parentActivity2 = this.f41666b.getParentActivity();
                pf.d.r(parentActivity2, "tel:" + this.f41667c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f41667c);
                org.telegram.messenger.wh.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f41666b));
                return;
            case 11:
                sn snVar2 = this.f41666b;
                snVar2.getClass();
                snVar2.presentFragment(new org.telegram.ui.Wallet.l9(this.f41667c));
                return;
            case 12:
                sn snVar3 = this.f41666b;
                String str2 = snVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = snVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f41667c));
                pf.d.t(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f41666b.getParentActivity();
                pf.d.r(parentActivity4, "https://fragment.com/username/" + this.f41667c);
                return;
        }
    }
}
