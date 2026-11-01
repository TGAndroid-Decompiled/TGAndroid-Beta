package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq implements fq {
    public final TLObject f43444a;
    public final long f43445b;
    public final boolean f43446c;
    public final pr d;

    public xq(pr prVar, TLObject tLObject, long j10, boolean z10) {
        this.d = prVar;
        this.f43444a = tLObject;
        this.f43445b = j10;
        this.f43446c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.h0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43444a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        pr prVar = this.d;
        ir irVar = prVar.l1;
        long j10 = this.f43445b;
        if (irVar != null && i10 == 1) {
            irVar.b(j10);
        } else if (irVar != null) {
            irVar.c(j10, tLObject);
        }
        if (this.f43446c) {
            prVar.removeSelfFromStack();
        }
    }
}
