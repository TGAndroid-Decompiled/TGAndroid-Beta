package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class vu extends org.telegram.ui.Components.hm0 {
    public final xu f42275c;

    public vu(xu xuVar) {
        this.f42275c = xuVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f42275c.f43241g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        xu xuVar = this.f42275c;
        if (i10 == 0) {
            view = xuVar.f43238d0;
        } else if (i10 == 2) {
            view = xuVar.f43239e0;
            s4.o0 o0Var = new s4.o0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i12;
            view.setLayoutParams(o0Var);
        } else {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(viewGroup.getContext());
            d9Var.setFixedSize(12);
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false)), org.telegram.ui.ActionBar.h6.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20948b7));
            zqVar.f32999w = true;
            d9Var.setBackgroundDrawable(zqVar);
            view = d9Var;
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
