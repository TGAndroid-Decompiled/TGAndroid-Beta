package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class sb extends s4.h0 {
    public final Context f43439c;
    public int d;
    public int e;
    public int f43440f;
    public int h;
    public final wb f43441n;

    public sb(wb wbVar, Context context) {
        this.f43441n = wbVar;
        new ArrayList();
        new ArrayList();
        this.f43439c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        wb wbVar = this.f43441n;
        ArrayList arrayList = wbVar.f45075o0;
        if (!arrayList.isEmpty()) {
            if (!wbVar.f45077q0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.e = i10;
            } else {
                this.e = -1;
            }
            int i11 = this.d;
            this.f43440f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f43440f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f43440f && i10 < this.h) {
            ArrayList arrayList = this.f43441n.f45075o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f43440f)) - 1)).stableId;
        } else if (i10 == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f43440f && i10 < this.h) {
            ArrayList arrayList = this.f43441n.f45075o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f43440f)) - 1)).contentType;
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
    public final void v(s4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        View view;
        wb wbVar = this.f43441n;
        ArrayList arrayList = wbVar.h;
        Context context = this.f43439c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                view = new org.telegram.ui.Cells.s1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(new nb(this));
            s1Var.setAllowAssistant(true);
            t1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
            v0Var.setDelegate(new qb(this));
            t1Var = v0Var;
        } else if (i10 == 2) {
            t1Var = new org.telegram.ui.Cells.u1(context, null);
        } else if (i10 == 10) {
            u6Var = ((org.telegram.ui.ActionBar.r2) wbVar).resourceProvider;
            org.telegram.ui.Cells.t1 t1Var2 = new org.telegram.ui.Cells.t1(context, u6Var);
            t1Var2.setDelegate(new f(this, 9));
            t1Var = t1Var2;
        } else {
            t1Var = new org.telegram.ui.Cells.y0(context, null);
        }
        return ic.a.n(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if ((view instanceof org.telegram.ui.Cells.s1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new rb(this, view, e1Var));
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            s1Var.setBackgroundDrawable(null);
            s1Var.M3(true, false);
            s1Var.setHighlighted(false);
        }
    }
}
