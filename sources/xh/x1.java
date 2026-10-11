package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.ProfileActivity;
public final class x1 extends q91 {
    public final org.telegram.ui.ActionBar.m2 T;
    public final ts0 U;

    public x1(ts0 ts0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = ts0Var;
        this.T = m2Var;
    }

    @Override
    public final void h() {
        ts0 ts0Var = this.U;
        p91 p91Var = ts0Var.f51603n;
        if (ts0Var.b() && p91Var != null) {
            if (ts0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                er erVar = new er(R.drawable.poll_add_plus, 0);
                erVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(erVar, 0, 1, 33);
                ts0Var.J = spannableStringBuilder;
            }
            p91Var.a(-1, ts0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        ts0 ts0Var = this.U;
        ts0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ts0Var.o();
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
