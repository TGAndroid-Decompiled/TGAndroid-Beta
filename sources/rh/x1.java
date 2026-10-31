package rh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class x1 implements Runnable {
    public final int f47677a;
    public final e4 f47678b;
    public final String f47679c;

    public x1(e4 e4Var, String str, int i10) {
        this.f47677a = i10;
        this.f47678b = e4Var;
        this.f47679c = str;
    }

    @Override
    public final void run() {
        int i10 = this.f47677a;
        String str = this.f47679c;
        e4 e4Var = this.f47678b;
        switch (i10) {
            case 0:
                long j10 = e4Var.P1;
                e4Var.f46801c2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    e4Var.dismiss();
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof un) {
                            un unVar = (un) Q;
                            if (unVar.a() == j10) {
                                cc.a0(unVar).I(2131624032, cd.L0(2131745114, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131745112, org.telegram.messenger.o5.t(j10)))).k(true);
                                return;
                            }
                        }
                        zs f7 = zs.f(e4Var.f21583a);
                        Long valueOf = Long.valueOf(j10);
                        Boolean bool = Boolean.FALSE;
                        f7.k(6, valueOf, bool);
                        zs.f(e4Var.f21583a).k(5, Long.valueOf(j10), bool);
                        un ha = un.ha(j10);
                        ha.whenFullyVisible(new o(7, e4Var, ha));
                        Q.presentFragment(ha);
                        return;
                    }
                    return;
                }
                e4Var.s2(0, true, null);
                return;
            case 1:
                Context context = e4Var.getContext();
                gf.f.t(context, vp.r1(e4Var.f21583a).I6 + str);
                return;
            case 2:
                Context context2 = e4Var.getContext();
                gf.f.t(context2, vp.r1(e4Var.f21583a).I6 + str);
                return;
            case 3:
                Context context3 = e4Var.getContext();
                gf.f.t(context3, vp.r1(e4Var.f21583a).I6 + str);
                return;
            case 4:
                Context context4 = e4Var.getContext();
                gf.f.t(context4, vp.r1(e4Var.f21583a).I6 + str);
                return;
            case 5:
                Context context5 = e4Var.getContext();
                gf.f.t(context5, vp.r1(e4Var.f21583a).I6 + str);
                return;
            case 6:
                Context context6 = e4Var.getContext();
                gf.f.t(context6, vp.r1(e4Var.f21583a).I6 + str);
                return;
            case 7:
                org.telegram.messenger.i0.g(str);
                wb k10 = e4Var.k().k(false);
                k10.f32145t = true;
                k10.j();
                return;
            default:
                e4Var.dismiss();
                Context context7 = e4Var.getContext();
                gf.f.r(context7, "https://" + vp.r1(e4Var.f21583a).U2 + "/" + str);
                return;
        }
    }
}
