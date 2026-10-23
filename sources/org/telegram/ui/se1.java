package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class se1 extends org.telegram.ui.Components.d91 {
    public final ArrayList f41396a;
    public final te1 f41397b;

    public se1(te1 te1Var) {
        this.f41397b = te1Var;
        ArrayList arrayList = new ArrayList();
        this.f41396a = arrayList;
        arrayList.add(new pe1(0));
        pe1 pe1Var = new pe1(2);
        pe1Var.f40460b = 0;
        arrayList.add(pe1Var);
        pe1 pe1Var2 = new pe1(2);
        pe1Var2.f40460b = 1;
        arrayList.add(pe1Var2);
        pe1 pe1Var3 = new pe1(2);
        pe1Var3.f40460b = 2;
        arrayList.add(pe1Var3);
        pe1 pe1Var4 = new pe1(2);
        pe1Var4.f40460b = 3;
        arrayList.add(pe1Var4);
        pe1 pe1Var5 = new pe1(2);
        pe1Var5.f40460b = 4;
        arrayList.add(pe1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        te1 te1Var = this.f41397b;
        te1Var.K(view, i10, te1Var.f41975b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        te1 te1Var = this.f41397b;
        ye1 ye1Var = te1Var.f41992t0;
        if (i10 == 1) {
            return te1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            org.telegram.ui.Components.xn0 xn0Var = new org.telegram.ui.Components.xn0(i11, ye1Var);
            xn0Var.f32607b.j(new re1(0));
            xn0Var.setUiCallback(te1Var);
            return xn0Var;
        }
        i10 i10Var = new i10(ye1Var);
        i10Var.setChatPreviewDelegate(te1Var.f41990r0);
        i10Var.setUiCallback(te1Var);
        i10Var.f38012b.j(new re1(1));
        return i10Var;
    }

    @Override
    public final int e() {
        return this.f41396a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f41396a;
        if (((pe1) arrayList.get(i10)).f40459a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((pe1) arrayList.get(i10)).f40459a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.f12042d3[((pe1) arrayList.get(i10)).f40460b];
        String str = o0Var.f12030c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12029b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f41396a;
        if (((pe1) arrayList.get(i10)).f40459a == 0) {
            return 1;
        }
        if (((pe1) arrayList.get(i10)).f40459a == 1) {
            return 2;
        }
        return ((pe1) arrayList.get(i10)).f40459a + i10;
    }
}
