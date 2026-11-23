package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.b5;
import hi.v5;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.dk0;
public final class t0 extends dk0 {
    public final Context f58139c;
    public final ca d;
    public final v5 f58140e;
    public final boolean f58141f;
    public final b5 h;

    public t0(b5 b5Var, Context context, ca caVar, v5 v5Var, boolean z10) {
        this.h = b5Var;
        this.f58139c = context;
        this.d = caVar;
        this.f58140e = v5Var;
        this.f58141f = z10;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f58167t0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f58167t0;
        return ((gj) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        yi d;
        boolean z12;
        b5 b5Var = this.h;
        ArrayList arrayList = b5Var.f58167t0;
        gj gjVar = (gj) arrayList.get((arrayList.size() - 1) - i7);
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            bj bjVar = b5Var.f58168u0;
            if (bjVar != null && (d = bjVar.d(gjVar)) != null) {
                if (d.f28058c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            bj bjVar2 = b5Var.f58168u0;
            if (bjVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            r1Var.y3(gjVar, bjVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setMessageObject(gjVar);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        u0 u0Var = this.h.E0;
        Context context = this.f58139c;
        if (i7 == 1) {
            return new v4.e1(new r0(this, context, u0Var));
        }
        s0 s0Var = new s0(this, context, k10.f24932t0, u0Var);
        s0Var.f31394f6 = true;
        return new v4.e1(s0Var);
    }
}
