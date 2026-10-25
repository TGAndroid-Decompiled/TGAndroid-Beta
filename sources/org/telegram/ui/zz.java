package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zz extends qg.b {
    public final b00 d;

    public zz(b00 b00Var) {
        this.d = b00Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 != 8 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final s4.h0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.f37932e0.size();
    }

    @Override
    public final int j(int i10) {
        return ((f00) this.d.f37932e0.get(i10)).f47037a;
    }

    @Override
    public final void l() {
        F().l();
    }

    @Override
    public final void m(int i10) {
        F().m(i10 + 1);
    }

    @Override
    public final void p(int i10, int i11) {
        F().p(i10 + 1, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        F().q(i10 + 1, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        F().r(i10 + 1, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        F().s(i10 + 1, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        F().t(i10 + 1, i11);
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11;
        int i12 = e1Var.f47738f;
        View view = e1Var.f47735a;
        ArrayList arrayList = this.d.f37932e0;
        f00 f00Var = (f00) arrayList.get(i10);
        int i13 = i10 + 1;
        if (i13 < arrayList.size() && (i11 = ((f00) arrayList.get(i13)).f47037a) != 3 && i11 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 7) {
            ((h00) view).e(f00Var.f39232m, z10);
        } else if (i12 != 6 && i12 != 3) {
            if (i12 != 0 && i12 == 8) {
                wz wzVar = (wz) view;
                wzVar.f45588a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (wzVar.f45590c != z10) {
                    wzVar.f45590c = z10;
                    wzVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i12 == 6) {
                i9Var.setFixedSize(0);
                i9Var.setText(f00Var.d);
                return;
            }
            i9Var.setFixedSize(12);
            i9Var.setText("");
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View i9Var;
        int i11;
        b00 b00Var = this.d;
        if (i10 == 8) {
            i9Var = new wz(b00Var.getContext());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, i9Var, null);
        } else if (i10 == 7) {
            Context context = b00Var.getContext();
            i11 = ((org.telegram.ui.ActionBar.k3) b00Var).currentAccount;
            i9Var = new yz(this, context, i11, b00Var.Y.f19549id);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, i9Var, null);
        } else if (i10 != 6 && i10 != 3) {
            i9Var = new a00(b00Var, b00Var.getContext());
        } else {
            i9Var = new org.telegram.ui.Cells.i9(b00Var.getContext());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23297a7, i9Var, null);
        }
        return new s4.e1(i9Var);
    }
}
