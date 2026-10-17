package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f41475a;
    public final dq f41476b;

    public sp(dq dqVar, int i10) {
        this.f41475a = i10;
        this.f41476b = dqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f41475a) {
            case 0:
                this.f41476b.r0(true);
                return;
            case 1:
                dq dqVar = this.f41476b;
                dqVar.t0(true);
                vp vpVar = new vp(dqVar, 0);
                if (!dqVar.K && !dqVar.L) {
                    dqVar.getMessagesController().addUserToChat(dqVar.f36298w.f20272id, dqVar.v, 0, dqVar.Y0, dqVar, true, vpVar, new sp(dqVar, 3));
                    return;
                }
                MessagesController messagesController = dqVar.getMessagesController();
                long j10 = dqVar.f36298w.f20272id;
                TLRPC.User user = dqVar.v;
                if (dqVar.K) {
                    o02 = dqVar.M;
                } else {
                    o02 = dq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, dqVar.S, false, dqVar, dqVar.Z0, dqVar.K, dqVar.Y0, vpVar, new sp(dqVar, 2));
                return;
            case 2:
            case 3:
            default:
                dq dqVar2 = this.f41476b;
                dqVar2.getClass();
                dqVar2.presentFragment(new xf1(6, null));
                return;
            case 4:
                this.f41476b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                dq dqVar3 = this.f41476b;
                m4.y0 y0Var = new m4.y0(22, dqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f33924b0 = y0Var;
                dqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        dq.U(this.f41476b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f41475a) {
            case 2:
                this.f41476b.t0(false);
                return true;
            case 3:
                this.f41476b.t0(false);
                return true;
            default:
                return dq.W(this.f41476b, tL_error);
        }
    }
}
