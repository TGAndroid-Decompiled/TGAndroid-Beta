package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.z71;
public final class u7 extends z71 {
    public final Context f47784a;
    public final int f47785b;
    public final boolean f47786c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f47787f;
    public final ArrayList f47788g = new ArrayList();

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f47784a = context;
        this.f47785b = i10;
        this.f47786c = z10;
        this.d = i11;
        this.e = d6Var;
        this.f47787f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new t7(this.f47784a, this.f47786c, this.f47787f, i10, this.f47785b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f47788g.size();
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
            ArrayList arrayList = this.f47788g;
            if (i10 < arrayList.size()) {
                return ((h51) arrayList.get(i10)).f24520z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f47788g;
        arrayList.clear();
        int i10 = this.f47785b;
        long j3 = this.f47787f;
        if (j3 == 0) {
            t5 y3 = t5.y(i10, this.f47786c);
            arrayList.add(h51.C(0));
            if (y3.O(1)) {
                arrayList.add(h51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(h51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(h51.C(0));
        if (!g10.k(j3).f47433a[1].isEmpty()) {
            arrayList.add(h51.C(1));
        }
        if (!g10.k(j3).f47433a[2].isEmpty()) {
            arrayList.add(h51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
