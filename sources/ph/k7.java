package ph;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ql0;
public final class k7 extends ql0 {
    public final l7 f41922c;

    public k7(l7 l7Var) {
        this.f41922c = l7Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f41922c.f41972c.size() + 2;
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
        throw new UnsupportedOperationException("Method not decompiled: ph.k7.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int dp;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        l7 l7Var = this.f41922c;
        if (i10 != 0 && i10 != 1) {
            Context context = l7Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) l7Var).resourcesProvider;
            view = new d8(context, f6Var);
        } else {
            View view2 = new View(l7Var.getContext());
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
