package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class y6 extends rg.v1 {
    public Paint[] f47993n;
    public final int f47994r;
    public final int f47995s;

    public y6(Context context, int i10, int i11) {
        super(context);
        this.f47994r = i10;
        this.f47995s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.u1 u1Var = new rg.u1(this.f47994r);
        this.f42473a = u1Var;
        u1Var.N = 105;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.f42456m = true;
        u1Var.h = true;
        if (this.f47995s == 1) {
            u1Var.f42454k = AndroidUtilities.dp(24.0f);
        }
        this.f47993n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f47993n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f47993n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f47993n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.u1 u1Var2 = this.f42473a;
                u1Var2.f42455l = new ci.x7(this, 5);
                u1Var2.f42461r = 17;
                u1Var2.f42462s = 18;
                u1Var2.f42463t = 19;
                u1Var2.P = org.telegram.ui.ActionBar.h6.G6;
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
