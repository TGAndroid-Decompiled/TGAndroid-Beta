package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements yp {
    public final TLObject f42175a;
    public final long f42176b;
    public final boolean f42177c;
    public final jr d;

    public qq(jr jrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = jrVar;
        this.f42175a = tLObject;
        this.f42176b = j10;
        this.f42177c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.b0(this.d, user);
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f42175a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        jr jrVar = this.d;
        br brVar = jrVar.f39579i1;
        long j10 = this.f42176b;
        if (brVar != null && i9 == 1) {
            brVar.b(j10);
        } else if (brVar != null) {
            brVar.c(j10, tLObject);
        }
        if (this.f42177c) {
            jrVar.removeSelfFromStack();
        }
    }
}
