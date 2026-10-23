package org.telegram.ui;

import android.view.View;
public final class te0 implements View.OnAttachStateChangeListener {
    public boolean f41972b;
    public final ue0 d;
    public long f41971a = System.currentTimeMillis();
    public final se0 f41973c = new se0(this, 0);

    public te0(ue0 ue0Var) {
        this.d = ue0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41972b = true;
        view.post(this.f41973c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f41972b = false;
        view.removeCallbacks(this.f41973c);
    }
}
