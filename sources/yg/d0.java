package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.xp;
public final class d0 extends z8 {
    public Drawable D;
    public int E;
    public boolean F;
    public final g6 f59461x;
    public ColorDrawable f59462y;

    public d0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f59461x = g6Var;
    }

    public void setBackground(boolean z9) {
        int i7;
        Context context = getContext();
        if (z9) {
            i7 = 2131231230;
        } else {
            i7 = 2131231229;
        }
        int i10 = l6.f27829b7;
        g6 g6Var = this.f59461x;
        Drawable X0 = l6.X0(context, i7, l6.w0(i10, g6Var));
        ColorDrawable colorDrawable = new ColorDrawable(l6.w0(l6.f27809a7, g6Var));
        this.f59462y = colorDrawable;
        this.D = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.f40453x = true;
        setBackground(xpVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f59462y;
            g6 g6Var = this.f59461x;
            if (colorDrawable != null) {
                colorDrawable.setColor(l6.w0(l6.f27809a7, g6Var));
            }
            if (this.D != null) {
                int w02 = l6.w0(l6.f27829b7, g6Var);
                if (w02 != this.E || !this.F) {
                    this.E = w02;
                    this.F = true;
                    this.D.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
