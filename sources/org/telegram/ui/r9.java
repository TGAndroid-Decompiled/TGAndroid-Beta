package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r9 extends org.telegram.ui.ActionBar.g3 {
    public final q9 f37945b;
    public final org.telegram.ui.ActionBar.e5[] f37946c;
    public final u9 d;

    public r9(Activity activity, org.telegram.ui.ActionBar.e5[] e5VarArr, int i10, u9 u9Var) {
        super(activity, false);
        this.f37946c = e5VarArr;
        this.d = u9Var;
        e5VarArr[0].setFragmentStack(new ArrayList());
        q9 q9Var = new q9(this, i10);
        this.f37945b = q9Var;
        q9Var.f39116w = true;
        ((ActionBarLayout) e5VarArr[0]).c(-1, q9Var);
        ((ActionBarLayout) e5VarArr[0]).c0();
        ViewGroup view = e5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        q9Var.I = u9Var;
        if (u9Var.G0() != null) {
            q9Var.f39109b.setText(u9Var.G0());
        }
        this.containerView = e5VarArr[0].getView();
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
        this.f37946c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.e5[] e5VarArr = this.f37946c;
        org.telegram.ui.ActionBar.e5 e5Var = e5VarArr[0];
        if (e5Var != null && e5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) e5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
