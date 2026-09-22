package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.z81;
import org.telegram.ui.ProfileActivity;
public final class x1 extends z81 {
    public final org.telegram.ui.ActionBar.n2 U;
    public final bs0 V;

    public x1(bs0 bs0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.V = bs0Var;
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
        bs0 bs0Var = this.V;
        y81 y81Var = bs0Var.f46441n;
        if (bs0Var.b() && y81Var != null) {
            if (bs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                oq oqVar = new oq(R.drawable.poll_add_plus, 0);
                oqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                bs0Var.J = spannableStringBuilder;
            }
            y81Var.a(-1, bs0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.V.g();
    }

    @Override
    public final void w(boolean z10) {
        bs0 bs0Var = this.V;
        bs0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        bs0Var.o();
    }
}
