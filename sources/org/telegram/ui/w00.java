package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class w00 extends org.telegram.ui.Components.ok0 {
    public final Context f42844r;
    public final v00 f42845s = new v00(this);
    public final z00 f42846w;

    public w00(z00 z00Var, Context context) {
        this.f42846w = z00Var;
        this.f42844r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        z00 z00Var = this.f42846w;
        int i11 = 1;
        if (i10 >= z00Var.f43955n.size()) {
            return 1;
        }
        int size = ((ArrayList) z00Var.f43960r.get(z00Var.f43955n.get(i10))).size();
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
        if (i10 < this.f42846w.f43955n.size()) {
            if (i10 != 0 && i11 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        z00 z00Var = this.f42846w;
        ArrayList arrayList = z00Var.f43955n;
        int i10 = 0;
        if (z00Var.f43947f.isEmpty() || (arrayList.isEmpty() && z00Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !z00Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f42844r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        z00 z00Var = this.f42846w;
        if (i10 < z00Var.f43955n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) ((ArrayList) z00Var.f43960r.get((String) z00Var.f43955n.get(i10))).get(0)).f16337k.date, false));
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
        z00 z00Var = this.f42846w;
        ArrayList arrayList = z00Var.f43955n;
        int i12 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) z00Var.f43960r.get((String) arrayList.get(i10));
            int i13 = c1Var.f47901f;
            boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i10 != 0) {
                        i11--;
                    }
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i11);
                    if (o7Var.getMessage() != null && o7Var.getMessage().f1() == jjVar.f1()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && z00Var.M)) {
                        z11 = true;
                    }
                    o7Var.D = z11;
                    o7Var.e();
                    o7Var.f22388b0 = jjVar;
                    o7Var.requestLayout();
                    o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.vj(this, o7Var, jjVar, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.e0(((org.telegram.messenger.jj) arrayList2.get(0)).f16337k.date, false));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        Context context = this.f42844r;
        if (i10 != 0) {
            if (i10 != 1) {
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setViewType(5);
                zzVar.setIsSingleCell(true);
                z3Var = zzVar;
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(1, context, null);
                o7Var.setDelegate(this.f42845s);
                z3Var = o7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return sc.e.o(z3Var, z3Var, -1, -2);
    }
}
