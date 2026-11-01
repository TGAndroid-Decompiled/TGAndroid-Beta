package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yf0 implements ka0 {
    public final ig0 f43660a;

    public yf0(ig0 ig0Var) {
        this.f43660a = ig0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f43660a.k0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ig0 ig0Var = this.f43660a;
            ig0Var.i0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ig0Var.f38038i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ig0Var.f38038i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        zf0 l02 = ig0Var.l0();
                        ig0Var.f38038i0.remove(i10);
                        ig0Var.f38039j0.add(0, tL_chatInviteExported2);
                        ig0Var.n0(l02);
                        return;
                    }
                    ig0Var.f38038i0.set(i10, tL_chatInviteExported2);
                    ig0Var.o0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            org.telegram.messenger.i0.h3(new if0(2, this, tLObject), 200L);
        }
    }
}
