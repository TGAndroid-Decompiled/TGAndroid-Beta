package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
public final class v implements x, org.telegram.ui.ActionBar.q1 {
    public final int f54974a;
    public final Serializable f54975b;
    public final Object f54976c;

    public v(int i7, Serializable serializable, Object obj) {
        this.f54974a = i7;
        this.f54976c = obj;
        this.f54975b = serializable;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.c.q((Context) this.f54976c, Uri.parse((String) this.f54975b), true, false);
    }

    @Override
    public void mo26run() {
        switch (this.f54974a) {
            case 0:
                ((y) this.f54976c).a((byte[]) this.f54975b);
                return;
            default:
                ((WidgetEngineBackend) this.f54976c).lambda$send$11((byte[]) this.f54975b);
                return;
        }
    }
}
