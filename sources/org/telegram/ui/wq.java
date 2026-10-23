package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements ar {
    public final hr f42945a;

    public wq(hr hrVar) {
        this.f42945a = hrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f42945a, user);
    }

    @Override
    public final void b(long j10) {
        hr hrVar = this.f42945a;
        ArrayList arrayList = hrVar.F;
        a0.h hVar = hrVar.K;
        TLRPC.User user = hrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new eh(21, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            br w02 = hrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f20427id;
            tL_channelParticipantAdmin.date = hrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = hrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f20427id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
            hrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        hr hrVar = this.f42945a;
        ArrayList arrayList = hrVar.F;
        a0.h hVar = hrVar.K;
        if (tLObject != null && hVar.f(j10) == null) {
            br w02 = hrVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(11));
            hrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
