package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq implements cr {
    public final jr f43467a;

    public yq(jr jrVar) {
        this.f43467a = jrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f43467a, user);
    }

    @Override
    public final void b(long j10) {
        jr jrVar = this.f43467a;
        ArrayList arrayList = jrVar.F;
        a0.h hVar = jrVar.K;
        TLRPC.User user = jrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new gh(21, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            dr w02 = jrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f20419id;
            tL_channelParticipantAdmin.date = jrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = jrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f20419id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
            jrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        jr jrVar = this.f43467a;
        ArrayList arrayList = jrVar.F;
        a0.h hVar = jrVar.K;
        if (tLObject != null && hVar.f(j10) == null) {
            dr w02 = jrVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
            jrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
