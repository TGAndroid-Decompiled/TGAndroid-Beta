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
import org.telegram.ui.Components.wq;
public final class d0 extends e9 {
    public int E;
    public boolean F;
    public final g6 f49415w;
    public ColorDrawable f49416x;
    public Drawable f49417y;

    public d0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f49415w = g6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = k6.f21146b7;
        g6 g6Var = this.f49415w;
        Drawable W0 = k6.W0(context, i10, k6.w0(i11, g6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.f21126a7, g6Var));
        this.f49416x = colorDrawable;
        this.f49417y = W0;
        wq wqVar = new wq(colorDrawable, W0, 0, 0);
        wqVar.f32329w = true;
        setBackground(wqVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f49416x;
            g6 g6Var = this.f49415w;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.f21126a7, g6Var));
            }
            if (this.f49417y != null) {
                int w02 = k6.w0(k6.f21146b7, g6Var);
                if (w02 != this.E || !this.F) {
                    this.E = w02;
                    this.F = true;
                    this.f49417y.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
