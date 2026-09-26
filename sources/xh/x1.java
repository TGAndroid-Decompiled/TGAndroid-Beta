package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.ProfileActivity;
public final class x1 extends x81 {
    public final org.telegram.ui.ActionBar.m2 T;
    public final as0 U;

    public x1(as0 as0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null);
        this.U = as0Var;
        this.T = m2Var;
    }

    @Override
    public final void h() {
        as0 as0Var = this.U;
        w81 w81Var = as0Var.f46399n;
        if (as0Var.b() && w81Var != null) {
            if (as0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.f0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                qq qqVar = new qq(R.drawable.poll_add_plus, 0);
                qqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(qqVar, 0, 1, 33);
                as0Var.J = spannableStringBuilder;
            }
            w81Var.a(-1, as0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        as0 as0Var = this.U;
        as0Var.l();
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (m2Var instanceof ProfileActivity) {
            ((ProfileActivity) m2Var).R();
            View fragmentView = m2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        as0Var.o();
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
