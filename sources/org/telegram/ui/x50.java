package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class x50 extends org.telegram.ui.Components.bk0 {
    public final Context f53591c;
    public ArrayList d = new ArrayList();
    public ArrayList f53592e = new ArrayList();
    public Timer f53593f;
    public boolean h;
    public final a60 f53594n;

    public x50(a60 a60Var, Context context) {
        this.f53594n = a60Var;
        this.f53591c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.r4) {
            ((org.telegram.ui.Cells.r4) view).f31695a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f53593f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f53592e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f53593f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f53594n.f45475w.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (!this.h) {
            if (i7 == 0) {
                return 1;
            }
            if (i7 == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i7;
        super.f();
        a60 a60Var = this.f53594n;
        x50 x50Var = a60Var.f45474s;
        if (x50Var != null && !a60Var.f45477y) {
            int b10 = x50Var.b();
            org.telegram.ui.Components.kv0 kv0Var = a60Var.f45473r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            kv0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (f1Var.f59127f == 0) {
            org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) f1Var.f59123a;
            boolean z10 = this.h;
            a60 a60Var = this.f53594n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i7);
                charSequence = (CharSequence) this.f53592e.get(i7);
            } else {
                f5Var = (org.telegram.messenger.f5) a60Var.f45475w.get(i7 - 2);
                charSequence = null;
            }
            r4Var.a(f5Var, charSequence);
            boolean containsKey = a60Var.E.containsKey(f5Var.f23838b);
            org.telegram.ui.Components.mp mpVar = r4Var.f31698e;
            if (mpVar != null) {
                mpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        Context context = this.f53591c;
        if (i7 == 1) {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            n8Var2.g(i10, i10);
            n8Var2.u(org.telegram.messenger.gd.M0(2131745232, null), "", false, 2131232367, false);
            n8Var = n8Var2;
        } else if (i7 == 2) {
            n8Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        } else {
            n8Var = new org.telegram.ui.Cells.r4(context, true);
        }
        return new v4.f1(n8Var);
    }
}
