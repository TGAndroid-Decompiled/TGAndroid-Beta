package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends rg.w1 {
    public Paint[] f48301n;
    public final int f48302r;
    public final int f48303s;

    public y6(Context context, int i10, int i11) {
        super(context);
        this.f48302r = i10;
        this.f48303s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.v1 v1Var = new rg.v1(this.f48302r);
        this.f42815a = v1Var;
        v1Var.N = 105;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f42795m = true;
        v1Var.h = true;
        if (this.f48303s == 1) {
            v1Var.f42793k = AndroidUtilities.dp(24.0f);
        }
        this.f48301n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f48301n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f48301n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f48301n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.v1 v1Var2 = this.f42815a;
                v1Var2.f42794l = new ci.x7(this, 5);
                v1Var2.f42800r = 17;
                v1Var2.f42801s = 18;
                v1Var2.f42802t = 19;
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
