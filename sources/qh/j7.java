package qh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
public final class j7 extends sl0 {
    public final k7 f45497c;

    public j7(k7 k7Var) {
        this.f45497c = k7Var;
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
        return this.f45497c.f45593c.size() + 2;
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
        throw new UnsupportedOperationException("Method not decompiled: qh.j7.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        k7 k7Var = this.f45497c;
        if (i10 != 0 && i10 != 1) {
            Context context = k7Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) k7Var).resourcesProvider;
            view = new c8(context, g6Var);
        } else {
            View view2 = new View(k7Var.getContext());
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
