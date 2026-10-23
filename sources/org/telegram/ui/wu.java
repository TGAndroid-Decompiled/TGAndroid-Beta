package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class wu extends org.telegram.ui.Components.lm0 {
    public final yu f43440c;

    public wu(yu yuVar) {
        this.f43440c = yuVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f43440c.f43974g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        yu yuVar = this.f43440c;
        if (i10 == 0) {
            view = yuVar.f43971d0;
        } else if (i10 == 2) {
            view = yuVar.f43972e0;
            s4.o0 o0Var = new s4.o0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.h3) yuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.h3) yuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i12;
            view.setLayoutParams(o0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            int i13 = org.telegram.ui.ActionBar.k6.f21125a7;
            ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            org.telegram.ui.ActionBar.r6.z(e9Var, colorDrawable, i13, null, PorterDuff.Mode.SRC_IN);
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(colorDrawable, org.telegram.ui.ActionBar.k6.X0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7));
            yqVar.f33019w = true;
            e9Var.setBackgroundDrawable(yqVar);
            view = e9Var;
        }
        return new s4.b1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
    }
}
