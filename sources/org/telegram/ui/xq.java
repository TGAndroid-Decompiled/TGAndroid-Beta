package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq implements jq {
    public final TLObject f42992a;
    public final rr f42993b;

    public xq(rr rrVar, TLObject tLObject) {
        this.f42993b = rrVar;
        this.f42992a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f42993b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42992a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.U(this.f42993b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
