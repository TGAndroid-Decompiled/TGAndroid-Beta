package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.ProfileActivity;
public final class u1 extends e91 {
    public final org.telegram.ui.ActionBar.n2 T;
    public final ks0 U;

    public u1(ks0 ks0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = ks0Var;
        this.T = n2Var;
    }

    @Override
    public final void h() {
        ks0 ks0Var = this.U;
        d91 d91Var = ks0Var.f50467n;
        if (ks0Var.b() && d91Var != null) {
            if (ks0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                yq yqVar = new yq(R.drawable.poll_add_plus, 0);
                yqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
                ks0Var.J = spannableStringBuilder;
            }
            d91Var.a(-1, ks0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        ks0 ks0Var = this.U;
        ks0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ks0Var.o();
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
