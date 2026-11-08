package zh;

import bi.v9;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.k60;
public final class m3 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.r0 f60466a;
    public final long f60467b;
    public final n3 f60468c;

    public m3(n3 n3Var, org.telegram.ui.ActionBar.r0 r0Var, long j3) {
        this.f60468c = n3Var;
        this.f60466a = r0Var;
        this.f60467b = j3;
    }

    @Override
    public final void b(int i7) {
        boolean w10;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        n3 n3Var = this.f60468c;
        v9 v9Var = n3Var.Q1;
        if (i7 == 1) {
            k60 k60Var = n3Var.V1;
            if (k60Var != null) {
                k60Var.u();
            }
            k60 F = k60.F(n3Var.f28622c, n3Var.I0, this.f60466a);
            n3Var.V1 = F;
            long e10 = p10.i(n3Var.f28616a).e();
            long j3 = this.f60467b;
            if (j3 == e10) {
                w10 = true;
            } else if (j3 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.t3.w(5, qp.s1(n3Var.f28616a).M0(Long.valueOf(-j3)));
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, F.f35206e, F.d, false, false);
            F.d(z0Var3);
            F.k();
            org.telegram.ui.ActionBar.z0 h = F.h();
            h.setText(id.M0(2131750196, null));
            org.telegram.ui.ActionBar.z0 h7 = F.h();
            h7.setText(id.M0(2131750200, null));
            org.telegram.ui.ActionBar.z0 h10 = F.h();
            h10.setText(id.M0(2131750195, null));
            org.telegram.ui.ActionBar.z0 h11 = F.h();
            h11.setText(id.M0(2131750197, null));
            if (w10) {
                F.k();
                org.telegram.ui.ActionBar.z0 h12 = F.h();
                h12.setText(id.M0(2131750202, null));
                org.telegram.ui.ActionBar.z0 h13 = F.h();
                h13.setText(id.M0(2131750201, null));
                z0Var2 = h13;
                z0Var = h12;
            } else {
                z0Var = null;
                z0Var2 = null;
            }
            gp0 gp0Var = new gp0(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
            gp0Var.run();
            z0Var3.setOnClickListener(new wg.z0(10, this, gp0Var));
            d2.j(h, v9Var, gp0Var, 1);
            d2.j(h7, v9Var, gp0Var, 2);
            d2.j(h10, v9Var, gp0Var, 4);
            d2.j(h11, v9Var, gp0Var, 8);
            if (w10) {
                d2.j(z0Var, v9Var, gp0Var, 256);
                d2.j(z0Var2, v9Var, gp0Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f35231s = 0;
            F.Z();
        } else if (i7 == -1) {
            n3Var.dismiss();
        }
    }
}
