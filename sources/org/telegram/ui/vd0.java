package org.telegram.ui;

import android.view.View;
public final class vd0 implements View.OnAttachStateChangeListener {
    public boolean f42709b;
    public final wd0 d;
    public long f42708a = System.currentTimeMillis();
    public final ud0 f42710c = new ud0(this, 0);

    public vd0(wd0 wd0Var) {
        this.d = wd0Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42709b = true;
        view.post(this.f42710c);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f42709b = false;
        view.removeCallbacks(this.f42710c);
    }
}
