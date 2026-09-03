package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements hq {
    public final TLObject f42194a;
    public final qr f42195b;

    public vq(qr qrVar, TLObject tLObject) {
        this.f42195b = qrVar;
        this.f42194a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f42195b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42194a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f42195b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
