package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.ProfileActivity;
public final class w1 extends u91 {
    public final org.telegram.ui.ActionBar.m2 T;
    public final xs0 U;

    public w1(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = xs0Var;
        this.T = m2Var;
    }

    @Override
    public final void h() {
        xs0 xs0Var = this.U;
        t91 t91Var = xs0Var.f51734n;
        if (xs0Var.b() && t91Var != null) {
            if (xs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                gr grVar = new gr(R.drawable.poll_add_plus, 0);
                grVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(grVar, 0, 1, 33);
                xs0Var.J = spannableStringBuilder;
            }
            t91Var.a(-1, xs0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        xs0 xs0Var = this.U;
        xs0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        xs0Var.o();
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
