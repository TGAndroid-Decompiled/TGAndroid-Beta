package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements iq {
    public final TLObject f39757a;
    public final rr f39758b;

    public wq(rr rrVar, TLObject tLObject) {
        this.f39758b = rrVar;
        this.f39757a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f39758b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39757a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.W(this.f39758b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
