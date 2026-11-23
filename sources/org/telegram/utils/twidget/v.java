package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
public final class v implements x, org.telegram.ui.ActionBar.q1 {
    public final int f55090a;
    public final Serializable f55091b;
    public final Object f55092c;

    public v(int i7, Serializable serializable, Object obj) {
        this.f55090a = i7;
        this.f55092c = obj;
        this.f55091b = serializable;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        vf.c.q((Context) this.f55092c, Uri.parse((String) this.f55091b), true, false);
    }

    @Override
    public void mo26run() {
        switch (this.f55090a) {
            case 0:
                ((y) this.f55092c).a((byte[]) this.f55091b);
                return;
            default:
                ((WidgetEngineBackend) this.f55092c).lambda$send$11((byte[]) this.f55091b);
                return;
        }
    }
}
