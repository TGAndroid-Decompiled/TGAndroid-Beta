package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class yp implements org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f40550a;
    public final jq f40551b;

    public yp(jq jqVar, int i10) {
        this.f40550a = i10;
        this.f40551b = jqVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.TL_chatAdminRights o02;
        switch (this.f40550a) {
            case 0:
                this.f40551b.r0(true);
                return;
            case 1:
                jq jqVar = this.f40551b;
                jqVar.t0(true);
                bq bqVar = new bq(jqVar, 0);
                if (!jqVar.H && !jqVar.I) {
                    jqVar.getMessagesController().addUserToChat(jqVar.f35458w.f19184id, jqVar.v, 0, jqVar.V0, jqVar, true, bqVar, new yp(jqVar, 3));
                    return;
                }
                MessagesController messagesController = jqVar.getMessagesController();
                long j10 = jqVar.f35458w.f19184id;
                TLRPC.User user = jqVar.v;
                if (jqVar.H) {
                    o02 = jqVar.J;
                } else {
                    o02 = jq.o0(false);
                }
                messagesController.setUserAdminRole(j10, user, o02, jqVar.P, false, jqVar, jqVar.W0, jqVar.H, jqVar.V0, bqVar, new yp(jqVar, 2));
                return;
            case 2:
            case 3:
            default:
                jq jqVar2 = this.f40551b;
                jqVar2.getClass();
                jqVar2.presentFragment(new og1(6, null));
                return;
            case 4:
                this.f40551b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                jq jqVar3 = this.f40551b;
                mg.w wVar = new mg.w(25, jqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 0;
                twoStepVerificationActivity.Y = wVar;
                jqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        jq.U(this.f40551b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f40550a) {
            case 2:
                this.f40551b.t0(false);
                return true;
            case 3:
                this.f40551b.t0(false);
                return true;
            default:
                return jq.W(this.f40551b, tL_error);
        }
    }
}
