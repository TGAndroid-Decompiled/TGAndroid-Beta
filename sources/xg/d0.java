package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ar;
public final class d0 extends i9 {
    public int E;
    public boolean F;
    public final u6 f51775w;
    public ColorDrawable f51776x;
    public Drawable f51777y;

    public d0(Context context, u6 u6Var) {
        super(context, u6Var);
        this.f51775w = u6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = R.drawable.greydivider_bottom;
        } else {
            i10 = R.drawable.greydivider;
        }
        int i11 = y6.f23316b7;
        u6 u6Var = this.f51775w;
        Drawable W0 = y6.W0(context, i10, y6.w0(i11, u6Var));
        ColorDrawable colorDrawable = new ColorDrawable(y6.w0(y6.f23297a7, u6Var));
        this.f51776x = colorDrawable;
        this.f51777y = W0;
        ar arVar = new ar(colorDrawable, W0, 0, 0);
        arVar.f26597w = true;
        setBackground(arVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f51776x;
            u6 u6Var = this.f51775w;
            if (colorDrawable != null) {
                colorDrawable.setColor(y6.w0(y6.f23297a7, u6Var));
            }
            if (this.f51777y != null) {
                int w02 = y6.w0(y6.f23316b7, u6Var);
                if (w02 != this.E || !this.F) {
                    this.E = w02;
                    this.F = true;
                    this.f51777y.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
