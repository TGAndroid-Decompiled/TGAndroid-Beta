package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.vk0;
public final class g extends o71 {
    public final h[] f46918a = new h[3];
    public final Context f46919b;
    public final vk0 f46920c;
    public final i d;

    public g(i iVar, Context context, vk0 vk0Var) {
        this.d = iVar;
        this.f46919b = context;
        this.f46920c = vk0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f46920c.L(view);
    }

    @Override
    public final View d(int i10) {
        h[] hVarArr = this.f46918a;
        if (hVarArr[i10] == null) {
            hVarArr[i10] = new h(this.d, this.f46919b, i10);
        }
        return hVarArr[i10];
    }

    @Override
    public final int e() {
        return this.f46918a.length;
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
        return cd.L0(i11, null);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }
}
