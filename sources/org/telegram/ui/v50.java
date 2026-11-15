package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class v50 extends org.telegram.ui.Components.tj0 {
    public final Context f52133c;
    public ArrayList d = new ArrayList();
    public ArrayList f52134e = new ArrayList();
    public Timer f52135f;
    public boolean h;
    public final y50 f52136n;

    public v50(y50 y50Var, Context context) {
        this.f52136n = y50Var;
        this.f52133c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).f31273a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f52135f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f52134e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f52135f = timer2;
        timer2.schedule(new jg.q1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f52136n.f53425w.size() + 2;
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
        y50 y50Var = this.f52136n;
        v50 v50Var = y50Var.f53424s;
        if (v50Var != null && !y50Var.f53427y) {
            int b10 = v50Var.b();
            org.telegram.ui.Components.cv0 cv0Var = y50Var.f53423r;
            if (b10 == 2) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            cv0Var.setVisibility(i7);
        }
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (e1Var.f58539f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) e1Var.f58535a;
            boolean z10 = this.h;
            y50 y50Var = this.f52136n;
            if (z10) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i7);
                charSequence = (CharSequence) this.f52134e.get(i7);
            } else {
                d5Var = (org.telegram.messenger.d5) y50Var.f53425w.get(i7 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = y50Var.E.containsKey(d5Var.f23032b);
            org.telegram.ui.Components.fp fpVar = q4Var.f31276e;
            if (fpVar != null) {
                fpVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.l8 l8Var;
        Context context = this.f52133c;
        if (i7 == 1) {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            l8Var2.g(i10, i10);
            l8Var2.u(org.telegram.messenger.hd.M0(2131745427, null), "", false, 2131232366, false);
            l8Var = l8Var2;
        } else if (i7 == 2) {
            l8Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        } else {
            l8Var = new org.telegram.ui.Cells.q4(context, true);
        }
        return new v4.e1(l8Var);
    }
}
