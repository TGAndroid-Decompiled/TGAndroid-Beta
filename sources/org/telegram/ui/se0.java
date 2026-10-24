package org.telegram.ui;

import android.view.View;
public final class se0 implements View.OnAttachStateChangeListener {
    public boolean f41364b;
    public final te0 d;
    public long f41363a = System.currentTimeMillis();
    public final re0 f41365c = new re0(this, 0);

    public se0(te0 te0Var) {
        this.d = te0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41364b = true;
        view.post(this.f41365c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f41364b = false;
        view.removeCallbacks(this.f41365c);
    }
}
