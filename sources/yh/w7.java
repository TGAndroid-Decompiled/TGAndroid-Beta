package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.j51;
public final class w7 extends b81 {
    public final Context f47974a;
    public final int f47975b;
    public final boolean f47976c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f47977f;
    public final ArrayList f47978g = new ArrayList();

    public w7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f47974a = context;
        this.f47975b = i10;
        this.f47976c = z10;
        this.d = i11;
        this.e = f6Var;
        this.f47977f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new v7(this.f47974a, this.f47976c, this.f47977f, i10, this.f47975b, this.d, this.e);
    }

    @Override
    public final int e() {
        return this.f47978g.size();
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
            ArrayList arrayList = this.f47978g;
            if (i10 < arrayList.size()) {
                return ((j51) arrayList.get(i10)).f25140z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f47978g;
        arrayList.clear();
        int i10 = this.f47975b;
        long j3 = this.f47977f;
        if (j3 == 0) {
            v5 y3 = v5.y(i10, this.f47976c);
            arrayList.add(j51.C(0));
            if (y3.O(1)) {
                arrayList.add(j51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(j51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(j51.C(0));
        if (!g10.k(j3).f47505a[1].isEmpty()) {
            arrayList.add(j51.C(1));
        }
        if (!g10.k(j3).f47505a[2].isEmpty()) {
            arrayList.add(j51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
