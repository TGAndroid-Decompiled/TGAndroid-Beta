package org.telegram.ui;

import android.view.View;
public final class ze0 implements View.OnAttachStateChangeListener {
    public boolean f43924b;
    public final af0 d;
    public long f43923a = System.currentTimeMillis();
    public final ye0 f43925c = new ye0(this, 0);

    public ze0(af0 af0Var) {
        this.d = af0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f43924b = true;
        view.post(this.f43925c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f43924b = false;
        view.removeCallbacks(this.f43925c);
    }
}
