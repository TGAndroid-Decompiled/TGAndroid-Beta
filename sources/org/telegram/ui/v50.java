package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class v50 implements org.telegram.ui.Components.v5 {
    public final int f37413a;
    public final Object f37414b;

    public v50(Object obj, int i10) {
        this.f37413a = i10;
        this.f37414b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37413a) {
            case 0:
                Iterator it = ((w50) this.f37414b).f37720i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                u61 u61Var = (u61) this.f37414b;
                u61Var.getClass();
                if (!yg.f0.f46996b && u61Var.getParent() != null) {
                    ((View) u61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
