package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.c5;
import hi.w5;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u9;
public final class s0 extends tj0 {
    public final Context f57549c;
    public final u9 d;
    public final w5 f57550e;
    public final boolean f57551f;
    public final c5 h;

    public s0(c5 c5Var, Context context, u9 u9Var, w5 w5Var, boolean z10) {
        this.h = c5Var;
        this.f57549c = context;
        this.d = u9Var;
        this.f57550e = w5Var;
        this.f57551f = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f57572t0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f57572t0;
        return ((gj) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        yi d;
        boolean z12;
        c5 c5Var = this.h;
        ArrayList arrayList = c5Var.f57572t0;
        gj gjVar = (gj) arrayList.get((arrayList.size() - 1) - i7);
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            bj bjVar = c5Var.f57573u0;
            if (bjVar != null && (d = bjVar.d(gjVar)) != null) {
                if (d.f27746c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            bj bjVar2 = c5Var.f57573u0;
            if (bjVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q1Var.x3(gjVar, bjVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setMessageObject(gjVar);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        t0 t0Var = this.h.E0;
        Context context = this.f57549c;
        if (i7 == 1) {
            return new v4.e1(new q0(this, context, t0Var));
        }
        r0 r0Var = new r0(this, context, m10.f24934t0, t0Var);
        r0Var.f30975f6 = true;
        return new v4.e1(r0Var);
    }
}
