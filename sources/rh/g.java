package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wk0;
public final class g extends p71 {
    public final h[] f46932a = new h[3];
    public final Context f46933b;
    public final wk0 f46934c;
    public final i d;

    public g(i iVar, Context context, wk0 wk0Var) {
        this.d = iVar;
        this.f46933b = context;
        this.f46934c = wk0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f46934c.L(view);
    }

    @Override
    public final View d(int i10) {
        h[] hVarArr = this.f46932a;
        if (hVarArr[i10] == null) {
            hVarArr[i10] = new h(this.d, this.f46933b, i10);
        }
        return hVarArr[i10];
    }

    @Override
    public final int e() {
        return this.f46932a.length;
    }

    @Override
    public final CharSequence g(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 2131744937;
        } else if (i10 == 2) {
            i11 = 2131744936;
        } else {
            i11 = 2131744938;
        }
        return dd.L0(i11, null);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
