package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.y81;
public final class x7 extends y81 {
    public final Context f52241a;
    public final int f52242b;
    public final boolean f52243c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f52244e;
    public final long f52245f;
    public bm0 f52246g;
    public li.p h;
    public final ArrayList f52247i = new ArrayList();

    public x7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f52241a = context;
        this.f52242b = i10;
        this.f52243c = z10;
        this.d = i11;
        this.f52244e = d6Var;
        this.f52245f = j3;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bm0 bm0Var = this.f52246g;
        if (bm0Var != null) {
            bm0Var.L(view);
        }
    }

    @Override
    public final View d(int i10) {
        w7 w7Var = new w7(this.f52241a, this.f52243c, this.f52245f, i10, this.f52242b, this.d, this.f52244e);
        if (this.f52246g != null) {
            w7Var.setClipChildren(false);
            w7Var.setClipToPadding(false);
            e71 e71Var = w7Var.f52203a;
            e71Var.setClipToPadding(false);
            e71Var.s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            e71Var.f26034f3.f32531r = false;
            e71Var.setCaptureSectionsDecoratorAllowed(true);
            e71Var.setOverScrollMode(0);
            li.p pVar = this.h;
            if (pVar != null) {
                pVar.b(e71Var);
            }
        }
        return w7Var;
    }

    @Override
    public final int e() {
        return this.f52247i.size();
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
            ArrayList arrayList = this.f52247i;
            if (i10 < arrayList.size()) {
                return ((h61) arrayList.get(i10)).f27106z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f52247i;
        arrayList.clear();
        int i10 = this.f52242b;
        long j3 = this.f52245f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.f52243c);
            arrayList.add(h61.D(0));
            if (y3.O(1)) {
                arrayList.add(h61.D(1));
            }
            if (y3.O(2)) {
                arrayList.add(h61.D(2));
                return;
            }
            return;
        }
        p g10 = p.g(i10);
        arrayList.add(h61.D(0));
        if (!g10.k(j3).f51719a[1].isEmpty()) {
            arrayList.add(h61.D(1));
        }
        if (!g10.k(j3).f51719a[2].isEmpty()) {
            arrayList.add(h61.D(2));
        }
    }
}
