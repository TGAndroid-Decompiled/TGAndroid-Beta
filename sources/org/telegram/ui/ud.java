package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ud extends org.telegram.ui.Components.n61 {
    public final Context f50377a;
    public final int f50378b;
    public final int f50379c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ArrayList f50380e = new ArrayList();
    public final vd f50381f;

    public ud(vd vdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f50381f = vdVar;
        this.f50377a = context;
        this.f50378b = i7;
        this.f50379c = i10;
        this.d = g6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f50381f.f50655b.L(view);
    }

    @Override
    public final View d(int i7) {
        return new td(this.f50381f, this.f50377a, i7, this.f50378b, this.f50379c, new bg.m0(this, i7, 20), this.d);
    }

    @Override
    public final int e() {
        return this.f50380e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.id.M0(2131748352, null);
        }
        return org.telegram.messenger.id.M0(2131748353, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f50380e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.y31) arrayList.get(i7)).f40581z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f50380e;
        arrayList.clear();
        vd vdVar = this.f50381f;
        if (!vdVar.f50659n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.y31.D(1));
        }
        if (!vdVar.f50660r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.y31.D(0));
        }
    }
}
