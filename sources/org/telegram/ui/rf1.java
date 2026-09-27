package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rf1 extends org.telegram.ui.Components.p81 {
    public final ArrayList f37117a;
    public final sf1 f37118b;

    public rf1(sf1 sf1Var) {
        this.f37118b = sf1Var;
        ArrayList arrayList = new ArrayList();
        this.f37117a = arrayList;
        arrayList.add(new of1(0));
        of1 of1Var = new of1(2);
        of1Var.f36202b = 0;
        arrayList.add(of1Var);
        of1 of1Var2 = new of1(2);
        of1Var2.f36202b = 1;
        arrayList.add(of1Var2);
        of1 of1Var3 = new of1(2);
        of1Var3.f36202b = 2;
        arrayList.add(of1Var3);
        of1 of1Var4 = new of1(2);
        of1Var4.f36202b = 3;
        arrayList.add(of1Var4);
        of1 of1Var5 = new of1(2);
        of1Var5.f36202b = 4;
        arrayList.add(of1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.f37118b;
        sf1Var.L(view, i10, sf1Var.f37427c0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.f37118b;
        wf1 wf1Var = sf1Var.f37444u0;
        if (i10 == 1) {
            return sf1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.o2) wf1Var).currentAccount;
            org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(i11, wf1Var);
            kn0Var.f25798b.j(new qf1(0));
            kn0Var.setUiCallback(sf1Var);
            return kn0Var;
        }
        w10 w10Var = new w10(wf1Var);
        w10Var.setChatPreviewDelegate(sf1Var.f37442s0);
        w10Var.setUiCallback(sf1Var);
        w10Var.f38757b.j(new qf1(1));
        return w10Var;
    }

    @Override
    public final int e() {
        return this.f37117a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f37117a;
        if (((of1) arrayList.get(i10)).f36201a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).f36201a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9902c3[((of1) arrayList.get(i10)).f36202b];
        String str = q0Var.f9886c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9885b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f37117a;
        if (((of1) arrayList.get(i10)).f36201a == 0) {
            return 1;
        }
        if (((of1) arrayList.get(i10)).f36201a == 1) {
            return 2;
        }
        return ((of1) arrayList.get(i10)).f36201a + i10;
    }
}
