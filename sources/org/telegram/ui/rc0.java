package org.telegram.ui;

import android.view.View;
public final class rc0 implements View.OnAttachStateChangeListener {
    public boolean f49387b;
    public final sc0 d;
    public long f49386a = System.currentTimeMillis();
    public final qc0 f49388c = new qc0(this, 0);

    public rc0(sc0 sc0Var) {
        this.d = sc0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f49387b = true;
        view.post(this.f49388c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f49387b = false;
        view.removeCallbacks(this.f49388c);
    }
}
