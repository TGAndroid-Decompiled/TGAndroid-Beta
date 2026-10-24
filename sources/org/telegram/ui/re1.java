package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class re1 extends org.telegram.ui.Components.d91 {
    public final ArrayList f41140a;
    public final se1 f41141b;

    public re1(se1 se1Var) {
        this.f41141b = se1Var;
        ArrayList arrayList = new ArrayList();
        this.f41140a = arrayList;
        arrayList.add(new oe1(0));
        oe1 oe1Var = new oe1(2);
        oe1Var.f40170b = 0;
        arrayList.add(oe1Var);
        oe1 oe1Var2 = new oe1(2);
        oe1Var2.f40170b = 1;
        arrayList.add(oe1Var2);
        oe1 oe1Var3 = new oe1(2);
        oe1Var3.f40170b = 2;
        arrayList.add(oe1Var3);
        oe1 oe1Var4 = new oe1(2);
        oe1Var4.f40170b = 3;
        arrayList.add(oe1Var4);
        oe1 oe1Var5 = new oe1(2);
        oe1Var5.f40170b = 4;
        arrayList.add(oe1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        se1 se1Var = this.f41141b;
        se1Var.K(view, i10, se1Var.f41367b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        se1 se1Var = this.f41141b;
        xe1 xe1Var = se1Var.f41384t0;
        if (i10 == 1) {
            return se1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
            org.telegram.ui.Components.wn0 wn0Var = new org.telegram.ui.Components.wn0(i11, xe1Var);
            wn0Var.f32303b.j(new qe1(0));
            wn0Var.setUiCallback(se1Var);
            return wn0Var;
        }
        i10 i10Var = new i10(xe1Var);
        i10Var.setChatPreviewDelegate(se1Var.f41382r0);
        i10Var.setUiCallback(se1Var);
        i10Var.f38095b.j(new qe1(1));
        return i10Var;
    }

    @Override
    public final int e() {
        return this.f41140a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f41140a;
        if (((oe1) arrayList.get(i10)).f40169a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((oe1) arrayList.get(i10)).f40169a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        hg.o0 o0Var = hg.q0.f12042d3[((oe1) arrayList.get(i10)).f40170b];
        String str = o0Var.f12030c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(o0Var.f12029b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f41140a;
        if (((oe1) arrayList.get(i10)).f40169a == 0) {
            return 1;
        }
        if (((oe1) arrayList.get(i10)).f40169a == 1) {
            return 2;
        }
        return ((oe1) arrayList.get(i10)).f40169a + i10;
    }
}
