package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements fq {
    public final TLObject f44212a;
    public final pr f44213b;

    public zq(pr prVar, TLObject tLObject) {
        this.f44213b = prVar;
        this.f44212a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.g0(this.f44213b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44212a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.a0(this.f44213b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
