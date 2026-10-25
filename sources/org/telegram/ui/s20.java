package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class s20 extends s4.u0 {
    public final v50 f43344a;

    public s20(v50 v50Var) {
        this.f43344a = v50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.vl0 vl0Var;
        v50 v50Var = this.f43344a;
        b50 b50Var = v50Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            b50Var.getChildAt(0);
            i11 = ((org.telegram.ui.ActionBar.k3) v50Var).backgroundPaddingTop;
            if ((v50Var.f44708y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && b50Var.canScrollVertically(1) && (vl0Var = (org.telegram.ui.Components.vl0) b50Var.K(0)) != null) {
                View view = vl0Var.f47735a;
                if (view.getTop() > 0) {
                    b50Var.w0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.t40 t40Var = v50Var.m0;
        if (t40Var != null) {
            t40Var.b(true);
        }
        org.telegram.ui.Components.t40 t40Var2 = v50Var.f44659n0;
        if (t40Var2 != null) {
            t40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        v50 v50Var = this.f43344a;
        if (v50Var.Q.getChildCount() > 0 && (call = v50Var.f44607a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && v50Var.Y.N0() > v50Var.P.F - 5) {
                v50Var.f44607a1.loadMembers(false);
            }
            v50.J0(v50Var);
            k50 k50Var = v50Var.U0;
            if (k50Var != null) {
                k50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
            viewGroup.invalidate();
        }
    }
}
