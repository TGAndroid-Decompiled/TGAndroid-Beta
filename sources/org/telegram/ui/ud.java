package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ud extends org.telegram.ui.Components.m61 {
    public final Context f50320a;
    public final int f50321b;
    public final int f50322c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList f50323e = new ArrayList();
    public final vd f50324f;

    public ud(vd vdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f50324f = vdVar;
        this.f50320a = context;
        this.f50321b = i7;
        this.f50322c = i10;
        this.d = f6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f50324f.f50644b.L(view);
    }

    @Override
    public final View d(int i7) {
        return new td(this.f50324f, this.f50320a, i7, this.f50321b, this.f50322c, new bg.m0(this, i7, 20), this.d);
    }

    @Override
    public final int e() {
        return this.f50323e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.id.M0(2131748353, null);
        }
        return org.telegram.messenger.id.M0(2131748354, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f50323e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.x31) arrayList.get(i7)).f40193z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f50323e;
        arrayList.clear();
        vd vdVar = this.f50324f;
        if (!vdVar.f50648n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x31.D(1));
        }
        if (!vdVar.f50649r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x31.D(0));
        }
    }
}
