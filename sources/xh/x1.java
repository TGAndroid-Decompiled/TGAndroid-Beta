package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.ProfileActivity;
public final class x1 extends h81 {
    public final org.telegram.ui.ActionBar.n2 T;
    public final nr0 U;

    public x1(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = nr0Var;
        this.T = n2Var;
    }

    @Override
    public final void h() {
        nr0 nr0Var = this.U;
        g81 g81Var = nr0Var.f46072n;
        if (nr0Var.b() && g81Var != null) {
            if (nr0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.z0.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                pq pqVar = new pq(R.drawable.poll_add_plus, 0);
                pqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
                nr0Var.J = spannableStringBuilder;
            }
            g81Var.a(-1, nr0Var.J);
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
