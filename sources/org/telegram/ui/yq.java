package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements gq {
    public final TLObject f40556a;
    public final long f40557b;
    public final boolean f40558c;
    public final pr d;

    public yq(pr prVar, TLObject tLObject, long j10, boolean z4) {
        this.d = prVar;
        this.f40556a = tLObject;
        this.f40557b = j10;
        this.f40558c = z4;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40556a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        pr prVar = this.d;
        ir irVar = prVar.f37467j1;
        long j10 = this.f40557b;
        if (irVar != null && i10 == 1) {
            irVar.b(j10);
        } else if (irVar != null) {
            irVar.c(j10, tLObject);
        }
        if (this.f40558c) {
            prVar.removeSelfFromStack();
        }
    }
}
