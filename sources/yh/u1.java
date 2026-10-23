package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
public final class u1 extends l91 {
    public final org.telegram.ui.ActionBar.o2 T;
    public final ns0 U;

    public u1(ns0 ns0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.U = ns0Var;
        this.T = o2Var;
    }

    @Override
    public final void h() {
        ns0 ns0Var = this.U;
        k91 k91Var = ns0Var.f50928n;
        if (ns0Var.b() && k91Var != null) {
            if (ns0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                xq xqVar = new xq(R.drawable.poll_add_plus, 0);
                xqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
                ns0Var.J = spannableStringBuilder;
            }
            k91Var.a(-1, ns0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.U.g();
    }

    @Override
    public final void w(boolean z10) {
        ns0 ns0Var = this.U;
        ns0Var.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.T;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
            View fragmentView = o2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ns0Var.o();
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
