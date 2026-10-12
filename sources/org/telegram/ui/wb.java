package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class wb extends s4.g0 {
    public final Context f41232c;
    public int d;
    public int e;
    public int f41233f;
    public int h;
    public final ac f41234n;

    public wb(ac acVar, Context context) {
        this.f41234n = acVar;
        new ArrayList();
        new ArrayList();
        this.f41232c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        ac acVar = this.f41234n;
        ArrayList arrayList = acVar.f34148o0;
        if (!arrayList.isEmpty()) {
            if (!acVar.f34150q0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.e = i10;
            } else {
                this.e = -1;
            }
            int i11 = this.d;
            this.f41233f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f41233f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f41233f && i10 < this.h) {
            ArrayList arrayList = this.f41234n.f34148o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f41233f)) - 1)).stableId;
        } else if (i10 == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f41233f && i10 < this.h) {
            ArrayList arrayList = this.f41234n.f34148o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f41233f)) - 1)).contentType;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.v1 v1Var;
        int i11;
        View view;
        ac acVar = this.f41234n;
        ArrayList arrayList = acVar.h;
        Context context = this.f41232c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                view = new org.telegram.ui.Cells.u1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(new rb(this));
            u1Var.setAllowAssistant(true);
            v1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context);
            x0Var.setDelegate(new ub(this));
            v1Var = x0Var;
        } else if (i10 == 2) {
            v1Var = new org.telegram.ui.Cells.w1(context, null);
        } else if (i10 == 10) {
            c6Var = ((org.telegram.ui.ActionBar.m2) acVar).resourceProvider;
            org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(context, c6Var);
            v1Var2.setDelegate(new g(this, 10));
            v1Var = v1Var2;
        } else {
            v1Var = new org.telegram.ui.Cells.a1(context, null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(v1Var, v1Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if ((view instanceof org.telegram.ui.Cells.u1) || (view instanceof org.telegram.ui.Cells.x0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new vb(this, view, b1Var));
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
