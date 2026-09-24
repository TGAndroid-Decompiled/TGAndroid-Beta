package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements hq {
    public final TLObject f40552a;
    public final long f40553b;
    public final boolean f40554c;
    public final pr d;

    public zq(pr prVar, TLObject tLObject, long j3, boolean z10) {
        this.d = prVar;
        this.f40552a = tLObject;
        this.f40553b = j3;
        this.f40554c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40552a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        pr prVar = this.d;
        ir irVar = prVar.f36625m1;
        long j3 = this.f40553b;
        if (irVar != null && i10 == 1) {
            irVar.b(j3);
        } else if (irVar != null) {
            irVar.c(j3, tLObject);
        }
        if (this.f40554c) {
            prVar.removeSelfFromStack();
        }
    }
}
