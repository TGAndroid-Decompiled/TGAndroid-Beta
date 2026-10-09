package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.p61;
public final class n7 extends f91 {
    public final Context f52937a;
    public final int f52938b;
    public final boolean f52939c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f52940e;
    public final long f52941f;
    public final ArrayList f52942g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f52937a = context;
        this.f52938b = i10;
        this.f52939c = z10;
        this.d = i11;
        this.f52940e = e6Var;
        this.f52941f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new m7(this.f52937a, this.f52939c, this.f52941f, i10, this.f52938b, this.d, this.f52940e);
    }

    @Override
    public final int e() {
        return this.f52942g.size();
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
            ArrayList arrayList = this.f52942g;
            if (i10 < arrayList.size()) {
                return ((p61) arrayList.get(i10)).f29747z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f52942g;
        arrayList.clear();
        long j3 = this.f52941f;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f52938b;
        if (i10 == 0) {
            m5 y3 = m5.y(i11, this.f52939c);
            arrayList.add(p61.C(0));
            if (y3.O(1)) {
                arrayList.add(p61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(p61.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i11);
        arrayList.add(p61.C(0));
        if (!g10.k(j3).f52910a[1].isEmpty()) {
            arrayList.add(p61.C(1));
        }
        if (!g10.k(j3).f52910a[2].isEmpty()) {
            arrayList.add(p61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
