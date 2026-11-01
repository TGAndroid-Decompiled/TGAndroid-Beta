package org.telegram.ui;

import android.view.View;
public final class ud0 implements View.OnAttachStateChangeListener {
    public boolean f41915b;
    public final vd0 d;
    public long f41914a = System.currentTimeMillis();
    public final td0 f41916c = new td0(this, 0);

    public ud0(vd0 vd0Var) {
        this.d = vd0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f41915b = true;
        view.post(this.f41916c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f41915b = false;
        view.removeCallbacks(this.f41916c);
    }
}
