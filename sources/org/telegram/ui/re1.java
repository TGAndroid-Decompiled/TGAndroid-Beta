package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class re1 extends org.telegram.ui.Components.g71 {

    public final ArrayList f41913a;

    public final se1 f41914b;

    public re1(se1 se1Var) {
        this.f41914b = se1Var;
        ArrayList arrayList = new ArrayList();
        this.f41913a = arrayList;
        arrayList.add(new oe1(0));
        oe1 oe1Var = new oe1(2);
        oe1Var.f41073b = 0;
        arrayList.add(oe1Var);
        oe1 oe1Var2 = new oe1(2);
        oe1Var2.f41073b = 1;
        arrayList.add(oe1Var2);
        oe1 oe1Var3 = new oe1(2);
        oe1Var3.f41073b = 2;
        arrayList.add(oe1Var3);
        oe1 oe1Var4 = new oe1(2);
        oe1Var4.f41073b = 3;
        arrayList.add(oe1Var4);
        oe1 oe1Var5 = new oe1(2);
        oe1Var5.f41073b = 4;
        arrayList.add(oe1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        se1 se1Var = this.f41914b;
        se1Var.K(view, i10, se1Var.U, true);
    }

    @Override
    public final View d(int i10) {
        se1 se1Var = this.f41914b;
        we1 we1Var = se1Var.f42621p0;
        if (i10 == 1) {
            return se1Var.P;
        }
        if (i10 == 2) {
            org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, we1Var);
            jm0Var.f29728b.j(new qe1(0));
            jm0Var.setUiCallback(se1Var);
            return jm0Var;
        }
        i10 i10Var = new i10(we1Var);
        i10Var.setChatPreviewDelegate(se1Var.f42619n0);
        i10Var.setUiCallback(se1Var);
        i10Var.f38936b.j(new qe1(1));
        return i10Var;
    }

    @Override
    public final int e() {
        return this.f41913a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f41913a;
        if (((oe1) arrayList.get(i10)).f41072a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((oe1) arrayList.get(i10)).f41072a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        pf.e0 e0Var = pf.g0.Y2[((oe1) arrayList.get(i10)).f41073b];
        String str = e0Var.f45781c;
        return str != null ? str : LocaleController.getString(e0Var.f45780b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f41913a;
        if (((oe1) arrayList.get(i10)).f41072a == 0) {
            return 1;
        }
        if (((oe1) arrayList.get(i10)).f41072a == 1) {
            return 2;
        }
        return ((oe1) arrayList.get(i10)).f41072a + i10;
    }
}
