package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class rm implements Runnable {

    public final int f41969a;

    public final dn f41970b;

    public final TLRPC.Chat f41971c;

    public rm(dn dnVar, TLRPC.Chat chat, int i10) {
        this.f41969a = i10;
        this.f41970b = dnVar;
        this.f41971c = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f41969a;
        TLRPC.Chat chat = this.f41971c;
        dn dnVar = this.f41970b;
        switch (i10) {
            case 0:
                dnVar.r(chat);
                break;
            case 1:
                dnVar.b(chat);
                break;
            case 2:
                dnVar.f37446a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.mc.a0(dnVar.f37446a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
