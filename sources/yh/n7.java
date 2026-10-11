package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.r61;
public final class n7 extends h91 {
    public final Context f53022a;
    public final int f53023b;
    public final boolean f53024c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f53025e;
    public final long f53026f;
    public final ArrayList f53027g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f53022a = context;
        this.f53023b = i10;
        this.f53024c = z10;
        this.d = i11;
        this.f53025e = d6Var;
        this.f53026f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new m7(this.f53022a, this.f53024c, this.f53026f, i10, this.f53023b, this.d, this.f53025e);
    }

    @Override
    public final int e() {
        return this.f53027g.size();
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
            ArrayList arrayList = this.f53027g;
            if (i10 < arrayList.size()) {
                return ((r61) arrayList.get(i10)).f30374z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f53027g;
        arrayList.clear();
        long j3 = this.f53026f;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f53023b;
        if (i10 == 0) {
            n5 y3 = n5.y(i11, this.f53024c);
            arrayList.add(r61.C(0));
            if (y3.O(1)) {
                arrayList.add(r61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(r61.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i11);
        arrayList.add(r61.C(0));
        if (!g10.k(j3).f52977a[1].isEmpty()) {
            arrayList.add(r61.C(1));
        }
        if (!g10.k(j3).f52977a[2].isEmpty()) {
            arrayList.add(r61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
