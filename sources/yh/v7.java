package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.i51;
public final class v7 extends a81 {
    public final Context f47852a;
    public final int f47853b;
    public final boolean f47854c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f47855f;
    public final ArrayList f47856g = new ArrayList();

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f47852a = context;
        this.f47853b = i10;
        this.f47854c = z10;
        this.d = i11;
        this.e = e6Var;
        this.f47855f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new u7(this.f47852a, this.f47854c, this.f47855f, i10, this.f47853b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f47856g.size();
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
            ArrayList arrayList = this.f47856g;
            if (i10 < arrayList.size()) {
                return ((i51) arrayList.get(i10)).f24913z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f47856g;
        arrayList.clear();
        int i10 = this.f47853b;
        long j3 = this.f47855f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.f47854c);
            arrayList.add(i51.C(0));
            if (y3.O(1)) {
                arrayList.add(i51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(i51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(i51.C(0));
        if (!g10.k(j3).f47447a[1].isEmpty()) {
            arrayList.add(i51.C(1));
        }
        if (!g10.k(j3).f47447a[2].isEmpty()) {
            arrayList.add(i51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
