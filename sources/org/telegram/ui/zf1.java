package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zf1 extends org.telegram.ui.Components.a81 {
    public final ArrayList f40195a;
    public final ag1 f40196b;

    public zf1(ag1 ag1Var) {
        this.f40196b = ag1Var;
        ArrayList arrayList = new ArrayList();
        this.f40195a = arrayList;
        arrayList.add(new wf1(0));
        wf1 wf1Var = new wf1(2);
        wf1Var.f39192b = 0;
        arrayList.add(wf1Var);
        wf1 wf1Var2 = new wf1(2);
        wf1Var2.f39192b = 1;
        arrayList.add(wf1Var2);
        wf1 wf1Var3 = new wf1(2);
        wf1Var3.f39192b = 2;
        arrayList.add(wf1Var3);
        wf1 wf1Var4 = new wf1(2);
        wf1Var4.f39192b = 3;
        arrayList.add(wf1Var4);
        wf1 wf1Var5 = new wf1(2);
        wf1Var5.f39192b = 4;
        arrayList.add(wf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ag1 ag1Var = this.f40196b;
        ag1Var.K(view, i10, ag1Var.f31806b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        ag1 ag1Var = this.f40196b;
        eg1 eg1Var = ag1Var.f31823t0;
        if (i10 == 1) {
            return ag1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
            org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(i11, eg1Var);
            vm0Var.f28830b.j(new yf1(0));
            vm0Var.setUiCallback(ag1Var);
            return vm0Var;
        }
        x10 x10Var = new x10(eg1Var);
        x10Var.setChatPreviewDelegate(ag1Var.f31821r0);
        x10Var.setUiCallback(ag1Var);
        x10Var.f39437b.j(new yf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f40195a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f40195a;
        if (((wf1) arrayList.get(i10)).f39191a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((wf1) arrayList.get(i10)).f39191a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.f9911c3[((wf1) arrayList.get(i10)).f39192b];
        String str = q0Var.f9895c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f9894b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f40195a;
        if (((wf1) arrayList.get(i10)).f39191a == 0) {
            return 1;
        }
        if (((wf1) arrayList.get(i10)).f39191a == 1) {
            return 2;
        }
        return ((wf1) arrayList.get(i10)).f39191a + i10;
    }
}
