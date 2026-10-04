package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends rg.y1 {
    public Paint[] f51135n;
    public final int f51136r;
    public final int f51137s;

    public b7(Context context, int i10, int i11) {
        super(context);
        this.f51136r = i10;
        this.f51137s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.x1 x1Var = new rg.x1(this.f51136r);
        this.f46392a = x1Var;
        x1Var.N = 105;
        int i10 = 0;
        x1Var.M = false;
        x1Var.G = false;
        x1Var.K = true;
        x1Var.H = true;
        x1Var.J = false;
        x1Var.f46367m = true;
        x1Var.h = true;
        if (this.f51137s == 1) {
            x1Var.f46365k = AndroidUtilities.dp(24.0f);
        }
        this.f51135n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f51135n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f51135n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f51135n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.x1 x1Var2 = this.f46392a;
                x1Var2.f46366l = new ci.y7(this, 5);
                x1Var2.f46372r = 17;
                x1Var2.f46373s = 18;
                x1Var2.f46374t = 19;
                x1Var2.P = org.telegram.ui.ActionBar.i6.G6;
                x1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
