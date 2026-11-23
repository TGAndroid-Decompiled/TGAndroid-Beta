package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class uz extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.n6 f52654a;
    public fh.g f52655b;
    public String f52656c;

    public uz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, false, false);
        this.f52654a = n6Var;
        n6Var.u(-1);
        n6Var.f37795b = 17;
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.n6 n6Var = this.f52654a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + n6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.f52655b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.f52655b.draw(canvas);
        }
        n6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f52654a.setBounds(0, 0, i7, i10);
    }

    @Override
    public final void updateColors() {
        fh.g gVar = this.f52655b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f52654a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
