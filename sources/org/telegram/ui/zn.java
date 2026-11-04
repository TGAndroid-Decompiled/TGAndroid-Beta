package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class zn extends org.telegram.ui.Components.sj0 {
    public final ao f52716c;

    public zn(ao aoVar) {
        this.f52716c = aoVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f52716c.i3.O.size() + 2;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 <= this.f52716c.i3.O.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        ao aoVar = this.f52716c;
        bo boVar = aoVar.i3;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.M0(2131743653, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) boVar.O.get(i3 - 1);
            ha haVar = (ha) view;
            if (haVar.I) {
                boVar.P = null;
            }
            if (i3 >= boVar.O.size()) {
                z10 = false;
            }
            haVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                boVar.P = haVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, aoVar.f38460o2);
        n4Var.setText(org.telegram.messenger.bd.M0(2131743654, null));
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ao aoVar = this.f52716c;
        org.telegram.ui.ActionBar.e6 e6Var = aoVar.f38460o2;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return null;
                }
                return new u4.d1(new org.telegram.ui.Cells.y8(12, aoVar.getContext(), e6Var));
            }
            return new u4.d1(new ca(this, aoVar.getContext(), e6Var));
        }
        return new u4.d1(new org.telegram.ui.Cells.n4(aoVar.getContext(), e6Var));
    }
}
