package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class sh0 extends org.telegram.ui.Components.dk0 {
    public final Context f52014c;
    public ArrayList d = new ArrayList();
    public ArrayList f52015e = new ArrayList();
    public rh0 f52016f;
    public final jg.z1 h;
    public final NotificationsCustomSettingsActivity f52017n;

    public sh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f52017n = notificationsCustomSettingsActivity;
        this.f52014c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17721a = new zr(this, 25);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int f10 = i5.c.f(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.f17724e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return z1Var.f17724e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f52016f != null) {
            Utilities.f22776g.a(this.f52016f);
            this.f52016f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f52015e.clear();
            this.h.f(null, null);
            jg.z1 z1Var = this.h;
            int i7 = this.f52017n.f43133s;
            boolean z10 = true;
            z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22776g;
        rh0 rh0Var = new rh0(this, str, 0);
        this.f52016f = rh0Var;
        q5Var.d(rh0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f17724e;
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.N0(2131754373, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
        boolean z11 = false;
        if (i7 < this.d.size()) {
            uh0 uh0Var = (uh0) this.d.get(i7);
            CharSequence charSequence = (CharSequence) this.f52015e.get(i7);
            if (i7 == this.d.size() - 1) {
                z10 = false;
            }
            raVar.f(uh0Var, charSequence, z10);
            raVar.setAddButtonVisible(false);
            return;
        }
        int f10 = i5.c.f(1, i7, this.d);
        ArrayList arrayList = this.h.f17724e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String N0 = org.telegram.messenger.hd.N0(2131747698, "NotificationsOn");
        if (f10 != arrayList.size() - 1) {
            z11 = true;
        }
        raVar.d(tLObject, null, N0, z11);
        raVar.setAddButtonVisible(true);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View raVar;
        if (i7 != 0) {
            raVar = new org.telegram.ui.Cells.y3(this.f52014c, null);
            raVar.setBackgroundColor(0);
            raVar.setTag(-33024);
        } else {
            raVar = new org.telegram.ui.Cells.ra(4, 0, this.f52014c, null, false, true);
        }
        return new v4.e1(raVar);
    }
}
