package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rf1 extends org.telegram.ui.Components.p81 {
    public final ArrayList f37428a;
    public final sf1 f37429b;

    public rf1(sf1 sf1Var) {
        this.f37429b = sf1Var;
        ArrayList arrayList = new ArrayList();
        this.f37428a = arrayList;
        arrayList.add(new of1(0));
        of1 of1Var = new of1(2);
        of1Var.f36368b = 0;
        arrayList.add(of1Var);
        of1 of1Var2 = new of1(2);
        of1Var2.f36368b = 1;
        arrayList.add(of1Var2);
        of1 of1Var3 = new of1(2);
        of1Var3.f36368b = 2;
        arrayList.add(of1Var3);
        of1 of1Var4 = new of1(2);
        of1Var4.f36368b = 3;
        arrayList.add(of1Var4);
        of1 of1Var5 = new of1(2);
        of1Var5.f36368b = 4;
        arrayList.add(of1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.f37429b;
        sf1Var.K(view, i10, sf1Var.f37832b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.f37429b;
        wf1 wf1Var = sf1Var.f37849t0;
        if (i10 == 1) {
            return sf1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            org.telegram.ui.Components.ln0 ln0Var = new org.telegram.ui.Components.ln0(i11, wf1Var);
            ln0Var.f26060b.j(new qf1(0));
            ln0Var.setUiCallback(sf1Var);
            return ln0Var;
        }
        t10 t10Var = new t10(wf1Var);
        t10Var.setChatPreviewDelegate(sf1Var.f37847r0);
        t10Var.setUiCallback(sf1Var);
        t10Var.f38029b.j(new qf1(1));
        return t10Var;
    }

    @Override
    public final int e() {
        return this.f37428a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f37428a;
        if (((of1) arrayList.get(i10)).f36367a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).f36367a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((of1) arrayList.get(i10)).f36368b];
        String str = q0Var.f9892c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9891b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f37428a;
        if (((of1) arrayList.get(i10)).f36367a == 0) {
            return 1;
        }
        if (((of1) arrayList.get(i10)).f36367a == 1) {
            return 2;
        }
        return ((of1) arrayList.get(i10)).f36367a + i10;
    }
}
