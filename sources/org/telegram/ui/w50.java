package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class w50 extends org.telegram.ui.Components.oj0 {
    public final Context f50959c;
    public ArrayList d = new ArrayList();
    public ArrayList f50960e = new ArrayList();
    public Timer f50961f;
    public boolean h;
    public final z50 f50962n;

    public w50(z50 z50Var, Context context) {
        this.f50962n = z50Var;
        this.f50959c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f56952a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).f30120a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f50961f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f50960e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f50961f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f50962n.f52485w.size() + 2;
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
        z50 z50Var = this.f50962n;
        w50 w50Var = z50Var.f52484s;
        if (w50Var != null && !z50Var.f52487y) {
            int b10 = w50Var.b();
            org.telegram.ui.Components.av0 av0Var = z50Var.f52483r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            av0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (d1Var.f56956f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) d1Var.f56952a;
            boolean z9 = this.h;
            z50 z50Var = this.f50962n;
            if (z9) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i7);
                charSequence = (CharSequence) this.f50960e.get(i7);
            } else {
                d5Var = (org.telegram.messenger.d5) z50Var.f52485w.get(i7 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = z50Var.D.containsKey(d5Var.f21957b);
            org.telegram.ui.Components.wo woVar = q4Var.f30123e;
            if (woVar != null) {
                woVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.f50959c;
        if (i7 == 1) {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            m8Var2.g(i10, i10);
            m8Var2.u(org.telegram.messenger.hd.M0(2131745428, null), "", false, 2131232365, false);
            m8Var = m8Var2;
        } else if (i7 == 2) {
            m8Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        } else {
            m8Var = new org.telegram.ui.Cells.q4(context, true);
        }
        return new v4.d1(m8Var);
    }
}
