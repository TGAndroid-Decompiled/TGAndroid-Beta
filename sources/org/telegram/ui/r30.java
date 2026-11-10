package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class r30 implements org.telegram.ui.Components.n5 {
    public final int f49221a;
    public final Object f49222b;

    public r30(Object obj, int i7) {
        this.f49221a = i7;
        this.f49222b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f49221a) {
            case 0:
                Iterator it = ((s30) this.f49222b).f49649i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                d11 d11Var = (d11) this.f49222b;
                d11Var.getClass();
                if (!ch.e0.f6235b && d11Var.getParent() != null) {
                    ((View) d11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
