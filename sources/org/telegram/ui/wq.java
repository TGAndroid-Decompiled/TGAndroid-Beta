package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements dq {
    public final TLObject f45540a;
    public final kr f45541b;

    public wq(kr krVar, TLObject tLObject) {
        this.f45541b = krVar;
        this.f45540a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        kr.d0(this.f45541b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f45540a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            kr.X(this.f45541b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
