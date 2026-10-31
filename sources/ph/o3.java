package ph;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.j20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.p10;
import rh.h8;
public final class o3 extends p51 {
    public final int P;
    public final Object Q;

    public o3(KeyEvent.Callback callback, tk0 tk0Var, Context context, int i10, j20 j20Var, p6 p6Var, int i11) {
        super(tk0Var, context, i10, 0, false, j20Var, p6Var);
        this.P = i11;
        this.Q = callback;
    }

    @Override
    public void t(s4.c1 c1Var, int i10) {
        th.c0 c0Var;
        th.h0 h0Var;
        switch (this.P) {
            case 2:
                super.t(c1Var, i10);
                th.p1 p1Var = (th.p1) this.Q;
                if (p1Var.D) {
                    View view = c1Var.f47898a;
                    if ((view instanceof th.c0) && (h0Var = (c0Var = (th.c0) view).K) != null && h0Var.f49006a == p1Var.f49095y) {
                        c0Var.c();
                        p1Var.D = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(c1Var, i10);
                return;
        }
    }

    @Override
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        p6 p6Var;
        p6 p6Var2;
        switch (this.P) {
            case 0:
                q3 q3Var = (q3) this.Q;
                if (i10 == 0) {
                    return new s4.c1(new p4(q3Var.getContext(), t6.L6, 13, 12, 4, false, false, q3Var.I0));
                }
                if (i10 == 42) {
                    return new s4.c1(new p4(q3Var.getContext(), t6.L6, 13, 12, 4, false, true, q3Var.I0));
                }
                return super.w(viewGroup, i10);
            case 1:
                h8 h8Var = (h8) this.Q;
                if (i10 == 42) {
                    Activity parentActivity = h8Var.getParentActivity();
                    int i11 = t6.L6;
                    p6Var = ((org.telegram.ui.ActionBar.k2) h8Var).resourceProvider;
                    p4 p4Var = new p4(parentActivity, i11, 21, 0, false, p6Var);
                    p4Var.setHeight(25);
                    return new s4.c1(p4Var);
                }
                return super.w(viewGroup, i10);
            case 2:
            default:
                return super.w(viewGroup, i10);
            case 3:
                wh.g gVar = (wh.g) this.Q;
                if (i10 == 42) {
                    p4 p4Var2 = new p4(gVar.getParentActivity(), t6.L6, 21, 0, false, wh.g.A0(gVar));
                    p4Var2.setHeight(25);
                    return new s4.c1(p4Var2);
                }
                return super.w(viewGroup, i10);
            case 4:
                xh.i iVar = (xh.i) this.Q;
                if (i10 == 42) {
                    Activity parentActivity2 = iVar.getParentActivity();
                    int i12 = t6.L6;
                    p6Var2 = ((org.telegram.ui.ActionBar.k2) iVar).resourceProvider;
                    p4 p4Var3 = new p4(parentActivity2, i12, 21, 0, false, p6Var2);
                    p4Var3.setHeight(25);
                    return new s4.c1(p4Var3);
                }
                return super.w(viewGroup, i10);
            case 5:
                xh.z2 z2Var = (xh.z2) this.Q;
                if (i10 == 42) {
                    p4 p4Var4 = new p4(z2Var.getParentActivity(), t6.L6, 21, 0, false, xh.z2.G0(z2Var));
                    p4Var4.setHeight(25);
                    return new s4.c1(p4Var4);
                }
                return super.w(viewGroup, i10);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        th.c0 c0Var;
        th.h0 h0Var;
        switch (this.P) {
            case 2:
                super.y(c1Var);
                th.p1 p1Var = (th.p1) this.Q;
                if (p1Var.D) {
                    View view = c1Var.f47898a;
                    if ((view instanceof th.c0) && (h0Var = (c0Var = (th.c0) view).K) != null && h0Var.f49006a == p1Var.f49095y) {
                        c0Var.c();
                        p1Var.D = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(c1Var);
                return;
        }
    }

    public o3(p10 p10Var, tk0 tk0Var, Activity activity, int i10, int i11, j20 j20Var, p6 p6Var, int i12) {
        super(tk0Var, activity, i10, i11, true, j20Var, p6Var);
        this.P = i12;
        this.Q = p10Var;
    }
}
