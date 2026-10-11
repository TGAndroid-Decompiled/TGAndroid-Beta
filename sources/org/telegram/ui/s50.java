package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class s50 implements org.telegram.ui.Components.y5 {
    public final int f41587a;
    public final Object f41588b;

    public s50(Object obj, int i10) {
        this.f41587a = i10;
        this.f41588b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41587a) {
            case 0:
                Iterator it = ((t50) this.f41588b).f42073i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f41588b;
                s61Var.getClass();
                if (!zg.d0.f54589b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
