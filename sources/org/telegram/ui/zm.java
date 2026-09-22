package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f40257a;
    public final ln f40258b;
    public final TLRPC.Chat f40259c;

    public zm(ln lnVar, TLRPC.Chat chat, int i10) {
        this.f40257a = i10;
        this.f40258b = lnVar;
        this.f40259c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f40257a;
        TLRPC.Chat chat = this.f40259c;
        ln lnVar = this.f40258b;
        switch (i10) {
            case 0:
                lnVar.x(chat);
                return;
            case 1:
                lnVar.b(chat);
                return;
            case 2:
                lnVar.f35505a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lnVar.f35505a);
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
