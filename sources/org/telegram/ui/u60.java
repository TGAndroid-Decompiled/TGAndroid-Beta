package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class u60 extends org.telegram.ui.Components.tk0 {
    public final Context f41835c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f41836f;
    public boolean h;
    public final x60 f41837n;

    public u60(x60 x60Var, Context context) {
        this.f41837n = x60Var;
        this.f41835c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.s4) {
            ((org.telegram.ui.Cells.s4) view).f23008a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f41836f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f41836f = timer2;
        timer2.schedule(new org.telegram.messenger.we(2, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f41837n.f43271w.size() + 2;
    }

    @Override
    public final int d(int i10) {
        if (!this.h) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i10;
        super.f();
        x60 x60Var = this.f41837n;
        u60 u60Var = x60Var.f43270s;
        if (u60Var != null && !x60Var.f43273y) {
            int b10 = u60Var.b();
            org.telegram.ui.Components.ew0 ew0Var = x60Var.f43269r;
            if (b10 == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            ew0Var.setVisibility(i10);
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (c1Var.f47912f == 0) {
            org.telegram.ui.Cells.s4 s4Var = (org.telegram.ui.Cells.s4) c1Var.f47909a;
            boolean z10 = this.h;
            x60 x60Var = this.f41837n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                f5Var = (org.telegram.messenger.f5) x60Var.f43271w.get(i10 - 2);
                charSequence = null;
            }
            s4Var.a(f5Var, charSequence);
            boolean containsKey = x60Var.D.containsKey(f5Var.f15693b);
            org.telegram.ui.Components.ep epVar = s4Var.e;
            if (epVar != null) {
                epVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        Context context = this.f41835c;
        if (i10 == 1) {
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            p8Var2.g(i11, i11);
            p8Var2.u(org.telegram.messenger.dd.L0(2131745445, null), "", false, 2131232364, false);
            p8Var = p8Var2;
        } else if (i10 == 2) {
            p8Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        } else {
            p8Var = new org.telegram.ui.Cells.s4(context, true);
        }
        return new s4.c1(p8Var);
    }
}
