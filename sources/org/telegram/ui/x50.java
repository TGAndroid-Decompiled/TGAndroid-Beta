package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class x50 extends org.telegram.ui.Components.dk0 {
    public final Context f53857c;
    public ArrayList d = new ArrayList();
    public ArrayList f53858e = new ArrayList();
    public Timer f53859f;
    public boolean h;
    public final a60 f53860n;

    public x50(a60 a60Var, Context context) {
        this.f53860n = a60Var;
        this.f53857c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.r4) {
            ((org.telegram.ui.Cells.r4) view).f31776a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f53859f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f53858e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f53859f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f53860n.f45603w.size() + 2;
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
        a60 a60Var = this.f53860n;
        x50 x50Var = a60Var.f45602s;
        if (x50Var != null && !a60Var.f45605y) {
            int b10 = x50Var.b();
            org.telegram.ui.Components.mv0 mv0Var = a60Var.f45601r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            mv0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (f1Var.f59249f == 0) {
            org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) f1Var.f59245a;
            boolean z10 = this.h;
            a60 a60Var = this.f53860n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i7);
                charSequence = (CharSequence) this.f53858e.get(i7);
            } else {
                f5Var = (org.telegram.messenger.f5) a60Var.f45603w.get(i7 - 2);
                charSequence = null;
            }
            r4Var.a(f5Var, charSequence);
            boolean containsKey = a60Var.E.containsKey(f5Var.f23949b);
            org.telegram.ui.Components.lp lpVar = r4Var.f31779e;
            if (lpVar != null) {
                lpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.f53857c;
        if (i7 == 1) {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            m8Var2.g(i10, i10);
            m8Var2.u(org.telegram.messenger.gd.N0(2131745231, null), "", false, 2131232370, false);
            m8Var = m8Var2;
        } else if (i7 == 2) {
            m8Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        } else {
            m8Var = new org.telegram.ui.Cells.r4(context, true);
        }
        return new v4.f1(m8Var);
    }
}
