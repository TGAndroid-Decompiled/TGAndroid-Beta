package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq implements jq {
    public final TLObject f42930a;
    public final rr f42931b;

    public xq(rr rrVar, TLObject tLObject) {
        this.f42931b = rrVar;
        this.f42930a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f42931b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42930a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.U(this.f42931b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
