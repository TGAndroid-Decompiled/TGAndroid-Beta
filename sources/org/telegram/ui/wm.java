package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wm implements Runnable {
    public final int f39403a;
    public final in f39404b;
    public final TLRPC.Chat f39405c;

    public wm(in inVar, TLRPC.Chat chat, int i10) {
        this.f39403a = i10;
        this.f39404b = inVar;
        this.f39405c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f39403a;
        TLRPC.Chat chat = this.f39405c;
        in inVar = this.f39404b;
        switch (i10) {
            case 0:
                inVar.x(chat);
                return;
            case 1:
                inVar.b(chat);
                return;
            case 2:
                inVar.f34556a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(inVar.f34556a);
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
