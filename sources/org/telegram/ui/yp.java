package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class yp implements org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final int f46065a;
    public final iq f46066b;

    public yp(iq iqVar, int i10) {
        this.f46065a = i10;
        this.f46066b = iqVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        TLRPC.TL_chatAdminRights p02;
        switch (this.f46065a) {
            case 0:
                this.f46066b.s0(true);
                return;
            case 1:
                iq iqVar = this.f46066b;
                iqVar.u0(true);
                aq aqVar = new aq(iqVar, 0);
                if (!iqVar.K && !iqVar.L) {
                    iqVar.getMessagesController().addUserToChat(iqVar.f40255w.f22028id, iqVar.v, 0, iqVar.Y0, iqVar, true, aqVar, new yp(iqVar, 3));
                    return;
                }
                MessagesController messagesController = iqVar.getMessagesController();
                long j10 = iqVar.f40255w.f22028id;
                TLRPC.User user = iqVar.v;
                if (iqVar.K) {
                    p02 = iqVar.M;
                } else {
                    p02 = iq.p0(false);
                }
                messagesController.setUserAdminRole(j10, user, p02, iqVar.S, false, iqVar, iqVar.Z0, iqVar.K, iqVar.Y0, aqVar, new yp(iqVar, 2));
                return;
            case 2:
            case 3:
            default:
                iq iqVar2 = this.f46066b;
                iqVar2.getClass();
                iqVar2.presentFragment(new fg1(6, null));
                return;
            case 4:
                this.f46066b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                iq iqVar3 = this.f46066b;
                m4.s0 s0Var = new m4.s0(26, iqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f36329b0 = s0Var;
                iqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        iq.V(this.f46066b, j10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        switch (this.f46065a) {
            case 2:
                this.f46066b.u0(false);
                return true;
            case 3:
                this.f46066b.u0(false);
                return true;
            default:
                return iq.X(this.f46066b, tL_error);
        }
    }
}
