package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class tz extends org.telegram.ui.Components.oj0 {
    public final Context f49924r;
    public final sz f49925s = new sz(this);
    public final wz f49926w;

    public tz(wz wzVar, Context context) {
        this.f49926w = wzVar;
        this.f49924r = context;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        wz wzVar = this.f49926w;
        int i10 = 1;
        if (i3 >= wzVar.f51653n.size()) {
            return 1;
        }
        int size = ((ArrayList) wzVar.f51658r.get(wzVar.f51653n.get(i3))).size();
        if (i3 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i3, int i10) {
        return null;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i3 < this.f49926w.f51653n.size()) {
            if (i3 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        wz wzVar = this.f49926w;
        ArrayList arrayList = wzVar.f51653n;
        int i3 = 0;
        if (wzVar.f51645f.isEmpty() || (arrayList.isEmpty() && wzVar.N)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !wzVar.O) {
            i3 = 1;
        }
        return size + i3;
    }

    @Override
    public final View T(int i3, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f49924r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27899e7, false) & (-218103809));
        }
        if (i3 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        wz wzVar = this.f49926w;
        if (i3 < wzVar.f51653n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) ((ArrayList) wzVar.f51658r.get((String) wzVar.f51653n.get(i3))).get(0)).f26868k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        return true;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        boolean z10;
        wz wzVar = this.f49926w;
        ArrayList arrayList = wzVar.f51653n;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) wzVar.f51658r.get((String) arrayList.get(i3));
            int i12 = d1Var.f55544f;
            boolean z11 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i3 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i10);
                    if (j7Var.getMessage() != null && j7Var.getMessage().f1() == ziVar.f1()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i3 == arrayList.size() - 1 && wzVar.N)) {
                        z11 = true;
                    }
                    j7Var.E = z11;
                    j7Var.e();
                    j7Var.f29438c0 = ziVar;
                    j7Var.requestLayout();
                    j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, j7Var, ziVar, z10, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.e0(((org.telegram.messenger.zi) arrayList2.get(0)).f26868k.date, false));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.f49924r;
        if (i3 != 0) {
            if (i3 != 1) {
                org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
                izVar.setViewType(5);
                izVar.setIsSingleCell(true);
                x3Var = izVar;
            } else {
                org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(1, context, null);
                j7Var.setDelegate(this.f49925s);
                x3Var = j7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return k2.p1.p(x3Var, x3Var, -1, -2);
    }
}
