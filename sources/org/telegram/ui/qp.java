package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class qp implements org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f40951a;
    public final bq f40952b;

    public qp(bq bqVar, int i10) {
        this.f40951a = i10;
        this.f40952b = bqVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f40951a) {
            case 0:
                this.f40952b.r0(true);
                return;
            case 1:
                bq bqVar = this.f40952b;
                bqVar.t0(true);
                tp tpVar = new tp(bqVar, 0);
                if (!bqVar.K && !bqVar.L) {
                    bqVar.getMessagesController().addUserToChat(bqVar.f35719w.f20280id, bqVar.v, 0, bqVar.Y0, bqVar, true, tpVar, new qp(bqVar, 3));
                    return;
                }
                MessagesController messagesController = bqVar.getMessagesController();
                long j10 = bqVar.f35719w.f20280id;
                TLRPC.User user = bqVar.v;
                if (bqVar.K) {
                    o02 = bqVar.M;
                } else {
                    o02 = bq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, bqVar.S, false, bqVar, bqVar.Z0, bqVar.K, bqVar.Y0, tpVar, new qp(bqVar, 2));
                return;
            case 2:
            case 3:
            default:
                bq bqVar2 = this.f40952b;
                bqVar2.getClass();
                bqVar2.presentFragment(new vf1(6, null));
                return;
            case 4:
                this.f40952b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                bq bqVar3 = this.f40952b;
                m4.w0 w0Var = new m4.w0(23, bqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f33943b0 = w0Var;
                bqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        bq.U(this.f40952b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f40951a) {
            case 2:
                this.f40952b.t0(false);
                return true;
            case 3:
                this.f40952b.t0(false);
                return true;
            default:
                return bq.W(this.f40952b, tL_error);
        }
    }
}
