package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements gq {
    public final TLObject f40850a;
    public final pr f40851b;

    public zq(pr prVar, TLObject tLObject) {
        this.f40851b = prVar;
        this.f40850a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f40851b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40850a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f40851b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
