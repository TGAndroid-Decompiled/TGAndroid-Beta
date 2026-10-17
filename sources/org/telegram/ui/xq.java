package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq implements cr {
    public final jr f43231a;

    public xq(jr jrVar) {
        this.f43231a = jrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.f43231a;
        if (jrVar.K.f(j10) == null) {
            dr w02 = jrVar.w0();
            jrVar.F.add(tLObject);
            jrVar.K.k(tLObject, j10);
            jrVar.z0(jrVar.F);
            jrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
        jr jrVar = this.f43231a;
        if (jrVar.K.f(j10) == null) {
            dr w02 = jrVar.w0();
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
            jrVar.f38304s.kicked_count++;
            jrVar.F.add(tL_channelParticipantBanned);
            jrVar.K.k(tL_channelParticipantBanned, j10);
            jrVar.z0(jrVar.F);
            jrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
