package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ue implements Runnable {
    public final int f42407a;
    public final zn f42408b;
    public final String f42409c;

    public ue(zn znVar, String str, int i10) {
        this.f42407a = i10;
        this.f42408b = znVar;
        this.f42409c = str;
    }

    @Override
    public final void run() {
        switch (this.f42407a) {
            case 0:
                zn.q1(this.f42408b, this.f42409c);
                return;
            case 1:
                zn.u1(this.f42408b, this.f42409c);
                return;
            case 2:
                i4.f(this.f42409c, r1.currentAccount, r1.X0, null, this.f42408b.f44763ea);
                return;
            case 3:
                zn znVar = this.f42408b;
                String str = this.f42409c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f44765f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f42408b.qa(this.f42409c);
                return;
            case 5:
                this.f42408b.ia(this.f42409c, false);
                return;
            case 6:
                Activity parentActivity = this.f42408b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f42409c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f42409c);
                org.telegram.messenger.bi.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.f42408b));
                return;
            case 8:
                zn.d1(this.f42408b, this.f42409c);
                return;
            case 9:
                Activity parentActivity2 = this.f42408b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f42409c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f42409c);
                org.telegram.messenger.bi.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.f42408b));
                return;
            case 11:
                zn znVar2 = this.f42408b;
                znVar2.getClass();
                znVar2.presentFragment(new org.telegram.ui.Wallet.j8(this.f42409c));
                return;
            case 12:
                zn znVar3 = this.f42408b;
                String str2 = znVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = znVar3.getParentActivity();
                StringBuilder v = a1.g.v(str2);
                v.append(Uri.encode(this.f42409c));
                of.f.u(parentActivity3, v.toString());
                return;
            default:
                Activity parentActivity4 = this.f42408b.getParentActivity();
                of.f.s(parentActivity4, "https://fragment.com/username/" + this.f42409c);
                return;
        }
    }
}
