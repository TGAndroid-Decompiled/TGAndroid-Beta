package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements aq {
    public final TLObject f42103a;
    public final long f42104b;
    public final boolean f42105c;
    public final jr d;

    public tq(jr jrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = jrVar;
        this.f42103a = tLObject;
        this.f42104b = j10;
        this.f42105c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42103a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        jr jrVar = this.d;
        cr crVar = jrVar.f38643m1;
        long j10 = this.f42104b;
        if (crVar != null && i10 == 1) {
            crVar.b(j10);
        } else if (crVar != null) {
            crVar.c(j10, tLObject);
        }
        if (this.f42105c) {
            jrVar.removeSelfFromStack();
        }
    }
}
