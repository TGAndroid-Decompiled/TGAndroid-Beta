package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
public final class d6 implements z4.e {
    public final u7 f48350a;
    public final k7 f48351b;

    public d6(k7 k7Var, u7 u7Var) {
        this.f48351b = k7Var;
        this.f48350a = u7Var;
    }

    @Override
    public final void a(int i10) {
        k7 k7Var = this.f48351b;
        a3 currentPeerView = k7Var.getCurrentPeerView();
        if (currentPeerView != null) {
            w2 w2Var = k7Var.B0;
            l7 l7Var = (l7) w2Var;
            l7Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            k7Var.F();
            u7 u7Var = this.f48350a;
            q7 q7Var = u7Var.f48961t0;
            if (q7Var != null) {
                if (i10 < 3) {
                    q7Var.b(false);
                } else if (i10 > k7Var.f48420z0.b() - 4) {
                    u7Var.f48961t0.b(true);
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        int i12;
        k7 k7Var = this.f48351b;
        k7Var.I0 = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        k7Var.J0 = i12;
        k7Var.K0 = f7;
        long j3 = UserConfig.getInstance(k7Var.f48419y0).clientUserId;
        int i13 = k7Var.I0;
        if (i13 >= 0 && (k7Var.f48418x0 != null ? k7Var.f48417w0 == j3 : !(i13 >= k7Var.A0.size() || ((Long) k7Var.A0.get(k7Var.I0)).longValue() != j3))) {
            ((l7) k7Var.B0).d(1.0f - k7Var.K0);
            return;
        }
        int i14 = k7Var.J0;
        if (i14 >= 0 && (k7Var.f48418x0 != null ? k7Var.f48417w0 == j3 : !(i14 >= k7Var.A0.size() || ((Long) k7Var.A0.get(k7Var.J0)).longValue() != j3))) {
            ((l7) k7Var.B0).d(k7Var.K0);
            return;
        }
        ((l7) k7Var.B0).d(0.0f);
    }

    @Override
    public final void c(int i10) {
        k7 k7Var = this.f48351b;
        ((l7) k7Var.B0).d.P();
        Runnable runnable = k7Var.G0;
        if (runnable != null && i10 == 0) {
            runnable.run();
            k7Var.G0 = null;
        }
        k7Var.F0 = i10;
        u7 u7Var = k7Var.Q0;
        if (u7Var.f48947n0.F0 == 1) {
            AndroidUtilities.cancelRunOnUIThread(u7Var.f48923b1);
        }
    }
}
