package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ud extends org.telegram.ui.Components.h61 {
    public final Context f50376a;
    public final int f50377b;
    public final int f50378c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList f50379e = new ArrayList();
    public final vd f50380f;

    public ud(vd vdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f50380f = vdVar;
        this.f50376a = context;
        this.f50377b = i7;
        this.f50378c = i10;
        this.d = f6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f50380f.f50691b.L(view);
    }

    @Override
    public final View d(int i7) {
        return new td(this.f50380f, this.f50376a, i7, this.f50377b, this.f50378c, new bg.m0(this, i7, 20), this.d);
    }

    @Override
    public final int e() {
        return this.f50379e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.hd.M0(2131748351, null);
        }
        return org.telegram.messenger.hd.M0(2131748352, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f50379e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.r31) arrayList.get(i7)).f37611z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f50379e;
        arrayList.clear();
        vd vdVar = this.f50380f;
        if (!vdVar.f50695n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r31.D(1));
        }
        if (!vdVar.f50696r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r31.D(0));
        }
    }
}
