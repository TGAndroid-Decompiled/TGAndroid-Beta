package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xp implements fp {
    public final TLObject f52070a;
    public final nq f52071b;

    public xp(nq nqVar, TLObject tLObject) {
        this.f52071b = nqVar;
        this.f52070a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        nq.h0(this.f52071b, user);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f52070a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            nq.b0(this.f52071b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
