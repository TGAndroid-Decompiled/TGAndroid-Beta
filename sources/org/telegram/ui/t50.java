package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class t50 implements org.telegram.ui.Components.w5 {
    public final int f40696a;
    public final Object f40697b;

    public t50(Object obj, int i10) {
        this.f40696a = i10;
        this.f40697b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f40696a) {
            case 0:
                Iterator it = ((u50) this.f40697b).f41065i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                l61 l61Var = (l61) this.f40697b;
                l61Var.getClass();
                if (!zg.e0.f53372b && l61Var.getParent() != null) {
                    ((View) l61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
