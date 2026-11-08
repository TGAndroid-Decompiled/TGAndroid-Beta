package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class qz extends View implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.i6 f49336a;
    public fh.g f49337b;
    public String f49338c;

    public qz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, false, false);
        this.f49336a = i6Var;
        i6Var.u(-1);
        i6Var.f34552b = 17;
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.i6 i6Var = this.f49336a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + i6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.f49337b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.f49337b.draw(canvas);
        }
        i6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f49336a.setBounds(0, 0, i7, i10);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f49337b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f49336a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
