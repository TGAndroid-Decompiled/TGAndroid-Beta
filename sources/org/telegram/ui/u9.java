package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u9 extends org.telegram.ui.ActionBar.k3 {
    public final t9 f44072b;
    public final org.telegram.ui.ActionBar.j5[] f44073c;
    public final x9 d;

    public u9(Activity activity, org.telegram.ui.ActionBar.j5[] j5VarArr, int i10, x9 x9Var) {
        super(activity, false);
        this.f44073c = j5VarArr;
        this.d = x9Var;
        j5VarArr[0].setFragmentStack(new ArrayList());
        t9 t9Var = new t9(this, i10);
        this.f44072b = t9Var;
        t9Var.f46007x = true;
        ((ActionBarLayout) j5VarArr[0]).c(-1, t9Var);
        ((ActionBarLayout) j5VarArr[0]).e0();
        ViewGroup view = j5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        t9Var.M = x9Var;
        if (x9Var.H0() != null) {
            t9Var.f45997c.setText(x9Var.H0());
        }
        this.containerView = j5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new u5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44073c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f44073c;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
        if (j5Var != null && j5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) j5VarArr[0]).H();
        } else {
            super.onBackPressed();
        }
    }
}
