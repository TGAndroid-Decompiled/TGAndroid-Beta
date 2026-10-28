package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ProfileActivity;
public final class v1 extends v91 {
    public final org.telegram.ui.ActionBar.r2 V;
    public final ws0 W;

    public v1(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context, null);
        this.W = ws0Var;
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
        ws0 ws0Var = this.W;
        u91 u91Var = ws0Var.f53292n;
        if (ws0Var.b() && u91Var != null) {
            if (ws0Var.J == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
                zq zqVar = new zq(R.drawable.poll_add_plus, 0);
                zqVar.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
                ws0Var.J = spannableStringBuilder;
            }
            u91Var.a(-1, ws0Var.J);
        }
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        return !this.W.g();
    }

    @Override
    public final void w(boolean z10) {
        ws0 ws0Var = this.W;
        ws0Var.l();
        org.telegram.ui.ActionBar.r2 r2Var = this.V;
        if (r2Var instanceof ProfileActivity) {
            ((ProfileActivity) r2Var).S();
            View fragmentView = r2Var.getFragmentView();
            if (fragmentView != null) {
                fragmentView.invalidate();
            }
        }
        ws0Var.p();
    }
}
