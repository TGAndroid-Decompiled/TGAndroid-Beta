package org.telegram.ui;

import android.view.View;
public final class ye0 implements View.OnAttachStateChangeListener {
    public boolean f40506b;
    public final ze0 d;
    public long f40505a = System.currentTimeMillis();
    public final xe0 f40507c = new xe0(this, 0);

    public ye0(ze0 ze0Var) {
        this.d = ze0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f40506b = true;
        view.post(this.f40507c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f40506b = false;
        view.removeCallbacks(this.f40507c);
    }
}
