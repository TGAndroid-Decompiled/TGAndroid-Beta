package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class t implements w, r1 {
    public final int f52965a;
    public final Serializable f52966b;
    public final Object f52967c;

    public t(int i7, Serializable serializable, Object obj) {
        this.f52965a = i7;
        this.f52967c = obj;
        this.f52966b = serializable;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        vf.c.q((Context) this.f52967c, Uri.parse((String) this.f52966b), true, false);
    }

    @Override
    public void run() {
        switch (this.f52965a) {
            case 0:
                ((x) this.f52967c).a((byte[]) this.f52966b);
                return;
            default:
                ((WidgetEngineBackend) this.f52967c).lambda$send$10((byte[]) this.f52966b);
                return;
        }
    }
}
