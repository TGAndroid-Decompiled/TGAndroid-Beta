package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
public final class v implements x, org.telegram.ui.ActionBar.q1 {
    public final int f55009a;
    public final Serializable f55010b;
    public final Object f55011c;

    public v(int i7, Serializable serializable, Object obj) {
        this.f55009a = i7;
        this.f55011c = obj;
        this.f55010b = serializable;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.c.q((Context) this.f55011c, Uri.parse((String) this.f55010b), true, false);
    }

    @Override
    public void mo26run() {
        switch (this.f55009a) {
            case 0:
                ((y) this.f55011c).a((byte[]) this.f55010b);
                return;
            default:
                ((WidgetEngineBackend) this.f55011c).lambda$send$11((byte[]) this.f55010b);
                return;
        }
    }
}
