package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r6 extends rg.w1 {
    public Paint[] f53256n;
    public final int f53257r;
    public final int f53258s;

    public r6(Context context, int i10, int i11) {
        super(context);
        this.f53257r = i10;
        this.f53258s = i11;
        c();
    }

    @Override
    public final void a() {
        rg.v1 v1Var = new rg.v1(this.f53257r);
        this.f47627a = v1Var;
        v1Var.N = 105;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f47610m = true;
        v1Var.h = true;
        if (this.f53258s == 1) {
            v1Var.f47608k = AndroidUtilities.dp(24.0f);
        }
        this.f53256n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f53256n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f53256n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f53256n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.v1 v1Var2 = this.f47627a;
                v1Var2.f47609l = new ci.x7(this, 5);
                v1Var2.f47615r = 17;
                v1Var2.f47616s = 18;
                v1Var2.f47617t = 19;
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
