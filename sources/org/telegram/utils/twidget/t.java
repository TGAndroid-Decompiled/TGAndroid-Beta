package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class t implements w, r1 {
    public final int f52978a;
    public final Serializable f52979b;
    public final Object f52980c;

    public t(int i7, Serializable serializable, Object obj) {
        this.f52978a = i7;
        this.f52980c = obj;
        this.f52979b = serializable;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        vf.c.q((Context) this.f52980c, Uri.parse((String) this.f52979b), true, false);
    }

    @Override
    public void run() {
        switch (this.f52978a) {
            case 0:
                ((x) this.f52980c).a((byte[]) this.f52979b);
                return;
            default:
                ((WidgetEngineBackend) this.f52980c).lambda$send$10((byte[]) this.f52979b);
                return;
        }
    }
}
