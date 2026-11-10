package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.xp;
public final class d0 extends z8 {
    public Drawable D;
    public int E;
    public boolean F;
    public final h6 f59459x;
    public ColorDrawable f59460y;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.f59459x = h6Var;
    }

    public void setBackground(boolean z9) {
        int i7;
        Context context = getContext();
        if (z9) {
            i7 = 2131231230;
        } else {
            i7 = 2131231229;
        }
        int i10 = m6.f27854b7;
        h6 h6Var = this.f59459x;
        Drawable X0 = m6.X0(context, i7, m6.w0(i10, h6Var));
        ColorDrawable colorDrawable = new ColorDrawable(m6.w0(m6.f27834a7, h6Var));
        this.f59460y = colorDrawable;
        this.D = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.f40383x = true;
        setBackground(xpVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f59460y;
            h6 h6Var = this.f59459x;
            if (colorDrawable != null) {
                colorDrawable.setColor(m6.w0(m6.f27834a7, h6Var));
            }
            if (this.D != null) {
                int w02 = m6.w0(m6.f27854b7, h6Var);
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
