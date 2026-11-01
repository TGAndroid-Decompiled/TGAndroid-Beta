package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements fq {
    public final TLObject f44038a;
    public final pr f44039b;

    public zq(pr prVar, TLObject tLObject) {
        this.f44039b = prVar;
        this.f44038a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.h0(this.f44039b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44038a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.b0(this.f44039b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
