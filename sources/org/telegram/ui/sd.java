package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.c71 {
    public final Context f52063a;
    public final int f52064b;
    public final int f52065c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final ArrayList f52066e = new ArrayList();
    public final td f52067f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f52067f = tdVar;
        this.f52063a = context;
        this.f52064b = i7;
        this.f52065c = i10;
        this.d = i6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f52067f.f52363b.J(view);
    }

    @Override
    public final View d(int i7) {
        return new rd(this.f52067f, this.f52063a, i7, this.f52064b, this.f52065c, new ai.u0(this, i7, 26), this.d);
    }

    @Override
    public final int e() {
        return this.f52066e.size();
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
            ArrayList arrayList = this.f52066e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.n41) arrayList.get(i7)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f52066e;
        arrayList.clear();
        td tdVar = this.f52067f;
        if (!tdVar.f52367n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.n41.D(1));
        }
        if (!tdVar.f52368r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.n41.D(0));
        }
    }
}
