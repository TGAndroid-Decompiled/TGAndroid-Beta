package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f42440a;
    public final dq f42441b;

    public sp(dq dqVar, int i10) {
        this.f42440a = i10;
        this.f42441b = dqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f42440a) {
            case 0:
                this.f42441b.r0(true);
                return;
            case 1:
                dq dqVar = this.f42441b;
                dqVar.t0(true);
                vp vpVar = new vp(dqVar, 0);
                if (!dqVar.G && !dqVar.H) {
                    dqVar.getMessagesController().addUserToChat(dqVar.f37602w.f22392id, dqVar.v, 0, dqVar.U0, dqVar, true, vpVar, new sp(dqVar, 3));
                    return;
                }
                MessagesController messagesController = dqVar.getMessagesController();
                long j10 = dqVar.f37602w.f22392id;
                TLRPC.User user = dqVar.v;
                if (dqVar.G) {
                    o02 = dqVar.I;
                } else {
                    o02 = dq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, dqVar.O, false, dqVar, dqVar.V0, dqVar.G, dqVar.U0, vpVar, new sp(dqVar, 2));
                return;
            case 2:
            case 3:
            default:
                dq dqVar2 = this.f42441b;
                dqVar2.getClass();
                dqVar2.presentFragment(new cg1(6, null));
                return;
            case 4:
                this.f42441b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                dq dqVar3 = this.f42441b;
                kg.w wVar = new kg.w(26, dqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 0;
                twoStepVerificationActivity.X = wVar;
                dqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        dq.U(this.f42441b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f42440a) {
            case 2:
                this.f42441b.t0(false);
                return true;
            case 3:
                this.f42441b.t0(false);
                return true;
            default:
                return dq.W(this.f42441b, tL_error);
        }
    }
}
