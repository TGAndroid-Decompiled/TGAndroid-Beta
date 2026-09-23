package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final int f39304a;
    public final jn f39305b;
    public final TLRPC.Chat f39306c;

    public xm(jn jnVar, TLRPC.Chat chat, int i10) {
        this.f39304a = i10;
        this.f39305b = jnVar;
        this.f39306c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f39304a;
        TLRPC.Chat chat = this.f39306c;
        jn jnVar = this.f39305b;
        switch (i10) {
            case 0:
                jnVar.x(chat);
                return;
            case 1:
                jnVar.b(chat);
                return;
            case 2:
                jnVar.f34487a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(jnVar.f34487a);
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
