package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t9 extends org.telegram.ui.ActionBar.g3 {
    public final s9 f38421b;
    public final org.telegram.ui.ActionBar.e5[] f38422c;
    public final w9 d;

    public t9(Activity activity, org.telegram.ui.ActionBar.e5[] e5VarArr, int i10, w9 w9Var) {
        super(activity, false);
        this.f38422c = e5VarArr;
        this.d = w9Var;
        e5VarArr[0].setFragmentStack(new ArrayList());
        s9 s9Var = new s9(this, i10);
        this.f38421b = s9Var;
        s9Var.f39935w = true;
        ((ActionBarLayout) e5VarArr[0]).c(-1, s9Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        s9Var.I = w9Var;
        if (w9Var.C0() != null) {
            s9Var.f39928b.setText(w9Var.C0());
        }
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new x5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38422c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.e5[] e5VarArr = this.f38422c;
        org.telegram.ui.ActionBar.e5 e5Var = e5VarArr[0];
        if (e5Var != null && e5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) e5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
