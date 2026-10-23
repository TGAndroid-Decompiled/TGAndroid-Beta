package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s9 extends org.telegram.ui.ActionBar.h3 {
    public final r9 f41324b;
    public final org.telegram.ui.ActionBar.h5[] f41325c;
    public final v9 d;

    public s9(Activity activity, org.telegram.ui.ActionBar.h5[] h5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.f41325c = h5VarArr;
        this.d = v9Var;
        h5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.f41324b = r9Var;
        r9Var.f42976x = true;
        ((ActionBarLayout) h5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) h5VarArr[0]).d0();
        ViewGroup view = h5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.M = v9Var;
        if (v9Var.p0() != null) {
            r9Var.f42966c.setText(v9Var.p0());
        }
        this.containerView = h5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new v5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41325c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f41325c;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
        if (h5Var != null && h5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) h5VarArr[0]).H();
        } else {
            super.onBackPressed();
        }
    }
}
