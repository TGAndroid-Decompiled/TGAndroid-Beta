package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements dq {
    public final TLObject f44882a;
    public final kr f44883b;

    public vq(kr krVar, TLObject tLObject) {
        this.f44883b = krVar;
        this.f44882a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        kr.d0(this.f44883b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44882a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            kr.X(this.f44883b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
