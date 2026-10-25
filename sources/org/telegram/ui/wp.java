package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class wp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f45534a;
    public final gq f45535b;

    public wp(gq gqVar, int i10) {
        this.f45534a = i10;
        this.f45535b = gqVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        TLRPC.TL_chatAdminRights p02;
        switch (this.f45534a) {
            case 0:
                this.f45535b.s0(true);
                return;
            case 1:
                gq gqVar = this.f45535b;
                gqVar.u0(true);
                yp ypVar = new yp(gqVar, 0);
                if (!gqVar.K && !gqVar.L) {
                    gqVar.getMessagesController().addUserToChat(gqVar.f39762w.f22027id, gqVar.v, 0, gqVar.Y0, gqVar, true, ypVar, new wp(gqVar, 3));
                    return;
                }
                MessagesController messagesController = gqVar.getMessagesController();
                long j10 = gqVar.f39762w.f22027id;
                TLRPC.User user = gqVar.v;
                if (gqVar.K) {
                    p02 = gqVar.M;
                } else {
                    p02 = gq.p0(false);
                }
                messagesController.setUserAdminRole(j10, user, p02, gqVar.S, false, gqVar, gqVar.Z0, gqVar.K, gqVar.Y0, ypVar, new wp(gqVar, 2));
                return;
            case 2:
            case 3:
            default:
                gq gqVar2 = this.f45535b;
                gqVar2.getClass();
                gqVar2.presentFragment(new dg1(6, null));
                return;
            case 4:
                this.f45535b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                gq gqVar3 = this.f45535b;
                m4.s0 s0Var = new m4.s0(26, gqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f36302b0 = s0Var;
                gqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        gq.V(this.f45535b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f45534a) {
            case 2:
                this.f45535b.u0(false);
                return true;
            case 3:
                this.f45535b.u0(false);
                return true;
            default:
                return gq.X(this.f45535b, tL_error);
        }
    }
}
