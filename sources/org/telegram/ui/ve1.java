package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ve1 extends org.telegram.ui.Components.m91 {
    public final ArrayList f44788a;
    public final we1 f44789b;

    public ve1(we1 we1Var) {
        this.f44789b = we1Var;
        ArrayList arrayList = new ArrayList();
        this.f44788a = arrayList;
        arrayList.add(new se1(0));
        se1 se1Var = new se1(2);
        se1Var.f43489b = 0;
        arrayList.add(se1Var);
        se1 se1Var2 = new se1(2);
        se1Var2.f43489b = 1;
        arrayList.add(se1Var2);
        se1 se1Var3 = new se1(2);
        se1Var3.f43489b = 2;
        arrayList.add(se1Var3);
        se1 se1Var4 = new se1(2);
        se1Var4.f43489b = 3;
        arrayList.add(se1Var4);
        se1 se1Var5 = new se1(2);
        se1Var5.f43489b = 4;
        arrayList.add(se1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        we1 we1Var = this.f44789b;
        we1Var.M(view, i10, we1Var.f45122d0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        we1 we1Var = this.f44789b;
        af1 af1Var = we1Var.f45139v0;
        if (i10 == 1) {
            return we1Var.V;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            org.telegram.ui.Components.co0 co0Var = new org.telegram.ui.Components.co0(i11, af1Var);
            co0Var.f27216b.j(new ue1(0));
            co0Var.setUiCallback(we1Var);
            return co0Var;
        }
        h10 h10Var = new h10(af1Var);
        h10Var.setChatPreviewDelegate(we1Var.f45137t0);
        h10Var.setUiCallback(we1Var);
        h10Var.f39825b.j(new ue1(1));
        return h10Var;
    }

    @Override
    public final int e() {
        return this.f44788a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f44788a;
        if (((se1) arrayList.get(i10)).f43488a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((se1) arrayList.get(i10)).f43488a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        ig.p0 p0Var = ig.r0.f14213k3[((se1) arrayList.get(i10)).f43489b];
        String str = p0Var.f14200c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f14199b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f44788a;
        if (((se1) arrayList.get(i10)).f43488a == 0) {
            return 1;
        }
        if (((se1) arrayList.get(i10)).f43488a == 1) {
            return 2;
        }
        return ((se1) arrayList.get(i10)).f43488a + i10;
    }
}
