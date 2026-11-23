package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hi.e6;
import hi.l5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.dk0;
public final class x0 extends dk0 {
    public final Context f58289c;
    public final ba d;
    public final e6 f58290e;
    public final boolean f58291f;
    public final l5 h;

    public x0(l5 l5Var, Context context, ba baVar, e6 e6Var, boolean z10) {
        this.h = l5Var;
        this.f58289c = context;
        this.d = baVar;
        this.f58290e = e6Var;
        this.f58291f = z10;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f58314u0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f58314u0;
        return ((fj) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        xi d;
        boolean z12;
        l5 l5Var = this.h;
        ArrayList arrayList = l5Var.f58314u0;
        fj fjVar = (fj) arrayList.get((arrayList.size() - 1) - i7);
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            aj ajVar = l5Var.f58315v0;
            if (ajVar != null && (d = ajVar.d(fjVar)) != null) {
                if (d.f27998c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            aj ajVar2 = l5Var.f58315v0;
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
        y0 y0Var = this.h.F0;
        Context context = this.f58289c;
        if (i7 == 1) {
            return new v4.f1(new v0(this, context, y0Var));
        }
        w0 w0Var = new w0(this, context, i10.f24637t0, y0Var);
        w0Var.f31478f6 = true;
        return new v4.f1(w0Var);
    }
}
