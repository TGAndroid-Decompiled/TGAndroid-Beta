package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.x51;
public final class t7 extends o81 {
    public final Context f48066a;
    public final int f48067b;
    public final boolean f48068c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f48069f;
    public final ArrayList f48070g = new ArrayList();

    public t7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f48066a = context;
        this.f48067b = i10;
        this.f48068c = z10;
        this.d = i11;
        this.e = e6Var;
        this.f48069f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new s7(this.f48066a, this.f48068c, this.f48069f, i10, this.f48067b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f48070g.size();
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
            ArrayList arrayList = this.f48070g;
            if (i10 < arrayList.size()) {
                return ((x51) arrayList.get(i10)).f30261z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f48070g;
        arrayList.clear();
        int i10 = this.f48067b;
        long j3 = this.f48069f;
        if (j3 == 0) {
            t5 y3 = t5.y(i10, this.f48068c);
            arrayList.add(x51.C(0));
            if (y3.O(1)) {
                arrayList.add(x51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(x51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(x51.C(0));
        if (!g10.k(j3).f47741a[1].isEmpty()) {
            arrayList.add(x51.C(1));
        }
        if (!g10.k(j3).f47741a[2].isEmpty()) {
            arrayList.add(x51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
