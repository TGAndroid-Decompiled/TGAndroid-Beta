package org.telegram.ui;

import android.view.View;
import java.util.Iterator;
public final class u50 implements org.telegram.ui.Components.v5 {
    public final int f37959a;
    public final Object f37960b;

    public u50(Object obj, int i10) {
        this.f37959a = i10;
        this.f37960b = obj;
    }

    @Override
    public final void invalidate() {
        switch (this.f37959a) {
            case 0:
                Iterator it = ((v50) this.f37960b).f38410i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                return;
            default:
                s61 s61Var = (s61) this.f37960b;
                s61Var.getClass();
                if (!zg.e0.f49318b && s61Var.getParent() != null) {
                    ((View) s61Var.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
