package zh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class x6 extends sg.z1 {
    public Paint[] f52851n;
    public final int f52852r;
    public final int f52853s;

    public x6(Context context, int i10, int i11) {
        super(context);
        this.f52852r = i10;
        this.f52853s = i11;
        b();
    }

    @Override
    public final void a() {
        sg.y1 y1Var = new sg.y1(this.f52852r);
        this.f46376a = y1Var;
        y1Var.N = 105;
        int i10 = 0;
        y1Var.M = false;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.J = false;
        y1Var.f46354m = true;
        y1Var.h = true;
        if (this.f52853s == 1) {
            y1Var.f46352k = AndroidUtilities.dp(24.0f);
        }
        this.f52851n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f52851n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f52851n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f52851n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                sg.y1 y1Var2 = this.f46376a;
                y1Var2.f46353l = new di.a8(this, 5);
                y1Var2.f46359r = 17;
                y1Var2.f46360s = 18;
                y1Var2.f46361t = 19;
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
