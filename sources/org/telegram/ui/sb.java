package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class sb extends s4.h0 {
    public final Context f36636c;
    public int d;
    public int e;
    public int f36637f;
    public int h;
    public final wb f36638n;

    public sb(wb wbVar, Context context) {
        this.f36638n = wbVar;
        new ArrayList();
        new ArrayList();
        this.f36636c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        wb wbVar = this.f36638n;
        ArrayList arrayList = wbVar.f37813s0;
        if (!arrayList.isEmpty()) {
            if (!wbVar.f37815u0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.e = i10;
            } else {
                this.e = -1;
            }
            int i11 = this.d;
            this.f36637f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f36637f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f36637f && i10 < this.h) {
            ArrayList arrayList = this.f36638n.f37813s0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f36637f)) - 1)).stableId;
        } else if (i10 == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f36637f && i10 < this.h) {
            ArrayList arrayList = this.f36638n.f37813s0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f36637f)) - 1)).contentType;
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
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sb.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        View view;
        wb wbVar = this.f36638n;
        ArrayList arrayList = wbVar.v;
        Context context = this.f36636c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                view = new org.telegram.ui.Cells.t1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(new nb(this));
            t1Var.setAllowAssistant(true);
            u1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
            w0Var.setDelegate(new qb(this));
            u1Var = w0Var;
        } else if (i10 == 2) {
            u1Var = new org.telegram.ui.Cells.v1(context, null);
        } else if (i10 == 10) {
            f6Var = ((org.telegram.ui.ActionBar.p2) wbVar).resourceProvider;
            org.telegram.ui.Cells.u1 u1Var2 = new org.telegram.ui.Cells.u1(context, f6Var);
            u1Var2.setDelegate(new g(this, 10));
            u1Var = u1Var2;
        } else {
            u1Var = new org.telegram.ui.Cells.z0(context, null);
        }
        return com.google.android.gms.internal.vision.e2.j(u1Var, u1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.w0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new rb(this, view, c1Var));
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            t1Var.setBackgroundDrawable(null);
            t1Var.K3(true, false);
            t1Var.setHighlighted(false);
        }
    }
}
