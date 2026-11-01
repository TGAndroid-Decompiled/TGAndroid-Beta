package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements fq {
    public final TLObject f43707a;
    public final pr f43708b;

    public yq(pr prVar, TLObject tLObject) {
        this.f43708b = prVar;
        this.f43707a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.h0(this.f43708b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43707a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.b0(this.f43708b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
