package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class s50 implements org.telegram.ui.Components.y5 {
    public final int f41579a;
    public final Object f41580b;

    public s50(Object obj, int i10) {
        this.f41579a = i10;
        this.f41580b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41579a) {
            case 0:
                Iterator it = ((t50) this.f41580b).f41852i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                t61 t61Var = (t61) this.f41580b;
                t61Var.getClass();
                if (!zg.d0.f54500b && t61Var.getParent() != null) {
                    ((View) t61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
