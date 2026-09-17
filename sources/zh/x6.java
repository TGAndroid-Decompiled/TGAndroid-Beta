package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class x6 extends sg.z1 {
    public Paint[] f52852n;
    public final int f52853r;
    public final int f52854s;

    public x6(Context context, int i10, int i11) {
        super(context);
        this.f52853r = i10;
        this.f52854s = i11;
        b();
    }

    @Override
    public final void a() {
        sg.y1 y1Var = new sg.y1(this.f52853r);
        this.f46377a = y1Var;
        y1Var.N = 105;
        int i10 = 0;
        y1Var.M = false;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.J = false;
        y1Var.f46355m = true;
        y1Var.h = true;
        if (this.f52854s == 1) {
            y1Var.f46353k = AndroidUtilities.dp(24.0f);
        }
        this.f52852n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f52852n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f52852n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f52852n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                sg.y1 y1Var2 = this.f46377a;
                y1Var2.f46354l = new di.a8(this, 5);
                y1Var2.f46360r = 17;
                y1Var2.f46361s = 18;
                y1Var2.f46362t = 19;
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
