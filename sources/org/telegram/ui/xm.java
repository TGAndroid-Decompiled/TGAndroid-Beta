package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final int f39939a;
    public final jn f39940b;
    public final TLRPC.Chat f39941c;

    public xm(jn jnVar, TLRPC.Chat chat, int i10) {
        this.f39939a = i10;
        this.f39940b = jnVar;
        this.f39941c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f39939a;
        TLRPC.Chat chat = this.f39941c;
        jn jnVar = this.f39940b;
        switch (i10) {
            case 0:
                jnVar.v(chat);
                return;
            case 1:
                jnVar.b(chat);
                return;
            case 2:
                jnVar.f35381a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(jnVar.f35381a);
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
