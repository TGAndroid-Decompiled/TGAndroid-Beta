package qh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import dg.a0;
import eg.p2;
import eg.q2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class c extends q2 {
    public Paint[] f43071n;
    public final int f43072r;
    public final int f43073s;

    public c(Context context, int i10, int i11) {
        super(context);
        this.f43072r = i10;
        this.f43073s = i11;
        b();
    }

    @Override
    public final void a() {
        p2 p2Var = new p2(this.f43072r);
        this.f5468a = p2Var;
        p2Var.N = 106;
        int i10 = 0;
        p2Var.M = false;
        p2Var.G = false;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.J = false;
        p2Var.f5436m = true;
        p2Var.h = true;
        if (this.f43073s == 1) {
            p2Var.f5434k = AndroidUtilities.dp(24.0f);
        }
        this.f43071n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.f43071n;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                this.f43071n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.f43071n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i10++;
            } else {
                p2 p2Var2 = this.f5468a;
                p2Var2.f5435l = new a0(this, 5);
                p2Var2.f5441r = 17;
                p2Var2.f5442s = 18;
                p2Var2.f5443t = 19;
                p2Var2.P = j6.G6;
                p2Var2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
