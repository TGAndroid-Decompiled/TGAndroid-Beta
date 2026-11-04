package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f49531a;
    public final hm f49532b;
    public final TLRPC.Chat f49533c;

    public sl(hm hmVar, TLRPC.Chat chat, int i3) {
        this.f49531a = i3;
        this.f49532b = hmVar;
        this.f49533c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i3 = this.f49531a;
        TLRPC.Chat chat = this.f49533c;
        hm hmVar = this.f49532b;
        switch (i3) {
            case 0:
                hmVar.m(chat);
                return;
            case 1:
                hmVar.a(chat);
                return;
            case 2:
                hmVar.f45934a.Ka(chat);
                return;
            default:
                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(hmVar.f45934a);
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                a02.Q(2131623989, 36, org.telegram.messenger.bd.a0(null, null, 2131742846, str)).k(true);
                return;
        }
    }
}
