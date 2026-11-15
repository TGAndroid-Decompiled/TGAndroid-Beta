package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.fq;
public final class d0 extends y8 {
    public Drawable E;
    public int F;
    public boolean G;
    public final e6 f60663x;
    public ColorDrawable f60664y;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f60663x = e6Var;
    }

    public void setBackground(boolean z10) {
        int i7;
        Context context = getContext();
        if (z10) {
            i7 = 2131231230;
        } else {
            i7 = 2131231229;
        }
        int i10 = j6.f28813b7;
        e6 e6Var = this.f60663x;
        Drawable X0 = j6.X0(context, i7, j6.w0(i10, e6Var));
        ColorDrawable colorDrawable = new ColorDrawable(j6.w0(j6.f28792a7, e6Var));
        this.f60664y = colorDrawable;
        this.E = X0;
        fq fqVar = new fq(colorDrawable, X0, 0, 0);
        fqVar.f34682x = true;
        setBackground(fqVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f60664y;
            e6 e6Var = this.f60663x;
            if (colorDrawable != null) {
                colorDrawable.setColor(j6.w0(j6.f28792a7, e6Var));
            }
            if (this.E != null) {
                int w02 = j6.w0(j6.f28813b7, e6Var);
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
