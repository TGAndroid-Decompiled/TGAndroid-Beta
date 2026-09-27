package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class s50 implements org.telegram.ui.Components.w5 {
    public final int f37306a;
    public final Object f37307b;

    public s50(Object obj, int i10) {
        this.f37306a = i10;
        this.f37307b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37306a) {
            case 0:
                Iterator it = ((t50) this.f37307b).f37655i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                l61 l61Var = (l61) this.f37307b;
                l61Var.getClass();
                if (!zg.f0.f49339b && l61Var.getParent() != null) {
                    ((View) l61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
