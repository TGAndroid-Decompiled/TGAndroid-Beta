package zh;

import bi.v9;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.l60;
public final class n3 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.r0 f60488a;
    public final long f60489b;
    public final o3 f60490c;

    public n3(o3 o3Var, org.telegram.ui.ActionBar.r0 r0Var, long j3) {
        this.f60490c = o3Var;
        this.f60488a = r0Var;
        this.f60489b = j3;
    }

    @Override
    public final void b(int i7) {
        boolean w10;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        o3 o3Var = this.f60490c;
        v9 v9Var = o3Var.Q1;
        if (i7 == 1) {
            l60 l60Var = o3Var.V1;
            if (l60Var != null) {
                l60Var.u();
            }
            l60 F = l60.F(o3Var.f28627c, o3Var.I0, this.f60488a);
            o3Var.V1 = F;
            long e10 = p10.i(o3Var.f28621a).e();
            long j3 = this.f60489b;
            if (j3 == e10) {
                w10 = true;
            } else if (j3 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.t3.w(5, qp.s1(o3Var.f28621a).M0(Long.valueOf(-j3)));
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, F.f35592e, F.d, false, false);
            F.d(z0Var3);
            F.k();
            org.telegram.ui.ActionBar.z0 h = F.h();
            h.setText(id.M0(2131750195, null));
            org.telegram.ui.ActionBar.z0 h7 = F.h();
            h7.setText(id.M0(2131750199, null));
            org.telegram.ui.ActionBar.z0 h10 = F.h();
            h10.setText(id.M0(2131750194, null));
            org.telegram.ui.ActionBar.z0 h11 = F.h();
            h11.setText(id.M0(2131750196, null));
            if (w10) {
                F.k();
                org.telegram.ui.ActionBar.z0 h12 = F.h();
                h12.setText(id.M0(2131750201, null));
                org.telegram.ui.ActionBar.z0 h13 = F.h();
                h13.setText(id.M0(2131750200, null));
                z0Var2 = h13;
                z0Var = h12;
            } else {
                z0Var = null;
                z0Var2 = null;
            }
            hp0 hp0Var = new hp0(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
            hp0Var.run();
            z0Var3.setOnClickListener(new wg.z0(10, this, hp0Var));
            d2.j(h, v9Var, hp0Var, 1);
            d2.j(h7, v9Var, hp0Var, 2);
            d2.j(h10, v9Var, hp0Var, 4);
            d2.j(h11, v9Var, hp0Var, 8);
            if (w10) {
                d2.j(z0Var, v9Var, hp0Var, 256);
                d2.j(z0Var2, v9Var, hp0Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f35617s = 0;
            F.Z();
        } else if (i7 == -1) {
            o3Var.dismiss();
        }
    }
}
