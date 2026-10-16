package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class z50 implements org.telegram.ui.Components.y5 {
    public final int f42165a;
    public final Object f42166b;

    public z50(Object obj, int i10) {
        this.f42165a = i10;
        this.f42166b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f42165a) {
            case 0:
                Iterator it = ((a60) this.f42166b).f33754i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                a71 a71Var = (a71) this.f42166b;
                a71Var.getClass();
                if (!ah.x0.f901b && a71Var.getParent() != null) {
                    ((View) a71Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
