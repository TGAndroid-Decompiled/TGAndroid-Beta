package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements yp {
    public final TLObject f41735a;
    public final hr f41736b;

    public tq(hr hrVar, TLObject tLObject) {
        this.f41736b = hrVar;
        this.f41735a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f41736b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41735a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            hr.W(this.f41736b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
