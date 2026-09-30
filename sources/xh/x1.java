package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ProfileActivity;
public final class x1 extends y81 {
    public final org.telegram.ui.ActionBar.m2 T;
    public final cs0 U;

    public x1(cs0 cs0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = cs0Var;
        this.T = m2Var;
    }

    @Override
    public final void h() {
        cs0 cs0Var = this.U;
        x81 x81Var = cs0Var.f46508n;
        if (cs0Var.b() && x81Var != null) {
            if (cs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.f0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                rq rqVar = new rq(R.drawable.poll_add_plus, 0);
                rqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
                cs0Var.J = spannableStringBuilder;
            }
            x81Var.a(-1, cs0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        cs0 cs0Var = this.U;
        cs0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        cs0Var.o();
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
