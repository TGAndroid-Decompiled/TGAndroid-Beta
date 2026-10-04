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
    public final Context f52131a;
    public final int f52132b;
    public final boolean f52133c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f52134e;
    public final long f52135f;
    public bm0 f52136g;
    public li.m h;
    public final ArrayList f52137i = new ArrayList();

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f52131a = context;
        this.f52132b = i10;
        this.f52133c = z10;
        this.d = i11;
        this.f52134e = d6Var;
        this.f52135f = j3;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bm0 bm0Var = this.f52136g;
        if (bm0Var != null) {
            bm0Var.L(view);
        }
    }

    @Override
    public final View d(int i10) {
        u7 u7Var = new u7(this.f52131a, this.f52133c, this.f52135f, i10, this.f52132b, this.d, this.f52134e);
        if (this.f52136g != null) {
            u7Var.setClipChildren(false);
            u7Var.setClipToPadding(false);
            c71 c71Var = u7Var.f52103a;
            c71Var.setClipToPadding(false);
            c71Var.t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            c71Var.f25245f3.f31307r = false;
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
        return this.f52137i.size();
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
            ArrayList arrayList = this.f52137i;
            if (i10 < arrayList.size()) {
                return ((g61) arrayList.get(i10)).f26682z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f52137i;
        arrayList.clear();
        int i10 = this.f52132b;
        long j3 = this.f52135f;
        if (j3 == 0) {
            t5 y3 = t5.y(i10, this.f52133c);
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
        if (!g10.k(j3).f51667a[1].isEmpty()) {
            arrayList.add(g61.C(1));
        }
        if (!g10.k(j3).f51667a[2].isEmpty()) {
            arrayList.add(g61.C(2));
        }
    }
}
