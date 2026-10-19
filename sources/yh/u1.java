package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.ProfileActivity;
public final class u1 extends d91 {
    public final org.telegram.ui.ActionBar.n2 T;
    public final js0 U;

    public u1(js0 js0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.U = js0Var;
        this.T = n2Var;
    }

    @Override
    public final void h() {
        js0 js0Var = this.U;
        c91 c91Var = js0Var.f50460n;
        if (js0Var.b() && c91Var != null) {
            if (js0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                yq yqVar = new yq(R.drawable.poll_add_plus, 0);
                yqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
                js0Var.J = spannableStringBuilder;
            }
            c91Var.a(-1, js0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        js0 js0Var = this.U;
        js0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.T;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        js0Var.o();
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
