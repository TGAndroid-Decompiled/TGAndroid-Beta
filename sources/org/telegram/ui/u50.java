package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class u50 implements org.telegram.ui.Components.u5 {
    public final int f37810a;
    public final Object f37811b;

    public u50(Object obj, int i10) {
        this.f37810a = i10;
        this.f37811b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37810a) {
            case 0:
                Iterator it = ((v50) this.f37811b).f38377i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                q61 q61Var = (q61) this.f37811b;
                q61Var.getClass();
                if (!zg.f0.f49016b && q61Var.getParent() != null) {
                    ((View) q61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
