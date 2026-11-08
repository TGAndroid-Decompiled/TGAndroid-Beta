package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class t implements w, r1 {
    public final int f52964a;
    public final Serializable f52965b;
    public final Object f52966c;

    public t(int i7, Serializable serializable, Object obj) {
        this.f52964a = i7;
        this.f52966c = obj;
        this.f52965b = serializable;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        vf.c.q((Context) this.f52966c, Uri.parse((String) this.f52965b), true, false);
    }

    @Override
    public void run() {
        switch (this.f52964a) {
            case 0:
                ((x) this.f52966c).a((byte[]) this.f52965b);
                return;
            default:
                ((WidgetEngineBackend) this.f52966c).lambda$send$10((byte[]) this.f52965b);
                return;
        }
    }
}
