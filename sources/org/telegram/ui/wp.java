package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp implements jp {
    public final TLObject f51414a;
    public final rq f51415b;

    public wp(rq rqVar, TLObject tLObject) {
        this.f51415b = rqVar;
        this.f51414a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f51415b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f51414a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.f51415b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
