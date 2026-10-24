package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class re implements Runnable {
    public final int f41135a;
    public final sn f41136b;
    public final String f41137c;

    public re(sn snVar, String str, int i10) {
        this.f41135a = i10;
        this.f41136b = snVar;
        this.f41137c = str;
    }

    @Override
    public final void run() {
        switch (this.f41135a) {
            case 0:
                sn.k0(this.f41136b, this.f41137c);
                return;
            case 1:
                sn.v0(this.f41136b, this.f41137c);
                return;
            case 2:
                k4.f(this.f41137c, r1.currentAccount, r1.f41558j1, null, this.f41136b.f41651qa);
                return;
            case 3:
                sn snVar = this.f41136b;
                String str = this.f41137c;
                if (str != null) {
                    snVar.getClass();
                    if (str.length() != 0) {
                        snVar.getMessagesController().sendBotStart(snVar.f41509f, str);
                        return;
                    }
                }
                snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", snVar.f41516f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f41136b.qa(this.f41137c);
                return;
            case 5:
                Activity parentActivity = this.f41136b.getParentActivity();
                pf.d.r(parentActivity, "tel:" + this.f41137c);
                return;
            case 6:
                AndroidUtilities.addToClipboard(this.f41137c);
                org.telegram.messenger.tl.p(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(this.f41136b));
                return;
            case 7:
                sn.J0(this.f41136b, this.f41137c);
                return;
            case 8:
                Activity parentActivity2 = this.f41136b.getParentActivity();
                pf.d.r(parentActivity2, "tel:" + this.f41137c);
                return;
            case 9:
                AndroidUtilities.addToClipboard(this.f41137c);
                org.telegram.messenger.tl.p(R.string.PhoneCopied, org.telegram.ui.Components.vc.a0(this.f41136b));
                return;
            case 10:
                this.f41136b.ia(this.f41137c, false);
                return;
            case 11:
                sn snVar2 = this.f41136b;
                snVar2.getClass();
                snVar2.presentFragment(new org.telegram.ui.Wallet.j9(this.f41137c));
                return;
            case 12:
                sn snVar3 = this.f41136b;
                String str2 = snVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = snVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f41137c));
                pf.d.t(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f41136b.getParentActivity();
                pf.d.r(parentActivity4, "https://fragment.com/username/" + this.f41137c);
                return;
        }
    }
}
