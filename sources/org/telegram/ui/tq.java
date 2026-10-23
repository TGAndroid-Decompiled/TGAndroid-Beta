package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements yp {
    public final TLObject f41729a;
    public final hr f41730b;

    public tq(hr hrVar, TLObject tLObject) {
        this.f41730b = hrVar;
        this.f41729a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f41730b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41729a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            hr.W(this.f41730b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
