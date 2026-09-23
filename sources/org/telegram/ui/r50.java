package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class r50 implements org.telegram.ui.Components.w5 {
    public final int f36695a;
    public final Object f36696b;

    public r50(Object obj, int i10) {
        this.f36695a = i10;
        this.f36696b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f36695a) {
            case 0:
                Iterator it = ((s50) this.f36696b).f37122i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                i61 i61Var = (i61) this.f36696b;
                i61Var.getClass();
                if (!zg.f0.f48967b && i61Var.getParent() != null) {
                    ((View) i61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
