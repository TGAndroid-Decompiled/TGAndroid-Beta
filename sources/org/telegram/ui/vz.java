package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class vz extends org.telegram.ui.Components.kj0 {
    public final Context f50799r;
    public final uz f50800s = new uz(this);
    public final yz f50801w;

    public vz(yz yzVar, Context context) {
        this.f50801w = yzVar;
        this.f50799r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        yz yzVar = this.f50801w;
        int i10 = 1;
        if (i7 >= yzVar.f52375n.size()) {
            return 1;
        }
        int size = ((ArrayList) yzVar.f52380r.get(yzVar.f52375n.get(i7))).size();
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
        if (i7 < this.f50801w.f52375n.size()) {
            if (i7 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        yz yzVar = this.f50801w;
        ArrayList arrayList = yzVar.f52375n;
        int i7 = 0;
        if (yzVar.f52367f.isEmpty() || (arrayList.isEmpty() && yzVar.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !yzVar.N) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f50799r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27872e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        yz yzVar = this.f50801w;
        if (i7 < yzVar.f52375n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) yzVar.f52380r.get((String) yzVar.f52375n.get(i7))).get(0)).f23262k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        boolean z9;
        yz yzVar = this.f50801w;
        ArrayList arrayList = yzVar.f52375n;
        int i11 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) yzVar.f52380r.get((String) arrayList.get(i7));
            int i12 = d1Var.f57047f;
            boolean z10 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i7 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i10);
                    if (k7Var.getMessage() != null && k7Var.getMessage().f1() == ijVar.f1()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && yzVar.M)) {
                        z10 = true;
                    }
                    k7Var.D = z10;
                    k7Var.e();
                    k7Var.f29435b0 = ijVar;
                    k7Var.requestLayout();
                    k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.tj(this, k7Var, ijVar, z9, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) arrayList2.get(0)).f23262k.date, false));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.f50799r;
        if (i7 != 0) {
            if (i7 != 1) {
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
                mzVar.setViewType(5);
                mzVar.setIsSingleCell(true);
                x3Var = mzVar;
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(1, context, null);
                k7Var.setDelegate(this.f50800s);
                x3Var = k7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}
