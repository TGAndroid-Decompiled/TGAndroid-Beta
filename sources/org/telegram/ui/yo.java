package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yo implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.so, org.telegram.messenger.lr {
    public final int f52372a;
    public final ip f52373b;

    public yo(ip ipVar, int i3) {
        this.f52372a = i3;
        this.f52373b = ipVar;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.f52372a) {
            case 2:
                this.f52373b.y0(false);
                return true;
            case 3:
                this.f52373b.y0(false);
                return true;
            default:
                return ip.b0(this.f52373b, tL_error);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        TLRPC.TL_chatAdminRights t02;
        switch (this.f52372a) {
            case 0:
                this.f52373b.w0(true);
                return;
            case 1:
                ip ipVar = this.f52373b;
                ipVar.y0(true);
                ap apVar = new ap(ipVar, 0);
                if (!ipVar.L && !ipVar.M) {
                    ipVar.getMessagesController().m(ipVar.f46357x.f27001id, ipVar.f46355w, 0, ipVar.Z0, ipVar, true, apVar, new yo(ipVar, 3), null);
                    return;
                }
                org.telegram.messenger.hp messagesController = ipVar.getMessagesController();
                long j10 = ipVar.f46357x.f27001id;
                TLRPC.User user = ipVar.f46355w;
                if (ipVar.L) {
                    t02 = ipVar.N;
                } else {
                    t02 = ip.t0(false);
                }
                messagesController.P4(j10, user, t02, ipVar.T, false, ipVar, ipVar.f46325a1, ipVar.L, ipVar.Z0, apVar, new yo(ipVar, 2));
                return;
            case 2:
            case 3:
            default:
                ip ipVar2 = this.f52373b;
                ipVar2.getClass();
                ipVar2.presentFragment(new ra1(6, null));
                return;
            case 4:
                this.f52373b.finishFragment();
                return;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                ip ipVar3 = this.f52373b;
                jo joVar = new jo(1, ipVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.f42083a0 = 0;
                twoStepVerificationActivity.f42087c0 = joVar;
                ipVar3.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    @Override
    public void run(long j10) {
        ip.Z(this.f52373b, j10);
    }
}
