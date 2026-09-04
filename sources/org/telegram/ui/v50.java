package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class v50 implements org.telegram.ui.Components.w5 {
    public final int f41424a;
    public final Object f41425b;

    public v50(Object obj, int i10) {
        this.f41424a = i10;
        this.f41425b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41424a) {
            case 0:
                Iterator it = ((w50) this.f41425b).f41769i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f41425b;
                s61Var.getClass();
                if (!ah.y0.f720b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
