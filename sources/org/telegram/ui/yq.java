package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements dr {
    public final kr f46093a;

    public yq(kr krVar) {
        this.f46093a = krVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        kr krVar = this.f46093a;
        if (krVar.J.f(j10) == null) {
            er x02 = krVar.x0();
            krVar.E.add(tLObject);
            krVar.J.k(tLObject, j10);
            krVar.A0(krVar.E);
            krVar.B0(x02);
        }
    }

    @Override
    public final void d(long j10) {
        kr krVar = this.f46093a;
        if (krVar.J.f(j10) == null) {
            er x02 = krVar.x0();
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
            tL_channelParticipantBanned.date = krVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = krVar.getAccountInstance().getUserConfig().clientUserId;
            krVar.f41041r.kicked_count++;
            krVar.E.add(tL_channelParticipantBanned);
            krVar.J.k(tL_channelParticipantBanned, j10);
            krVar.A0(krVar.E);
            krVar.B0(x02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
