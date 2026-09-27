package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t9 extends org.telegram.ui.ActionBar.g3 {
    public final s9 f37704b;
    public final org.telegram.ui.ActionBar.d5[] f37705c;
    public final w9 d;

    public t9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, w9 w9Var) {
        super(activity, false);
        this.f37705c = d5VarArr;
        this.d = w9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        s9 s9Var = new s9(this, i10);
        this.f37704b = s9Var;
        s9Var.f39580w = true;
        ((ActionBarLayout) d5VarArr[0]).c(-1, s9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        s9Var.L = w9Var;
        if (w9Var.J0() != null) {
            s9Var.f39570b.setText(w9Var.J0());
        }
        this.containerView = d5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new t5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f37705c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.f37705c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
