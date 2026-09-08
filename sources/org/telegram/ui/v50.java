package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class v50 implements org.telegram.ui.Components.w5 {
    public final int f41451a;
    public final Object f41452b;

    public v50(Object obj, int i10) {
        this.f41451a = i10;
        this.f41452b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41451a) {
            case 0:
                Iterator it = ((w50) this.f41452b).f41796i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f41452b;
                s61Var.getClass();
                if (!ah.y0.f732b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
