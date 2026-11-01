package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class v00 extends org.telegram.ui.Components.pk0 {
    public final Context f42373r;
    public final u00 f42374s = new u00(this);
    public final y00 f42375w;

    public v00(y00 y00Var, Context context) {
        this.f42375w = y00Var;
        this.f42373r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        y00 y00Var = this.f42375w;
        int i11 = 1;
        if (i10 >= y00Var.f43512n.size()) {
            return 1;
        }
        int size = ((ArrayList) y00Var.f43517r.get(y00Var.f43512n.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 < this.f42375w.f43512n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        y00 y00Var = this.f42375w;
        ArrayList arrayList = y00Var.f43512n;
        int i10 = 0;
        if (y00Var.f43504f.isEmpty() || (arrayList.isEmpty() && y00Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !y00Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f42373r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        y00 y00Var = this.f42375w;
        if (i10 < y00Var.f43512n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(((org.telegram.messenger.kj) ((ArrayList) y00Var.f43517r.get((String) y00Var.f43512n.get(i10))).get(0)).f16690k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        y00 y00Var = this.f42375w;
        ArrayList arrayList = y00Var.f43512n;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) y00Var.f43517r.get((String) arrayList.get(i10));
            int i13 = c1Var.f47912f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(i11);
                    if (o7Var.getMessage() != null && o7Var.getMessage().f1() == kjVar.f1()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && y00Var.M)) {
                        z11 = true;
                    }
                    o7Var.D = z11;
                    o7Var.e();
                    o7Var.f22389b0 = kjVar;
                    o7Var.requestLayout();
                    o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, o7Var, kjVar, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.e0(((org.telegram.messenger.kj) arrayList2.get(0)).f16690k.date, false));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        Context context = this.f42373r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setViewType(5);
                zzVar.setIsSingleCell(true);
                z3Var = zzVar;
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(1, context, null);
                o7Var.setDelegate(this.f42374s);
                z3Var = o7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return sc.e.o(z3Var, z3Var, -1, -2);
    }
}
