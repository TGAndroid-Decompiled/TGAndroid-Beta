package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class r00 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.e6 f41100a;
    public vg.f f41101b;
    public String f41102c;

    public r00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, false, false);
        this.f41100a = e6Var;
        e6Var.u(-1);
        e6Var.f25695b = 17;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.e6 e6Var = this.f41100a;
        int N = (int) (org.telegram.messenger.i0.N(30.0f) + e6Var.c());
        int width = (getWidth() - N) / 2;
        int i10 = N + width;
        vg.f fVar = this.f41101b;
        if (fVar != null) {
            fVar.setBounds(width, 0, i10, getHeight());
            this.f41101b.draw(canvas);
        }
        e6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f41100a.setBounds(0, 0, i10, i11);
    }

    @Override
    public final void updateColors() {
        vg.f fVar = this.f41101b;
        if (fVar != null) {
            fVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f41100a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
