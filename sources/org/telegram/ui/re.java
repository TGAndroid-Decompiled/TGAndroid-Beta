package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class re implements Runnable {
    public final int f41107a;
    public final sn f41108b;
    public final String f41109c;

    public re(sn snVar, String str, int i10) {
        this.f41107a = i10;
        this.f41108b = snVar;
        this.f41109c = str;
    }

    @Override
    public final void run() {
        switch (this.f41107a) {
            case 0:
                sn.k0(this.f41108b, this.f41109c);
                return;
            case 1:
                sn.v0(this.f41108b, this.f41109c);
                return;
            case 2:
                k4.f(this.f41109c, r1.currentAccount, r1.f41561j1, null, this.f41108b.f41654qa);
                return;
            case 3:
                sn snVar = this.f41108b;
                String str = this.f41109c;
                if (str != null) {
                    snVar.getClass();
                    if (str.length() != 0) {
                        snVar.getMessagesController().sendBotStart(snVar.f41512f, str);
                        return;
                    }
                }
                snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", snVar.f41519f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f41108b.qa(this.f41109c);
                return;
            case 5:
                Activity parentActivity = this.f41108b.getParentActivity();
                pf.d.r(parentActivity, "tel:" + this.f41109c);
                return;
            case 6:
                AndroidUtilities.addToClipboard(this.f41109c);
                org.telegram.messenger.sl.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f41108b));
                return;
            case 7:
                sn.J0(this.f41108b, this.f41109c);
                return;
            case 8:
                Activity parentActivity2 = this.f41108b.getParentActivity();
                pf.d.r(parentActivity2, "tel:" + this.f41109c);
                return;
            case 9:
                AndroidUtilities.addToClipboard(this.f41109c);
                org.telegram.messenger.sl.p(R.string.PhoneCopied, org.telegram.ui.Components.xc.a0(this.f41108b));
                return;
            case 10:
                this.f41108b.ia(this.f41109c, false);
                return;
            case 11:
                sn snVar2 = this.f41108b;
                snVar2.getClass();
                snVar2.presentFragment(new org.telegram.ui.Wallet.j9(this.f41109c));
                return;
            case 12:
                sn snVar3 = this.f41108b;
                String str2 = snVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = snVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f41109c));
                pf.d.t(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f41108b.getParentActivity();
                pf.d.r(parentActivity4, "https://fragment.com/username/" + this.f41109c);
                return;
        }
    }
}
