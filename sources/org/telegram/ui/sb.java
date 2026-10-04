package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class sb extends s4.h0 {
    public final Context f40438c;
    public int d;
    public int f40439e;
    public int f40440f;
    public int h;
    public final wb f40441n;

    public sb(wb wbVar, Context context) {
        this.f40441n = wbVar;
        new ArrayList();
        new ArrayList();
        this.f40438c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        wb wbVar = this.f40441n;
        ArrayList arrayList = wbVar.f42032o0;
        if (!arrayList.isEmpty()) {
            if (!wbVar.f42034q0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.f40439e = i10;
            } else {
                this.f40439e = -1;
            }
            int i11 = this.d;
            this.f40440f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.f40439e = -1;
        this.f40440f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f40440f && i10 < this.h) {
            ArrayList arrayList = this.f40441n.f42032o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f40440f)) - 1)).stableId;
        } else if (i10 == this.f40439e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f40440f && i10 < this.h) {
            ArrayList arrayList = this.f40441n.f42032o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f40440f)) - 1)).contentType;
        }
        return 4;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Cells.v1 v1Var;
        int i11;
        View view;
        wb wbVar = this.f40441n;
        ArrayList arrayList = wbVar.h;
        Context context = this.f40438c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.n2) wbVar).currentAccount;
                view = new org.telegram.ui.Cells.u1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(new nb(this));
            u1Var.setAllowAssistant(true);
            v1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
            w0Var.setDelegate(new qb(this));
            v1Var = w0Var;
        } else if (i10 == 2) {
            v1Var = new org.telegram.ui.Cells.w1(context, null);
        } else if (i10 == 10) {
            d6Var = ((org.telegram.ui.ActionBar.n2) wbVar).resourceProvider;
            org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(context, d6Var);
            v1Var2.setDelegate(new g(this, 9));
            v1Var = v1Var2;
        } else {
            v1Var = new org.telegram.ui.Cells.z0(context, null);
        }
        return com.google.android.gms.internal.vision.e2.k(v1Var, v1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f46523a;
        if ((view instanceof org.telegram.ui.Cells.u1) || (view instanceof org.telegram.ui.Cells.w0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new rb(this, view, c1Var));
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            u1Var.setBackgroundDrawable(null);
            u1Var.K3(true, false);
            u1Var.setHighlighted(false);
        }
    }
}
