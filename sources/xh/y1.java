package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ProfileActivity;
public final class y1 extends y81 {
    public final org.telegram.ui.ActionBar.o2 U;
    public final bs0 V;

    public y1(bs0 bs0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.V = bs0Var;
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
        bs0 bs0Var = this.V;
        x81 x81Var = bs0Var.f46473n;
        if (bs0Var.b() && x81Var != null) {
            if (bs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                qq qqVar = new qq(R.drawable.poll_add_plus, 0);
                qqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(qqVar, 0, 1, 33);
                bs0Var.J = spannableStringBuilder;
            }
            x81Var.a(-1, bs0Var.J);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.U;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
            View fragmentView = o2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        bs0Var.o();
    }
}
