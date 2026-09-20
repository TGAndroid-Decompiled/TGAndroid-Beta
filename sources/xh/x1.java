package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.ProfileActivity;
public final class x1 extends x81 {
    public final org.telegram.ui.ActionBar.n2 U;
    public final yr0 V;

    public x1(yr0 yr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.V = yr0Var;
        this.U = n2Var;
    }

    @Override
    public final void A(int i10) {
        this.V.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }

    @Override
    public final void h() {
        yr0 yr0Var = this.V;
        w81 w81Var = yr0Var.f46420n;
        if (yr0Var.b() && w81Var != null) {
            if (yr0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                oq oqVar = new oq(R.drawable.poll_add_plus, 0);
                oqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                yr0Var.J = spannableStringBuilder;
            }
            w81Var.a(-1, yr0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.V.g();
    }

    @Override
    public final void w(boolean z10) {
        yr0 yr0Var = this.V;
        yr0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        yr0Var.o();
    }
}
