package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class te implements Runnable {
    public final int f42196a;
    public final zn f42197b;
    public final String f42198c;

    public te(zn znVar, String str, int i10) {
        this.f42196a = i10;
        this.f42197b = znVar;
        this.f42198c = str;
    }

    @Override
    public final void run() {
        switch (this.f42196a) {
            case 0:
                zn.q1(this.f42197b, this.f42198c);
                return;
            case 1:
                zn.u1(this.f42197b, this.f42198c);
                return;
            case 2:
                h4.f(this.f42198c, r1.currentAccount, r1.X0, null, this.f42197b.f44796ea);
                return;
            case 3:
                zn znVar = this.f42197b;
                String str = this.f42198c;
                if (str != null) {
                    znVar.getClass();
                    if (str.length() != 0) {
                        znVar.getMessagesController().sendBotStart(znVar.f44798f, str);
                        return;
                    }
                }
                znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f42197b.qa(this.f42198c);
                return;
            case 5:
                this.f42197b.ia(this.f42198c, false);
                return;
            case 6:
                Activity parentActivity = this.f42197b.getParentActivity();
                of.f.s(parentActivity, "tel:" + this.f42198c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f42198c);
                org.telegram.messenger.ai.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.f42197b));
                return;
            case 8:
                zn.d1(this.f42197b, this.f42198c);
                return;
            case 9:
                Activity parentActivity2 = this.f42197b.getParentActivity();
                of.f.s(parentActivity2, "tel:" + this.f42198c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f42198c);
                org.telegram.messenger.ai.p(R.string.PhoneCopied, org.telegram.ui.Components.ad.a0(this.f42197b));
                return;
            case 11:
                zn znVar2 = this.f42197b;
                znVar2.getClass();
                znVar2.presentFragment(new org.telegram.ui.Wallet.l8(this.f42198c));
                return;
            case 12:
                zn znVar3 = this.f42197b;
                String str2 = znVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = znVar3.getParentActivity();
                StringBuilder v = a1.g.v(str2);
                v.append(Uri.encode(this.f42198c));
                of.f.u(parentActivity3, v.toString());
                return;
            default:
                Activity parentActivity4 = this.f42197b.getParentActivity();
                of.f.s(parentActivity4, "https://fragment.com/username/" + this.f42198c);
                return;
        }
    }
}
