package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class t50 implements org.telegram.ui.Components.w5 {
    public final int f40689a;
    public final Object f40690b;

    public t50(Object obj, int i10) {
        this.f40689a = i10;
        this.f40690b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f40689a) {
            case 0:
                Iterator it = ((u50) this.f40690b).f41058i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                l61 l61Var = (l61) this.f40690b;
                l61Var.getClass();
                if (!zg.e0.f53366b && l61Var.getParent() != null) {
                    ((View) l61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
