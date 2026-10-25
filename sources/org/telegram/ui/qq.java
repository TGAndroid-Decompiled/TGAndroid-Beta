package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements dq {
    public final TLObject f42893a;
    public final kr f42894b;

    public qq(kr krVar, TLObject tLObject) {
        this.f42894b = krVar;
        this.f42893a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        kr.d0(this.f42894b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42893a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            kr.X(this.f42894b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
