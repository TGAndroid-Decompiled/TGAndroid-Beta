package ph;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zn;
public final class a6 extends b6 {
    public final TLRPC.Chat f41305b;

    public a6(String str, TLRPC.Chat chat) {
        super(str);
        this.f41305b = chat;
    }

    @Override
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override
    public final String b() {
        return this.f41305b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(zn.R9(-this.f41305b.f19159id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat = this.f41305b;
        z8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, z8Var);
    }
}
