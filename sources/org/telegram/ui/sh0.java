package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class sh0 extends org.telegram.ui.Components.bk0 {
    public final Context f51996c;
    public ArrayList d = new ArrayList();
    public ArrayList f51997e = new ArrayList();
    public rh0 f51998f;
    public final jg.z1 h;
    public final NotificationsCustomSettingsActivity f51999n;

    public sh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f51999n = notificationsCustomSettingsActivity;
        this.f51996c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17727a = new zr(this, 25);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int f10 = i5.c.f(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.f17730e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return z1Var.f17730e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f51998f != null) {
            Utilities.f22781g.a(this.f51998f);
            this.f51998f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f51997e.clear();
            this.h.f(null, null);
            jg.z1 z1Var = this.h;
            int i7 = this.f51999n.f43123s;
            boolean z10 = true;
            z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22781g;
        rh0 rh0Var = new rh0(this, str, 0);
        this.f51998f = rh0Var;
        q5Var.d(rh0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f17730e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.M0(2131754374, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
        boolean z11 = false;
        if (i7 < this.d.size()) {
            uh0 uh0Var = (uh0) this.d.get(i7);
            CharSequence charSequence = (CharSequence) this.f51997e.get(i7);
            if (i7 == this.d.size() - 1) {
                z10 = false;
            }
            raVar.f(uh0Var, charSequence, z10);
            raVar.setAddButtonVisible(false);
            return;
        }
        int f10 = i5.c.f(1, i7, this.d);
        ArrayList arrayList = this.h.f17730e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String M0 = org.telegram.messenger.gd.M0(2131747699, "NotificationsOn");
        if (f10 != arrayList.size() - 1) {
            z11 = true;
        }
        raVar.d(tLObject, null, M0, z11);
        raVar.setAddButtonVisible(true);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View raVar;
        if (i7 != 0) {
            raVar = new org.telegram.ui.Cells.y3(this.f51996c, null);
            raVar.setBackgroundColor(0);
            raVar.setTag(-33024);
        } else {
            raVar = new org.telegram.ui.Cells.ra(4, 0, this.f51996c, null, false, true);
        }
        return new v4.f1(raVar);
    }
}
