package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.w51;
public final class u7 extends o81 {
    public final Context f48135a;
    public final int f48136b;
    public final boolean f48137c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f48138f;
    public final ArrayList f48139g = new ArrayList();

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f48135a = context;
        this.f48136b = i10;
        this.f48137c = z10;
        this.d = i11;
        this.e = f6Var;
        this.f48138f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new t7(this.f48135a, this.f48137c, this.f48138f, i10, this.f48136b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f48139g.size();
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
            ArrayList arrayList = this.f48139g;
            if (i10 < arrayList.size()) {
                return ((w51) arrayList.get(i10)).f29961z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f48139g;
        arrayList.clear();
        int i10 = this.f48136b;
        long j3 = this.f48138f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.f48137c);
            arrayList.add(w51.C(0));
            if (y3.O(1)) {
                arrayList.add(w51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(w51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(w51.C(0));
        if (!g10.k(j3).f47785a[1].isEmpty()) {
            arrayList.add(w51.C(1));
        }
        if (!g10.k(j3).f47785a[2].isEmpty()) {
            arrayList.add(w51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
