package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th0 implements yb0 {
    public final di0 f40117a;

    public th0(di0 di0Var) {
        this.f40117a = di0Var;
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f40117a.e0(tL_chatInviteExported);
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
            di0 di0Var = this.f40117a;
            di0Var.c0(tL_chatInviteExported2);
            for (int i10 = 0; i10 < di0Var.f35042i0.size(); i10++) {
                if (((TLRPC.TL_chatInviteExported) di0Var.f35042i0.get(i10)).link.equals(tL_chatInviteExported.link)) {
                    if (tL_chatInviteExported2.revoked) {
                        uh0 f02 = di0Var.f0();
                        di0Var.f35042i0.remove(i10);
                        di0Var.f35043j0.add(0, tL_chatInviteExported2);
                        di0Var.h0(f02);
                        return;
                    }
                    di0Var.f35042i0.set(i10, tL_chatInviteExported2);
                    di0Var.i0(true);
                    return;
                }
            }
        }
    }

    @Override
    public final void c(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            AndroidUtilities.runOnUIThread(new se0(12, this, tLObject), 200L);
        }
    }
}
