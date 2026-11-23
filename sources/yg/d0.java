package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.lq;
public final class d0 extends z8 {
    public Drawable E;
    public int F;
    public boolean G;
    public final i6 f61360x;
    public ColorDrawable f61361y;

    public d0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.f61360x = i6Var;
    }

    public void setBackground(boolean z10) {
        int i7;
        Context context = getContext();
        if (z10) {
            i7 = 2131231233;
        } else {
            i7 = 2131231232;
        }
        int i10 = n6.f29415b7;
        i6 i6Var = this.f61360x;
        Drawable X0 = n6.X0(context, i7, n6.w0(i10, i6Var));
        ColorDrawable colorDrawable = new ColorDrawable(n6.w0(n6.f29394a7, i6Var));
        this.f61361y = colorDrawable;
        this.E = X0;
        lq lqVar = new lq(colorDrawable, X0, 0, 0);
        lqVar.f37204x = true;
        setBackground(lqVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f61361y;
            i6 i6Var = this.f61360x;
            if (colorDrawable != null) {
                colorDrawable.setColor(n6.w0(n6.f29394a7, i6Var));
            }
            if (this.E != null) {
                int w02 = n6.w0(n6.f29415b7, i6Var);
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
