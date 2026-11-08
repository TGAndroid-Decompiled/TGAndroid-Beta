package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.e5;
import fi.x5;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.y9;
public final class s0 extends oj0 {
    public final Context f55941c;
    public final y9 d;
    public final x5 f55942e;
    public final boolean f55943f;
    public final e5 h;

    public s0(e5 e5Var, Context context, y9 y9Var, x5 x5Var, boolean z9) {
        this.h = e5Var;
        this.f55941c = context;
        this.d = y9Var;
        this.f55942e = x5Var;
        this.f55943f = z9;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.f55964s0.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.h.f55964s0;
        return ((ij) arrayList.get((arrayList.size() - 1) - i7)).U;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        aj d;
        boolean z11;
        e5 e5Var = this.h;
        ArrayList arrayList = e5Var.f55964s0;
        ij ijVar = (ij) arrayList.get((arrayList.size() - 1) - i7);
        View view = d1Var.f57044a;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            dj djVar = e5Var.f55965t0;
            if (djVar != null && (d = djVar.d(ijVar)) != null) {
                if (d.f21443c != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z9 = z11;
            } else {
                z9 = false;
            }
            dj djVar2 = e5Var.f55965t0;
            if (djVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q1Var.w3(ijVar, djVar2, z10, z9, false, false);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setMessageObject(ijVar);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        t0 t0Var = this.h.D0;
        Context context = this.f55941c;
        if (i7 == 1) {
            return new v4.d1(new q0(this, context, t0Var));
        }
        r0 r0Var = new r0(this, context, p10.f24470s0, t0Var);
        r0Var.f29828e6 = true;
        return new v4.d1(r0Var);
    }
}
