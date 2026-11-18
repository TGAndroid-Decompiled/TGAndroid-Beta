package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements j90 {
    public final gf0 f53821a;

    public xe0(gf0 gf0Var) {
        this.f53821a = gf0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f53821a.k0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            gf0 gf0Var = this.f53821a;
            gf0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < gf0Var.f48012j0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) gf0Var.f48012j0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ye0 l02 = gf0Var.l0();
                        gf0Var.f48012j0.remove(i7);
                        gf0Var.f48013k0.add(0, tL_chatInviteExported2);
                        gf0Var.n0(l02);
                        return;
                    }
                    gf0Var.f48012j0.set(i7, tL_chatInviteExported2);
                    gf0Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.h3(new we0(0, this, tLObject), 200L);
        }
    }
}
