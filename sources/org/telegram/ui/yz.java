package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class yz extends org.telegram.ui.Components.zj0 {
    public final Context f54452r;
    public final xz f54453s = new xz(this);
    public final b00 f54454w;

    public yz(b00 b00Var, Context context) {
        this.f54454w = b00Var;
        this.f54452r = context;
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
        b00 b00Var = this.f54454w;
        int i10 = 1;
        if (i7 >= b00Var.f45860n.size()) {
            return 1;
        }
        int size = ((ArrayList) b00Var.f45865r.get(b00Var.f45860n.get(i7))).size();
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
        if (i7 < this.f54454w.f45860n.size()) {
            if (i7 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        b00 b00Var = this.f54454w;
        ArrayList arrayList = b00Var.f45860n;
        int i7 = 0;
        if (b00Var.f45852f.isEmpty() || (arrayList.isEmpty() && b00Var.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !b00Var.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.y3(this.f54452r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29471e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        b00 b00Var = this.f54454w;
        if (i7 < b00Var.f45860n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) ((ArrayList) b00Var.f45865r.get((String) b00Var.f45860n.get(i7))).get(0)).f24073k.date, false));
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
        b00 b00Var = this.f54454w;
        ArrayList arrayList = b00Var.f45860n;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) b00Var.f45865r.get((String) arrayList.get(i7));
            int i12 = f1Var.f59249f;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i7 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i10);
                    if (k7Var.getMessage() != null && k7Var.getMessage().e1() == fjVar.e1()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && b00Var.N)) {
                        z11 = true;
                    }
                    k7Var.E = z11;
                    k7Var.e();
                    k7Var.f31022c0 = fjVar;
                    k7Var.requestLayout();
                    k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ik(this, k7Var, fjVar, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.e0(((org.telegram.messenger.fj) arrayList2.get(0)).f24073k.date, false));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y3 y3Var;
        Context context = this.f54452r;
        if (i7 != 0) {
            if (i7 != 1) {
                org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
                vzVar.setViewType(5);
                vzVar.setIsSingleCell(true);
                y3Var = vzVar;
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(1, context, null);
                k7Var.setDelegate(this.f54453s);
                y3Var = k7Var;
            }
        } else {
            y3Var = new org.telegram.ui.Cells.y3(context, null);
        }
        return i5.c.q(y3Var, y3Var, -1, -2);
    }
}
