package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements dq {
    public final TLObject f45537a;
    public final kr f45538b;

    public wq(kr krVar, TLObject tLObject) {
        this.f45538b = krVar;
        this.f45537a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        kr.d0(this.f45538b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f45537a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            kr.X(this.f45538b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
