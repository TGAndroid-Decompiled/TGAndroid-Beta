package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.v51;
public final class x7 extends n81 {
    public final Context f46314a;
    public final int f46315b;
    public final boolean f46316c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f46317f;
    public final ArrayList f46318g = new ArrayList();

    public x7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f46314a = context;
        this.f46315b = i10;
        this.f46316c = z10;
        this.d = i11;
        this.e = f6Var;
        this.f46317f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new w7(this.f46314a, this.f46316c, this.f46317f, i10, this.f46315b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f46318g.size();
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
            ArrayList arrayList = this.f46318g;
            if (i10 < arrayList.size()) {
                return ((v51) arrayList.get(i10)).f27842z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f46318g;
        arrayList.clear();
        int i10 = this.f46315b;
        long j3 = this.f46317f;
        if (j3 == 0) {
            v5 y3 = v5.y(i10, this.f46316c);
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
        p g10 = p.g(i10);
        arrayList.add(v51.C(0));
        if (!g10.k(j3).f45783a[1].isEmpty()) {
            arrayList.add(v51.C(1));
        }
        if (!g10.k(j3).f45783a[2].isEmpty()) {
            arrayList.add(v51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
