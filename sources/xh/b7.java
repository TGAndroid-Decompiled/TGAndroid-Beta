package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import bi.c9;
import org.telegram.messenger.AndroidUtilities;
public final class b7 extends qg.x1 {
    public Paint[] f45283n;
    public final int f45284r;
    public final int f45285s;

    public b7(Context context, int i10, int i11) {
        super(context);
        this.f45284r = i10;
        this.f45285s = i11;
        b();
    }

    @Override
    public final void a() {
        qg.w1 w1Var = new qg.w1(this.f45284r);
        this.f40983a = w1Var;
        w1Var.N = 105;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f40964m = true;
        w1Var.h = true;
        if (this.f45285s == 1) {
            w1Var.f40962k = AndroidUtilities.dp(24.0f);
        }
        this.f45283n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f45283n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f45283n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f45283n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                qg.w1 w1Var2 = this.f40983a;
                w1Var2.f40963l = new c9(this, 5);
                w1Var2.f40969r = 17;
                w1Var2.f40970s = 18;
                w1Var2.f40971t = 19;
                w1Var2.P = org.telegram.ui.ActionBar.j6.G6;
                w1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
