package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.or0;
import org.telegram.ui.ProfileActivity;
public final class w1 extends j81 {
    public final org.telegram.ui.ActionBar.o2 U;
    public final or0 V;

    public w1(or0 or0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.V = or0Var;
        this.U = o2Var;
    }

    @Override
    public final void A(int i10) {
        this.V.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.U;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
        }
    }

    @Override
    public final void h() {
        or0 or0Var = this.V;
        i81 i81Var = or0Var.f46137n;
        if (or0Var.b() && i81Var != null) {
            if (or0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                oq oqVar = new oq(R.drawable.poll_add_plus, 0);
                oqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                or0Var.J = spannableStringBuilder;
            }
            i81Var.a(-1, or0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.V.g();
    }

    @Override
    public final void w(boolean z10) {
        or0 or0Var = this.V;
        or0Var.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.U;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
            View fragmentView = o2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        or0Var.o();
    }
}
