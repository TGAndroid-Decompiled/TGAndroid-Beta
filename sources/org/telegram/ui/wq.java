package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements iq {
    public final TLObject f39072a;
    public final qr f39073b;

    public wq(qr qrVar, TLObject tLObject) {
        this.f39073b = qrVar;
        this.f39072a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f39073b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39072a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f39073b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
