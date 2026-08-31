package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final int f43107a;
    public final jn f43108b;
    public final TLRPC.Chat f43109c;

    public xm(jn jnVar, TLRPC.Chat chat, int i10) {
        this.f43107a = i10;
        this.f43108b = jnVar;
        this.f43109c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f43107a;
        TLRPC.Chat chat = this.f43109c;
        jn jnVar = this.f43108b;
        switch (i10) {
            case 0:
                jnVar.w(chat);
                return;
            case 1:
                jnVar.b(chat);
                return;
            case 2:
                jnVar.f38188a.ka(chat);
                return;
            default:
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(jnVar.f38188a);
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
