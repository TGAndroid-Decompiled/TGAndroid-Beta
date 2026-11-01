package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f41391a;
    public final fn f41392b;
    public final TLRPC.Chat f41393c;

    public sm(fn fnVar, TLRPC.Chat chat, int i10) {
        this.f41391a = i10;
        this.f41392b = fnVar;
        this.f41393c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f41391a;
        TLRPC.Chat chat = this.f41393c;
        fn fnVar = this.f41392b;
        switch (i10) {
            case 0:
                fnVar.p(chat);
                return;
            case 1:
                fnVar.a(chat);
                return;
            case 2:
                fnVar.f37191a.Fa(chat);
                return;
            default:
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(fnVar.f37191a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(2131623989, 36, org.telegram.messenger.dd.a0(null, null, 2131742861, str)).k(true);
                return;
        }
    }
}
