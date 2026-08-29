package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements aq {
    public final TLObject f43087a;
    public final jr f43088b;

    public tq(jr jrVar, TLObject tLObject) {
        this.f43088b = jrVar;
        this.f43087a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f43088b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43087a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f43088b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
