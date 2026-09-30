package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements hq {
    public final TLObject f40665a;
    public final long f40666b;
    public final boolean f40667c;
    public final pr d;

    public zq(pr prVar, TLObject tLObject, long j3, boolean z10) {
        this.d = prVar;
        this.f40665a = tLObject;
        this.f40666b = j3;
        this.f40667c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40665a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        pr prVar = this.d;
        ir irVar = prVar.f36736m1;
        long j3 = this.f40666b;
        if (irVar != null && i10 == 1) {
            irVar.b(j3);
        } else if (irVar != null) {
            irVar.c(j3, tLObject);
        }
        if (this.f40667c) {
            prVar.removeSelfFromStack();
        }
    }
}
