package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ud extends org.telegram.ui.Components.l61 {
    public final Context f50398a;
    public final int f50399b;
    public final int f50400c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList f50401e = new ArrayList();
    public final vd f50402f;

    public ud(vd vdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f50402f = vdVar;
        this.f50398a = context;
        this.f50399b = i7;
        this.f50400c = i10;
        this.d = f6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f50402f.f50701b.L(view);
    }

    @Override
    public final View d(int i7) {
        return new td(this.f50402f, this.f50398a, i7, this.f50399b, this.f50400c, new bg.m0(this, i7, 20), this.d);
    }

    @Override
    public final int e() {
        return this.f50401e.size();
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
            ArrayList arrayList = this.f50401e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.w31) arrayList.get(i7)).f39843z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f50401e;
        arrayList.clear();
        vd vdVar = this.f50402f;
        if (!vdVar.f50705n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.w31.D(1));
        }
        if (!vdVar.f50706r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.w31.D(0));
        }
    }
}
