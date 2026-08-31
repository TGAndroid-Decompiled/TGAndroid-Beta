package qh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class z5 extends a6 {
    public final TLRPC.Chat f46390b;

    public z5(String str, TLRPC.Chat chat) {
        super(str);
        this.f46390b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f46390b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(xn.R9(-this.f46390b.f20843id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat = this.f46390b;
        z8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, z8Var);
    }
}
