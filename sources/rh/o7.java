package rh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class o7 extends kg.g2 {
    public final int f47291r;
    public Paint[] f47292s;
    public final int f47293w;
    public final int f47294x;

    public o7(Context context, int i10, int i11, int i12) {
        super(context);
        this.f47291r = i12;
        switch (i12) {
            case 1:
                this.f47293w = i10;
                this.f47294x = i11;
                super(context);
                c();
                return;
            default:
                this.f47293w = i10;
                this.f47294x = i11;
                c();
                return;
        }
    }

    @Override
    public final void a() {
        int i10;
        int f7;
        float f10;
        int i11;
        int i12;
        switch (this.f47291r) {
            case 0:
                kg.f2 f2Var = new kg.f2(this.f47293w);
                this.f11092a = f2Var;
                f2Var.O = 105;
                int i13 = 0;
                f2Var.M = false;
                f2Var.G = false;
                f2Var.K = true;
                f2Var.H = true;
                f2Var.J = false;
                f2Var.f11077m = true;
                f2Var.h = true;
                int i14 = this.f47294x;
                if (i14 == 1) {
                    f2Var.f11075k = org.telegram.messenger.i0.L(24.0f);
                }
                if (i14 == 2) {
                    i10 = 40;
                } else {
                    i10 = 20;
                }
                this.f47292s = new Paint[i10];
                while (true) {
                    Paint[] paintArr = this.f47292s;
                    if (i13 < paintArr.length) {
                        paintArr[i13] = new Paint(1);
                        if (i14 == 2) {
                            if (i13 >= 20) {
                                f10 = (i13 - 20) / 19.0f;
                                i11 = -1005568;
                                i12 = -2062336;
                            } else if (i13 % 5 == 0) {
                                f7 = -2340;
                            } else {
                                f10 = i13 / 19.0f;
                                i11 = -10645;
                                i12 = -20165;
                            }
                            f7 = i0.b.f(f10, i11, i12);
                        } else {
                            f7 = i0.b.f(i13 / (this.f47292s.length - 1), -371690, -14281);
                        }
                        this.f47292s[i13].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                        i13++;
                    } else {
                        kg.f2 f2Var2 = this.f11092a;
                        f2Var2.f11076l = new jg.v(this, 3);
                        f2Var2.f11082r = 17;
                        f2Var2.f11083s = 18;
                        f2Var2.f11084t = 19;
                        if (i14 == 2) {
                            f2Var2.N = true;
                            f2Var2.f11082r = 9;
                            f2Var2.f11083s = 11;
                            f2Var2.f11084t = 13;
                            f2Var2.f11079o = 1.6f;
                            f2Var2.f11087x = 1400L;
                            f2Var2.f11088y = 1600;
                            f2Var2.L = true;
                        }
                        f2Var2.Q = org.telegram.ui.ActionBar.t6.G6;
                        f2Var2.c();
                        return;
                    }
                }
            default:
                kg.f2 f2Var3 = new kg.f2(this.f47293w);
                this.f11092a = f2Var3;
                f2Var3.O = 106;
                int i15 = 0;
                f2Var3.M = false;
                f2Var3.G = false;
                f2Var3.K = true;
                f2Var3.H = true;
                f2Var3.J = false;
                f2Var3.f11077m = true;
                f2Var3.h = true;
                if (this.f47294x == 1) {
                    f2Var3.f11075k = org.telegram.messenger.i0.L(24.0f);
                }
                this.f47292s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.f47292s;
                    if (i15 < paintArr2.length) {
                        paintArr2[i15] = new Paint(1);
                        this.f47292s[i15].setColorFilter(new PorterDuffColorFilter(i0.b.f(i15 / (this.f47292s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i15++;
                    } else {
                        kg.f2 f2Var4 = this.f11092a;
                        f2Var4.f11076l = new jg.v(this, 5);
                        f2Var4.f11082r = 17;
                        f2Var4.f11083s = 18;
                        f2Var4.f11084t = 19;
                        f2Var4.Q = org.telegram.ui.ActionBar.t6.G6;
                        f2Var4.c();
                        return;
                    }
                }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.f47291r) {
            case 0:
                return getMeasuredWidth();
            default:
                return getMeasuredWidth();
        }
    }
}
