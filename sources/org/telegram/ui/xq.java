package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class xq implements dr {

    public final lr f44593a;

    public xq(lr lrVar) {
        this.f44593a = lrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        lr lrVar = this.f44593a;
        if (lrVar.G.f(j10) == null) {
            er erVarW0 = lrVar.w0();
            lrVar.B.add(tLObject);
            lrVar.G.k(tLObject, j10);
            lrVar.z0(lrVar.B);
            lrVar.A0(erVarW0);
        }
    }

    @Override
    public final void d(long j10) {
        lr lrVar = this.f44593a;
        if (lrVar.G.f(j10) == null) {
            er erVarW0 = lrVar.w0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j10 > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_channelParticipantBanned.date = lrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = lrVar.getAccountInstance().getUserConfig().clientUserId;
            lrVar.f40220s.kicked_count++;
            lrVar.B.add(tL_channelParticipantBanned);
            lrVar.G.k(tL_channelParticipantBanned, j10);
            lrVar.z0(lrVar.B);
            lrVar.A0(erVarW0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
