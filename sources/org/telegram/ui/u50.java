package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class u50 implements org.telegram.ui.Components.w5 {
    public final int f37883a;
    public final Object f37884b;

    public u50(Object obj, int i10) {
        this.f37883a = i10;
        this.f37884b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37883a) {
            case 0:
                Iterator it = ((v50) this.f37884b).f38305i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                p61 p61Var = (p61) this.f37884b;
                p61Var.getClass();
                if (!zg.e0.f49272b && p61Var.getParent() != null) {
                    ((View) p61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
