package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rc implements h5.d {
    public final int f37794a;
    public final boolean f37795b;
    public final Object f37796c;

    public rc(int i10, Object obj, boolean z4) {
        this.f37794a = i10;
        this.f37796c = obj;
        this.f37795b = z4;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.j81 j81Var;
        switch (this.f37794a) {
            case 0:
                uc ucVar = (uc) this.f37796c;
                View view = (View) obj;
                tc tcVar = (tc) view;
                ucVar.f38772b.getClass();
                if (RecyclerView.R(view) == ucVar.e) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tcVar.f38459s = z4;
                if (!this.f37795b) {
                    tcVar.v.f(z4, true);
                }
                tcVar.invalidate();
                return;
            case 1:
                zn znVar = (zn) this.f37796c;
                View view2 = (View) obj;
                boolean z12 = view2 instanceof org.telegram.ui.Cells.s1;
                boolean z13 = this.f37795b;
                if (z12) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                    if (s1Var.B8 && s1Var.D8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != z13 && znVar.B9()) {
                        s1Var.B8 = z13;
                        s1Var.D8 = znVar.B9();
                        s1Var.f22056k8 = true;
                        s1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).f22396b0 = z13;
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.k81 k81Var = (org.telegram.ui.Components.k81) this.f37796c;
                View view3 = (View) obj;
                k81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.i81) {
                    org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) view3;
                    if (this.f37795b && (j81Var = k81Var.f26231y) != null && ((org.telegram.ui.Components.tp0) j81Var).j(R)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i81Var.setReordering(z11);
                    return;
                }
                return;
        }
    }
}
