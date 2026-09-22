package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.y51;
public final class u7 extends q81 {
    public final Context f48156a;
    public final int f48157b;
    public final boolean f48158c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f48159f;
    public final ArrayList f48160g = new ArrayList();

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f48156a = context;
        this.f48157b = i10;
        this.f48158c = z10;
        this.d = i11;
        this.e = f6Var;
        this.f48159f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new t7(this.f48156a, this.f48158c, this.f48159f, i10, this.f48157b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f48160g.size();
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
            ArrayList arrayList = this.f48160g;
            if (i10 < arrayList.size()) {
                return ((y51) arrayList.get(i10)).f30531z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f48160g;
        arrayList.clear();
        int i10 = this.f48157b;
        long j3 = this.f48159f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.f48158c);
            arrayList.add(y51.C(0));
            if (y3.O(1)) {
                arrayList.add(y51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(y51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(y51.C(0));
        if (!g10.k(j3).f47806a[1].isEmpty()) {
            arrayList.add(y51.C(1));
        }
        if (!g10.k(j3).f47806a[2].isEmpty()) {
            arrayList.add(y51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
