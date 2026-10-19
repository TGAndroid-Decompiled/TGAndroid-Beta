package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uo extends org.telegram.ui.Components.hm0 {
    public final vo f42017c;

    public uo(vo voVar) {
        this.f42017c = voVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42017c.Y2.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f42017c.Y2.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        vo voVar = this.f42017c;
        wo woVar = voVar.Y2;
        int i11 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    d9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(voVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20951b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) woVar.N.get(i10 - 1);
            pa paVar = (pa) view;
            if (paVar.H) {
                woVar.O = null;
            }
            if (i10 >= woVar.N.size()) {
                z10 = false;
            }
            paVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                woVar.O = paVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, voVar.f27301n2));
        l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        vo voVar = this.f42017c;
        org.telegram.ui.ActionBar.d6 d6Var = voVar.f27301n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.b1(new org.telegram.ui.Cells.d9(voVar.getContext(), 12, d6Var));
            }
            return new s4.b1(new ia(this, voVar.getContext(), d6Var));
        }
        return new s4.b1(new org.telegram.ui.Cells.l4(voVar.getContext(), d6Var));
    }
}
