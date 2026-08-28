package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yz extends wf.b {
    public final a00 d;

    public yz(a00 a00Var) {
        this.d = a00Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 8 && i9 != 7) {
            return false;
        }
        return true;
    }

    public final f2.r0 F() {
        return this.d.d.getAdapter();
    }

    @Override
    public final int h() {
        return this.d.Z.size();
    }

    @Override
    public final int j(int i9) {
        return ((e00) this.d.Z.get(i9)).f48814a;
    }

    @Override
    public final void l() {
        F().l();
    }

    @Override
    public final void m(int i9) {
        F().m(i9 + 1);
    }

    @Override
    public final void p(int i9, int i10) {
        F().p(i9 + 1, i10);
    }

    @Override
    public final void q(int i9, int i10) {
        F().q(i9 + 1, i10);
    }

    @Override
    public final void r(int i9, int i10, Object obj) {
        F().r(i9 + 1, i10, obj);
    }

    @Override
    public final void s(int i9, int i10) {
        F().s(i9 + 1, i10);
    }

    @Override
    public final void t(int i9, int i10) {
        F().t(i9 + 1, i10);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        int i10;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        ArrayList arrayList = this.d.Z;
        e00 e00Var = (e00) arrayList.get(i9);
        int i12 = i9 + 1;
        if (i12 < arrayList.size() && (i10 = ((e00) arrayList.get(i12)).f48814a) != 3 && i10 != 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 7) {
            ((g00) view).e(e00Var.f37775m, z10);
        } else if (i11 != 6 && i11 != 3) {
            if (i11 != 0 && i11 == 8) {
                vz vzVar = (vz) view;
                vzVar.f43612a.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                if (vzVar.f43614c != z10) {
                    vzVar.f43614c = z10;
                    vzVar.setWillNotDraw(!z10);
                }
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i11 == 6) {
                b9Var.setFixedSize(0);
                b9Var.setText(e00Var.d);
                return;
            }
            b9Var.setFixedSize(12);
            b9Var.setText("");
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View b9Var;
        int i10;
        a00 a00Var = this.d;
        if (i9 == 8) {
            b9Var = new vz(a00Var.getContext());
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        } else if (i9 == 7) {
            Context context = a00Var.getContext();
            i10 = ((org.telegram.ui.ActionBar.f3) a00Var).currentAccount;
            b9Var = new xz(this, context, i10, a00Var.T.f19649id);
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        } else if (i9 != 6 && i9 != 3) {
            b9Var = new zz(a00Var, a00Var.getContext());
        } else {
            b9Var = new org.telegram.ui.Cells.b9(a00Var.getContext());
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        }
        return new f2.q1(b9Var);
    }
}
