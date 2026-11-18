package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class uz extends View implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.m6 f52627a;
    public fh.g f52628b;
    public String f52629c;

    public uz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, false, false);
        this.f52627a = m6Var;
        m6Var.u(-1);
        m6Var.f37377b = 17;
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.m6 m6Var = this.f52627a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + m6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.f52628b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.f52628b.draw(canvas);
        }
        m6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f52627a.setBounds(0, 0, i7, i10);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f52628b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f52627a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
