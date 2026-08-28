package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq implements yp {
    public final TLObject f42474a;
    public final jr f42475b;

    public rq(jr jrVar, TLObject tLObject) {
        this.f42475b = jrVar;
        this.f42474a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.b0(this.f42475b, user);
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42474a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.V(this.f42475b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
