package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s9 extends org.telegram.ui.ActionBar.f3 {
    public final r9 f40396b;
    public final org.telegram.ui.ActionBar.c5[] f40397c;
    public final v9 d;

    public s9(Activity activity, org.telegram.ui.ActionBar.c5[] c5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.f40397c = c5VarArr;
        this.d = v9Var;
        c5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.f40396b = r9Var;
        r9Var.f41974w = true;
        ((ActionBarLayout) c5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) c5VarArr[0]).c0();
        ViewGroup view = c5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.L = v9Var;
        if (v9Var.J0() != null) {
            r9Var.f41963b.setText(v9Var.J0());
        }
        this.containerView = c5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new s5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f40397c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.c5[] c5VarArr = this.f40397c;
        org.telegram.ui.ActionBar.c5 c5Var = c5VarArr[0];
        if (c5Var != null && c5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) c5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
