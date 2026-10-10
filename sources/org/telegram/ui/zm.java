package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f44737a;
    public final ln f44738b;
    public final TLRPC.Chat f44739c;

    public zm(ln lnVar, TLRPC.Chat chat, int i10) {
        this.f44737a = i10;
        this.f44738b = lnVar;
        this.f44739c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f44737a;
        TLRPC.Chat chat = this.f44739c;
        ln lnVar = this.f44738b;
        switch (i10) {
            case 0:
                lnVar.v(chat);
                return;
            case 1:
                lnVar.a(chat);
                return;
            case 2:
                lnVar.f39680a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(lnVar.f39680a);
                int i11 = R.raw.contact_check;
                int i12 = R.string.YouJoinedChannel;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(i11, 36, LocaleController.formatString(i12, str)).k(true);
                return;
        }
    }
}
