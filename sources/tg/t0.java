package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.a5;
import hi.u5;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.dk0;
public final class t0 extends dk0 {
    public final Context f58174c;
    public final ca d;
    public final u5 f58175e;
    public final boolean f58176f;
    public final a5 h;

    public t0(a5 a5Var, Context context, ca caVar, u5 u5Var, boolean z10) {
        this.h = a5Var;
        this.f58174c = context;
        this.d = caVar;
        this.f58175e = u5Var;
        this.f58176f = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f58202t0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f58202t0;
        return ((gj) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        yi d;
        boolean z12;
        a5 a5Var = this.h;
        ArrayList arrayList = a5Var.f58202t0;
        gj gjVar = (gj) arrayList.get((arrayList.size() - 1) - i7);
        View view = f1Var.f59165a;
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            bj bjVar = a5Var.f58203u0;
            if (bjVar != null && (d = bjVar.d(gjVar)) != null) {
                if (d.f28094c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            bj bjVar2 = a5Var.f58203u0;
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
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        u0 u0Var = this.h.E0;
        Context context = this.f58174c;
        if (i7 == 1) {
            return new v4.f1(new r0(this, context, u0Var));
        }
        s0 s0Var = new s0(this, context, k10.f24968t0, u0Var);
        s0Var.f31428f6 = true;
        return new v4.f1(s0Var);
    }
}
