package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.l61;
public final class n7 extends c91 {
    public final Context f50888a;
    public final int f50889b;
    public final boolean f50890c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f50891f;
    public final ArrayList f50892g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f50888a = context;
        this.f50889b = i10;
        this.f50890c = z10;
        this.d = i11;
        this.e = c6Var;
        this.f50891f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new m7(this.f50888a, this.f50890c, this.f50891f, i10, this.f50889b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f50892g.size();
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
            ArrayList arrayList = this.f50892g;
            if (i10 < arrayList.size()) {
                return ((l61) arrayList.get(i10)).f26967z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f50892g;
        arrayList.clear();
        long j10 = this.f50891f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f50889b;
        if (i10 == 0) {
            n5 y3 = n5.y(i11, this.f50890c);
            arrayList.add(l61.C(0));
            if (y3.O(1)) {
                arrayList.add(l61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(l61.C(2));
                return;
            }
            return;
        }
        p g10 = p.g(i11);
        arrayList.add(l61.C(0));
        if (!g10.k(j10).f50893a[1].isEmpty()) {
            arrayList.add(l61.C(1));
        }
        if (!g10.k(j10).f50893a[2].isEmpty()) {
            arrayList.add(l61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
