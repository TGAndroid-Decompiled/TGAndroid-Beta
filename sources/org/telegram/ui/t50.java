package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class t50 implements org.telegram.ui.Components.w5 {
    public final int f40713a;
    public final Object f40714b;

    public t50(Object obj, int i10) {
        this.f40713a = i10;
        this.f40714b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f40713a) {
            case 0:
                Iterator it = ((u50) this.f40714b).f41113i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                j61 j61Var = (j61) this.f40714b;
                j61Var.getClass();
                if (!zg.c0.f53348b && j61Var.getParent() != null) {
                    ((View) j61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
