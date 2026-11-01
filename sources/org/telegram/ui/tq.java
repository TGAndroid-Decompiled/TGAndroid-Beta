package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements fq {
    public final TLObject f41711a;
    public final pr f41712b;

    public tq(pr prVar, TLObject tLObject) {
        this.f41712b = prVar;
        this.f41711a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.h0(this.f41712b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41711a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.b0(this.f41712b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
