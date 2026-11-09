package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class y50 extends org.telegram.ui.Components.pj0 {
    public final Context f51911c;
    public ArrayList d = new ArrayList();
    public ArrayList f51912e = new ArrayList();
    public Timer f51913f;
    public boolean h;
    public final b60 f51914n;

    public y50(b60 b60Var, Context context) {
        this.f51914n = b60Var;
        this.f51911c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).f30129a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f51913f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f51912e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f51913f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f51914n.f43916w.size() + 2;
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
        b60 b60Var = this.f51914n;
        y50 y50Var = b60Var.f43915s;
        if (y50Var != null && !b60Var.f43918y) {
            int b10 = y50Var.b();
            org.telegram.ui.Components.cv0 cv0Var = b60Var.f43914r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            cv0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (d1Var.f57060f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) d1Var.f57056a;
            boolean z9 = this.h;
            b60 b60Var = this.f51914n;
            if (z9) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i7);
                charSequence = (CharSequence) this.f51912e.get(i7);
            } else {
                d5Var = (org.telegram.messenger.d5) b60Var.f43916w.get(i7 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = b60Var.D.containsKey(d5Var.f21987b);
            org.telegram.ui.Components.wo woVar = q4Var.f30132e;
            if (woVar != null) {
                woVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.f51911c;
        if (i7 == 1) {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            int i10 = org.telegram.ui.ActionBar.l6.G6;
            m8Var2.g(i10, i10);
            m8Var2.u(org.telegram.messenger.id.M0(2131745427, null), "", false, 2131232365, false);
            m8Var = m8Var2;
        } else if (i7 == 2) {
            m8Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        } else {
            m8Var = new org.telegram.ui.Cells.q4(context, true);
        }
        return new v4.d1(m8Var);
    }
}
