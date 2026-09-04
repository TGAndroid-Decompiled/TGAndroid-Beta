package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zf1 extends org.telegram.ui.Components.a81 {
    public final ArrayList f43425a;
    public final ag1 f43426b;

    public zf1(ag1 ag1Var) {
        this.f43426b = ag1Var;
        ArrayList arrayList = new ArrayList();
        this.f43425a = arrayList;
        arrayList.add(new wf1(0));
        wf1 wf1Var = new wf1(2);
        wf1Var.f42354b = 0;
        arrayList.add(wf1Var);
        wf1 wf1Var2 = new wf1(2);
        wf1Var2.f42354b = 1;
        arrayList.add(wf1Var2);
        wf1 wf1Var3 = new wf1(2);
        wf1Var3.f42354b = 2;
        arrayList.add(wf1Var3);
        wf1 wf1Var4 = new wf1(2);
        wf1Var4.f42354b = 3;
        arrayList.add(wf1Var4);
        wf1 wf1Var5 = new wf1(2);
        wf1Var5.f42354b = 4;
        arrayList.add(wf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ag1 ag1Var = this.f43426b;
        ag1Var.K(view, i10, ag1Var.f34428b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        ag1 ag1Var = this.f43426b;
        eg1 eg1Var = ag1Var.f34445t0;
        if (i10 == 1) {
            return ag1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(i11, eg1Var);
            vm0Var.f31364b.j(new yf1(0));
            vm0Var.setUiCallback(ag1Var);
            return vm0Var;
        }
        x10 x10Var = new x10(eg1Var);
        x10Var.setChatPreviewDelegate(ag1Var.f34443r0);
        x10Var.setUiCallback(ag1Var);
        x10Var.f42537b.j(new yf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f43425a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f43425a;
        if (((wf1) arrayList.get(i10)).f42353a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((wf1) arrayList.get(i10)).f42353a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.q0 q0Var = hg.s0.f11237c3[((wf1) arrayList.get(i10)).f42354b];
        String str = q0Var.f11217c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f11216b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f43425a;
        if (((wf1) arrayList.get(i10)).f42353a == 0) {
            return 1;
        }
        if (((wf1) arrayList.get(i10)).f42353a == 1) {
            return 2;
        }
        return ((wf1) arrayList.get(i10)).f42353a + i10;
    }
}
