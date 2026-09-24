package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements hq {
    public final TLObject f38776a;
    public final pr f38777b;

    public vq(pr prVar, TLObject tLObject) {
        this.f38777b = prVar;
        this.f38776a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f38777b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f38776a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f38777b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
