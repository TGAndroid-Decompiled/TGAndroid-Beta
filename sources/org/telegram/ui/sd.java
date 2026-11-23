package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.b71 {
    public final Context f51993a;
    public final int f51994b;
    public final int f51995c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final ArrayList f51996e = new ArrayList();
    public final td f51997f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f51997f = tdVar;
        this.f51993a = context;
        this.f51994b = i7;
        this.f51995c = i10;
        this.d = h6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f51997f.f52253b.H(view);
    }

    @Override
    public final View d(int i7) {
        return new rd(this.f51997f, this.f51993a, i7, this.f51994b, this.f51995c, new ai.t0(this, i7, 26), this.d);
    }

    @Override
    public final int e() {
        return this.f51996e.size();
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
            ArrayList arrayList = this.f51996e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.o41) arrayList.get(i7)).A;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f51996e;
        arrayList.clear();
        td tdVar = this.f51997f;
        if (!tdVar.f52257n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.o41.D(1));
        }
        if (!tdVar.f52258r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.o41.D(0));
        }
    }
}
