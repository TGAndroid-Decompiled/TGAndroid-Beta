package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f42121a;
    public final un f42122b;
    public final org.telegram.messenger.jj f42123c;

    public ue(un unVar, org.telegram.messenger.jj jjVar, int i10) {
        this.f42121a = i10;
        this.f42122b = unVar;
        this.f42123c = jjVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f42121a;
        un unVar = this.f42122b;
        org.telegram.messenger.jj jjVar = this.f42123c;
        switch (i14) {
            case 0:
                TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(jjVar) == null) {
                        unVar.createArticleViewer(false).L(jjVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                unVar.getClass();
                TLRPC.Message message = jjVar.f16337k;
                int i15 = message.ttl;
                if (i15 != Integer.MAX_VALUE) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i15 == Integer.MAX_VALUE) {
                    i10 = 0;
                } else {
                    i10 = i15;
                }
                message.destroyTime = unVar.getConnectionsManager().getCurrentTime() + i10;
                jjVar.f16337k.destroyTimeMillis = unVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (unVar.h != null) {
                    unVar.getMessagesController().m3(unVar.f42297j6, i10, jjVar.f16337k.random_id);
                    return;
                } else {
                    unVar.getMessagesController().n3(unVar.f42297j6, jjVar.f1(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int f12 = jjVar.f1();
                un unVar2 = this.f42122b;
                unVar2.nb(f12, 0, true, 0, true, 0, null, null, new lg(unVar2, 13));
                if (unVar2.f42473x6.isEmpty()) {
                    unVar2.ec(false);
                    return;
                }
                return;
            case 3:
                un unVar3 = this.f42122b;
                unVar3.getClass();
                int O1 = jjVar.O1();
                TLRPC.Message message2 = jjVar.f16337k;
                int i16 = message2.f19814id;
                if (org.telegram.messenger.jj.B0(message2) == unVar3.f42199b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                unVar3.nb(O1, i16, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) jjVar.f16337k.action).answer.option, null);
                return;
            case 4:
                un unVar4 = this.f42122b;
                unVar4.getClass();
                int O12 = jjVar.O1();
                TLRPC.Message message3 = jjVar.f16337k;
                int i17 = message3.f19814id;
                if (org.telegram.messenger.jj.B0(message3) == unVar4.f42199b7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                unVar4.nb(O12, i17, true, i12, false, 0, null, null, null);
                return;
            case 5:
                un unVar5 = this.f42122b;
                unVar5.getClass();
                int O13 = jjVar.O1();
                TLRPC.Message message4 = jjVar.f16337k;
                int i18 = message4.f19814id;
                if (org.telegram.messenger.jj.B0(message4) == unVar5.f42199b7) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                unVar5.k(O13, i18, true, i13, false, 0);
                return;
            case 6:
                if (org.telegram.messenger.jj.L4(jjVar.f16337k)) {
                    unVar.xa(null, jjVar);
                    return;
                } else {
                    MediaController.B().S(jjVar);
                    return;
                }
            case 7:
                unVar.getMessagesController().z3(unVar.e, unVar.f42243f, jjVar.f1(), true, false, false);
                unVar.O3 = null;
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                return;
        }
    }
}
