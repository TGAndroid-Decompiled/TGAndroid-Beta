package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.xp;
public final class d0 extends y8 {
    public Drawable E;
    public int F;
    public boolean G;
    public final e6 f60492x;
    public ColorDrawable f60493y;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f60492x = e6Var;
    }

    public void setBackground(boolean z10) {
        int i3;
        Context context = getContext();
        if (z10) {
            i3 = 2131231230;
        } else {
            i3 = 2131231229;
        }
        int i10 = k6.f27843b7;
        e6 e6Var = this.f60492x;
        Drawable X0 = k6.X0(context, i3, k6.w0(i10, e6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.f27824a7, e6Var));
        this.f60493y = colorDrawable;
        this.E = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.f40447x = true;
        setBackground(xpVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f60493y;
            e6 e6Var = this.f60492x;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.f27824a7, e6Var));
            }
            if (this.E != null) {
                int w02 = k6.w0(k6.f27843b7, e6Var);
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
