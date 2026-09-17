package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class x6 extends sg.z1 {
    public Paint[] f52883n;
    public final int f52884r;
    public final int f52885s;

    public x6(Context context, int i10, int i11) {
        super(context);
        this.f52884r = i10;
        this.f52885s = i11;
        b();
    }

    @Override
    public final void a() {
        sg.y1 y1Var = new sg.y1(this.f52884r);
        this.f46405a = y1Var;
        y1Var.N = 105;
        int i10 = 0;
        y1Var.M = false;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.J = false;
        y1Var.f46383m = true;
        y1Var.h = true;
        if (this.f52885s == 1) {
            y1Var.f46381k = AndroidUtilities.dp(24.0f);
        }
        this.f52883n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f52883n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f52883n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f52883n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                sg.y1 y1Var2 = this.f46405a;
                y1Var2.f46382l = new di.a8(this, 5);
                y1Var2.f46388r = 17;
                y1Var2.f46389s = 18;
                y1Var2.f46390t = 19;
                y1Var2.P = org.telegram.ui.ActionBar.j6.G6;
                y1Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
