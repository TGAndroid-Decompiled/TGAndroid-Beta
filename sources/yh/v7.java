package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.x81;
public final class v7 extends x81 {
    public final Context f52130a;
    public final int f52131b;
    public final boolean f52132c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f52133e;
    public final long f52134f;
    public bm0 f52135g;
    public li.m h;
    public final ArrayList f52136i = new ArrayList();

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f52130a = context;
        this.f52131b = i10;
        this.f52132c = z10;
        this.d = i11;
        this.f52133e = d6Var;
        this.f52134f = j3;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bm0 bm0Var = this.f52135g;
        if (bm0Var != null) {
            bm0Var.L(view);
        }
    }

    @Override
    public final View d(int i10) {
        u7 u7Var = new u7(this.f52130a, this.f52132c, this.f52134f, i10, this.f52131b, this.d, this.f52133e);
        if (this.f52135g != null) {
            u7Var.setClipChildren(false);
            u7Var.setClipToPadding(false);
            c71 c71Var = u7Var.f52102a;
            c71Var.setClipToPadding(false);
            c71Var.t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            c71Var.f25244f3.f31306r = false;
            c71Var.setCaptureSectionsDecoratorAllowed(true);
            c71Var.setOverScrollMode(0);
            li.m mVar = this.h;
            if (mVar != null) {
                mVar.b(c71Var);
            }
        }
        return u7Var;
    }

    @Override
    public final int e() {
        return this.f52136i.size();
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
            ArrayList arrayList = this.f52136i;
            if (i10 < arrayList.size()) {
                return ((g61) arrayList.get(i10)).f26681z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f52136i;
        arrayList.clear();
        int i10 = this.f52131b;
        long j3 = this.f52134f;
        if (j3 == 0) {
            t5 y3 = t5.y(i10, this.f52132c);
            arrayList.add(g61.C(0));
            if (y3.O(1)) {
                arrayList.add(g61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(g61.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(g61.C(0));
        if (!g10.k(j3).f51666a[1].isEmpty()) {
            arrayList.add(g61.C(1));
        }
        if (!g10.k(j3).f51666a[2].isEmpty()) {
            arrayList.add(g61.C(2));
        }
    }
}
