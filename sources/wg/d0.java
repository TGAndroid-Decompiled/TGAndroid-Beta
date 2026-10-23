package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.yq;
public final class d0 extends e9 {
    public int E;
    public boolean F;
    public final g6 f49416w;
    public ColorDrawable f49417x;
    public Drawable f49418y;

    public d0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f49416w = g6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = k6.f21145b7;
        g6 g6Var = this.f49416w;
        Drawable W0 = k6.W0(context, i10, k6.w0(i11, g6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.f21125a7, g6Var));
        this.f49417x = colorDrawable;
        this.f49418y = W0;
        yq yqVar = new yq(colorDrawable, W0, 0, 0);
        yqVar.f33019w = true;
        setBackground(yqVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f49417x;
            g6 g6Var = this.f49416w;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.f21125a7, g6Var));
            }
            if (this.f49418y != null) {
                int w02 = k6.w0(k6.f21145b7, g6Var);
                if (w02 != this.E || !this.F) {
                    this.E = w02;
                    this.F = true;
                    this.f49418y.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
