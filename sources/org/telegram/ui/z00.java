package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class z00 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.p6 f44023a;
    public dh.d f44024b;
    public String f44025c;

    public z00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, false, false);
        this.f44023a = p6Var;
        p6Var.u(-1);
        p6Var.f29437b = 17;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.p6 p6Var = this.f44023a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + p6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        dh.d dVar = this.f44024b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.f44024b.draw(canvas);
        }
        p6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f44023a.setBounds(0, 0, i10, i11);
    }

    @Override
    public final void updateColors() {
        dh.d dVar = this.f44024b;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f44023a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
