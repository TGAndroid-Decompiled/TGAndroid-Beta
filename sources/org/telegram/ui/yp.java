package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yp implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.gp, org.telegram.messenger.cs {
    public final int f43877a;
    public final iq f43878b;

    public yp(iq iqVar, int i10) {
        this.f43877a = i10;
        this.f43878b = iqVar;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f43877a) {
            case 2:
                this.f43878b.x0(false);
                return true;
            case 3:
                this.f43878b.x0(false);
                return true;
            default:
                return iq.a0(this.f43878b, tL_error);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TLRPC.TL_chatAdminRights s02;
        switch (this.f43877a) {
            case 0:
                this.f43878b.v0(true);
                return;
            case 1:
                iq iqVar = this.f43878b;
                iqVar.x0(true);
                aq aqVar = new aq(iqVar, 0);
                if (!iqVar.K && !iqVar.L) {
                    iqVar.getMessagesController().m(iqVar.f38325x.f19793id, iqVar.f38323w, 0, iqVar.Y0, iqVar, true, aqVar, new yp(iqVar, 3), null);
                    return;
                }
                org.telegram.messenger.vp messagesController = iqVar.getMessagesController();
                long j10 = iqVar.f38325x.f19793id;
                TLRPC.User user = iqVar.f38323w;
                if (iqVar.K) {
                    s02 = iqVar.M;
                } else {
                    s02 = iq.s0(false);
                }
                messagesController.M4(j10, user, s02, iqVar.S, false, iqVar, iqVar.Z0, iqVar.K, iqVar.Y0, aqVar, new yp(iqVar, 2));
                return;
            case 2:
            case 3:
            default:
                iq iqVar2 = this.f43878b;
                iqVar2.getClass();
                iqVar2.presentFragment(new tc1(6, null));
                return;
            case 4:
                this.f43878b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                iq iqVar3 = this.f43878b;
                ng.d dVar = new ng.d(21, iqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34129b0 = dVar;
                iqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        iq.Y(this.f43878b, j10);
    }
}
