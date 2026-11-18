package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.b5;
import hi.v5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ca;
public final class s0 extends bk0 {
    public final Context f58118c;
    public final ca d;
    public final v5 f58119e;
    public final boolean f58120f;
    public final b5 h;

    public s0(b5 b5Var, Context context, ca caVar, v5 v5Var, boolean z10) {
        this.h = b5Var;
        this.f58118c = context;
        this.d = caVar;
        this.f58119e = v5Var;
        this.f58120f = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f58141t0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f58141t0;
        return ((fj) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        xi d;
        boolean z12;
        b5 b5Var = this.h;
        ArrayList arrayList = b5Var.f58141t0;
        fj fjVar = (fj) arrayList.get((arrayList.size() - 1) - i7);
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            aj ajVar = b5Var.f58142u0;
            if (ajVar != null && (d = ajVar.d(fjVar)) != null) {
                if (d.f27884c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            aj ajVar2 = b5Var.f58142u0;
            if (ajVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q1Var.y3(fjVar, ajVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.u0) {
            ((org.telegram.ui.Cells.u0) view).setMessageObject(fjVar);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        t0 t0Var = this.h.E0;
        Context context = this.f58118c;
        if (i7 == 1) {
            return new v4.f1(new q0(this, context, t0Var));
        }
        r0 r0Var = new r0(this, context, j10.f24773t0, t0Var);
        r0Var.f31347f6 = true;
        return new v4.f1(r0Var);
    }
}
