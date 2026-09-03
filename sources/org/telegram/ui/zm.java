package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f40505a;
    public final ln f40506b;
    public final TLRPC.Chat f40507c;

    public zm(ln lnVar, TLRPC.Chat chat, int i10) {
        this.f40505a = i10;
        this.f40506b = lnVar;
        this.f40507c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f40505a;
        TLRPC.Chat chat = this.f40507c;
        ln lnVar = this.f40506b;
        switch (i10) {
            case 0:
                lnVar.v(chat);
                return;
            case 1:
                lnVar.b(chat);
                return;
            case 2:
                lnVar.f35808a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(lnVar.f35808a);
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
