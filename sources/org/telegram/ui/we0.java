package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class we0 implements j90 {
    public final ff0 f51012a;

    public we0(ff0 ff0Var) {
        this.f51012a = ff0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f51012a.k0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ff0 ff0Var = this.f51012a;
            ff0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < ff0Var.f45742i0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) ff0Var.f45742i0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        xe0 l02 = ff0Var.l0();
                        ff0Var.f45742i0.remove(i7);
                        ff0Var.f45743j0.add(0, tL_chatInviteExported2);
                        ff0Var.n0(l02);
                        return;
                    }
                    ff0Var.f45742i0.set(i7, tL_chatInviteExported2);
                    ff0Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.i3(new tc0(10, this, tLObject), 200L);
        }
    }
}
