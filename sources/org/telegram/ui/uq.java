package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uq implements aq {
    public final TLObject f42034a;
    public final jr f42035b;

    public uq(jr jrVar, TLObject tLObject) {
        this.f42035b = jrVar;
        this.f42034a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f42035b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42034a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f42035b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
