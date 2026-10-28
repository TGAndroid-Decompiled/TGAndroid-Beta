package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vm implements Runnable {
    public final int f44381a;
    public final hn f44382b;
    public final TLRPC.Chat f44383c;

    public vm(hn hnVar, TLRPC.Chat chat, int i10) {
        this.f44381a = i10;
        this.f44382b = hnVar;
        this.f44383c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f44381a;
        TLRPC.Chat chat = this.f44383c;
        hn hnVar = this.f44382b;
        switch (i10) {
            case 0:
                hnVar.w(chat);
                return;
            case 1:
                hnVar.a(chat);
                return;
            case 2:
                hnVar.f39938a.xa(chat);
                return;
            default:
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(hnVar.f39938a);
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
