package ph;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rl0;
public final class l7 extends rl0 {
    public final m7 f41912c;

    public l7(m7 m7Var) {
        this.f41912c = m7Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f41912c.f41965c.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ph.l7.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        m7 m7Var = this.f41912c;
        if (i10 != 0 && i10 != 1) {
            Context context = m7Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) m7Var).resourcesProvider;
            view = new e8(context, f6Var);
        } else {
            View view2 = new View(m7Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new f2.w0(-1, dp));
            view = view2;
        }
        return new f2.l1(view);
    }
}
