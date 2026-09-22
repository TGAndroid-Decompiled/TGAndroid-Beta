package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class vc1 implements View.OnClickListener {
    public final int f38509a;
    public int f38510b = 0;
    public final wd1 f38511c;

    public vc1(wd1 wd1Var, int i10) {
        this.f38509a = i10;
        this.f38511c = wd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38509a) {
            case 0:
                wd1 wd1Var = this.f38511c;
                wd1Var.F0.setRotation(this.f38510b);
                this.f38510b -= 45;
                wd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27421g).start();
                ld1[] ld1VarArr = wd1Var.f38845w0;
                ld1 ld1Var = ld1VarArr[0];
                if (ld1Var != null) {
                    Drawable background = ld1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = wd1Var.f38835s;
                        if (wd1Var.f38789b == 2) {
                            wd1Var.f38811h1 += 45;
                            while (true) {
                                int i10 = wd1Var.f38811h1;
                                if (i10 >= 360) {
                                    wd1Var.f38811h1 = i10 - 360;
                                } else {
                                    wd1Var.a1(wd1Var.Z0, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f18700n += 45;
                            while (true) {
                                int i11 = g6Var.f18700n;
                                if (i11 >= 360) {
                                    g6Var.f18700n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                ld1 ld1Var2 = ld1VarArr[1];
                if (ld1Var2 != null) {
                    Drawable background2 = ld1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                wd1 wd1Var2 = this.f38511c;
                org.telegram.ui.ActionBar.q5 q5Var = wd1Var2.R;
                wd1Var2.G0.setRotation(this.f38510b);
                this.f38510b -= 45;
                wd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27421g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = wd1Var2.f38835s;
                if (g6Var2.f18695i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = g6Var2.h;
                if (i12 != 0) {
                    int i13 = g6Var2.e;
                    if (i13 == 0) {
                        i13 = g6Var2.f18692c;
                    }
                    g6Var2.e = g6Var2.f18693f;
                    g6Var2.f18693f = g6Var2.f18694g;
                    g6Var2.f18694g = i12;
                    g6Var2.h = i13;
                } else {
                    int i14 = g6Var2.e;
                    if (i14 == 0) {
                        i14 = g6Var2.f18692c;
                    }
                    g6Var2.e = g6Var2.f18693f;
                    g6Var2.f18693f = g6Var2.f18694g;
                    g6Var2.f18694g = i14;
                }
                wd1Var2.V.e(g6Var2.h, 3);
                wd1Var2.V.e(g6Var2.f18694g, 2);
                wd1Var2.V.e(g6Var2.f18693f, 1);
                org.telegram.ui.Components.mq mqVar = wd1Var2.V;
                int i15 = g6Var2.e;
                if (i15 == 0) {
                    i15 = g6Var2.f18692c;
                }
                mqVar.e(i15, 0);
                wd1Var2.K0[1].b(0, g6Var2.e);
                wd1Var2.K0[1].b(1, g6Var2.f18693f);
                wd1Var2.K0[1].b(2, g6Var2.f18694g);
                wd1Var2.K0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.i6.n1(true, true);
                wd1Var2.f38840u0.f1();
                return;
        }
    }
}
