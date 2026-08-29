package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements aq {
    public final TLObject f42446a;
    public final long f42447b;
    public final boolean f42448c;
    public final jr d;

    public sq(jr jrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = jrVar;
        this.f42446a = tLObject;
        this.f42447b = j10;
        this.f42448c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42446a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        jr jrVar = this.d;
        cr crVar = jrVar.f39640i1;
        long j10 = this.f42447b;
        if (crVar != null && i10 == 1) {
            crVar.b(j10);
        } else if (crVar != null) {
            crVar.c(j10, tLObject);
        }
        if (this.f42448c) {
            jrVar.removeSelfFromStack();
        }
    }
}
