package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class wz extends org.telegram.ui.Components.pj0 {
    public final Context f53030r;
    public final vz f53031s = new vz(this);
    public final zz f53032w;

    public wz(zz zzVar, Context context) {
        this.f53032w = zzVar;
        this.f53030r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        zz zzVar = this.f53032w;
        int i10 = 1;
        if (i7 >= zzVar.f54090n.size()) {
            return 1;
        }
        int size = ((ArrayList) zzVar.f54095r.get(zzVar.f54090n.get(i7))).size();
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
        if (i7 < this.f53032w.f54090n.size()) {
            if (i7 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        zz zzVar = this.f53032w;
        ArrayList arrayList = zzVar.f54090n;
        int i7 = 0;
        if (zzVar.f54082f.isEmpty() || (arrayList.isEmpty() && zzVar.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !zzVar.O) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f53030r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28869e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        zz zzVar = this.f53032w;
        if (i7 < zzVar.f54090n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) ((ArrayList) zzVar.f54095r.get((String) zzVar.f54090n.get(i7))).get(0)).f23817k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        boolean z10;
        zz zzVar = this.f53032w;
        ArrayList arrayList = zzVar.f54090n;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) zzVar.f54095r.get((String) arrayList.get(i7));
            int i12 = e1Var.f58539f;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i7 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i10);
                    if (j7Var.getMessage() != null && j7Var.getMessage().e1() == gjVar.e1()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && zzVar.N)) {
                        z11 = true;
                    }
                    j7Var.E = z11;
                    j7Var.e();
                    j7Var.f30499c0 = gjVar;
                    j7Var.requestLayout();
                    j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.bk(this, j7Var, gjVar, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.e0(((org.telegram.messenger.gj) arrayList2.get(0)).f23817k.date, false));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.f53030r;
        if (i7 != 0) {
            if (i7 != 1) {
                org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
                pzVar.setViewType(5);
                pzVar.setIsSingleCell(true);
                x3Var = pzVar;
            } else {
                org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(1, context, null);
                j7Var.setDelegate(this.f53031s);
                x3Var = j7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return i5.c.q(x3Var, x3Var, -1, -2);
    }
}
