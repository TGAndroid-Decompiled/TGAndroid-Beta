package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class vo extends org.telegram.ui.Components.yk0 {

    public final wo f43494c;

    public vo(wo woVar) {
        this.f43494c = woVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 1;
    }

    @Override
    public final int h() {
        return this.f43494c.W2.J.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 <= this.f43494c.W2.J.size() ? 1 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        wo woVar = this.f43494c;
        xo xoVar = woVar.W2;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, woVar.f35277l2));
            j4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
            x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(woVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) xoVar.J.get(i10 - 1);
        ka kaVar = (ka) view;
        if (kaVar.D) {
            xoVar.K = null;
        }
        kaVar.a(tL_username, i10 < xoVar.J.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        xoVar.K = kaVar;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        wo woVar = this.f43494c;
        org.telegram.ui.ActionBar.c6 c6Var = woVar.f35277l2;
        if (i10 == 0) {
            return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.j4(woVar.getContext(), c6Var));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.lk0(new da(this, woVar.getContext(), c6Var));
        }
        if (i10 != 2) {
            return null;
        }
        return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.x8(woVar.getContext(), 12, c6Var));
    }
}
