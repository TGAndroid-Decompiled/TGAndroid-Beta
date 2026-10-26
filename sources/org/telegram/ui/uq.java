package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uq implements dq {
    public final TLObject f44514a;
    public final long f44515b;
    public final boolean f44516c;
    public final kr d;

    public uq(kr krVar, TLObject tLObject, long j10, boolean z10) {
        this.d = krVar;
        this.f44514a = tLObject;
        this.f44515b = j10;
        this.f44516c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        kr.d0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44514a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        kr krVar = this.d;
        dr drVar = krVar.l1;
        long j10 = this.f44515b;
        if (drVar != null && i10 == 1) {
            drVar.b(j10);
        } else if (drVar != null) {
            drVar.c(j10, tLObject);
        }
        if (this.f44516c) {
            krVar.removeSelfFromStack();
        }
    }
}
