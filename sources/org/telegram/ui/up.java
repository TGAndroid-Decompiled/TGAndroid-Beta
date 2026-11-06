package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class up implements hp {
    public final TLObject f50457a;
    public final oq f50458b;

    public up(oq oqVar, TLObject tLObject) {
        this.f50458b = oqVar;
        this.f50457a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        oq.h0(this.f50458b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f50457a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            oq.b0(this.f50458b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
