package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class to extends org.telegram.ui.Components.vk0 {
    public final uo f43045c;

    public to(uo uoVar) {
        this.f43045c = uoVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43045c.W2.J.size() + 2;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 <= this.f43045c.W2.J.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        uo uoVar = this.f43045c;
        vo voVar = uoVar.W2;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    b9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(uoVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) voVar.J.get(i9 - 1);
            ja jaVar = (ja) view;
            if (jaVar.D) {
                voVar.K = null;
            }
            if (i9 < voVar.J.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            jaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                voVar.K = jaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, uoVar.f34260l2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        uo uoVar = this.f43045c;
        org.telegram.ui.ActionBar.b6 b6Var = uoVar.f34260l2;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return null;
                }
                return new f2.q1(new org.telegram.ui.Cells.b9(uoVar.getContext(), 12, b6Var));
            }
            return new f2.q1(new ca(this, uoVar.getContext(), b6Var));
        }
        return new f2.q1(new org.telegram.ui.Cells.m4(uoVar.getContext(), b6Var));
    }
}
