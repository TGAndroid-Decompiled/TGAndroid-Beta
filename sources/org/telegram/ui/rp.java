package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

public final class rp implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {

    public final int f42306a;

    public final dq f42307b;

    public rp(dq dqVar, int i10) {
        this.f42306a = i10;
        this.f42307b = dqVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42306a) {
            case 0:
                this.f42307b.r0(true);
                break;
            case 1:
                dq dqVar = this.f42307b;
                dqVar.t0(true);
                up upVar = new up(dqVar, 0);
                if (dqVar.G || dqVar.H) {
                    dqVar.getMessagesController().setUserAdminRole(dqVar.f37519w.f22380id, dqVar.v, dqVar.G ? dqVar.I : dq.o0(false), dqVar.O, false, dqVar, dqVar.V0, dqVar.G, dqVar.U0, upVar, new rp(dqVar, 2));
                } else {
                    dqVar.getMessagesController().addUserToChat(dqVar.f37519w.f22380id, dqVar.v, 0, dqVar.U0, dqVar, true, upVar, new rp(dqVar, 3));
                }
                break;
            case 2:
            case 3:
            default:
                dq dqVar2 = this.f42307b;
                dqVar2.getClass();
                dqVar2.presentFragment(new zf1(6, null));
                break;
            case 4:
                this.f42307b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                dq dqVar3 = this.f42307b;
                jh.z1 z1Var = new jh.z1(26, dqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 0;
                twoStepVerificationActivity.X = z1Var;
                dqVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override
    public void run(long j10) {
        dq.U(this.f42307b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f42306a) {
            case 2:
                this.f42307b.t0(false);
                return true;
            case 3:
                this.f42307b.t0(false);
                return true;
            default:
                return dq.W(this.f42307b, tL_error);
        }
    }
}
