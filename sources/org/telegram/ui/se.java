package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f43478a;
    public final un f43479b;
    public final String f43480c;

    public se(un unVar, String str, int i10) {
        this.f43478a = i10;
        this.f43479b = unVar;
        this.f43480c = str;
    }

    @Override
    public final void run() {
        switch (this.f43478a) {
            case 0:
                un.o0(this.f43479b, this.f43480c);
                return;
            case 1:
                un.g0(this.f43479b, this.f43480c);
                return;
            case 2:
                j4.f(this.f43480c, r1.currentAccount, r1.f44295j1, null, this.f43479b.f44388qa);
                return;
            case 3:
                un unVar = this.f43479b;
                String str = this.f43480c;
                if (str != null) {
                    unVar.getClass();
                    if (str.length() != 0) {
                        unVar.getMessagesController().sendBotStart(unVar.f44245f, str);
                        return;
                    }
                }
                unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", unVar.f44252f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f43479b.va(this.f43480c);
                return;
            case 5:
                this.f43479b.na(this.f43480c, false);
                return;
            case 6:
                Activity parentActivity = this.f43479b.getParentActivity();
                qf.d.r(parentActivity, "tel:" + this.f43480c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f43480c);
                org.telegram.messenger.vh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.f43479b));
                return;
            case 8:
                un.e0(this.f43479b, this.f43480c);
                return;
            case 9:
                Activity parentActivity2 = this.f43479b.getParentActivity();
                qf.d.r(parentActivity2, "tel:" + this.f43480c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f43480c);
                org.telegram.messenger.vh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.f43479b));
                return;
            case 11:
                un unVar2 = this.f43479b;
                unVar2.getClass();
                unVar2.presentFragment(new org.telegram.ui.Wallet.i9(this.f43480c));
                return;
            case 12:
                un unVar3 = this.f43479b;
                String str2 = unVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = unVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f43480c));
                qf.d.t(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f43479b.getParentActivity();
                qf.d.r(parentActivity4, "https://fragment.com/username/" + this.f43480c);
                return;
        }
    }
}
