package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rf1 extends org.telegram.ui.Components.y81 {
    public final ArrayList f40091a;
    public final sf1 f40092b;

    public rf1(sf1 sf1Var) {
        this.f40092b = sf1Var;
        ArrayList arrayList = new ArrayList();
        this.f40091a = arrayList;
        arrayList.add(new of1(0));
        of1 of1Var = new of1(2);
        of1Var.f39193b = 0;
        arrayList.add(of1Var);
        of1 of1Var2 = new of1(2);
        of1Var2.f39193b = 1;
        arrayList.add(of1Var2);
        of1 of1Var3 = new of1(2);
        of1Var3.f39193b = 2;
        arrayList.add(of1Var3);
        of1 of1Var4 = new of1(2);
        of1Var4.f39193b = 3;
        arrayList.add(of1Var4);
        of1 of1Var5 = new of1(2);
        of1Var5.f39193b = 4;
        arrayList.add(of1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sf1 sf1Var = this.f40092b;
        sf1Var.M(view, i10, sf1Var.f40472d0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        sf1 sf1Var = this.f40092b;
        wf1 wf1Var = sf1Var.f40489v0;
        if (i10 == 1) {
            return sf1Var.V;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
            org.telegram.ui.Components.on0 on0Var = new org.telegram.ui.Components.on0(i11, wf1Var);
            on0Var.f29513b.j(new qf1(0));
            on0Var.setUiCallback(sf1Var);
            return on0Var;
        }
        x10 x10Var = new x10(wf1Var);
        x10Var.setChatPreviewDelegate(sf1Var.f40487t0);
        x10Var.setUiCallback(sf1Var);
        x10Var.f42757b.j(new qf1(1));
        return x10Var;
    }

    @Override
    public final int e() {
        return this.f40091a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f40091a;
        if (((of1) arrayList.get(i10)).f39192a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((of1) arrayList.get(i10)).f39192a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.q0 q0Var = gg.s0.j3[((of1) arrayList.get(i10)).f39193b];
        String str = q0Var.f10757c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(q0Var.f10756b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f40091a;
        if (((of1) arrayList.get(i10)).f39192a == 0) {
            return 1;
        }
        if (((of1) arrayList.get(i10)).f39192a == 1) {
            return 2;
        }
        return ((of1) arrayList.get(i10)).f39192a + i10;
    }
}
