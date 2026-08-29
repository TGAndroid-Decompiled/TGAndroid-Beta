package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uq implements aq {
    public final TLObject f43307a;
    public final jr f43308b;

    public uq(jr jrVar, TLObject tLObject) {
        this.f43308b = jrVar;
        this.f43307a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f43308b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43307a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f43308b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
