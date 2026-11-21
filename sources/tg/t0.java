package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.a5;
import hi.u5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.dk0;
public final class t0 extends dk0 {
    public final Context f58170c;
    public final ca d;
    public final u5 f58171e;
    public final boolean f58172f;
    public final a5 h;

    public t0(a5 a5Var, Context context, ca caVar, u5 u5Var, boolean z10) {
        this.h = a5Var;
        this.f58170c = context;
        this.d = caVar;
        this.f58171e = u5Var;
        this.f58172f = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f58198t0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f58198t0;
        return ((fj) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        xi d;
        boolean z12;
        a5 a5Var = this.h;
        ArrayList arrayList = a5Var.f58198t0;
        fj fjVar = (fj) arrayList.get((arrayList.size() - 1) - i7);
        View view = f1Var.f59161a;
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            aj ajVar = a5Var.f58199u0;
            if (ajVar != null && (d = ajVar.d(fjVar)) != null) {
                if (d.f27910c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            aj ajVar2 = a5Var.f58199u0;
            if (ajVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            r1Var.y3(fjVar, ajVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setMessageObject(fjVar);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        u0 u0Var = this.h.E0;
        Context context = this.f58170c;
        if (i7 == 1) {
            return new v4.f1(new r0(this, context, u0Var));
        }
        s0 s0Var = new s0(this, context, j10.f24798t0, u0Var);
        s0Var.f31425f6 = true;
        return new v4.f1(s0Var);
    }
}
