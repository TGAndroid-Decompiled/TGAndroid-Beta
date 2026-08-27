package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

public final class yu extends org.telegram.ui.Components.yk0 {

    public final av f44915c;

    public yu(av avVar) {
        this.f44915c = avVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.f44915c.f36639c0.h() ? 1 : 3;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        av avVar = this.f44915c;
        if (i10 == 0) {
            view = avVar.Z;
        } else if (i10 == 2) {
            view = avVar.f36637a0;
            f2.y0 y0Var = new f2.y0(-1, -2);
            ((ViewGroup.MarginLayoutParams) y0Var).leftMargin = ((org.telegram.ui.ActionBar.e3) avVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) y0Var).rightMargin = ((org.telegram.ui.ActionBar.e3) avVar).backgroundPaddingLeft;
            view.setLayoutParams(y0Var);
        } else {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(viewGroup.getContext());
            x8Var.setFixedSize(12);
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            dqVar.f27828w = true;
            x8Var.setBackgroundDrawable(dqVar);
            view = x8Var;
        }
        return new org.telegram.ui.Components.lk0(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
    }
}
