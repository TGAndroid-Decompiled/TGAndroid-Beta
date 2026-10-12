package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r6 extends rg.w1 {
    public Paint[] f53359n;
    public final int f53360r;
    public final int f53361s;

    public r6(Context context, int i10, int i11) {
        super(context);
        this.f53360r = i10;
        this.f53361s = i11;
        c();
    }

    @Override
    public final void a() {
        rg.v1 v1Var = new rg.v1(this.f53360r);
        this.f47717a = v1Var;
        v1Var.N = 105;
        int i10 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.f47700m = true;
        v1Var.h = true;
        if (this.f53361s == 1) {
            v1Var.f47698k = AndroidUtilities.dp(24.0f);
        }
        this.f53359n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f53359n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f53359n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f53359n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.v1 v1Var2 = this.f47717a;
                v1Var2.f47699l = new ci.x7(this, 5);
                v1Var2.f47705r = 17;
                v1Var2.f47706s = 18;
                v1Var2.f47707t = 19;
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
