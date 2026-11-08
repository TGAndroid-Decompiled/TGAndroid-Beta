package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.xp;
public final class d0 extends z8 {
    public Drawable D;
    public int E;
    public boolean F;
    public final f6 f59452x;
    public ColorDrawable f59453y;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f59452x = f6Var;
    }

    public void setBackground(boolean z9) {
        int i7;
        Context context = getContext();
        if (z9) {
            i7 = 2131231230;
        } else {
            i7 = 2131231229;
        }
        int i10 = k6.f27816b7;
        f6 f6Var = this.f59452x;
        Drawable X0 = k6.X0(context, i7, k6.w0(i10, f6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.f27796a7, f6Var));
        this.f59453y = colorDrawable;
        this.D = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.f40361x = true;
        setBackground(xpVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f59453y;
            f6 f6Var = this.f59452x;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.f27796a7, f6Var));
            }
            if (this.D != null) {
                int w02 = k6.w0(k6.f27816b7, f6Var);
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
