package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class a7 extends rg.v1 {
    public Paint[] f46992n;
    public final int f46993r;
    public final int f46994s;

    public a7(Context context, int i10, int i11) {
        super(context);
        this.f46993r = i10;
        this.f46994s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.u1 u1Var = new rg.u1(this.f46993r);
        this.f42522a = u1Var;
        u1Var.N = 105;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.f42505m = true;
        u1Var.h = true;
        if (this.f46994s == 1) {
            u1Var.f42503k = AndroidUtilities.dp(24.0f);
        }
        this.f46992n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f46992n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f46992n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f46992n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.u1 u1Var2 = this.f42522a;
                u1Var2.f42504l = new ci.a8(this, 5);
                u1Var2.f42510r = 17;
                u1Var2.f42511s = 18;
                u1Var2.f42512t = 19;
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
