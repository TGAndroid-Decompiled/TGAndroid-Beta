package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements kq {
    public final TLObject f44478a;
    public final sr f44479b;

    public yq(sr srVar, TLObject tLObject) {
        this.f44479b = srVar;
        this.f44478a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f44479b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44478a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            sr.W(this.f44479b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
