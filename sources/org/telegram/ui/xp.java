package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xp implements kp {
    public final TLObject f53916a;
    public final rq f53917b;

    public xp(rq rqVar, TLObject tLObject) {
        this.f53917b = rqVar;
        this.f53916a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f53917b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f53916a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.f53917b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
