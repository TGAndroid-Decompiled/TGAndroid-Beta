package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wo extends org.telegram.ui.Components.il0 {
    public final xo f44340c;

    public wo(xo xoVar) {
        this.f44340c = xoVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44340c.W2.J.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f44340c.W2.J.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        xo xoVar = this.f44340c;
        yo yoVar = xoVar.W2;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    y8Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(xoVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) yoVar.J.get(i10 - 1);
            ia iaVar = (ia) view;
            if (iaVar.D) {
                yoVar.K = null;
            }
            if (i10 < yoVar.J.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            iaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                yoVar.K = iaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, xoVar.f29709l2));
        k4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        xo xoVar = this.f44340c;
        org.telegram.ui.ActionBar.c6 c6Var = xoVar.f29709l2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new f2.n1(new org.telegram.ui.Cells.y8(xoVar.getContext(), 12, c6Var));
            }
            return new f2.n1(new ba(this, xoVar.getContext(), c6Var));
        }
        return new f2.n1(new org.telegram.ui.Cells.k4(xoVar.getContext(), c6Var));
    }
}
