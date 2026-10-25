package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class y00 extends View implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.r6 f45913a;
    public eh.d f45914b;
    public String f45915c;

    public y00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, false, false);
        this.f45913a = r6Var;
        r6Var.u(-1);
        r6Var.f32119b = 17;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.r6 r6Var = this.f45913a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + r6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        eh.d dVar = this.f45914b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.f45914b.draw(canvas);
        }
        r6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f45913a.setBounds(0, 0, i10, i11);
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f45914b;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f45913a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
