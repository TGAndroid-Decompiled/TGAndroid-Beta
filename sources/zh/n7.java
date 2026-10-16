package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.m61;
public final class n7 extends d91 {
    public final Context f50889a;
    public final int f50890b;
    public final boolean f50891c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f50892f;
    public final ArrayList f50893g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f50889a = context;
        this.f50890b = i10;
        this.f50891c = z10;
        this.d = i11;
        this.e = c6Var;
        this.f50892f = j10;
        i();
    }

    @Override
    public final View d(int i10) {
        return new m7(this.f50889a, this.f50891c, this.f50892f, i10, this.f50890b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f50893g.size();
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
            ArrayList arrayList = this.f50893g;
            if (i10 < arrayList.size()) {
                return ((m61) arrayList.get(i10)).f26959z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f50893g;
        arrayList.clear();
        long j10 = this.f50892f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f50890b;
        if (i10 == 0) {
            n5 y3 = n5.y(i11, this.f50891c);
            arrayList.add(m61.C(0));
            if (y3.O(1)) {
                arrayList.add(m61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(m61.C(2));
                return;
            }
            return;
        }
        p g10 = p.g(i11);
        arrayList.add(m61.C(0));
        if (!g10.k(j10).f50894a[1].isEmpty()) {
            arrayList.add(m61.C(1));
        }
        if (!g10.k(j10).f50894a[2].isEmpty()) {
            arrayList.add(m61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
