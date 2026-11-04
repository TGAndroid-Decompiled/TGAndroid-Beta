package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements fp {
    public final TLObject f49585a;
    public final nq f49586b;

    public sp(nq nqVar, TLObject tLObject) {
        this.f49586b = nqVar;
        this.f49585a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        nq.h0(this.f49586b, user);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f49585a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            nq.b0(this.f49586b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
