package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r9 extends org.telegram.ui.ActionBar.f3 {
    public final q9 f36990b;
    public final org.telegram.ui.ActionBar.d5[] f36991c;
    public final u9 d;

    public r9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, u9 u9Var) {
        super(activity, false);
        this.f36991c = d5VarArr;
        this.d = u9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        q9 q9Var = new q9(this, i10);
        this.f36990b = q9Var;
        q9Var.f38379w = true;
        ((ActionBarLayout) d5VarArr[0]).c(-1, q9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        q9Var.L = u9Var;
        if (u9Var.J0() != null) {
            q9Var.f38369b.setText(u9Var.J0());
        }
        this.containerView = d5VarArr[0].getView();
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
        this.f36991c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.f36991c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
