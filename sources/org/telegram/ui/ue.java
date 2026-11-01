package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ue implements Runnable {
    public final int f41920a;
    public final un f41921b;
    public final org.telegram.messenger.kj f41922c;

    public ue(un unVar, org.telegram.messenger.kj kjVar, int i10) {
        this.f41920a = i10;
        this.f41921b = unVar;
        this.f41922c = kjVar;
    }

    @Override
    public final void run() {
        TLRPC.WebPage webPage;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f41920a;
        un unVar = this.f41921b;
        org.telegram.messenger.kj kjVar = this.f41922c;
        switch (i14) {
            case 0:
                TLRPC.MessageMedia messageMedia = kjVar.f16690k.media;
                if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.I1.N().k(kjVar) == null) {
                        unVar.createArticleViewer(false).L(kjVar, null, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                unVar.getClass();
                TLRPC.Message message = kjVar.f16690k;
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
                kjVar.f16690k.destroyTimeMillis = unVar.getConnectionsManager().getCurrentTimeMillis() + (i10 * 1000);
                if (unVar.h != null) {
                    unVar.getMessagesController().m3(unVar.f42108j6, i10, kjVar.f16690k.random_id);
                    return;
                } else {
                    unVar.getMessagesController().n3(unVar.f42108j6, kjVar.f1(), null, i10, 0L, z10);
                    return;
                }
            case 2:
                int f12 = kjVar.f1();
                un unVar2 = this.f41921b;
                unVar2.sb(f12, 0, true, 0, true, 0, null, null, new ng(unVar2, 9));
                if (unVar2.f42284x6.isEmpty()) {
                    unVar2.jc(false);
                    return;
                }
                return;
            case 3:
                un unVar3 = this.f41921b;
                unVar3.getClass();
                int O1 = kjVar.O1();
                TLRPC.Message message2 = kjVar.f16690k;
                int i16 = message2.f19815id;
                if (org.telegram.messenger.kj.B0(message2) == unVar3.f42010b7) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                unVar3.sb(O1, i16, true, i11, false, 0, null, ((TLRPC.TL_messageActionPollAppendAnswer) kjVar.f16690k.action).answer.option, null);
                return;
            case 4:
                un unVar4 = this.f41921b;
                unVar4.getClass();
                int O12 = kjVar.O1();
                TLRPC.Message message3 = kjVar.f16690k;
                int i17 = message3.f19815id;
                if (org.telegram.messenger.kj.B0(message3) == unVar4.f42010b7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                unVar4.sb(O12, i17, true, i12, false, 0, null, null, null);
                return;
            case 5:
                un unVar5 = this.f41921b;
                unVar5.getClass();
                int O13 = kjVar.O1();
                TLRPC.Message message4 = kjVar.f16690k;
                int i18 = message4.f19815id;
                if (org.telegram.messenger.kj.B0(message4) == unVar5.f42010b7) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                unVar5.l(O13, i18, true, i13, false, 0);
                return;
            case 6:
                if (org.telegram.messenger.kj.L4(kjVar.f16690k)) {
                    unVar.Ca(null, kjVar);
                    return;
                } else {
                    MediaController.B().S(kjVar);
                    return;
                }
            case 7:
                unVar.getMessagesController().z3(unVar.e, unVar.f42054f, kjVar.f1(), true, false, false);
                unVar.O3 = null;
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                return;
        }
    }
}
