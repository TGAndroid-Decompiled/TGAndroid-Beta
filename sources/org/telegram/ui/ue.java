package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class ue implements Runnable {
    public final int f42405a;
    public final zn f42406b;
    public final String f42407c;

    public ue(zn znVar, String str, int i10) {
        this.f42405a = i10;
        this.f42406b = znVar;
        this.f42407c = str;
    }

    @Override
    public final void run() {
        switch (this.f42405a) {
            case 0:
                zn.q1(this.f42406b, this.f42407c);
                return;
            case 1:
                zn.u1(this.f42406b, this.f42407c);
                return;
            case 2:
                i4.f(this.f42407c, r1.currentAccount, r1.X0, null, this.f42406b.f44761ea);
                return;
            case 3:
                zn znVar = this.f42406b;
                String str = this.f42407c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f44763f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f42406b.qa(this.f42407c);
                return;
            case 5:
                this.f42406b.ia(this.f42407c, false);
                return;
            case 6:
                Activity parentActivity = this.f42406b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f42407c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f42407c);
                org.telegram.messenger.bi.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.f42406b));
                return;
            case 8:
                zn.d1(this.f42406b, this.f42407c);
                return;
            case 9:
                Activity parentActivity2 = this.f42406b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f42407c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f42407c);
                org.telegram.messenger.bi.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.f42406b));
                return;
            case 11:
                zn znVar2 = this.f42406b;
                znVar2.getClass();
                znVar2.presentFragment(new org.telegram.ui.Wallet.i8(this.f42407c));
                return;
            case 12:
                zn znVar3 = this.f42406b;
                String str2 = znVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = znVar3.getParentActivity();
                StringBuilder v = a1.g.v(str2);
                v.append(Uri.encode(this.f42407c));
                of.f.u(parentActivity3, v.toString());
                return;
            default:
                Activity parentActivity4 = this.f42406b.getParentActivity();
                of.f.s(parentActivity4, "https://fragment.com/username/" + this.f42407c);
                return;
        }
    }
}
