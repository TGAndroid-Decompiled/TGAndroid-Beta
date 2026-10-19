package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements yp {
    public final TLObject f41510a;
    public final hr f41511b;

    public sq(hr hrVar, TLObject tLObject) {
        this.f41511b = hrVar;
        this.f41510a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f41511b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41510a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            hr.W(this.f41511b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
