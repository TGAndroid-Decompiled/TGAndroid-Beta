package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.oq;
public final class d0 extends a9 {
    public Drawable E;
    public int F;
    public boolean G;
    public final h6 f61272x;
    public ColorDrawable f61273y;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.f61272x = h6Var;
    }

    public void setBackground(boolean z10) {
        int i7;
        Context context = getContext();
        if (z10) {
            i7 = 2131231230;
        } else {
            i7 = 2131231229;
        }
        int i10 = m6.f29342b7;
        h6 h6Var = this.f61272x;
        Drawable X0 = m6.X0(context, i7, m6.w0(i10, h6Var));
        ColorDrawable colorDrawable = new ColorDrawable(m6.w0(m6.f29321a7, h6Var));
        this.f61273y = colorDrawable;
        this.E = X0;
        oq oqVar = new oq(colorDrawable, X0, 0, 0);
        oqVar.f38345x = true;
        setBackground(oqVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f61273y;
            h6 h6Var = this.f61272x;
            if (colorDrawable != null) {
                colorDrawable.setColor(m6.w0(m6.f29321a7, h6Var));
            }
            if (this.E != null) {
                int w02 = m6.w0(m6.f29342b7, h6Var);
                if (w02 != this.F || !this.G) {
                    this.F = w02;
                    this.G = true;
                    this.E.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
