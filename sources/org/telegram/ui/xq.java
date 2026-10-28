package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq implements fq {
    public final TLObject f45757a;
    public final mr f45758b;

    public xq(mr mrVar, TLObject tLObject) {
        this.f45758b = mrVar;
        this.f45757a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        mr.d0(this.f45758b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f45757a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            mr.X(this.f45758b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
