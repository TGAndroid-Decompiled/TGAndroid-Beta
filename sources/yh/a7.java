package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class a7 extends rg.v1 {
    public Paint[] f47015n;
    public final int f47016r;
    public final int f47017s;

    public a7(Context context, int i10, int i11) {
        super(context);
        this.f47016r = i10;
        this.f47017s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.u1 u1Var = new rg.u1(this.f47016r);
        this.f42544a = u1Var;
        u1Var.N = 105;
        int i10 = 0;
        u1Var.M = false;
        u1Var.G = false;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.J = false;
        u1Var.f42527m = true;
        u1Var.h = true;
        if (this.f47017s == 1) {
            u1Var.f42525k = AndroidUtilities.dp(24.0f);
        }
        this.f47015n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f47015n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f47015n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f47015n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.u1 u1Var2 = this.f42544a;
                u1Var2.f42526l = new ci.a8(this, 5);
                u1Var2.f42532r = 17;
                u1Var2.f42533s = 18;
                u1Var2.f42534t = 19;
                u1Var2.P = org.telegram.ui.ActionBar.j6.G6;
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
