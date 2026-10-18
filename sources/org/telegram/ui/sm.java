package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f41160a;
    public final en f41161b;
    public final TLRPC.Chat f41162c;

    public sm(en enVar, TLRPC.Chat chat, int i10) {
        this.f41160a = i10;
        this.f41161b = enVar;
        this.f41162c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f41160a;
        TLRPC.Chat chat = this.f41162c;
        en enVar = this.f41161b;
        switch (i10) {
            case 0:
                enVar.u(chat);
                return;
            case 1:
                enVar.a(chat);
                return;
            case 2:
                enVar.f36573a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(enVar.f36573a);
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
