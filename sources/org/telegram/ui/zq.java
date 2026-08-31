package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements hq {
    public final TLObject f43970a;
    public final long f43971b;
    public final boolean f43972c;
    public final qr d;

    public zq(qr qrVar, TLObject tLObject, long j10, boolean z4) {
        this.d = qrVar;
        this.f43970a = tLObject;
        this.f43971b = j10;
        this.f43972c = z4;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43970a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qr qrVar = this.d;
        jr jrVar = qrVar.f40623j1;
        long j10 = this.f43971b;
        if (jrVar != null && i10 == 1) {
            jrVar.b(j10);
        } else if (jrVar != null) {
            jrVar.c(j10, tLObject);
        }
        if (this.f43972c) {
            qrVar.removeSelfFromStack();
        }
    }
}
