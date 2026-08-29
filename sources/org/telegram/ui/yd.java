package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yd extends org.telegram.ui.Components.q71 {
    public final Context f44840a;
    public final int f44841b;
    public final int f44842c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ArrayList f44843e = new ArrayList();
    public final zd f44844f;

    public yd(zd zdVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f44844f = zdVar;
        this.f44840a = context;
        this.f44841b = i10;
        this.f44842c = i11;
        this.d = c6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new xd(this.f44844f, this.f44840a, i10, this.f44841b, this.f44842c, new bg.f(this, i10, 19), this.d);
    }

    @Override
    public final int e() {
        return this.f44843e.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return LocaleController.getString(R.string.MonetizationTransactionsTON);
        }
        return LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f44843e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.w41) arrayList.get(i10)).f34313z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f44843e;
        arrayList.clear();
        zd zdVar = this.f44844f;
        if (!zdVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.w41.C(1));
        }
        if (!zdVar.f45143n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.w41.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
