package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg0 implements za0 {
    public final ih0 f43488a;

    public yg0(ih0 ih0Var) {
        this.f43488a = ih0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f43488a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ih0 ih0Var = this.f43488a;
            ih0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ih0Var.f37989i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ih0Var.f37989i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        zg0 f02 = ih0Var.f0();
                        ih0Var.f37989i0.remove(i10);
                        ih0Var.f37990j0.add(0, tL_chatInviteExported2);
                        ih0Var.h0(f02);
                        return;
                    }
                    ih0Var.f37989i0.set(i10, tL_chatInviteExported2);
                    ih0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new xg0(0, this, tLObject), 200L);
        }
    }
}
