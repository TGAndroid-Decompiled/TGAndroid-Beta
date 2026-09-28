package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends rg.w1 {
    public Paint[] f48302n;
    public final int f48303r;
    public final int f48304s;

    public y6(Context context, int i10, int i11) {
        super(context);
        this.f48303r = i10;
        this.f48304s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.v1 v1Var = new rg.v1(this.f48303r);
        this.f42816a = v1Var;
        v1Var.N = 105;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f42796m = true;
        v1Var.h = true;
        if (this.f48304s == 1) {
            v1Var.f42794k = AndroidUtilities.dp(24.0f);
        }
        this.f48302n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f48302n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f48302n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f48302n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.v1 v1Var2 = this.f42816a;
                v1Var2.f42795l = new ci.x7(this, 5);
                v1Var2.f42801r = 17;
                v1Var2.f42802s = 18;
                v1Var2.f42803t = 19;
                v1Var2.P = org.telegram.ui.ActionBar.h6.G6;
                v1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
