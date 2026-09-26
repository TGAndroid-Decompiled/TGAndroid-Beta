package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class zp implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f40560a;
    public final kq f40561b;

    public zp(kq kqVar, int i10) {
        this.f40560a = i10;
        this.f40561b = kqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f40560a) {
            case 0:
                this.f40561b.r0(true);
                return;
            case 1:
                kq kqVar = this.f40561b;
                kqVar.t0(true);
                cq cqVar = new cq(kqVar, 0);
                if (!kqVar.K && !kqVar.L) {
                    kqVar.getMessagesController().addUserToChat(kqVar.f35152w.f18335id, kqVar.v, 0, kqVar.Y0, kqVar, true, cqVar, new zp(kqVar, 3));
                    return;
                }
                MessagesController messagesController = kqVar.getMessagesController();
                long j3 = kqVar.f35152w.f18335id;
                TLRPC.User user = kqVar.v;
                if (kqVar.K) {
                    o02 = kqVar.M;
                } else {
                    o02 = kq.o0(false);
                }
                messagesController.setUserAdminRole(j3, user, o02, kqVar.S, false, kqVar, kqVar.Z0, kqVar.K, kqVar.Y0, cqVar, new zp(kqVar, 2));
                return;
            case 2:
            case 3:
            default:
                kq kqVar2 = this.f40561b;
                kqVar2.getClass();
                kqVar2.presentFragment(new zg1(6, null));
                return;
            case 4:
                this.f40561b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kq kqVar3 = this.f40561b;
                o oVar = new o(19, kqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f31876b0 = oVar;
                kqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        kq.U(this.f40561b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f40560a) {
            case 2:
                this.f40561b.t0(false);
                return true;
            case 3:
                this.f40561b.t0(false);
                return true;
            default:
                return kq.W(this.f40561b, tL_error);
        }
    }
}
