package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class r30 implements org.telegram.ui.Components.v5 {
    public final int f51439a;
    public final Object f51440b;

    public r30(Object obj, int i7) {
        this.f51439a = i7;
        this.f51440b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f51439a) {
            case 0:
                Iterator it = ((s30) this.f51440b).f51913i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                c11 c11Var = (c11) this.f51440b;
                c11Var.getClass();
                if (!ch.f0.f5383b && c11Var.getParent() != null) {
                    ((View) c11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
