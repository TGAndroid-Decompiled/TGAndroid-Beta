package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ve0 implements i90 {
    public final ef0 f52957a;

    public ve0(ef0 ef0Var) {
        this.f52957a = ef0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f52957a.k0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ef0 ef0Var = this.f52957a;
            ef0Var.i0(tL_chatInviteExported2);
            for (int i7 = 0; i7 < ef0Var.f47530j0.size(); i7++) {
                if (((TLRPC.TL_chatInviteExported) ef0Var.f47530j0.get(i7)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        we0 l02 = ef0Var.l0();
                        ef0Var.f47530j0.remove(i7);
                        ef0Var.f47531k0.add(0, tL_chatInviteExported2);
                        ef0Var.n0(l02);
                        return;
                    }
                    ef0Var.f47530j0.set(i7, tL_chatInviteExported2);
                    ef0Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.g0.h3(new bd0(6, this, tLObject), 200L);
        }
    }
}
