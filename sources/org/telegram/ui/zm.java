package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f40236a;
    public final ln f40237b;
    public final TLRPC.Chat f40238c;

    public zm(ln lnVar, TLRPC.Chat chat, int i10) {
        this.f40236a = i10;
        this.f40237b = lnVar;
        this.f40238c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f40236a;
        TLRPC.Chat chat = this.f40238c;
        ln lnVar = this.f40237b;
        switch (i10) {
            case 0:
                lnVar.x(chat);
                return;
            case 1:
                lnVar.b(chat);
                return;
            case 2:
                lnVar.f35482a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lnVar.f35482a);
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
