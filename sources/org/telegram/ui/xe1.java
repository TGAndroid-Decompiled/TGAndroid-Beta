package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xe1 extends org.telegram.ui.Components.n91 {
    public final ArrayList f45673a;
    public final ye1 f45674b;

    public xe1(ye1 ye1Var) {
        this.f45674b = ye1Var;
        ArrayList arrayList = new ArrayList();
        this.f45673a = arrayList;
        arrayList.add(new ue1(0));
        ue1 ue1Var = new ue1(2);
        ue1Var.f44009b = 0;
        arrayList.add(ue1Var);
        ue1 ue1Var2 = new ue1(2);
        ue1Var2.f44009b = 1;
        arrayList.add(ue1Var2);
        ue1 ue1Var3 = new ue1(2);
        ue1Var3.f44009b = 2;
        arrayList.add(ue1Var3);
        ue1 ue1Var4 = new ue1(2);
        ue1Var4.f44009b = 3;
        arrayList.add(ue1Var4);
        ue1 ue1Var5 = new ue1(2);
        ue1Var5.f44009b = 4;
        arrayList.add(ue1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ye1 ye1Var = this.f45674b;
        ye1Var.M(view, i10, ye1Var.f45986d0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        ye1 ye1Var = this.f45674b;
        cf1 cf1Var = ye1Var.f46003v0;
        if (i10 == 1) {
            return ye1Var.V;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
            org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(i11, cf1Var);
            do0Var.f27501b.j(new we1(0));
            do0Var.setUiCallback(ye1Var);
            return do0Var;
        }
        j10 j10Var = new j10(cf1Var);
        j10Var.setChatPreviewDelegate(ye1Var.f46001t0);
        j10Var.setUiCallback(ye1Var);
        j10Var.f40322b.j(new we1(1));
        return j10Var;
    }

    @Override
    public final int e() {
        return this.f45673a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f45673a;
        if (((ue1) arrayList.get(i10)).f44008a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((ue1) arrayList.get(i10)).f44008a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        ig.p0 p0Var = ig.r0.f14212k3[((ue1) arrayList.get(i10)).f44009b];
        String str = p0Var.f14199c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f14198b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f45673a;
        if (((ue1) arrayList.get(i10)).f44008a == 0) {
            return 1;
        }
        if (((ue1) arrayList.get(i10)).f44008a == 1) {
            return 2;
        }
        return ((ue1) arrayList.get(i10)).f44008a + i10;
    }
}
