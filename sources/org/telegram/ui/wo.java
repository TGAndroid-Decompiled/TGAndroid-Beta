package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wo extends org.telegram.ui.Components.lm0 {
    public final xo f43407c;

    public wo(xo xoVar) {
        this.f43407c = xoVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43407c.f43628b3.O.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f43407c.f43628b3.O.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        xo xoVar = this.f43407c;
        yo yoVar = xoVar.f43628b3;
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, xoVar.getContext(), e9Var, null);
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) yoVar.O.get(i10 - 1);
            pa paVar = (pa) view;
            if (paVar.H) {
                yoVar.P = null;
            }
            if (i10 >= yoVar.O.size()) {
                z10 = false;
            }
            paVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                yoVar.P = paVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, l4Var, xoVar.f28705n2);
        l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xo xoVar = this.f43407c;
        org.telegram.ui.ActionBar.g6 g6Var = xoVar.f28705n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.b1(new org.telegram.ui.Cells.e9(xoVar.getContext(), 12, g6Var));
            }
            return new s4.b1(new ia(this, xoVar.getContext(), g6Var));
        }
        return new s4.b1(new org.telegram.ui.Cells.l4(xoVar.getContext(), g6Var));
    }
}
