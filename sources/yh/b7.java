package yh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends rg.y1 {
    public Paint[] f51142n;
    public final int f51143r;
    public final int f51144s;

    public b7(Context context, int i10, int i11) {
        super(context);
        this.f51143r = i10;
        this.f51144s = i11;
        b();
    }

    @Override
    public final void a() {
        rg.x1 x1Var = new rg.x1(this.f51143r);
        this.f46400a = x1Var;
        x1Var.N = 105;
        int i10 = 0;
        x1Var.M = false;
        x1Var.G = false;
        x1Var.K = true;
        x1Var.H = true;
        x1Var.J = false;
        x1Var.f46375m = true;
        x1Var.h = true;
        if (this.f51144s == 1) {
            x1Var.f46373k = AndroidUtilities.dp(24.0f);
        }
        this.f51142n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f51142n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f51142n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f51142n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                rg.x1 x1Var2 = this.f46400a;
                x1Var2.f46374l = new ci.y7(this, 5);
                x1Var2.f46380r = 17;
                x1Var2.f46381s = 18;
                x1Var2.f46382t = 19;
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
