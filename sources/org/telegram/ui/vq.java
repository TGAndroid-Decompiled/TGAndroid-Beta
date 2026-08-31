package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements hq {
    public final TLObject f42274a;
    public final qr f42275b;

    public vq(qr qrVar, TLObject tLObject) {
        this.f42275b = qrVar;
        this.f42274a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f42275b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42274a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f42275b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
