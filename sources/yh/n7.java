package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.q61;
public final class n7 extends g91 {
    public final Context f53056a;
    public final int f53057b;
    public final boolean f53058c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f53059e;
    public final long f53060f;
    public final ArrayList f53061g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f53056a = context;
        this.f53057b = i10;
        this.f53058c = z10;
        this.d = i11;
        this.f53059e = d6Var;
        this.f53060f = j3;
        i();
    }

    @Override
    public final View d(int i10) {
        return new m7(this.f53056a, this.f53058c, this.f53060f, i10, this.f53057b, this.d, this.f53059e);
    }

    @Override
    public final int e() {
        return this.f53061g.size();
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
            ArrayList arrayList = this.f53061g;
            if (i10 < arrayList.size()) {
                return ((q61) arrayList.get(i10)).f30180z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f53061g;
        arrayList.clear();
        long j3 = this.f53060f;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f53057b;
        if (i10 == 0) {
            n5 y3 = n5.y(i11, this.f53058c);
            arrayList.add(q61.C(0));
            if (y3.O(1)) {
                arrayList.add(q61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(q61.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i11);
        arrayList.add(q61.C(0));
        if (!g10.k(j3).f53011a[1].isEmpty()) {
            arrayList.add(q61.C(1));
        }
        if (!g10.k(j3).f53011a[2].isEmpty()) {
            arrayList.add(q61.C(2));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
