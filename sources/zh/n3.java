package zh;

import bi.v9;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.k60;
public final class n3 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.r0 f60383a;
    public final long f60384b;
    public final o3 f60385c;

    public n3(o3 o3Var, org.telegram.ui.ActionBar.r0 r0Var, long j3) {
        this.f60385c = o3Var;
        this.f60383a = r0Var;
        this.f60384b = j3;
    }

    @Override
    public final void b(int i7) {
        boolean w10;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        o3 o3Var = this.f60385c;
        v9 v9Var = o3Var.Q1;
        if (i7 == 1) {
            k60 k60Var = o3Var.V1;
            if (k60Var != null) {
                k60Var.u();
            }
            k60 F = k60.F(o3Var.f28619c, o3Var.I0, this.f60383a);
            o3Var.V1 = F;
            long e10 = p10.i(o3Var.f28613a).e();
            long j3 = this.f60384b;
            if (j3 == e10) {
                w10 = true;
            } else if (j3 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.t3.w(5, qp.s1(o3Var.f28613a).M0(Long.valueOf(-j3)));
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, F.f35180e, F.d, false, false);
            F.d(z0Var3);
            F.k();
            org.telegram.ui.ActionBar.z0 h = F.h();
            h.setText(hd.M0(2131750194, null));
            org.telegram.ui.ActionBar.z0 h7 = F.h();
            h7.setText(hd.M0(2131750198, null));
            org.telegram.ui.ActionBar.z0 h10 = F.h();
            h10.setText(hd.M0(2131750193, null));
            org.telegram.ui.ActionBar.z0 h11 = F.h();
            h11.setText(hd.M0(2131750195, null));
            if (w10) {
                F.k();
                org.telegram.ui.ActionBar.z0 h12 = F.h();
                h12.setText(hd.M0(2131750200, null));
                org.telegram.ui.ActionBar.z0 h13 = F.h();
                h13.setText(hd.M0(2131750199, null));
                z0Var2 = h13;
                z0Var = h12;
            } else {
                z0Var = null;
                z0Var2 = null;
            }
            gp0 gp0Var = new gp0(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
            gp0Var.run();
            z0Var3.setOnClickListener(new wg.z0(10, this, gp0Var));
            f2.j(h, v9Var, gp0Var, 1);
            f2.j(h7, v9Var, gp0Var, 2);
            f2.j(h10, v9Var, gp0Var, 4);
            f2.j(h11, v9Var, gp0Var, 8);
            if (w10) {
                f2.j(z0Var, v9Var, gp0Var, 256);
                f2.j(z0Var2, v9Var, gp0Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f35205s = 0;
            F.Z();
        } else if (i7 == -1) {
            o3Var.dismiss();
        }
    }
}
