package org.telegram.ui;

import android.view.View;
public final class se0 implements View.OnAttachStateChangeListener {
    public boolean f43308b;
    public final te0 d;
    public long f43307a = System.currentTimeMillis();
    public final re0 f43309c = new re0(this, 0);

    public se0(te0 te0Var) {
        this.d = te0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f43308b = true;
        view.post(this.f43309c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f43308b = false;
        view.removeCallbacks(this.f43309c);
    }
}
