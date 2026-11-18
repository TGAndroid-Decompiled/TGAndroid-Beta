package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class rh0 extends org.telegram.ui.Components.bk0 {
    public final Context f51612c;
    public ArrayList d = new ArrayList();
    public ArrayList f51613e = new ArrayList();
    public qh0 f51614f;
    public final jg.z1 h;
    public final NotificationsCustomSettingsActivity f51615n;

    public rh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f51615n = notificationsCustomSettingsActivity;
        this.f51612c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17730a = new zr(this, 25);
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
        ArrayList arrayList = z1Var.f17733e;
        if (f10 >= 0 && f10 < arrayList.size()) {
            return z1Var.f17733e.get(f10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f51614f != null) {
            Utilities.f22784g.a(this.f51614f);
            this.f51614f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f51613e.clear();
            this.h.f(null, null);
            jg.z1 z1Var = this.h;
            int i7 = this.f51615n.f43123s;
            boolean z10 = true;
            z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22784g;
        qh0 qh0Var = new qh0(this, str, 0);
        this.f51614f = qh0Var;
        q5Var.d(qh0Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f17733e;
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
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.gd.M0(2131754374, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
        boolean z11 = false;
        if (i7 < this.d.size()) {
            th0 th0Var = (th0) this.d.get(i7);
            CharSequence charSequence = (CharSequence) this.f51613e.get(i7);
            if (i7 == this.d.size() - 1) {
                z10 = false;
            }
            qaVar.f(th0Var, charSequence, z10);
            qaVar.setAddButtonVisible(false);
            return;
        }
        int f10 = i5.c.f(1, i7, this.d);
        ArrayList arrayList = this.h.f17733e;
        TLObject tLObject = (TLObject) arrayList.get(f10);
        String M0 = org.telegram.messenger.gd.M0(2131747699, "NotificationsOn");
        if (f10 != arrayList.size() - 1) {
            z11 = true;
        }
        qaVar.d(tLObject, null, M0, z11);
        qaVar.setAddButtonVisible(true);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View qaVar;
        if (i7 != 0) {
            qaVar = new org.telegram.ui.Cells.x3(this.f51612c, null);
            qaVar.setBackgroundColor(0);
            qaVar.setTag(-33024);
        } else {
            qaVar = new org.telegram.ui.Cells.qa(4, 0, this.f51612c, null, false, true);
        }
        return new v4.f1(qaVar);
    }
}
