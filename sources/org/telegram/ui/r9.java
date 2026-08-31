package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r9 extends org.telegram.ui.ActionBar.h3 {
    public final q9 f40856b;
    public final org.telegram.ui.ActionBar.f5[] f40857c;
    public final u9 d;

    public r9(Activity activity, org.telegram.ui.ActionBar.f5[] f5VarArr, int i10, u9 u9Var) {
        super(activity, false);
        this.f40857c = f5VarArr;
        this.d = u9Var;
        f5VarArr[0].setFragmentStack(new ArrayList());
        q9 q9Var = new q9(this, i10);
        this.f40856b = q9Var;
        q9Var.f42177w = true;
        ((ActionBarLayout) f5VarArr[0]).c(-1, q9Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        q9Var.I = u9Var;
        if (u9Var.E0() != null) {
            q9Var.f42169b.setText(u9Var.E0());
        }
        this.containerView = f5VarArr[0].getView();
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
        this.f40857c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.f5[] f5VarArr = this.f40857c;
        org.telegram.ui.ActionBar.f5 f5Var = f5VarArr[0];
        if (f5Var != null && f5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) f5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
