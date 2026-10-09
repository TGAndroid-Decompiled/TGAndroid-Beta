package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.ProfileActivity;
public final class x1 extends o91 {
    public final org.telegram.ui.ActionBar.n2 T;
    public final rs0 U;

    public x1(rs0 rs0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = rs0Var;
        this.T = n2Var;
    }

    @Override
    public final void h() {
        rs0 rs0Var = this.U;
        n91 n91Var = rs0Var.f51514n;
        if (rs0Var.b() && n91Var != null) {
            if (rs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                er erVar = new er(R.drawable.poll_add_plus, 0);
                erVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(erVar, 0, 1, 33);
                rs0Var.J = spannableStringBuilder;
            }
            n91Var.a(-1, rs0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        rs0 rs0Var = this.U;
        rs0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        rs0Var.o();
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
