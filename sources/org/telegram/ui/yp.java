package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yp implements fp {
    public final TLObject f52375a;
    public final nq f52376b;

    public yp(nq nqVar, TLObject tLObject) {
        this.f52376b = nqVar;
        this.f52375a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        nq.h0(this.f52376b, user);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f52375a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            nq.b0(this.f52376b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
