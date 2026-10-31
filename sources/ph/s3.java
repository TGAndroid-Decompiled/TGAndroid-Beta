package ph;

import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.rv0;
import rh.v5;
public final class s3 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.ActionBar.t0 f45308a;
    public final long f45309b;
    public final t3 f45310c;

    public s3(t3 t3Var, org.telegram.ui.ActionBar.t0 t0Var, long j10) {
        this.f45310c = t3Var;
        this.f45308a = t0Var;
        this.f45309b = j10;
    }

    @Override
    public final void b(int i10) {
        boolean w9;
        org.telegram.ui.ActionBar.b1 b1Var;
        org.telegram.ui.ActionBar.b1 b1Var2;
        t3 t3Var = this.f45310c;
        v5 v5Var = t3Var.Q1;
        if (i10 == 1) {
            z60 z60Var = t3Var.V1;
            if (z60Var != null) {
                z60Var.u();
            }
            z60 F = z60.F(t3Var.f21589c, t3Var.I0, this.f45308a);
            t3Var.V1 = F;
            long e = d20.i(t3Var.f21583a).e();
            long j10 = this.f45309b;
            if (j10 == e) {
                w9 = true;
            } else if (j10 >= 0) {
                w9 = false;
            } else {
                w9 = org.telegram.messenger.w3.w(5, vp.r1(t3Var.f21583a).L0(Long.valueOf(-j10)));
            }
            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(0, F.e, F.d, false, false);
            F.d(b1Var3);
            F.k();
            org.telegram.ui.ActionBar.b1 h = F.h();
            h.setText(cd.L0(2131750204, null));
            org.telegram.ui.ActionBar.b1 h10 = F.h();
            h10.setText(cd.L0(2131750208, null));
            org.telegram.ui.ActionBar.b1 h11 = F.h();
            h11.setText(cd.L0(2131750203, null));
            org.telegram.ui.ActionBar.b1 h12 = F.h();
            h12.setText(cd.L0(2131750205, null));
            if (w9) {
                F.k();
                org.telegram.ui.ActionBar.b1 h13 = F.h();
                h13.setText(cd.L0(2131750210, null));
                org.telegram.ui.ActionBar.b1 h14 = F.h();
                h14.setText(cd.L0(2131750209, null));
                b1Var2 = h14;
                b1Var = h13;
            } else {
                b1Var = null;
                b1Var2 = null;
            }
            hq0 hq0Var = new hq0(this, b1Var3, h, h10, h11, h12, w9, b1Var, b1Var2);
            hq0Var.run();
            b1Var3.setOnClickListener(new rv0(23, this, hq0Var));
            j2.j(h, v5Var, hq0Var, 1);
            j2.j(h10, v5Var, hq0Var, 2);
            j2.j(h11, v5Var, hq0Var, 4);
            j2.j(h12, v5Var, hq0Var, 8);
            if (w9) {
                j2.j(b1Var, v5Var, hq0Var, 256);
                j2.j(b1Var2, v5Var, hq0Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f32941s = 0;
            F.Z();
        } else if (i10 == -1) {
            t3Var.dismiss();
        }
    }
}
