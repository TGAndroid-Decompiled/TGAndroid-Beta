package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class rb extends s4.g0 {
    public final Context f41083c;
    public int d;
    public int e;
    public int f41084f;
    public int h;
    public final vb f41085n;

    public rb(vb vbVar, Context context) {
        this.f41085n = vbVar;
        new ArrayList();
        new ArrayList();
        this.f41083c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        vb vbVar = this.f41085n;
        ArrayList arrayList = vbVar.f42664o0;
        if (!arrayList.isEmpty()) {
            if (!vbVar.f42666q0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.e = i10;
            } else {
                this.e = -1;
            }
            int i11 = this.d;
            this.f41084f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f41084f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f41084f && i10 < this.h) {
            ArrayList arrayList = this.f41085n.f42664o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f41084f)) - 1)).stableId;
        } else if (i10 == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f41084f && i10 < this.h) {
            ArrayList arrayList = this.f41085n.f42664o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f41084f)) - 1)).contentType;
        }
        return 4;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rb.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        View view;
        vb vbVar = this.f41085n;
        ArrayList arrayList = vbVar.h;
        Context context = this.f41083c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                view = new org.telegram.ui.Cells.t1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(new mb(this));
            t1Var.setAllowAssistant(true);
            u1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
            v0Var.setDelegate(new pb(this));
            u1Var = v0Var;
        } else if (i10 == 2) {
            u1Var = new org.telegram.ui.Cells.v1(context, null);
        } else if (i10 == 10) {
            g6Var = ((org.telegram.ui.ActionBar.o2) vbVar).resourceProvider;
            org.telegram.ui.Cells.u1 u1Var2 = new org.telegram.ui.Cells.u1(context, g6Var);
            u1Var2.setDelegate(new f(this, 10));
            u1Var = u1Var2;
        } else {
            u1Var = new org.telegram.ui.Cells.y0(context, null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u1Var, u1Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new qb(this, view, b1Var));
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            t1Var.setBackgroundDrawable(null);
            t1Var.J3(true, false);
            t1Var.setHighlighted(false);
        }
    }
}
