package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class r6 extends sg.x1 {
    public Paint[] f51116n;
    public final int f51117r;
    public final int f51118s;

    public r6(Context context, int i10, int i11) {
        super(context);
        this.f51117r = i10;
        this.f51118s = i11;
        c();
    }

    @Override
    public final void a() {
        sg.w1 w1Var = new sg.w1(this.f51117r);
        this.f45428a = w1Var;
        w1Var.N = 105;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.f45408m = true;
        w1Var.h = true;
        if (this.f51118s == 1) {
            w1Var.f45406k = AndroidUtilities.dp(24.0f);
        }
        this.f51116n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f51116n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f51116n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f51116n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                sg.w1 w1Var2 = this.f45428a;
                w1Var2.f45407l = new di.w7(this, 5);
                w1Var2.f45413r = 17;
                w1Var2.f45414s = 18;
                w1Var2.f45415t = 19;
                w1Var2.P = org.telegram.ui.ActionBar.g6.G6;
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
