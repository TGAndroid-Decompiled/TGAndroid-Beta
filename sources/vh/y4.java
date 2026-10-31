package vh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un;
public final class y4 extends z4 {
    public final TLRPC.Chat f52204b;

    public y4(String str, TLRPC.Chat chat) {
        super(str);
        this.f52204b = chat;
    }

    @Override
    public final String a() {
        return cd.L0(2131754819, null);
    }

    @Override
    public final String b() {
        return this.f52204b.title;
    }

    @Override
    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        k2Var.presentFragment(un.ha(-this.f52204b.f19793id));
    }

    @Override
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        TLRPC.Chat chat = this.f52204b;
        r8Var.q(chat);
        imageReceiver.i0(chat, r8Var, null);
    }
}
