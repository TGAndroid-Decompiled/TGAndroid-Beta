package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s9 extends org.telegram.ui.ActionBar.f3 {
    public final r9 f41403b;
    public final org.telegram.ui.ActionBar.d5[] f41404c;
    public final v9 d;

    public s9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.f41404c = d5VarArr;
        this.d = v9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.f41403b = r9Var;
        r9Var.f42515x = true;
        ((ActionBarLayout) d5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.M = v9Var;
        if (v9Var.p0() != null) {
            r9Var.f42505c.setText(v9Var.p0());
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
        this.f41404c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.f41404c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
