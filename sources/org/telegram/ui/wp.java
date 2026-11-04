package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wp implements fp {
    public final TLObject f51581a;
    public final long f51582b;
    public final boolean f51583c;
    public final nq d;

    public wp(nq nqVar, TLObject tLObject, long j10, boolean z10) {
        this.d = nqVar;
        this.f51581a = tLObject;
        this.f51582b = j10;
        this.f51583c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        nq.h0(this.d, user);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f51581a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        nq nqVar = this.d;
        fq fqVar = nqVar.m1;
        long j10 = this.f51582b;
        if (fqVar != null && i3 == 1) {
            fqVar.b(j10);
        } else if (fqVar != null) {
            fqVar.c(j10, tLObject);
        }
        if (this.f51583c) {
            nqVar.removeSelfFromStack();
        }
    }
}
