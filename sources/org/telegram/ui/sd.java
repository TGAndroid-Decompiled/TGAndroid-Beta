package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.b71 {
    public final Context f52024a;
    public final int f52025b;
    public final int f52026c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final ArrayList f52027e = new ArrayList();
    public final td f52028f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f52028f = tdVar;
        this.f52024a = context;
        this.f52025b = i7;
        this.f52026c = i10;
        this.d = h6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f52028f.f52307b.H(view);
    }

    @Override
    public final View d(int i7) {
        return new rd(this.f52028f, this.f52024a, i7, this.f52025b, this.f52026c, new ai.c1(this, i7, 24), this.d);
    }

    @Override
    public final int e() {
        return this.f52027e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.hd.N0(2131748159, null);
        }
        return org.telegram.messenger.hd.N0(2131748160, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f52027e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.o41) arrayList.get(i7)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f52027e;
        arrayList.clear();
        td tdVar = this.f52028f;
        if (!tdVar.f52311n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.o41.D(1));
        }
        if (!tdVar.f52312r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.o41.D(0));
        }
    }
}
