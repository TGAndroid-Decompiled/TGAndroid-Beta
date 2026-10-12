package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class t9 extends org.telegram.ui.ActionBar.e3 {
    public final s9 f42126b;
    public final org.telegram.ui.ActionBar.b5[] f42127c;
    public final x9 d;

    public t9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, boolean z10, x9 x9Var) {
        super(activity, false);
        this.f42127c = b5VarArr;
        this.d = x9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        s9 s9Var = new s9(this, i10);
        this.f42126b = s9Var;
        s9Var.f44347x = true;
        s9Var.W = z10;
        ((ActionBarLayout) b5VarArr[0]).c(-1, s9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        s9Var.M = x9Var;
        if (x9Var.A0() != null) {
            s9Var.f44333b.setText(x9Var.A0());
        }
        this.containerView = b5VarArr[0].getView();
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
        this.f42127c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f42127c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
