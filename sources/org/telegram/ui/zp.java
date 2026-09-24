package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class zp implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f40547a;
    public final kq f40548b;

    public zp(kq kqVar, int i10) {
        this.f40547a = i10;
        this.f40548b = kqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f40547a) {
            case 0:
                this.f40548b.r0(true);
                return;
            case 1:
                kq kqVar = this.f40548b;
                kqVar.t0(true);
                cq cqVar = new cq(kqVar, 0);
                if (!kqVar.K && !kqVar.L) {
                    kqVar.getMessagesController().addUserToChat(kqVar.f35120w.f18321id, kqVar.v, 0, kqVar.Y0, kqVar, true, cqVar, new zp(kqVar, 3));
                    return;
                }
                MessagesController messagesController = kqVar.getMessagesController();
                long j3 = kqVar.f35120w.f18321id;
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
                kq kqVar2 = this.f40548b;
                kqVar2.getClass();
                kqVar2.presentFragment(new zg1(6, null));
                return;
            case 4:
                this.f40548b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kq kqVar3 = this.f40548b;
                o oVar = new o(19, kqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f31863b0 = oVar;
                kqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j3) {
        kq.U(this.f40548b, j3);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f40547a) {
            case 2:
                this.f40548b.t0(false);
                return true;
            case 3:
                this.f40548b.t0(false);
                return true;
            default:
                return kq.W(this.f40548b, tL_error);
        }
    }
}
