package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.ProfileActivity;
public final class x1 extends x81 {
    public final org.telegram.ui.ActionBar.n2 U;
    public final zr0 V;

    public x1(zr0 zr0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.V = zr0Var;
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
        zr0 zr0Var = this.V;
        w81 w81Var = zr0Var.f46373n;
        if (zr0Var.b() && w81Var != null) {
            if (zr0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                oq oqVar = new oq(R.drawable.poll_add_plus, 0);
                oqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                zr0Var.J = spannableStringBuilder;
            }
            w81Var.a(-1, zr0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.V.g();
    }

    @Override
    public final void w(boolean z10) {
        zr0 zr0Var = this.V;
        zr0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        zr0Var.o();
    }
}
