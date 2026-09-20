package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements kq {
    public final TLObject f39990a;
    public final sr f39991b;

    public yq(sr srVar, TLObject tLObject) {
        this.f39991b = srVar;
        this.f39990a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f39991b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39990a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            sr.W(this.f39991b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
