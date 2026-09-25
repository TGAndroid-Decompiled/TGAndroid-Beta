package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.v51;
public final class u7 extends n81 {
    public final Context f48129a;
    public final int f48130b;
    public final boolean f48131c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f48132f;
    public final ArrayList f48133g = new ArrayList();

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f48129a = context;
        this.f48130b = i10;
        this.f48131c = z10;
        this.d = i11;
        this.e = d6Var;
        this.f48132f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new t7(this.f48129a, this.f48131c, this.f48132f, i10, this.f48130b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f48133g.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return LocaleController.getString(R.string.StarsTransactionsOutgoing);
            }
            return LocaleController.getString(R.string.StarsTransactionsIncoming);
        }
        return LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f48133g;
            if (i10 < arrayList.size()) {
                return ((v51) arrayList.get(i10)).f29062z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f48133g;
        arrayList.clear();
        int i10 = this.f48130b;
        long j3 = this.f48132f;
        if (j3 == 0) {
            s5 y3 = s5.y(i10, this.f48131c);
            arrayList.add(v51.C(0));
            if (y3.O(1)) {
                arrayList.add(v51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(v51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(v51.C(0));
        if (!g10.k(j3).f47753a[1].isEmpty()) {
            arrayList.add(v51.C(1));
        }
        if (!g10.k(j3).f47753a[2].isEmpty()) {
            arrayList.add(v51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
