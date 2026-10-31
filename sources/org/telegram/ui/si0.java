package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class si0 extends org.telegram.ui.Components.sk0 {
    public final Context f41527c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ri0 f41528f;
    public final zf.m1 h;
    public final NotificationsCustomSettingsActivity f41529n;

    public si0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f41529n = notificationsCustomSettingsActivity;
        this.f41527c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.h = m1Var;
        m1Var.f55575a = new tt(this, 25);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e = sc.e.e(1, i10, this.d);
        zf.m1 m1Var = this.h;
        ArrayList arrayList = m1Var.e;
        if (e >= 0 && e < arrayList.size()) {
            return m1Var.e.get(e);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f41528f != null) {
            Utilities.f14522g.a(this.f41528f);
            this.f41528f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            zf.m1 m1Var = this.h;
            int i10 = this.f41529n.f33403s;
            boolean z10 = true;
            m1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14522g;
        ri0 ri0Var = new ri0(this, str, 0);
        this.f41528f = ri0Var;
        r5Var.d(ri0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int d(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            ui0 ui0Var = (ui0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            paVar.f(ui0Var, charSequence, z10);
            paVar.setAddButtonVisible(false);
            return;
        }
        int e = sc.e.e(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(e);
        String L0 = org.telegram.messenger.cd.L0(2131747908, "NotificationsOn");
        if (e != arrayList.size() - 1) {
            z11 = true;
        }
        paVar.d(tLObject, null, L0, z11);
        paVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View paVar;
        if (i10 != 0) {
            paVar = new org.telegram.ui.Cells.z3(this.f41527c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.f41527c, null, false, true);
        }
        return new s4.c1(paVar);
    }
}
