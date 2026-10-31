package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class v60 extends org.telegram.ui.Components.sk0 {
    public final Context f42636c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f42637f;
    public boolean h;
    public final y60 f42638n;

    public v60(y60 y60Var, Context context) {
        this.f42638n = y60Var;
        this.f42636c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.s4) {
            ((org.telegram.ui.Cells.s4) view).f23007a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f42637f;
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
        this.f42637f = timer2;
        timer2.schedule(new org.telegram.messenger.ve(2, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f42638n.f43739w.size() + 2;
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
        y60 y60Var = this.f42638n;
        v60 v60Var = y60Var.f43738s;
        if (v60Var != null && !y60Var.f43741y) {
            int b10 = v60Var.b();
            org.telegram.ui.Components.dw0 dw0Var = y60Var.f43737r;
            if (b10 == 2) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            dw0Var.setVisibility(i10);
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.messenger.f5 f5Var;
        CharSequence charSequence;
        if (c1Var.f47901f == 0) {
            org.telegram.ui.Cells.s4 s4Var = (org.telegram.ui.Cells.s4) c1Var.f47898a;
            boolean z10 = this.h;
            y60 y60Var = this.f42638n;
            if (z10) {
                f5Var = (org.telegram.messenger.f5) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                f5Var = (org.telegram.messenger.f5) y60Var.f43739w.get(i10 - 2);
                charSequence = null;
            }
            s4Var.a(f5Var, charSequence);
            boolean containsKey = y60Var.D.containsKey(f5Var.f15509b);
            org.telegram.ui.Components.ep epVar = s4Var.e;
            if (epVar != null) {
                epVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p8 p8Var;
        Context context = this.f42636c;
        if (i10 == 1) {
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            p8Var2.g(i11, i11);
            p8Var2.u(org.telegram.messenger.cd.L0(2131745445, null), "", false, 2131232364, false);
            p8Var = p8Var2;
        } else if (i10 == 2) {
            p8Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        } else {
            p8Var = new org.telegram.ui.Cells.s4(context, true);
        }
        return new s4.c1(p8Var);
    }
}
