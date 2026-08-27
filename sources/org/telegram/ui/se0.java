package org.telegram.ui;

import android.view.View;

public final class se0 implements View.OnAttachStateChangeListener {

    public boolean f42605b;
    public final te0 d;

    public long f42604a = System.currentTimeMillis();

    public final re0 f42606c = new re0(this, 0);

    public se0(te0 te0Var) {
        this.d = te0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42605b = true;
        view.post(this.f42606c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42605b = false;
        view.removeCallbacks(this.f42606c);
    }
}
