package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yf1 extends org.telegram.ui.Components.a81 {
    public final ArrayList f39867a;
    public final zf1 f39868b;

    public yf1(zf1 zf1Var) {
        this.f39868b = zf1Var;
        ArrayList arrayList = new ArrayList();
        this.f39867a = arrayList;
        arrayList.add(new vf1(0));
        vf1 vf1Var = new vf1(2);
        vf1Var.f38593b = 0;
        arrayList.add(vf1Var);
        vf1 vf1Var2 = new vf1(2);
        vf1Var2.f38593b = 1;
        arrayList.add(vf1Var2);
        vf1 vf1Var3 = new vf1(2);
        vf1Var3.f38593b = 2;
        arrayList.add(vf1Var3);
        vf1 vf1Var4 = new vf1(2);
        vf1Var4.f38593b = 3;
        arrayList.add(vf1Var4);
        vf1 vf1Var5 = new vf1(2);
        vf1Var5.f38593b = 4;
        arrayList.add(vf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        zf1 zf1Var = this.f39868b;
        zf1Var.K(view, i10, zf1Var.f40190b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        zf1 zf1Var = this.f39868b;
        dg1 dg1Var = zf1Var.f40207t0;
        if (i10 == 1) {
            return zf1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(i11, dg1Var);
            vm0Var.f28833b.j(new xf1(0));
            vm0Var.setUiCallback(zf1Var);
            return vm0Var;
        }
        x10 x10Var = new x10(dg1Var);
        x10Var.setChatPreviewDelegate(zf1Var.f40205r0);
        x10Var.setUiCallback(zf1Var);
        x10Var.f39440b.j(new xf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f39867a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f39867a;
        if (((vf1) arrayList.get(i10)).f38592a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((vf1) arrayList.get(i10)).f38592a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9910c3[((vf1) arrayList.get(i10)).f38593b];
        String str = q0Var.f9894c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9893b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f39867a;
        if (((vf1) arrayList.get(i10)).f38592a == 0) {
            return 1;
        }
        if (((vf1) arrayList.get(i10)).f38592a == 1) {
            return 2;
        }
        return ((vf1) arrayList.get(i10)).f38592a + i10;
    }
}
