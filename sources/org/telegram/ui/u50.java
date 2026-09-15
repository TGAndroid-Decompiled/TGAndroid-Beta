package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class u50 implements org.telegram.ui.Components.u5 {
    public final int f37860a;
    public final Object f37861b;

    public u50(Object obj, int i10) {
        this.f37860a = i10;
        this.f37861b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37860a) {
            case 0:
                Iterator it = ((v50) this.f37861b).f38364i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                p61 p61Var = (p61) this.f37861b;
                p61Var.getClass();
                if (!zg.f0.f49023b && p61Var.getParent() != null) {
                    ((View) p61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
