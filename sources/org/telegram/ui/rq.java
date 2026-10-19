package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq implements yp {
    public final TLObject f41261a;
    public final long f41262b;
    public final boolean f41263c;
    public final hr d;

    public rq(hr hrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = hrVar;
        this.f41261a = tLObject;
        this.f41262b = j10;
        this.f41263c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41261a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        hr hrVar = this.d;
        ar arVar = hrVar.f37736m1;
        long j10 = this.f41262b;
        if (arVar != null && i10 == 1) {
            arVar.b(j10);
        } else if (arVar != null) {
            arVar.c(j10, tLObject);
        }
        if (this.f41263c) {
            hrVar.removeSelfFromStack();
        }
    }
}
