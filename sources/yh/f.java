package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.y81;
public final class f extends y81 {
    public final g[] f51271a = new g[3];
    public final Context f51272b;
    public final bm0 f51273c;
    public final h d;

    public f(h hVar, Context context, bm0 bm0Var) {
        this.d = hVar;
        this.f51272b = context;
        this.f51273c = bm0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f51273c.L(view);
    }

    @Override
    public final View d(int i10) {
        g[] gVarArr = this.f51271a;
        if (gVarArr[i10] == null) {
            gVarArr[i10] = new g(this.d, this.f51272b, i10);
        }
        return gVarArr[i10];
    }

    @Override
    public final int e() {
        return this.f51271a.length;
    }

    @Override
    public final CharSequence g(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = R.string.StarsTransactionsIncoming;
        } else if (i10 == 2) {
            i11 = R.string.StarsTransactionsOutgoing;
        } else {
            i11 = R.string.StarsTransactionsAll;
        }
        return LocaleController.getString(i11);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
