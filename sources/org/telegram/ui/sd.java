package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.y61 {
    public final Context f51975a;
    public final int f51976b;
    public final int f51977c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final ArrayList f51978e = new ArrayList();
    public final td f51979f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f51979f = tdVar;
        this.f51975a = context;
        this.f51976b = i7;
        this.f51977c = i10;
        this.d = i6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f51979f.f52259b.H(view);
    }

    @Override
    public final View d(int i7) {
        return new rd(this.f51979f, this.f51975a, i7, this.f51976b, this.f51977c, new ai.w0(this, i7, 24), this.d);
    }

    @Override
    public final int e() {
        return this.f51978e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.gd.M0(2131748160, null);
        }
        return org.telegram.messenger.gd.M0(2131748161, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f51978e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.l41) arrayList.get(i7)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f51978e;
        arrayList.clear();
        td tdVar = this.f51979f;
        if (!tdVar.f52263n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.l41.D(1));
        }
        if (!tdVar.f52264r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.l41.D(0));
        }
    }
}
