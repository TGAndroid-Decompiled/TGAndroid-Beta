package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp implements jp {
    public final TLObject f51438a;
    public final qq f51439b;

    public wp(qq qqVar, TLObject tLObject) {
        this.f51439b = qqVar;
        this.f51438a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.f51439b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f51438a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qq.b0(this.f51439b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
