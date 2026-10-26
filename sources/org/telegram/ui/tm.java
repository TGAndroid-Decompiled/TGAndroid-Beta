package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tm implements Runnable {
    public final int f43869a;
    public final fn f43870b;
    public final TLRPC.Chat f43871c;

    public tm(fn fnVar, TLRPC.Chat chat, int i10) {
        this.f43869a = i10;
        this.f43870b = fnVar;
        this.f43871c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f43869a;
        TLRPC.Chat chat = this.f43871c;
        fn fnVar = this.f43870b;
        switch (i10) {
            case 0:
                fnVar.w(chat);
                return;
            case 1:
                fnVar.a(chat);
                return;
            case 2:
                fnVar.f39423a.ua(chat);
                return;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(fnVar.f39423a);
                int i11 = R.raw.contact_check;
                int i12 = R.string.YouJoinedChannel;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                b02.R(i11, 36, LocaleController.formatString(i12, str)).k(true);
                return;
        }
    }
}
