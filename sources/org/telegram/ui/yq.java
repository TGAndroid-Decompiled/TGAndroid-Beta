package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements kq {
    public final TLObject f40012a;
    public final sr f40013b;

    public yq(sr srVar, TLObject tLObject) {
        this.f40013b = srVar;
        this.f40012a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f40013b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40012a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            sr.W(this.f40013b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
