package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
public final class v implements x, org.telegram.ui.ActionBar.r1 {
    public final int f54964a;
    public final Serializable f54965b;
    public final Object f54966c;

    public v(int i7, Serializable serializable, Object obj) {
        this.f54964a = i7;
        this.f54966c = obj;
        this.f54965b = serializable;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vf.c.q((Context) this.f54966c, Uri.parse((String) this.f54965b), true, false);
    }

    @Override
    public void mo26run() {
        switch (this.f54964a) {
            case 0:
                ((y) this.f54966c).a((byte[]) this.f54965b);
                return;
            default:
                ((WidgetEngineBackend) this.f54966c).lambda$send$11((byte[]) this.f54965b);
                return;
        }
    }
}
