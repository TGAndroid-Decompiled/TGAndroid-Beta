package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.h51;
public final class t7 extends a81 {
    public final Context f52698a;
    public final int f52699b;
    public final boolean f52700c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f52701e;
    public final long f52702f;
    public final ArrayList f52703g = new ArrayList();

    public t7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f52698a = context;
        this.f52699b = i10;
        this.f52700c = z10;
        this.d = i11;
        this.f52701e = f6Var;
        this.f52702f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new s7(this.f52698a, this.f52700c, this.f52702f, i10, this.f52699b, this.d, this.f52701e);
    }

    @Override
    public final int e() {
        return this.f52703g.size();
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
            ArrayList arrayList = this.f52703g;
            if (i10 < arrayList.size()) {
                return ((h51) arrayList.get(i10)).f26634z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f52703g;
        arrayList.clear();
        int i10 = this.f52699b;
        long j3 = this.f52702f;
        if (j3 == 0) {
            s5 y3 = s5.y(i10, this.f52700c);
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
        if (!g10.k(j3).f52316a[1].isEmpty()) {
            arrayList.add(h51.C(1));
        }
        if (!g10.k(j3).f52316a[2].isEmpty()) {
            arrayList.add(h51.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
