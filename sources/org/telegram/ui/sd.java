package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class sd extends org.telegram.ui.Components.f61 {
    public final Context f49476a;
    public final int f49477b;
    public final int f49478c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList f49479e = new ArrayList();
    public final td f49480f;

    public sd(td tdVar, Context context, int i3, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f49480f = tdVar;
        this.f49476a = context;
        this.f49477b = i3;
        this.f49478c = i10;
        this.d = e6Var;
        i();
    }

    @Override
    public final void b(View view, int i3, int i10) {
        this.f49480f.f49776b.L(view);
    }

    @Override
    public final View d(int i3) {
        return new rd(this.f49480f, this.f49476a, i3, this.f49477b, this.f49478c, new cg.l0(this, i3, 20), this.d);
    }

    @Override
    public final int e() {
        return this.f49479e.size();
    }

    @Override
    public final CharSequence g(int i3) {
        int h = h(i3);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return org.telegram.messenger.bd.M0(2131748360, null);
        }
        return org.telegram.messenger.bd.M0(2131748361, null);
    }

    @Override
    public final int h(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f49479e;
            if (i3 < arrayList.size()) {
                return ((org.telegram.ui.Components.r31) arrayList.get(i3)).f37640z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f49479e;
        arrayList.clear();
        td tdVar = this.f49480f;
        if (!tdVar.f49780n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r31.D(1));
        }
        if (!tdVar.f49781r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r31.D(0));
        }
    }
}
