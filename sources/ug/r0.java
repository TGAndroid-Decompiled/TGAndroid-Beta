package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gi.c5;
import gi.x5;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.x9;
public final class r0 extends sj0 {
    public final Context f56233c;
    public final x9 d;
    public final x5 f56234e;
    public final boolean f56235f;
    public final c5 h;

    public r0(c5 c5Var, Context context, x9 x9Var, x5 x5Var, boolean z10) {
        this.h = c5Var;
        this.f56233c = context;
        this.d = x9Var;
        this.f56234e = x5Var;
        this.f56235f = z10;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f56265t0.size();
    }

    @Override
    public final int d(int i3) {
        ArrayList arrayList = this.h.f56265t0;
        return ((zi) arrayList.get((arrayList.size() - 1) - i3)).U;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        ri d;
        boolean z12;
        c5 c5Var = this.h;
        ArrayList arrayList = c5Var.f56265t0;
        zi ziVar = (zi) arrayList.get((arrayList.size() - 1) - i3);
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            ui uiVar = c5Var.f56266u0;
            if (uiVar != null && (d = uiVar.d(ziVar)) != null) {
                if (d.f25142c != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            ui uiVar2 = c5Var.f56266u0;
            if (uiVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q1Var.u3(ziVar, uiVar2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setMessageObject(ziVar);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        s0 s0Var = this.h.E0;
        Context context = this.f56233c;
        if (i3 == 1) {
            return new u4.d1(new p0(this, context, s0Var));
        }
        q0 q0Var = new q0(this, context, h10.f22829t0, s0Var);
        q0Var.f29900e6 = true;
        return new u4.d1(q0Var);
    }
}
