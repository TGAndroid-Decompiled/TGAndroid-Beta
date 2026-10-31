package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
public final class ub0 extends FrameLayout {
    public final HashMap f42110a;
    public final yb0 f42111b;

    public ub0(yb0 yb0Var, Context context) {
        super(context);
        this.f42111b = yb0Var;
        this.f42110a = new HashMap();
    }

    public final void a() {
        org.telegram.messenger.ga gaVar = this.f42111b.G;
        if (gaVar != null) {
            n2.u g10 = gaVar.g();
            for (Map.Entry entry : this.f42110a.entrySet()) {
                View view = (View) entry.getValue();
                Point a02 = g10.a0(((org.telegram.messenger.fa) entry.getKey()).a());
                view.setTranslationX(a02.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(org.telegram.messenger.i0.L(22.0f) + (a02.y - view.getMeasuredHeight()));
            }
        }
    }
}
