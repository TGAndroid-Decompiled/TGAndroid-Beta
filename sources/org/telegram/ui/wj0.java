package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class wj0 extends s4.u0 {
    public final int f45017a;
    public final org.telegram.ui.Components.s71 f45018b;
    public final xj0 f45019c;
    public final zj0 d;

    public wj0(zj0 zj0Var, int i10, org.telegram.ui.Components.s71 s71Var, xj0 xj0Var) {
        this.d = zj0Var;
        this.f45017a = i10;
        this.f45018b = s71Var;
        this.f45019c = xj0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            int i11 = this.f45017a;
            zj0 zj0Var = this.d;
            if (i11 != 2) {
                zj0.a0(zj0Var);
            } else if (zj0Var.getParentActivity() != null) {
                AndroidUtilities.hideKeyboard(zj0Var.getParentActivity().getCurrentFocus());
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.f45017a;
        zj0 zj0Var = this.d;
        xj0 xj0Var = this.f45019c;
        if (i11 >= 0) {
            org.telegram.ui.Components.s71 s71Var = this.f45018b;
            if (s71Var.f32503f3.N0() >= s71Var.f32504g3.f29882y.size() - 5 && !xj0Var.f45720k) {
                zj0Var.l0(i12, false);
            }
        }
        if (i12 == 1) {
            zj0Var.m0(xj0Var);
        }
    }
}
