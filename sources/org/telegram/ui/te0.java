package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class te0 implements g90 {
    public final cf0 f50018a;

    public te0(cf0 cf0Var) {
        this.f50018a = cf0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f50018a.k0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            cf0 cf0Var = this.f50018a;
            cf0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < cf0Var.f44785i0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) cf0Var.f44785i0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ue0 l02 = cf0Var.l0();
                        cf0Var.f44785i0.remove(i7);
                        cf0Var.f44786j0.add(0, tL_chatInviteExported2);
                        cf0Var.n0(l02);
                        return;
                    }
                    cf0Var.f44785i0.set(i7, tL_chatInviteExported2);
                    cf0Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.i3(new zc0(9, this, tLObject), 200L);
        }
    }
}
