package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ProfileActivity;
public final class v1 extends u91 {
    public final org.telegram.ui.ActionBar.r2 V;
    public final vs0 W;

    public v1(vs0 vs0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.W = vs0Var;
        this.V = r2Var;
    }

    @Override
    public final void A(int i10) {
        this.W.l();
        org.telegram.ui.ActionBar.r2 r2Var = this.V;
        if (r2Var instanceof ProfileActivity) {
            ((ProfileActivity) r2Var).S();
        }
    }

    @Override
    public final void h() {
        vs0 vs0Var = this.W;
        t91 t91Var = vs0Var.f53231n;
        if (vs0Var.b() && t91Var != null) {
            if (vs0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                zq zqVar = new zq(R.drawable.poll_add_plus, 0);
                zqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
                vs0Var.J = spannableStringBuilder;
            }
            t91Var.a(-1, vs0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.W.g();
    }

    @Override
    public final void w(boolean z10) {
        vs0 vs0Var = this.W;
        vs0Var.l();
        org.telegram.ui.ActionBar.r2 r2Var = this.V;
        if (r2Var instanceof ProfileActivity) {
            ((ProfileActivity) r2Var).S();
            View fragmentView = r2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        vs0Var.p();
    }
}
