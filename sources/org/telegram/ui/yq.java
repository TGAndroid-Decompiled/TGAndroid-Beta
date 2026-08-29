package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements cr {
    public final jr f44954a;

    public yq(jr jrVar) {
        this.f44954a = jrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f44954a, user);
    }

    @Override
    public final void b(long j10) {
        jr jrVar = this.f44954a;
        ArrayList arrayList = jrVar.B;
        a0.h hVar = jrVar.G;
        TLRPC.User user = jrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new vf(27, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            dr w02 = jrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f22539id;
            tL_channelParticipantAdmin.date = jrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = jrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f22539id);
            Collections.sort(arrayList, new lh.e4(18));
            jrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.f44954a;
        ArrayList arrayList = jrVar.B;
        a0.h hVar = jrVar.G;
        if (tLObject != null && hVar.f(j10) == null) {
            dr w02 = jrVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new lh.e4(18));
            jrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
