package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class tq implements aq {

    public final TLObject f42994a;

    public final lr f42995b;

    public tq(lr lrVar, TLObject tLObject) {
        this.f42995b = lrVar;
        this.f42994a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        lr.c0(this.f42995b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42994a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            lr.W(this.f42995b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
