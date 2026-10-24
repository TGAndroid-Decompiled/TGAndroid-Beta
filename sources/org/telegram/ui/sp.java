package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f41780a;
    public final dq f41781b;

    public sp(dq dqVar, int i10) {
        this.f41780a = i10;
        this.f41781b = dqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f41780a) {
            case 0:
                this.f41781b.r0(true);
                return;
            case 1:
                dq dqVar = this.f41781b;
                dqVar.t0(true);
                vp vpVar = new vp(dqVar, 0);
                if (!dqVar.L && !dqVar.M) {
                    dqVar.getMessagesController().addUserToChat(dqVar.f36697x.f20344id, dqVar.f36695w, 0, dqVar.Z0, dqVar, true, vpVar, new sp(dqVar, 3));
                    return;
                }
                MessagesController messagesController = dqVar.getMessagesController();
                long j10 = dqVar.f36697x.f20344id;
                TLRPC.User user = dqVar.f36695w;
                if (dqVar.L) {
                    o02 = dqVar.N;
                } else {
                    o02 = dq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, dqVar.T, false, dqVar, dqVar.f36665a1, dqVar.L, dqVar.Z0, vpVar, new sp(dqVar, 2));
                return;
            case 2:
            case 3:
            default:
                dq dqVar2 = this.f41781b;
                dqVar2.getClass();
                dqVar2.presentFragment(new ag1(6, null));
                return;
            case 4:
                this.f41781b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                dq dqVar3 = this.f41781b;
                m4.w0 w0Var = new m4.w0(23, dqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34242b0 = w0Var;
                dqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        dq.U(this.f41781b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f41780a) {
            case 2:
                this.f41781b.t0(false);
                return true;
            case 3:
                this.f41781b.t0(false);
                return true;
            default:
                return dq.W(this.f41781b, tL_error);
        }
    }
}
