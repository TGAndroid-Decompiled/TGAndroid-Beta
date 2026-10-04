package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.rq;
import org.telegram.ui.ProfileActivity;
public final class x1 extends g91 {
    public final org.telegram.ui.ActionBar.n2 V;
    public final fs0 W;

    public x1(fs0 fs0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.W = fs0Var;
        this.V = n2Var;
    }

    @Override
    public final void A(int i10) {
        this.W.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.V;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).P();
        }
    }

    @Override
    public final void h() {
        fs0 fs0Var = this.W;
        f91 f91Var = fs0Var.f50230n;
        if (fs0Var.b() && f91Var != null) {
            if (fs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                rq rqVar = new rq(R.drawable.poll_add_plus, 0);
                rqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
                fs0Var.J = spannableStringBuilder;
            }
            f91Var.a(-1, fs0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.W.g();
    }

    @Override
    public final void w(boolean z10) {
        fs0 fs0Var = this.W;
        fs0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.V;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).P();
            View fragmentView = n2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        fs0Var.o();
    }
}
