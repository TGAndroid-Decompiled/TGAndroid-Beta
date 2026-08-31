package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class zp implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f43967a;
    public final kq f43968b;

    public zp(kq kqVar, int i10) {
        this.f43967a = i10;
        this.f43968b = kqVar;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f43967a) {
            case 0:
                this.f43968b.r0(true);
                return;
            case 1:
                kq kqVar = this.f43968b;
                kqVar.t0(true);
                cq cqVar = new cq(kqVar, 0);
                if (!kqVar.H && !kqVar.I) {
                    kqVar.getMessagesController().addUserToChat(kqVar.f38484w.f20843id, kqVar.v, 0, kqVar.V0, kqVar, true, cqVar, new zp(kqVar, 3));
                    return;
                }
                MessagesController messagesController = kqVar.getMessagesController();
                long j10 = kqVar.f38484w.f20843id;
                TLRPC.User user = kqVar.v;
                if (kqVar.H) {
                    o02 = kqVar.J;
                } else {
                    o02 = kq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, kqVar.P, false, kqVar, kqVar.W0, kqVar.H, kqVar.V0, cqVar, new zp(kqVar, 2));
                return;
            case 2:
            case 3:
            default:
                kq kqVar2 = this.f43968b;
                kqVar2.getClass();
                kqVar2.presentFragment(new qg1(6, null));
                return;
            case 4:
                this.f43968b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kq kqVar3 = this.f43968b;
                ng.w wVar = new ng.w(25, kqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 0;
                twoStepVerificationActivity.Y = wVar;
                kqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        kq.U(this.f43968b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f43967a) {
            case 2:
                this.f43968b.t0(false);
                return true;
            case 3:
                this.f43968b.t0(false);
                return true;
            default:
                return kq.W(this.f43968b, tL_error);
        }
    }
}
