package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.ProfileActivity;
public final class u1 extends l91 {
    public final org.telegram.ui.ActionBar.o2 T;
    public final ms0 U;

    public u1(ms0 ms0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.U = ms0Var;
        this.T = o2Var;
    }

    @Override
    public final void h() {
        ms0 ms0Var = this.U;
        k91 k91Var = ms0Var.f50927n;
        if (ms0Var.b() && k91Var != null) {
            if (ms0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                vq vqVar = new vq(R.drawable.poll_add_plus, 0);
                vqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
                ms0Var.J = spannableStringBuilder;
            }
            k91Var.a(-1, ms0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        ms0 ms0Var = this.U;
        ms0Var.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.T;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
            View fragmentView = o2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ms0Var.o();
    }

    @Override
    public final void z(int i10) {
        this.U.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.T;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
        }
    }
}
