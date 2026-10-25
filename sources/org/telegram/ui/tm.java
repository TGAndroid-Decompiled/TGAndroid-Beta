package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tm implements Runnable {
    public final int f43866a;
    public final fn f43867b;
    public final TLRPC.Chat f43868c;

    public tm(fn fnVar, TLRPC.Chat chat, int i10) {
        this.f43866a = i10;
        this.f43867b = fnVar;
        this.f43868c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f43866a;
        TLRPC.Chat chat = this.f43868c;
        fn fnVar = this.f43867b;
        switch (i10) {
            case 0:
                fnVar.w(chat);
                return;
            case 1:
                fnVar.a(chat);
                return;
            case 2:
                fnVar.f39420a.ua(chat);
                return;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(fnVar.f39420a);
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
