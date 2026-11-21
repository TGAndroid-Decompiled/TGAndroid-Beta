package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class zz extends org.telegram.ui.Components.zj0 {
    public final Context f54665r;
    public final yz f54666s = new yz(this);
    public final c00 f54667w;

    public zz(c00 c00Var, Context context) {
        this.f54667w = c00Var;
        this.f54665r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        c00 c00Var = this.f54667w;
        int i10 = 1;
        if (i7 >= c00Var.f46360n.size()) {
            return 1;
        }
        int size = ((ArrayList) c00Var.f46365r.get(c00Var.f46360n.get(i7))).size();
        if (i7 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 < this.f54667w.f46360n.size()) {
            if (i7 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        c00 c00Var = this.f54667w;
        ArrayList arrayList = c00Var.f46360n;
        int i7 = 0;
        if (c00Var.f46352f.isEmpty() || (arrayList.isEmpty() && c00Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !c00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.f54665r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29398e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        c00 c00Var = this.f54667w;
        if (i7 < c00Var.f46360n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) c00Var.f46365r.get((String) c00Var.f46360n.get(i7))).get(0)).f23993k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        boolean z10;
        c00 c00Var = this.f54667w;
        ArrayList arrayList = c00Var.f46360n;
        int i11 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) c00Var.f46365r.get((String) arrayList.get(i7));
            int i12 = f1Var.f59165f;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i7 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i10);
                    if (l7Var.getMessage() != null && l7Var.getMessage().e1() == fjVar.e1()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && c00Var.N)) {
                        z11 = true;
                    }
                    l7Var.E = z11;
                    l7Var.e();
                    l7Var.f31027c0 = fjVar;
                    l7Var.requestLayout();
                    l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.kk(this, l7Var, fjVar, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) arrayList2.get(0)).f23993k.date, false));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        Context context = this.f54665r;
        if (i7 != 0) {
            if (i7 != 1) {
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
                yzVar.setViewType(5);
                yzVar.setIsSingleCell(true);
                y3Var = yzVar;
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(1, context, null);
                l7Var.setDelegate(this.f54666s);
                y3Var = l7Var;
            }
        } else {
            y3Var = new org.telegram.ui.Cells.y3(context, null);
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}
