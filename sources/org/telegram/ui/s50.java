package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class s50 implements org.telegram.ui.Components.y5 {
    public final int f41625a;
    public final Object f41626b;

    public s50(Object obj, int i10) {
        this.f41625a = i10;
        this.f41626b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41625a) {
            case 0:
                Iterator it = ((t50) this.f41626b).f41898i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                t61 t61Var = (t61) this.f41626b;
                t61Var.getClass();
                if (!zg.d0.f54546b && t61Var.getParent() != null) {
                    ((View) t61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
