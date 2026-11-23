package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class x50 extends org.telegram.ui.Components.dk0 {
    public final Context f53636c;
    public ArrayList d = new ArrayList();
    public ArrayList f53637e = new ArrayList();
    public Timer f53638f;
    public boolean h;
    public final a60 f53639n;

    public x50(a60 a60Var, Context context) {
        this.f53639n = a60Var;
        this.f53636c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59165a;
        if (view instanceof org.telegram.ui.Cells.r4) {
            ((org.telegram.ui.Cells.r4) view).f31726a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f53638f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f53637e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f53638f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f53639n.f45519w.size() + 2;
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
        a60 a60Var = this.f53639n;
        x50 x50Var = a60Var.f45518s;
        if (x50Var != null && !a60Var.f45521y) {
            int b10 = x50Var.b();
            org.telegram.ui.Components.nv0 nv0Var = a60Var.f45517r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            nv0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (f1Var.f59169f == 0) {
            org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) f1Var.f59165a;
            boolean z10 = this.h;
            a60 a60Var = this.f53639n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i7);
                charSequence = (CharSequence) this.f53637e.get(i7);
            } else {
                f5Var = (org.telegram.messenger.f5) a60Var.f45519w.get(i7 - 2);
                charSequence = null;
            }
            r4Var.a(f5Var, charSequence);
            boolean containsKey = a60Var.E.containsKey(f5Var.f23861b);
            org.telegram.ui.Components.op opVar = r4Var.f31729e;
            if (opVar != null) {
                opVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        Context context = this.f53636c;
        if (i7 == 1) {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            n8Var2.g(i10, i10);
            n8Var2.u(org.telegram.messenger.hd.N0(2131745231, null), "", false, 2131232367, false);
            n8Var = n8Var2;
        } else if (i7 == 2) {
            n8Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        } else {
            n8Var = new org.telegram.ui.Cells.r4(context, true);
        }
        return new v4.f1(n8Var);
    }
}
