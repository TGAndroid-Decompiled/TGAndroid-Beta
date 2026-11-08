package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class up implements hp {
    public final TLObject f50382a;
    public final oq f50383b;

    public up(oq oqVar, TLObject tLObject) {
        this.f50383b = oqVar;
        this.f50382a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        oq.h0(this.f50383b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f50382a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            oq.b0(this.f50383b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
