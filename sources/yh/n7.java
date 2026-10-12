package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.u61;
public final class n7 extends l91 {
    public final Context f53159a;
    public final int f53160b;
    public final boolean f53161c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 f53162e;
    public final long f53163f;
    public final ArrayList f53164g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f53159a = context;
        this.f53160b = i10;
        this.f53161c = z10;
        this.d = i11;
        this.f53162e = c6Var;
        this.f53163f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new m7(this.f53159a, this.f53161c, this.f53163f, i10, this.f53160b, this.d, this.f53162e);
    }

    @Override
    public final int e() {
        return this.f53164g.size();
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
            ArrayList arrayList = this.f53164g;
            if (i10 < arrayList.size()) {
                return ((u61) arrayList.get(i10)).f31089z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f53164g;
        arrayList.clear();
        long j3 = this.f53163f;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f53160b;
        if (i10 == 0) {
            n5 y3 = n5.y(i11, this.f53161c);
            arrayList.add(u61.C(0));
            if (y3.O(1)) {
                arrayList.add(u61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(u61.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i11);
        arrayList.add(u61.C(0));
        if (!g10.k(j3).f53114a[1].isEmpty()) {
            arrayList.add(u61.C(1));
        }
        if (!g10.k(j3).f53114a[2].isEmpty()) {
            arrayList.add(u61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
