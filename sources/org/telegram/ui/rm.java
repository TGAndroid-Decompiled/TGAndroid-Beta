package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rm implements Runnable {
    public final int f41189a;
    public final dn f41190b;
    public final TLRPC.Chat f41191c;

    public rm(dn dnVar, TLRPC.Chat chat, int i10) {
        this.f41189a = i10;
        this.f41190b = dnVar;
        this.f41191c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f41189a;
        TLRPC.Chat chat = this.f41191c;
        dn dnVar = this.f41190b;
        switch (i10) {
            case 0:
                dnVar.u(chat);
                return;
            case 1:
                dnVar.a(chat);
                return;
            case 2:
                dnVar.f36660a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(dnVar.f36660a);
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
