package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements dq {
    public final TLObject f44879a;
    public final kr f44880b;

    public vq(kr krVar, TLObject tLObject) {
        this.f44880b = krVar;
        this.f44879a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        kr.d0(this.f44880b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44879a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            kr.X(this.f44880b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
