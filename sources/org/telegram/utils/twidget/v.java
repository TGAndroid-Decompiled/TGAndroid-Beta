package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
public final class v implements x, org.telegram.ui.ActionBar.q1 {
    public final int f55005a;
    public final Serializable f55006b;
    public final Object f55007c;

    public v(int i7, Serializable serializable, Object obj) {
        this.f55005a = i7;
        this.f55007c = obj;
        this.f55006b = serializable;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.c.q((Context) this.f55007c, Uri.parse((String) this.f55006b), true, false);
    }

    @Override
    public void mo26run() {
        switch (this.f55005a) {
            case 0:
                ((y) this.f55007c).a((byte[]) this.f55006b);
                return;
            default:
                ((WidgetEngineBackend) this.f55007c).lambda$send$11((byte[]) this.f55006b);
                return;
        }
    }
}
