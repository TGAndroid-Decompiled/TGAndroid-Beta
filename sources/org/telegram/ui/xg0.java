package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements ab0 {
    public final hh0 f44517a;

    public xg0(hh0 hh0Var) {
        this.f44517a = hh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f44517a.d0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            hh0 hh0Var = this.f44517a;
            hh0Var.b0(tL_chatInviteExported2);
            for (int i9 = 0; i9 < hh0Var.f38799e0.size(); i9++) {
                if (((TLRPC.TL_chatInviteExported) hh0Var.f38799e0.get(i9)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        yg0 e02 = hh0Var.e0();
                        hh0Var.f38799e0.remove(i9);
                        hh0Var.f38801f0.add(0, tL_chatInviteExported2);
                        hh0Var.g0(e02);
                        return;
                    }
                    hh0Var.f38799e0.set(i9, tL_chatInviteExported2);
                    hh0Var.h0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new cf0(5, this, tLObject), 200L);
        }
    }
}
