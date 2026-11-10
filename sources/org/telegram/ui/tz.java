package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class tz extends View implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.h6 f50357a;
    public fh.g f50358b;
    public String f50359c;

    public tz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(true, false, false);
        this.f50357a = h6Var;
        h6Var.u(-1);
        h6Var.f34187b = 17;
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.h6 h6Var = this.f50357a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + h6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.f50358b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.f50358b.draw(canvas);
        }
        h6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f50357a.setBounds(0, 0, i7, i10);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f50358b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f50357a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
