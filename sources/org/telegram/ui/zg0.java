package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg0 implements cb0 {
    public final jh0 f46285a;

    public zg0(jh0 jh0Var) {
        this.f46285a = jh0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f46285a.g0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            jh0 jh0Var = this.f46285a;
            jh0Var.e0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < jh0Var.f40654i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) jh0Var.f40654i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        ah0 h02 = jh0Var.h0();
                        jh0Var.f40654i0.remove(i10);
                        jh0Var.f40655j0.add(0, tL_chatInviteExported2);
                        jh0Var.j0(h02);
                        return;
                    }
                    jh0Var.f40654i0.set(i10, tL_chatInviteExported2);
                    jh0Var.k0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new wb0(17, this, tLObject), 200L);
        }
    }
}
