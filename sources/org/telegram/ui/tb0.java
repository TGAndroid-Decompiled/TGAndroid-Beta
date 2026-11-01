package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
public final class tb0 extends FrameLayout {
    public final HashMap f41609a;
    public final xb0 f41610b;

    public tb0(xb0 xb0Var, Context context) {
        super(context);
        this.f41610b = xb0Var;
        this.f41609a = new HashMap();
    }

    public final void a() {
        org.telegram.messenger.ha haVar = this.f41610b.G;
        if (haVar != null) {
            n2.u g10 = haVar.g();
            for (Map.Entry entry : this.f41609a.entrySet()) {
                View view = (View) entry.getValue();
                Point a02 = g10.a0(((org.telegram.messenger.ga) entry.getKey()).a());
                view.setTranslationX(a02.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(org.telegram.messenger.i0.L(22.0f) + (a02.y - view.getMeasuredHeight()));
            }
        }
    }
}
