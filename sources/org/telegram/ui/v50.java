package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class v50 implements org.telegram.ui.Components.w5 {
    public final int f41452a;
    public final Object f41453b;

    public v50(Object obj, int i10) {
        this.f41452a = i10;
        this.f41453b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41452a) {
            case 0:
                Iterator it = ((w50) this.f41453b).f41797i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f41453b;
                s61Var.getClass();
                if (!ah.y0.f732b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
