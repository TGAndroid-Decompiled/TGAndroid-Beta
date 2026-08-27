package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class zq implements dr {

    public final lr f45234a;

    public zq(lr lrVar) {
        this.f45234a = lrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        lr.c0(this.f45234a, user);
    }

    @Override
    public final void b(long j10) {
        lr lrVar = this.f45234a;
        ArrayList arrayList = lrVar.B;
        a0.h hVar = lrVar.G;
        TLRPC.User user = lrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new yq(0, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            er erVarW0 = lrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f22527id;
            tL_channelParticipantAdmin.date = lrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = lrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f22527id);
            Collections.sort(arrayList, new k9.a(18));
            lrVar.A0(erVarW0);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        lr lrVar = this.f45234a;
        ArrayList arrayList = lrVar.B;
        a0.h hVar = lrVar.G;
        if (tLObject == null || hVar.f(j10) != null) {
            return;
        }
        er erVarW0 = lrVar.w0();
        arrayList.add(tLObject);
        hVar.k(tLObject, j10);
        Collections.sort(arrayList, new k9.a(18));
        lrVar.A0(erVarW0);
    }

    @Override
    public final void d(long j10) {
    }
}
