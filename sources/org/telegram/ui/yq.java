package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements fq {
    public final TLObject f46068a;
    public final mr f46069b;

    public yq(mr mrVar, TLObject tLObject) {
        this.f46069b = mrVar;
        this.f46068a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        mr.d0(this.f46069b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f46068a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            mr.X(this.f46069b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
