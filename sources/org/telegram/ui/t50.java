package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class t50 implements org.telegram.ui.Components.w5 {
    public final int f40690a;
    public final Object f40691b;

    public t50(Object obj, int i10) {
        this.f40690a = i10;
        this.f40691b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f40690a) {
            case 0:
                Iterator it = ((u50) this.f40691b).f41059i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                l61 l61Var = (l61) this.f40691b;
                l61Var.getClass();
                if (!zg.e0.f53367b && l61Var.getParent() != null) {
                    ((View) l61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
