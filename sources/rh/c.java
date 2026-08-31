package rh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import eg.y;
import fg.o2;
import fg.p2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class c extends p2 {
    public Paint[] f46820n;
    public final int f46821r;
    public final int f46822s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f46821r = i10;
        this.f46822s = i11;
        b();
    }

    @Override
    public final void a() {
        o2 o2Var = new o2(this.f46821r);
        this.f6501a = o2Var;
        o2Var.N = 106;
        int i10 = 0;
        o2Var.M = false;
        o2Var.G = false;
        o2Var.K = true;
        o2Var.H = true;
        o2Var.J = false;
        o2Var.f6461m = true;
        o2Var.h = true;
        if (this.f46822s == 1) {
            o2Var.f6459k = AndroidUtilities.dp(24.0f);
        }
        this.f46820n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f46820n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f46820n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f46820n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                o2 o2Var2 = this.f6501a;
                o2Var2.f6460l = new y(this, 5);
                o2Var2.f6466r = 17;
                o2Var2.f6467s = 18;
                o2Var2.f6468t = 19;
                o2Var2.P = k6.G6;
                o2Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
