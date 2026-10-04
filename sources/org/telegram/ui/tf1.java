package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tf1 extends org.telegram.ui.Components.x81 {
    public final ArrayList f40812a;
    public final uf1 f40813b;

    public tf1(uf1 uf1Var) {
        this.f40813b = uf1Var;
        ArrayList arrayList = new ArrayList();
        this.f40812a = arrayList;
        arrayList.add(new qf1(0));
        qf1 qf1Var = new qf1(2);
        qf1Var.f39716b = 0;
        arrayList.add(qf1Var);
        qf1 qf1Var2 = new qf1(2);
        qf1Var2.f39716b = 1;
        arrayList.add(qf1Var2);
        qf1 qf1Var3 = new qf1(2);
        qf1Var3.f39716b = 2;
        arrayList.add(qf1Var3);
        qf1 qf1Var4 = new qf1(2);
        qf1Var4.f39716b = 3;
        arrayList.add(qf1Var4);
        qf1 qf1Var5 = new qf1(2);
        qf1Var5.f39716b = 4;
        arrayList.add(qf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        uf1 uf1Var = this.f40813b;
        uf1Var.M(view, i10, uf1Var.f41172c0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        uf1 uf1Var = this.f40813b;
        yf1 yf1Var = uf1Var.f41189u0;
        if (i10 == 1) {
            return uf1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(i11, yf1Var);
            on0Var.f29408b.j(new sf1(0));
            on0Var.setUiCallback(uf1Var);
            return on0Var;
        }
        x10 x10Var = new x10(yf1Var);
        x10Var.setChatPreviewDelegate(uf1Var.f41187s0);
        x10Var.setUiCallback(uf1Var);
        x10Var.f42683b.j(new sf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f40812a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f40812a;
        if (((qf1) arrayList.get(i10)).f39715a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((qf1) arrayList.get(i10)).f39715a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((qf1) arrayList.get(i10)).f39716b];
        String str = q0Var.f10756c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f10755b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f40812a;
        if (((qf1) arrayList.get(i10)).f39715a == 0) {
            return 1;
        }
        if (((qf1) arrayList.get(i10)).f39715a == 1) {
            return 2;
        }
        return ((qf1) arrayList.get(i10)).f39715a + i10;
    }
}
