package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class sq implements aq {

    public final TLObject f42680a;

    public final long f42681b;

    public final boolean f42682c;
    public final lr d;

    public sq(lr lrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = lrVar;
        this.f42680a = tLObject;
        this.f42681b = j10;
        this.f42682c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        lr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42680a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        lr lrVar = this.d;
        dr drVar = lrVar.f40201i1;
        long j10 = this.f42681b;
        if (drVar != null && i10 == 1) {
            drVar.b(j10);
        } else if (drVar != null) {
            drVar.c(j10, tLObject);
        }
        if (this.f42682c) {
            lrVar.removeSelfFromStack();
        }
    }
}
