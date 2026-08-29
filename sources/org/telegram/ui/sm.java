package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f42426a;
    public final fn f42427b;
    public final TLRPC.Chat f42428c;

    public sm(fn fnVar, TLRPC.Chat chat, int i10) {
        this.f42426a = i10;
        this.f42427b = fnVar;
        this.f42428c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f42426a;
        TLRPC.Chat chat = this.f42428c;
        fn fnVar = this.f42427b;
        switch (i10) {
            case 0:
                fnVar.r(chat);
                return;
            case 1:
                fnVar.b(chat);
                return;
            case 2:
                fnVar.f38212a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(fnVar.f38212a);
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
