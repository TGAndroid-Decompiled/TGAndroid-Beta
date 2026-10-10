package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements kq {
    public final TLObject f44441a;
    public final tr f44442b;

    public yq(tr trVar, TLObject tLObject) {
        this.f44442b = trVar;
        this.f44441a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        tr.c0(this.f44442b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44441a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            tr.W(this.f44442b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
