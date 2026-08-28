package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class vu extends org.telegram.ui.Components.vk0 {
    public final xu f43585c;

    public vu(xu xuVar) {
        this.f43585c = xuVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f43585c.f44606c0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10;
        int i11;
        xu xuVar = this.f43585c;
        if (i9 == 0) {
            view = xuVar.Z;
        } else if (i9 == 2) {
            view = xuVar.f44604a0;
            f2.a1 a1Var = new f2.a1(-1, -2);
            i10 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) a1Var).leftMargin = i10;
            i11 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) a1Var).rightMargin = i11;
            view.setLayoutParams(a1Var);
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(viewGroup.getContext());
            b9Var.setFixedSize(12);
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false)), org.telegram.ui.ActionBar.f6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
            fqVar.f28550w = true;
            b9Var.setBackgroundDrawable(fqVar);
            view = b9Var;
        }
        return new f2.q1(view);
    }

    @Override
    public final int j(int i9) {
        return i9;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
    }
}
