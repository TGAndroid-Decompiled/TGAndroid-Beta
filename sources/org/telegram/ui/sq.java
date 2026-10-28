package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements fq {
    public final TLObject f43383a;
    public final mr f43384b;

    public sq(mr mrVar, TLObject tLObject) {
        this.f43384b = mrVar;
        this.f43383a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        mr.d0(this.f43384b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43383a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            mr.X(this.f43384b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
