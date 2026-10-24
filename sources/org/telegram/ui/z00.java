package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class z00 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.n6 f43986a;
    public dh.d f43987b;
    public String f43988c;

    public z00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, false, false);
        this.f43986a = n6Var;
        n6Var.u(-1);
        n6Var.f28797b = 17;
        n6Var.x(AndroidUtilities.bold());
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.n6 n6Var = this.f43986a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + n6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        dh.d dVar = this.f43987b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.f43987b.draw(canvas);
        }
        n6Var.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f43986a.setBounds(0, 0, i10, i11);
    }

    @Override
    public final void updateColors() {
        dh.d dVar = this.f43987b;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f43986a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
