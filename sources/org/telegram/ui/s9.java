package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class s9 extends org.telegram.ui.ActionBar.g3 {
    public final r9 f37418b;
    public final org.telegram.ui.ActionBar.e5[] f37419c;
    public final v9 d;

    public s9(Activity activity, org.telegram.ui.ActionBar.e5[] e5VarArr, int i10, v9 v9Var) {
        super(activity, false);
        this.f37419c = e5VarArr;
        this.d = v9Var;
        e5VarArr[0].setFragmentStack(new ArrayList());
        r9 r9Var = new r9(this, i10);
        this.f37418b = r9Var;
        r9Var.f38612w = true;
        ((ActionBarLayout) e5VarArr[0]).c(-1, r9Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        r9Var.L = v9Var;
        if (v9Var.J0() != null) {
            r9Var.f38602b.setText(v9Var.J0());
        }
        this.containerView = e5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new r5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f37419c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.e5[] e5VarArr = this.f37419c;
        org.telegram.ui.ActionBar.e5 e5Var = e5VarArr[0];
        if (e5Var != null && e5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) e5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
