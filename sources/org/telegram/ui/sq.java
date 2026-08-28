package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements yp {
    public final TLObject f42747a;
    public final jr f42748b;

    public sq(jr jrVar, TLObject tLObject) {
        this.f42748b = jrVar;
        this.f42747a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.b0(this.f42748b, user);
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42747a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.V(this.f42748b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
