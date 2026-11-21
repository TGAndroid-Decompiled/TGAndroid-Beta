package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class r30 implements org.telegram.ui.Components.v5 {
    public final int f51435a;
    public final Object f51436b;

    public r30(Object obj, int i7) {
        this.f51435a = i7;
        this.f51436b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f51435a) {
            case 0:
                Iterator it = ((s30) this.f51436b).f51909i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                c11 c11Var = (c11) this.f51436b;
                c11Var.getClass();
                if (!ch.f0.f5380b && c11Var.getParent() != null) {
                    ((View) c11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
