package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class x50 extends org.telegram.ui.Components.dk0 {
    public final Context f53558c;
    public ArrayList d = new ArrayList();
    public ArrayList f53559e = new ArrayList();
    public Timer f53560f;
    public boolean h;
    public final a60 f53561n;

    public x50(a60 a60Var, Context context) {
        this.f53561n = a60Var;
        this.f53558c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.r4) {
            ((org.telegram.ui.Cells.r4) view).f31692a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f53560f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f53559e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f53560f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f53561n.f45485w.size() + 2;
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
        a60 a60Var = this.f53561n;
        x50 x50Var = a60Var.f45484s;
        if (x50Var != null && !a60Var.f45487y) {
            int b10 = x50Var.b();
            org.telegram.ui.Components.nv0 nv0Var = a60Var.f45483r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            nv0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (e1Var.f59115f == 0) {
            org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) e1Var.f59111a;
            boolean z10 = this.h;
            a60 a60Var = this.f53561n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i7);
                charSequence = (CharSequence) this.f53559e.get(i7);
            } else {
                f5Var = (org.telegram.messenger.f5) a60Var.f45485w.get(i7 - 2);
                charSequence = null;
            }
            r4Var.a(f5Var, charSequence);
            boolean containsKey = a60Var.E.containsKey(f5Var.f23825b);
            org.telegram.ui.Components.op opVar = r4Var.f31695e;
            if (opVar != null) {
                opVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        Context context = this.f53558c;
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
        return new v4.e1(n8Var);
    }
}
