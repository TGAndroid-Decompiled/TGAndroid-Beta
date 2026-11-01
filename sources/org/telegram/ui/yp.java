package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yp implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.hp, org.telegram.messenger.ds {
    public final int f43703a;
    public final iq f43704b;

    public yp(iq iqVar, int i10) {
        this.f43703a = i10;
        this.f43704b = iqVar;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f43703a) {
            case 2:
                this.f43704b.y0(false);
                return true;
            case 3:
                this.f43704b.y0(false);
                return true;
            default:
                return iq.b0(this.f43704b, tL_error);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f43703a) {
            case 0:
                this.f43704b.w0(true);
                return;
            case 1:
                iq iqVar = this.f43704b;
                iqVar.y0(true);
                aq aqVar = new aq(iqVar, 0);
                if (!iqVar.K && !iqVar.L) {
                    iqVar.getMessagesController().m(iqVar.f38151x.f19794id, iqVar.f38149w, 0, iqVar.Y0, iqVar, true, aqVar, new yp(iqVar, 3), null);
                    return;
                }
                org.telegram.messenger.wp messagesController = iqVar.getMessagesController();
                long j10 = iqVar.f38151x.f19794id;
                TLRPC.User user = iqVar.f38149w;
                if (iqVar.K) {
                    t02 = iqVar.M;
                } else {
                    t02 = iq.t0(false);
                }
                messagesController.M4(j10, user, t02, iqVar.S, false, iqVar, iqVar.Z0, iqVar.K, iqVar.Y0, aqVar, new yp(iqVar, 2));
                return;
            case 2:
            case 3:
            default:
                iq iqVar2 = this.f43704b;
                iqVar2.getClass();
                iqVar2.presentFragment(new rc1(6, null));
                return;
            case 4:
                this.f43704b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                iq iqVar3 = this.f43704b;
                ng.d dVar = new ng.d(21, iqVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.f34136b0 = dVar;
                iqVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        iq.Z(this.f43704b, j10);
    }
}
