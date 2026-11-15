package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.n61 {
    public final Context f51201a;
    public final int f51202b;
    public final int f51203c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList f51204e = new ArrayList();
    public final td f51205f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f51205f = tdVar;
        this.f51201a = context;
        this.f51202b = i7;
        this.f51203c = i10;
        this.d = e6Var;
        i();
    }

    @Override
    public final void b(View view, int i7, int i10) {
        this.f51205f.f51555b.J(view);
    }

    @Override
    public final View d(int i7) {
        return new rd(this.f51205f, this.f51201a, i7, this.f51202b, this.f51203c, new ai.v0(this, i7, 21), this.d);
    }

    @Override
    public final int e() {
        return this.f51204e.size();
    }

    @Override
    public final CharSequence g(int i7) {
        int h = h(i7);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.hd.M0(2131748352, null);
        }
        return org.telegram.messenger.hd.M0(2131748353, null);
    }

    @Override
    public final int h(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f51204e;
            if (i7 < arrayList.size()) {
                return ((org.telegram.ui.Components.b41) arrayList.get(i7)).f33194z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f51204e;
        arrayList.clear();
        td tdVar = this.f51205f;
        if (!tdVar.f51559n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.b41.D(1));
        }
        if (!tdVar.f51560r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.b41.D(0));
        }
    }
}
