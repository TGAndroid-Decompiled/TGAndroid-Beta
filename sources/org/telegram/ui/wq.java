package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements fq {
    public final TLObject f45382a;
    public final long f45383b;
    public final boolean f45384c;
    public final mr d;

    public wq(mr mrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = mrVar;
        this.f45382a = tLObject;
        this.f45383b = j10;
        this.f45384c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        mr.d0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f45382a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        mr mrVar = this.d;
        fr frVar = mrVar.l1;
        long j10 = this.f45383b;
        if (frVar != null && i10 == 1) {
            frVar.b(j10);
        } else if (frVar != null) {
            frVar.c(j10, tLObject);
        }
        if (this.f45384c) {
            mrVar.removeSelfFromStack();
        }
    }
}
