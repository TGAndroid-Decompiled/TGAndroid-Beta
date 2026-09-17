package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class v50 implements org.telegram.ui.Components.w5 {
    public final int f41425a;
    public final Object f41426b;

    public v50(Object obj, int i10) {
        this.f41425a = i10;
        this.f41426b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41425a) {
            case 0:
                Iterator it = ((w50) this.f41426b).f41770i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f41426b;
                s61Var.getClass();
                if (!ah.y0.f720b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
