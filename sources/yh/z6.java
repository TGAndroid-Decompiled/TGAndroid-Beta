package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class z6 extends rg.v1 {
    public Paint[] f48058n;
    public final int f48059r;
    public final int f48060s;

    public z6(Context context, int i10, int i11) {
        super(context);
        this.f48059r = i10;
        this.f48060s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.u1 u1Var = new rg.u1(this.f48059r);
        this.f42518a = u1Var;
        u1Var.N = 105;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.f42501m = true;
        u1Var.h = true;
        if (this.f48060s == 1) {
            u1Var.f42499k = AndroidUtilities.dp(24.0f);
        }
        this.f48058n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f48058n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f48058n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f48058n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.u1 u1Var2 = this.f42518a;
                u1Var2.f42500l = new ci.a8(this, 5);
                u1Var2.f42506r = 17;
                u1Var2.f42507s = 18;
                u1Var2.f42508t = 19;
                u1Var2.P = org.telegram.ui.ActionBar.i6.G6;
                u1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
