package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class s50 implements org.telegram.ui.Components.y5 {
    public final int f41621a;
    public final Object f41622b;

    public s50(Object obj, int i10) {
        this.f41621a = i10;
        this.f41622b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f41621a) {
            case 0:
                Iterator it = ((t50) this.f41622b).f42107i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f41622b;
                s61Var.getClass();
                if (!zg.d0.f54623b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
