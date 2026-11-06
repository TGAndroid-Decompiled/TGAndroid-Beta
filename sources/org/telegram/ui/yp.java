package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yp implements hp {
    public final TLObject f52296a;
    public final long f52297b;
    public final boolean f52298c;
    public final oq d;

    public yp(oq oqVar, TLObject tLObject, long j3, boolean z9) {
        this.d = oqVar;
        this.f52296a = tLObject;
        this.f52297b = j3;
        this.f52298c = z9;
    }

    @Override
    public final void a(TLRPC.User user) {
        oq.h0(this.d, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f52296a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        oq oqVar = this.d;
        hq hqVar = oqVar.l1;
        long j3 = this.f52297b;
        if (hqVar != null && i7 == 1) {
            hqVar.b(j3);
        } else if (hqVar != null) {
            hqVar.c(j3, tLObject);
        }
        if (this.f52298c) {
            oqVar.removeSelfFromStack();
        }
    }
}
