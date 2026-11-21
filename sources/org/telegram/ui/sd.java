package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.b71 {
    public final Context f52020a;
    public final int f52021b;
    public final int f52022c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final ArrayList f52023e = new ArrayList();
    public final td f52024f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f52024f = tdVar;
        this.f52020a = context;
        this.f52021b = i7;
        this.f52022c = i10;
        this.d = h6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f52024f.f52303b.H(view);
    }

    @Override
    public final View d(int i7) {
        return new rd(this.f52024f, this.f52020a, i7, this.f52021b, this.f52022c, new ai.y0(this, i7, 24), this.d);
    }

    @Override
    public final int e() {
        return this.f52023e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.gd.N0(2131748159, null);
        }
        return org.telegram.messenger.gd.N0(2131748160, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f52023e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.o41) arrayList.get(i7)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f52023e;
        arrayList.clear();
        td tdVar = this.f52024f;
        if (!tdVar.f52307n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.o41.D(1));
        }
        if (!tdVar.f52308r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.o41.D(0));
        }
    }
}
