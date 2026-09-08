package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.ProfileActivity;
public final class v1 extends i81 {
    public final org.telegram.ui.ActionBar.n2 T;
    public final nr0 U;

    public v1(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = nr0Var;
        this.T = n2Var;
    }

    @Override
    public final void h() {
        nr0 nr0Var = this.U;
        h81 h81Var = nr0Var.f50549n;
        if (nr0Var.b() && h81Var != null) {
            if (nr0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                nq nqVar = new nq(R.drawable.poll_add_plus, 0);
                nqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
                nr0Var.J = spannableStringBuilder;
            }
            h81Var.a(-1, nr0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        nr0 nr0Var = this.U;
        nr0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        nr0Var.o();
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
