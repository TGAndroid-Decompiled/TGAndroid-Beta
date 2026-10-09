package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f44693a;
    public final ln f44694b;
    public final TLRPC.Chat f44695c;

    public zm(ln lnVar, TLRPC.Chat chat, int i10) {
        this.f44693a = i10;
        this.f44694b = lnVar;
        this.f44695c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f44693a;
        TLRPC.Chat chat = this.f44695c;
        ln lnVar = this.f44694b;
        switch (i10) {
            case 0:
                lnVar.v(chat);
                return;
            case 1:
                lnVar.a(chat);
                return;
            case 2:
                lnVar.f39636a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(lnVar.f39636a);
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
