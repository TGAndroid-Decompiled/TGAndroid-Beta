package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class se implements Runnable {
    public final int f43304a;
    public final wn f43305b;
    public final String f43306c;

    public se(wn wnVar, String str, int i10) {
        this.f43304a = i10;
        this.f43305b = wnVar;
        this.f43306c = str;
    }

    @Override
    public final void run() {
        switch (this.f43304a) {
            case 0:
                wn.f0(this.f43305b, this.f43306c);
                return;
            case 1:
                wn.g1(this.f43305b, this.f43306c);
                return;
            case 2:
                j4.f(this.f43306c, r1.currentAccount, r1.f45163j1, null, this.f43305b.f45309ua);
                return;
            case 3:
                wn wnVar = this.f43305b;
                String str = this.f43306c;
                if (str != null) {
                    wnVar.getClass();
                    if (str.length() != 0) {
                        wnVar.getMessagesController().sendBotStart(wnVar.f45113f, str);
                        return;
                    }
                }
                wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", wnVar.f45168j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f43305b.ya(this.f43306c);
                return;
            case 5:
                wn wnVar2 = this.f43305b;
                wnVar2.getClass();
                wnVar2.presentFragment(new org.telegram.ui.Wallet.i9(this.f43306c));
                return;
            case 6:
                wn wnVar3 = this.f43305b;
                String str2 = wnVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = wnVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f43306c));
                qf.d.t(parentActivity, u10.toString());
                return;
            case 7:
                this.f43305b.qa(this.f43306c, false);
                return;
            case 8:
                Activity parentActivity2 = this.f43305b.getParentActivity();
                qf.d.r(parentActivity2, "tel:" + this.f43306c);
                return;
            case 9:
                AndroidUtilities.addToClipboard(this.f43306c);
                org.telegram.messenger.wh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.f43305b));
                return;
            case 10:
                wn.j1(this.f43305b, this.f43306c);
                return;
            case 11:
                Activity parentActivity3 = this.f43305b.getParentActivity();
                qf.d.r(parentActivity3, "tel:" + this.f43306c);
                return;
            case 12:
                AndroidUtilities.addToClipboard(this.f43306c);
                org.telegram.messenger.wh.m(R.string.PhoneCopied, org.telegram.ui.Components.wc.b0(this.f43305b));
                return;
            default:
                Activity parentActivity4 = this.f43305b.getParentActivity();
                qf.d.r(parentActivity4, "https://fragment.com/username/" + this.f43306c);
                return;
        }
    }
}
