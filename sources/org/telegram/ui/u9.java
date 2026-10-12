package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u9 extends org.telegram.ui.ActionBar.e3 {
    public final t9 f40568b;
    public final org.telegram.ui.ActionBar.b5[] f40569c;
    public final y9 d;

    public u9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, boolean z10, y9 y9Var) {
        super(activity, false);
        this.f40569c = b5VarArr;
        this.d = y9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        t9 t9Var = new t9(this, i10);
        this.f40568b = t9Var;
        t9Var.f42562x = true;
        t9Var.W = z10;
        ((ActionBarLayout) b5VarArr[0]).c(-1, t9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        t9Var.M = y9Var;
        if (y9Var.I0() != null) {
            t9Var.f42549b.setText(y9Var.I0());
        }
        this.containerView = b5VarArr[0].getView();
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
        this.f40569c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f40569c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
