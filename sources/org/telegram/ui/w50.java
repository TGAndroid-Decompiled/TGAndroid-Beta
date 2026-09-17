package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class w50 implements org.telegram.ui.Components.u5 {
    public final int f38571a;
    public final Object f38572b;

    public w50(Object obj, int i10) {
        this.f38571a = i10;
        this.f38572b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f38571a) {
            case 0:
                Iterator it = ((x50) this.f38572b).f39383i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                r61 r61Var = (r61) this.f38572b;
                r61Var.getClass();
                if (!zg.f0.f49046b && r61Var.getParent() != null) {
                    ((View) r61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
