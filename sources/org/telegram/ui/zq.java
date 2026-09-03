package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements hq {
    public final TLObject f44002a;
    public final long f44003b;
    public final boolean f44004c;
    public final qr d;

    public zq(qr qrVar, TLObject tLObject, long j10, boolean z4) {
        this.d = qrVar;
        this.f44002a = tLObject;
        this.f44003b = j10;
        this.f44004c = z4;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44002a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qr qrVar = this.d;
        jr jrVar = qrVar.f40591j1;
        long j10 = this.f44003b;
        if (jrVar != null && i10 == 1) {
            jrVar.b(j10);
        } else if (jrVar != null) {
            jrVar.c(j10, tLObject);
        }
        if (this.f44004c) {
            qrVar.removeSelfFromStack();
        }
    }
}
