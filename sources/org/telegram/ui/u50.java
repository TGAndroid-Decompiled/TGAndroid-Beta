package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class u50 implements org.telegram.ui.Components.y5 {
    public final int f42366a;
    public final Object f42367b;

    public u50(Object obj, int i10) {
        this.f42366a = i10;
        this.f42367b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f42366a) {
            case 0:
                Iterator it = ((v50) this.f42367b).f42679i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                w61 w61Var = (w61) this.f42367b;
                w61Var.getClass();
                if (!zg.d0.f54726b && w61Var.getParent() != null) {
                    ((View) w61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
