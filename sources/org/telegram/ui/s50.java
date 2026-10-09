package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class s50 implements org.telegram.ui.Components.y5 {
    public final int f41581a;
    public final Object f41582b;

    public s50(Object obj, int i10) {
        this.f41581a = i10;
        this.f41582b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41581a) {
            case 0:
                Iterator it = ((t50) this.f41582b).f41854i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                t61 t61Var = (t61) this.f41582b;
                t61Var.getClass();
                if (!zg.d0.f54502b && t61Var.getParent() != null) {
                    ((View) t61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
