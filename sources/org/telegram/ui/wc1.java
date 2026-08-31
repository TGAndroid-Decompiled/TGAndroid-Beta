package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wc1 extends org.telegram.ui.Components.sl0 {
    public final Context f42442c;
    public final ArrayList d;

    public wc1(Context context) {
        this.f42442c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.m2 m2Var = new org.telegram.ui.Cells.m2();
        m2Var.f23150a = LocaleController.getString(R.string.ThemePreviewDialog1);
        m2Var.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        m2Var.f23152c = 0;
        m2Var.d = 0;
        m2Var.f23153e = true;
        m2Var.f23154f = false;
        m2Var.f23155g = 0;
        m2Var.h = currentTimeMillis;
        m2Var.f23156i = false;
        m2Var.f23157j = false;
        m2Var.f23158k = 2;
        arrayList.add(m2Var);
        org.telegram.ui.Cells.m2 m2Var2 = new org.telegram.ui.Cells.m2();
        m2Var2.f23150a = LocaleController.getString(R.string.ThemePreviewDialog2);
        m2Var2.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        m2Var2.f23152c = 1;
        m2Var2.d = 2;
        m2Var2.f23153e = false;
        m2Var2.f23154f = false;
        m2Var2.f23155g = 0;
        m2Var2.h = currentTimeMillis - 3600;
        m2Var2.f23156i = false;
        m2Var2.f23157j = false;
        m2Var2.f23158k = -1;
        arrayList.add(m2Var2);
        org.telegram.ui.Cells.m2 m2Var3 = new org.telegram.ui.Cells.m2();
        m2Var3.f23150a = LocaleController.getString(R.string.ThemePreviewDialog3);
        m2Var3.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        m2Var3.f23152c = 2;
        m2Var3.d = 3;
        m2Var3.f23153e = false;
        m2Var3.f23154f = true;
        m2Var3.f23155g = 0;
        m2Var3.h = currentTimeMillis - 7200;
        m2Var3.f23156i = false;
        m2Var3.f23157j = true;
        m2Var3.f23158k = -1;
        arrayList.add(m2Var3);
        org.telegram.ui.Cells.m2 m2Var4 = new org.telegram.ui.Cells.m2();
        m2Var4.f23150a = LocaleController.getString(R.string.ThemePreviewDialog4);
        m2Var4.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        m2Var4.f23152c = 3;
        m2Var4.d = 0;
        m2Var4.f23153e = false;
        m2Var4.f23154f = false;
        m2Var4.f23155g = 2;
        m2Var4.h = currentTimeMillis - 10800;
        m2Var4.f23156i = false;
        m2Var4.f23157j = false;
        m2Var4.f23158k = -1;
        arrayList.add(m2Var4);
        org.telegram.ui.Cells.m2 m2Var5 = new org.telegram.ui.Cells.m2();
        m2Var5.f23150a = LocaleController.getString(R.string.ThemePreviewDialog5);
        m2Var5.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        m2Var5.f23152c = 4;
        m2Var5.d = 0;
        m2Var5.f23153e = false;
        m2Var5.f23154f = false;
        m2Var5.f23155g = 1;
        m2Var5.h = currentTimeMillis - 14400;
        m2Var5.f23156i = false;
        m2Var5.f23157j = false;
        m2Var5.f23158k = 2;
        arrayList.add(m2Var5);
        org.telegram.ui.Cells.m2 m2Var6 = new org.telegram.ui.Cells.m2();
        m2Var6.f23150a = LocaleController.getString(R.string.ThemePreviewDialog6);
        m2Var6.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        m2Var6.f23152c = 5;
        m2Var6.d = 0;
        m2Var6.f23153e = false;
        m2Var6.f23154f = false;
        m2Var6.f23155g = 0;
        m2Var6.h = currentTimeMillis - 18000;
        m2Var6.f23156i = false;
        m2Var6.f23157j = false;
        m2Var6.f23158k = -1;
        arrayList.add(m2Var6);
        org.telegram.ui.Cells.m2 m2Var7 = new org.telegram.ui.Cells.m2();
        m2Var7.f23150a = LocaleController.getString(R.string.ThemePreviewDialog7);
        m2Var7.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        m2Var7.f23152c = 6;
        m2Var7.d = 0;
        m2Var7.f23153e = false;
        m2Var7.f23154f = false;
        m2Var7.f23155g = 0;
        m2Var7.h = currentTimeMillis - 21600;
        m2Var7.f23156i = true;
        m2Var7.f23157j = false;
        m2Var7.f23158k = -1;
        arrayList.add(m2Var7);
        org.telegram.ui.Cells.m2 m2Var8 = new org.telegram.ui.Cells.m2();
        m2Var8.f23150a = LocaleController.getString(R.string.ThemePreviewDialog8);
        m2Var8.f23151b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        m2Var8.f23152c = 0;
        m2Var8.d = 0;
        m2Var8.f23153e = false;
        m2Var8.f23154f = false;
        m2Var8.f23155g = 0;
        m2Var8.h = currentTimeMillis - 25200;
        m2Var8.f23156i = true;
        m2Var8.f23157j = false;
        m2Var8.f23158k = -1;
        arrayList.add(m2Var8);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f5879f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) m1Var.f5875a;
            ArrayList arrayList = this.d;
            boolean z4 = true;
            if (i10 == arrayList.size() - 1) {
                z4 = false;
            }
            r2Var.f23486p2 = z4;
            r2Var.setDialog((org.telegram.ui.Cells.m2) arrayList.get(i10));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View s4Var;
        Context context = this.f42442c;
        if (i10 == 0) {
            s4Var = new org.telegram.ui.Cells.r2(context, false);
        } else {
            s4Var = new org.telegram.ui.Cells.s4(context);
        }
        s4Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(s4Var);
    }
}
