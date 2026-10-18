package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t9 extends org.telegram.ui.ActionBar.f3 {
    public final s9 f41615b;
    public final org.telegram.ui.ActionBar.d5[] f41616c;
    public final x9 d;

    public t9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, boolean z10, x9 x9Var) {
        super(activity, false);
        this.f41616c = d5VarArr;
        this.d = x9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        s9 s9Var = new s9(this, i10);
        this.f41615b = s9Var;
        s9Var.f43352y = true;
        s9Var.X = z10;
        ((ActionBarLayout) d5VarArr[0]).c(-1, s9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        s9Var.N = x9Var;
        if (x9Var.p0() != null) {
            s9Var.f43339c.setText(x9Var.p0());
        }
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new w5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41616c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.f41616c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
