package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class w50 implements org.telegram.ui.Components.u5 {
    public final int f38576a;
    public final Object f38577b;

    public w50(Object obj, int i10) {
        this.f38576a = i10;
        this.f38577b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f38576a) {
            case 0:
                Iterator it = ((x50) this.f38577b).f39388i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                r61 r61Var = (r61) this.f38577b;
                r61Var.getClass();
                if (!zg.f0.f49051b && r61Var.getParent() != null) {
                    ((View) r61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
