package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.ProfileActivity;
public final class x1 extends w81 {
    public final org.telegram.ui.ActionBar.m2 T;
    public final zr0 U;

    public x1(zr0 zr0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = zr0Var;
        this.T = m2Var;
    }

    @Override
    public final void h() {
        zr0 zr0Var = this.U;
        v81 v81Var = zr0Var.f46401n;
        if (zr0Var.b() && v81Var != null) {
            if (zr0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.f0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                pq pqVar = new pq(R.drawable.poll_add_plus, 0);
                pqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
                zr0Var.J = spannableStringBuilder;
            }
            v81Var.a(-1, zr0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        zr0 zr0Var = this.U;
        zr0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        zr0Var.o();
    }

    @Override
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
        }
    }
}
