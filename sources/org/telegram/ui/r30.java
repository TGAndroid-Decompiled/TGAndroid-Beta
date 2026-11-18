package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class r30 implements org.telegram.ui.Components.u5 {
    public final int f51446a;
    public final Object f51447b;

    public r30(Object obj, int i7) {
        this.f51446a = i7;
        this.f51447b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f51446a) {
            case 0:
                Iterator it = ((s30) this.f51447b).f51869i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                b11 b11Var = (b11) this.f51447b;
                b11Var.getClass();
                if (!ch.f0.f5351b && b11Var.getParent() != null) {
                    ((View) b11Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
