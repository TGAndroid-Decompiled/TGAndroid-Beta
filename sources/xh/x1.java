package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.ProfileActivity;
public final class x1 extends p91 {
    public final org.telegram.ui.ActionBar.n2 T;
    public final ss0 U;

    public x1(ss0 ss0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = ss0Var;
        this.T = n2Var;
    }

    @Override
    public final void h() {
        ss0 ss0Var = this.U;
        o91 o91Var = ss0Var.f51560n;
        if (ss0Var.b() && o91Var != null) {
            if (ss0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                er erVar = new er(R.drawable.poll_add_plus, 0);
                erVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(erVar, 0, 1, 33);
                ss0Var.J = spannableStringBuilder;
            }
            o91Var.a(-1, ss0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        ss0 ss0Var = this.U;
        ss0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ss0Var.o();
    }

    @Override
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }
}
