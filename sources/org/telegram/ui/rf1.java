package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rf1 extends org.telegram.ui.Components.z71 {
    public final ArrayList f36812a;
    public final sf1 f36813b;

    public rf1(sf1 sf1Var) {
        this.f36813b = sf1Var;
        ArrayList arrayList = new ArrayList();
        this.f36812a = arrayList;
        arrayList.add(new of1(0));
        of1 of1Var = new of1(2);
        of1Var.f35863b = 0;
        arrayList.add(of1Var);
        of1 of1Var2 = new of1(2);
        of1Var2.f35863b = 1;
        arrayList.add(of1Var2);
        of1 of1Var3 = new of1(2);
        of1Var3.f35863b = 2;
        arrayList.add(of1Var3);
        of1 of1Var4 = new of1(2);
        of1Var4.f35863b = 3;
        arrayList.add(of1Var4);
        of1 of1Var5 = new of1(2);
        of1Var5.f35863b = 4;
        arrayList.add(of1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.f36813b;
        sf1Var.K(view, i10, sf1Var.f37277b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.f36813b;
        wf1 wf1Var = sf1Var.f37294t0;
        if (i10 == 1) {
            return sf1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
            org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(i11, wf1Var);
            wm0Var.f29748b.j(new qf1(0));
            wm0Var.setUiCallback(sf1Var);
            return wm0Var;
        }
        u10 u10Var = new u10(wf1Var);
        u10Var.setChatPreviewDelegate(sf1Var.f37292r0);
        u10Var.setUiCallback(sf1Var);
        u10Var.f37846b.j(new qf1(1));
        return u10Var;
    }

    @Override
    public final int e() {
        return this.f36812a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f36812a;
        if (((of1) arrayList.get(i10)).f35862a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).f35862a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9897c3[((of1) arrayList.get(i10)).f35863b];
        String str = q0Var.f9881c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9880b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f36812a;
        if (((of1) arrayList.get(i10)).f35862a == 0) {
            return 1;
        }
        if (((of1) arrayList.get(i10)).f35862a == 1) {
            return 2;
        }
        return ((of1) arrayList.get(i10)).f35862a + i10;
    }
}
