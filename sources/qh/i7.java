package qh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rl0;
public final class i7 extends rl0 {
    public final j7 f45491c;

    public i7(j7 j7Var) {
        this.f45491c = j7Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f45491c.f45540c.size() + 2;
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
    public final void v(f2.m1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: qh.i7.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        j7 j7Var = this.f45491c;
        if (i10 != 0 && i10 != 1) {
            Context context = j7Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) j7Var).resourcesProvider;
            view = new b8(context, g6Var);
        } else {
            View view2 = new View(j7Var.getContext());
            if (i10 == 0) {
                dp = (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f);
            } else {
                dp = AndroidUtilities.dp(54.0f);
            }
            view2.setLayoutParams(new f2.x0(-1, dp));
            view = view2;
        }
        return new f2.m1(view);
    }
}
