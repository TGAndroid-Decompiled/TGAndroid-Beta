package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zf1 extends org.telegram.ui.Components.h91 {
    public final ArrayList f44655a;
    public final ag1 f44656b;

    public zf1(ag1 ag1Var) {
        this.f44656b = ag1Var;
        ArrayList arrayList = new ArrayList();
        this.f44655a = arrayList;
        arrayList.add(new wf1(0));
        wf1 wf1Var = new wf1(2);
        wf1Var.f43768b = 0;
        arrayList.add(wf1Var);
        wf1 wf1Var2 = new wf1(2);
        wf1Var2.f43768b = 1;
        arrayList.add(wf1Var2);
        wf1 wf1Var3 = new wf1(2);
        wf1Var3.f43768b = 2;
        arrayList.add(wf1Var3);
        wf1 wf1Var4 = new wf1(2);
        wf1Var4.f43768b = 3;
        arrayList.add(wf1Var4);
        wf1 wf1Var5 = new wf1(2);
        wf1Var5.f43768b = 4;
        arrayList.add(wf1Var5);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ag1 ag1Var = this.f44656b;
        ag1Var.K(view, i10, ag1Var.f36071b0, true);
    }

    @Override
    public final View d(int i10) {
        int i11;
        ag1 ag1Var = this.f44656b;
        eg1 eg1Var = ag1Var.f36088t0;
        if (i10 == 1) {
            return ag1Var.T;
        }
        if (i10 == 2) {
            i11 = ((org.telegram.ui.ActionBar.m2) eg1Var).currentAccount;
            org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(i11, eg1Var);
            do0Var.f25644b.j(new yf1(0));
            do0Var.setUiCallback(ag1Var);
            return do0Var;
        }
        v10 v10Var = new v10(eg1Var);
        v10Var.setChatPreviewDelegate(ag1Var.f36086r0);
        v10Var.setUiCallback(ag1Var);
        v10Var.f42830b.j(new yf1(1));
        return v10Var;
    }

    @Override
    public final int e() {
        return this.f44655a.size();
    }

    @Override
    public final CharSequence g(int i10) {
        ArrayList arrayList = this.f44655a;
        if (((wf1) arrayList.get(i10)).f43767a == 0) {
            return LocaleController.getString(R.string.SearchMessages);
        }
        if (((wf1) arrayList.get(i10)).f43767a == 1) {
            return LocaleController.getString(R.string.DownloadsTabs);
        }
        gg.p0 p0Var = gg.r0.f10778a3[((wf1) arrayList.get(i10)).f43768b];
        String str = p0Var.f10761c;
        if (str != null) {
            return str;
        }
        return LocaleController.getString(p0Var.f10760b);
    }

    @Override
    public final int h(int i10) {
        ArrayList arrayList = this.f44655a;
        if (((wf1) arrayList.get(i10)).f43767a == 0) {
            return 1;
        }
        if (((wf1) arrayList.get(i10)).f43767a == 1) {
            return 2;
        }
        return ((wf1) arrayList.get(i10)).f43767a + i10;
    }
}
