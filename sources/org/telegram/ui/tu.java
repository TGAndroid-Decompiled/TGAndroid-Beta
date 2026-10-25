package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class tu extends org.telegram.ui.Components.lm0 {
    public final vu f43911c;

    public tu(vu vuVar) {
        this.f43911c = vuVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f43911c.f44906g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        vu vuVar = this.f43911c;
        if (i10 == 0) {
            view = vuVar.f44903d0;
        } else if (i10 == 2) {
            view = vuVar.f44904e0;
            s4.q0 q0Var = new s4.q0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.k3) vuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.k3) vuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i12;
            view.setLayoutParams(q0Var);
        } else {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(viewGroup.getContext());
            i9Var.setFixedSize(12);
            int i13 = org.telegram.ui.ActionBar.y6.f23297a7;
            ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            org.telegram.ui.ActionBar.f7.y(i9Var, colorDrawable, i13, null, PorterDuff.Mode.SRC_IN);
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, org.telegram.ui.ActionBar.y6.X0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23316b7));
            arVar.f26597w = true;
            i9Var.setBackgroundDrawable(arVar);
            view = i9Var;
        }
        return new s4.e1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
    }
}
