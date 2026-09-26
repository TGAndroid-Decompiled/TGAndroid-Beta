package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rf1 extends org.telegram.ui.Components.n81 {
    public final ArrayList f37326a;
    public final sf1 f37327b;

    public rf1(sf1 sf1Var) {
        this.f37327b = sf1Var;
        ArrayList arrayList = new ArrayList();
        this.f37326a = arrayList;
        arrayList.add(new of1(0));
        of1 of1Var = new of1(2);
        of1Var.f36231b = 0;
        arrayList.add(of1Var);
        of1 of1Var2 = new of1(2);
        of1Var2.f36231b = 1;
        arrayList.add(of1Var2);
        of1 of1Var3 = new of1(2);
        of1Var3.f36231b = 2;
        arrayList.add(of1Var3);
        of1 of1Var4 = new of1(2);
        of1Var4.f36231b = 3;
        arrayList.add(of1Var4);
        of1 of1Var5 = new of1(2);
        of1Var5.f36231b = 4;
        arrayList.add(of1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.f37327b;
        sf1Var.K(view, i10, sf1Var.f37736b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.f37327b;
        wf1 wf1Var = sf1Var.f37753t0;
        if (i10 == 1) {
            return sf1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(i11, wf1Var);
            in0Var.f25120b.j(new qf1(0));
            in0Var.setUiCallback(sf1Var);
            return in0Var;
        }
        t10 t10Var = new t10(wf1Var);
        t10Var.setChatPreviewDelegate(sf1Var.f37751r0);
        t10Var.setUiCallback(sf1Var);
        t10Var.f37921b.j(new qf1(1));
        return t10Var;
    }

    @Override
    public final int e() {
        return this.f37326a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f37326a;
        if (((of1) arrayList.get(i10)).f36230a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).f36230a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9896c3[((of1) arrayList.get(i10)).f36231b];
        String str = q0Var.f9880c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9879b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f37326a;
        if (((of1) arrayList.get(i10)).f36230a == 0) {
            return 1;
        }
        if (((of1) arrayList.get(i10)).f36230a == 1) {
            return 2;
        }
        return ((of1) arrayList.get(i10)).f36230a + i10;
    }
}
