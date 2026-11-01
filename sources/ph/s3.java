package ph;

import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.qv0;
import rh.v5;
public final class s3 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.ActionBar.t0 f45319a;
    public final long f45320b;
    public final t3 f45321c;

    public s3(t3 t3Var, org.telegram.ui.ActionBar.t0 t0Var, long j10) {
        this.f45321c = t3Var;
        this.f45319a = t0Var;
        this.f45320b = j10;
    }

    @Override
    public final void b(int i10) {
        boolean w9;
        org.telegram.ui.ActionBar.b1 b1Var;
        org.telegram.ui.ActionBar.b1 b1Var2;
        t3 t3Var = this.f45321c;
        v5 v5Var = t3Var.Q1;
        if (i10 == 1) {
            z60 z60Var = t3Var.V1;
            if (z60Var != null) {
                z60Var.u();
            }
            z60 F = z60.F(t3Var.f21590c, t3Var.I0, this.f45319a);
            t3Var.V1 = F;
            long e = e20.i(t3Var.f21584a).e();
            long j10 = this.f45320b;
            if (j10 == e) {
                w9 = true;
            } else if (j10 >= 0) {
                w9 = false;
            } else {
                w9 = org.telegram.messenger.w3.w(5, wp.r1(t3Var.f21584a).L0(Long.valueOf(-j10)));
            }
            org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(0, F.e, F.d, false, false);
            F.d(b1Var3);
            F.k();
            org.telegram.ui.ActionBar.b1 h = F.h();
            h.setText(dd.L0(2131750204, null));
            org.telegram.ui.ActionBar.b1 h10 = F.h();
            h10.setText(dd.L0(2131750208, null));
            org.telegram.ui.ActionBar.b1 h11 = F.h();
            h11.setText(dd.L0(2131750203, null));
            org.telegram.ui.ActionBar.b1 h12 = F.h();
            h12.setText(dd.L0(2131750205, null));
            if (w9) {
                F.k();
                org.telegram.ui.ActionBar.b1 h13 = F.h();
                h13.setText(dd.L0(2131750210, null));
                org.telegram.ui.ActionBar.b1 h14 = F.h();
                h14.setText(dd.L0(2131750209, null));
                b1Var2 = h14;
                b1Var = h13;
            } else {
                b1Var = null;
                b1Var2 = null;
            }
            iq0 iq0Var = new iq0(this, b1Var3, h, h10, h11, h12, w9, b1Var, b1Var2);
            iq0Var.run();
            b1Var3.setOnClickListener(new qv0(23, this, iq0Var));
            j2.j(h, v5Var, iq0Var, 1);
            j2.j(h10, v5Var, iq0Var, 2);
            j2.j(h11, v5Var, iq0Var, 4);
            j2.j(h12, v5Var, iq0Var, 8);
            if (w9) {
                j2.j(b1Var, v5Var, iq0Var, 256);
                j2.j(b1Var2, v5Var, iq0Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f33044s = 0;
            F.Z();
        } else if (i10 == -1) {
            t3Var.dismiss();
        }
    }
}
