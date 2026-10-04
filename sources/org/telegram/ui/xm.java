package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final int f42909a;
    public final kn f42910b;
    public final TLRPC.Chat f42911c;

    public xm(kn knVar, TLRPC.Chat chat, int i10) {
        this.f42909a = i10;
        this.f42910b = knVar;
        this.f42911c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f42909a;
        TLRPC.Chat chat = this.f42911c;
        kn knVar = this.f42910b;
        switch (i10) {
            case 0:
                knVar.x(chat);
                return;
            case 1:
                knVar.b(chat);
                return;
            case 2:
                knVar.f38003a.ja(chat);
                return;
            default:
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(knVar.f38003a);
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
