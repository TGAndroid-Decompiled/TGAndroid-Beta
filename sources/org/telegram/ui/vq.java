package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements br {
    public final jr f43561a;

    public vq(jr jrVar) {
        this.f43561a = jrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.f43561a;
        if (jrVar.G.f(j10) == null) {
            cr v02 = jrVar.v0();
            jrVar.B.add(tLObject);
            jrVar.G.k(tLObject, j10);
            jrVar.y0(jrVar.B);
            jrVar.z0(v02);
        }
    }

    @Override
    public final void d(long j10) {
        jr jrVar = this.f43561a;
        if (jrVar.G.f(j10) == null) {
            cr v02 = jrVar.v0();
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
            tL_channelParticipantBanned.date = jrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = jrVar.getAccountInstance().getUserConfig().clientUserId;
            jrVar.f39598s.kicked_count++;
            jrVar.B.add(tL_channelParticipantBanned);
            jrVar.G.k(tL_channelParticipantBanned, j10);
            jrVar.y0(jrVar.B);
            jrVar.z0(v02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
