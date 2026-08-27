package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class uq implements aq {

    public final TLObject f43271a;

    public final lr f43272b;

    public uq(lr lrVar, TLObject tLObject) {
        this.f43272b = lrVar;
        this.f43271a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        lr.c0(this.f43272b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43271a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            lr.W(this.f43272b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
