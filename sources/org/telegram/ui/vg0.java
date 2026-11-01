package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class vg0 extends s4.g0 {
    public final int f42531c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f42532f;

    public vg0(KeyEvent.Callback callback, Context context, Object obj, int i10) {
        this.f42531c = i10;
        this.f42532f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override
    public final int b() {
        switch (this.f42531c) {
            case 0:
                return ((ih0) this.f42532f).M.size();
            default:
                return vh.r.a().size();
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        switch (this.f42531c) {
            case 0:
                ih0 ih0Var = (ih0) this.f42532f;
                ArrayList arrayList = ih0Var.M;
                boolean z11 = true;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get((b() - 1) - i10);
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) c1Var.f47909a;
                org.telegram.messenger.fj k10 = ih0Var.k(kjVar);
                int i11 = 0;
                if (k10 == null) {
                    z11 = false;
                }
                q1Var.setInvalidatesParent(z11);
                q1Var.s3(kjVar, k10, false, false, false, false);
                if (!ih0Var.O.i() && arrayList.size() >= 10) {
                    i11 = arrayList.size() % 10;
                }
                if (i10 == i11 && !kjVar.n5()) {
                    ih0Var.P = q1Var;
                    Point point = org.telegram.messenger.i0.f16172q;
                    q1Var.u3(point.x, point.y);
                    ih0Var.Q = kjVar.f1();
                    return;
                }
                return;
            default:
                vh.s sVar = (vh.s) c1Var.f47909a;
                vh.r rVar = (vh.r) vh.r.a().get(i10);
                if (i10 == sVar.f51885s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sVar.setDrawable(new org.telegram.ui.Components.ob0(rVar, false));
                sVar.b(rVar.equals(((vh.t) this.f42532f).f51959b), z10);
                sVar.f51885s = i10;
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        switch (this.f42531c) {
            case 0:
                ih0 ih0Var = (ih0) this.f42532f;
                hh0 hh0Var = new hh0(ih0Var, this.d, ih0Var.f38062c, (org.telegram.ui.ActionBar.p6) this.e);
                hh0Var.setDelegate(new jb.b(15));
                return new s4.c1(hh0Var);
            default:
                vh.a9 a9Var = new vh.a9(this.d);
                a9Var.setLayoutParams(new s4.o0(org.telegram.messenger.i0.L(46.0f), org.telegram.messenger.i0.L(56.0f)));
                a9Var.setBackground(org.telegram.ui.ActionBar.t6.h0(553648127, 1, -1));
                return new s4.c1(a9Var);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        switch (this.f42531c) {
            case 1:
                vh.s sVar = (vh.s) c1Var.f47909a;
                ((vh.z1) this.e).a(sVar);
                int i10 = sVar.f51885s;
                if (i10 >= 0 && i10 < vh.r.a().size()) {
                    vh.r rVar = (vh.r) vh.r.a().get(sVar.f51885s);
                    sVar.setDrawable(new org.telegram.ui.Components.ob0(rVar, false));
                    sVar.b(rVar.equals(((vh.t) this.f42532f).f51959b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(s4.c1 c1Var) {
        switch (this.f42531c) {
            case 1:
                ((vh.z1) this.e).d.remove((vh.s) c1Var.f47909a);
                return;
            default:
                return;
        }
    }
}
