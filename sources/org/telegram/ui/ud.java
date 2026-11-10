package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ud extends org.telegram.ui.Components.m61 {
    public final Context f50474a;
    public final int f50475b;
    public final int f50476c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final ArrayList f50477e = new ArrayList();
    public final vd f50478f;

    public ud(vd vdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f50478f = vdVar;
        this.f50474a = context;
        this.f50475b = i7;
        this.f50476c = i10;
        this.d = h6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f50478f.f50705b.L(view);
    }

    @Override
    public final View d(int i7) {
        return new td(this.f50478f, this.f50474a, i7, this.f50475b, this.f50476c, new bg.m0(this, i7, 20), this.d);
    }

    @Override
    public final int e() {
        return this.f50477e.size();
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
            ArrayList arrayList = this.f50477e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.x31) arrayList.get(i7)).f40169z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f50477e;
        arrayList.clear();
        vd vdVar = this.f50478f;
        if (!vdVar.f50709n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x31.D(1));
        }
        if (!vdVar.f50710r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x31.D(0));
        }
    }
}
