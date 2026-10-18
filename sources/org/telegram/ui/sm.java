package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f41125a;
    public final en f41126b;
    public final TLRPC.Chat f41127c;

    public sm(en enVar, TLRPC.Chat chat, int i10) {
        this.f41125a = i10;
        this.f41126b = enVar;
        this.f41127c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f41125a;
        TLRPC.Chat chat = this.f41127c;
        en enVar = this.f41126b;
        switch (i10) {
            case 0:
                enVar.u(chat);
                return;
            case 1:
                enVar.a(chat);
                return;
            case 2:
                enVar.f36557a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(enVar.f36557a);
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
