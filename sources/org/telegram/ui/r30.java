package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class r30 implements org.telegram.ui.Components.v5 {
    public final int f51470a;
    public final Object f51471b;

    public r30(Object obj, int i7) {
        this.f51470a = i7;
        this.f51471b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f51470a) {
            case 0:
                Iterator it = ((s30) this.f51471b).f51882i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                b11 b11Var = (b11) this.f51471b;
                b11Var.getClass();
                if (!ch.f0.f5346b && b11Var.getParent() != null) {
                    ((View) b11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
