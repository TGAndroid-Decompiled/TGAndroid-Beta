package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements aq {
    public final TLObject f42275a;
    public final jr f42276b;

    public vq(jr jrVar, TLObject tLObject) {
        this.f42276b = jrVar;
        this.f42275a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f42276b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42275a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f42276b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
