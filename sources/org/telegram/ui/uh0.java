package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uh0 implements zb0 {
    public final ei0 f40684a;

    public uh0(ei0 ei0Var) {
        this.f40684a = ei0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f40684a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            ei0 ei0Var = this.f40684a;
            ei0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < ei0Var.f35596i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) ei0Var.f35596i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        vh0 f02 = ei0Var.f0();
                        ei0Var.f35596i0.remove(i10);
                        ei0Var.f35597j0.add(0, tL_chatInviteExported2);
                        ei0Var.h0(f02);
                        return;
                    }
                    ei0Var.f35596i0.set(i10, tL_chatInviteExported2);
                    ei0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new wc0(17, this, tLObject), 200L);
        }
    }
}
