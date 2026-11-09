package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class t implements w, r1 {
    public final int f52979a;
    public final Serializable f52980b;
    public final Object f52981c;

    public t(int i7, Serializable serializable, Object obj) {
        this.f52979a = i7;
        this.f52981c = obj;
        this.f52980b = serializable;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        vf.c.q((Context) this.f52981c, Uri.parse((String) this.f52980b), true, false);
    }

    @Override
    public void run() {
        switch (this.f52979a) {
            case 0:
                ((x) this.f52981c).a((byte[]) this.f52980b);
                return;
            default:
                ((WidgetEngineBackend) this.f52981c).lambda$send$10((byte[]) this.f52980b);
                return;
        }
    }
}
