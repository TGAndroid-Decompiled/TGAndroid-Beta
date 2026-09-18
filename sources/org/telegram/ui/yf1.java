package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yf1 extends org.telegram.ui.Components.o81 {
    public final ArrayList f39815a;
    public final zf1 f39816b;

    public yf1(zf1 zf1Var) {
        this.f39816b = zf1Var;
        ArrayList arrayList = new ArrayList();
        this.f39815a = arrayList;
        arrayList.add(new vf1(0));
        vf1 vf1Var = new vf1(2);
        vf1Var.f38547b = 0;
        arrayList.add(vf1Var);
        vf1 vf1Var2 = new vf1(2);
        vf1Var2.f38547b = 1;
        arrayList.add(vf1Var2);
        vf1 vf1Var3 = new vf1(2);
        vf1Var3.f38547b = 2;
        arrayList.add(vf1Var3);
        vf1 vf1Var4 = new vf1(2);
        vf1Var4.f38547b = 3;
        arrayList.add(vf1Var4);
        vf1 vf1Var5 = new vf1(2);
        vf1Var5.f38547b = 4;
        arrayList.add(vf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        zf1 zf1Var = this.f39816b;
        zf1Var.L(view, i10, zf1Var.f40116c0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        zf1 zf1Var = this.f39816b;
        dg1 dg1Var = zf1Var.f40133u0;
        if (i10 == 1) {
            return zf1Var.U;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
            org.telegram.ui.Components.jn0 jn0Var = new org.telegram.ui.Components.jn0(i11, dg1Var);
            jn0Var.f25380b.j(new xf1(0));
            jn0Var.setUiCallback(zf1Var);
            return jn0Var;
        }
        x10 x10Var = new x10(dg1Var);
        x10Var.setChatPreviewDelegate(zf1Var.f40131s0);
        x10Var.setUiCallback(zf1Var);
        x10Var.f39304b.j(new xf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f39815a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f39815a;
        if (((vf1) arrayList.get(i10)).f38546a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((vf1) arrayList.get(i10)).f38546a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9914c3[((vf1) arrayList.get(i10)).f38547b];
        String str = q0Var.f9898c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9897b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f39815a;
        if (((vf1) arrayList.get(i10)).f38546a == 0) {
            return 1;
        }
        if (((vf1) arrayList.get(i10)).f38546a == 1) {
            return 2;
        }
        return ((vf1) arrayList.get(i10)).f38546a + i10;
    }
}
