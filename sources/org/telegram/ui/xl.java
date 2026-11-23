package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f53820a;
    public final mm f53821b;
    public final TLRPC.Chat f53822c;

    public xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.f53820a = i7;
        this.f53821b = mmVar;
        this.f53822c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i7 = this.f53820a;
        TLRPC.Chat chat = this.f53822c;
        mm mmVar = this.f53821b;
        switch (i7) {
            case 0:
                mmVar.n(chat);
                return;
            case 1:
                mmVar.a(chat);
                return;
            case 2:
                mmVar.f49910a.Na(chat);
                return;
            default:
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(mmVar.f49910a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                b02.Q(2131623990, 36, org.telegram.messenger.hd.a0(null, null, 2131742572, str)).k(true);
                return;
        }
    }
}
