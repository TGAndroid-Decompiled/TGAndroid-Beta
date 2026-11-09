package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class sz extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.i6 f50009a;
    public fh.g f50010b;
    public String f50011c;

    public sz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, false, false);
        this.f50009a = i6Var;
        i6Var.u(-1);
        i6Var.f34587b = 17;
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.i6 i6Var = this.f50009a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + i6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.f50010b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.f50010b.draw(canvas);
        }
        i6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f50009a.setBounds(0, 0, i7, i10);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f50010b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f50009a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
