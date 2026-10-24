package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rm implements Runnable {
    public final int f41185a;
    public final dn f41186b;
    public final TLRPC.Chat f41187c;

    public rm(dn dnVar, TLRPC.Chat chat, int i10) {
        this.f41185a = i10;
        this.f41186b = dnVar;
        this.f41187c = chat;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f41185a;
        TLRPC.Chat chat = this.f41187c;
        dn dnVar = this.f41186b;
        switch (i10) {
            case 0:
                dnVar.u(chat);
                return;
            case 1:
                dnVar.a(chat);
                return;
            case 2:
                dnVar.f36651a.pa(chat);
                return;
            default:
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(dnVar.f36651a);
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
