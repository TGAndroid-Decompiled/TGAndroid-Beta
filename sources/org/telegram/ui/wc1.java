package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class wc1 implements View.OnClickListener {
    public final int f38796a;
    public int f38797b = 0;
    public final xd1 f38798c;

    public wc1(xd1 xd1Var, int i10) {
        this.f38796a = i10;
        this.f38798c = xd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38796a) {
            case 0:
                xd1 xd1Var = this.f38798c;
                xd1Var.F0.setRotation(this.f38797b);
                this.f38797b -= 45;
                xd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27643g).start();
                md1[] md1VarArr = xd1Var.f39529w0;
                md1 md1Var = md1VarArr[0];
                if (md1Var != null) {
                    Drawable background = md1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.kc0) {
                        ((org.telegram.ui.Components.kc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39519s;
                        if (xd1Var.f39473b == 2) {
                            xd1Var.f39495h1 += 45;
                            while (true) {
                                int i10 = xd1Var.f39495h1;
                                if (i10 >= 360) {
                                    xd1Var.f39495h1 = i10 - 360;
                                } else {
                                    xd1Var.a1(xd1Var.Z0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f18937n += 45;
                            while (true) {
                                int i11 = h6Var.f18937n;
                                if (i11 >= 360) {
                                    h6Var.f18937n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                md1 md1Var2 = md1VarArr[1];
                if (md1Var2 != null) {
                    Drawable background2 = md1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.kc0) {
                        ((org.telegram.ui.Components.kc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                xd1 xd1Var2 = this.f38798c;
                org.telegram.ui.ActionBar.q5 q5Var = xd1Var2.R;
                xd1Var2.G0.setRotation(this.f38797b);
                this.f38797b -= 45;
                xd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27643g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var2.f39519s;
                if (h6Var2.f18932i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = h6Var2.h;
                if (i12 != 0) {
                    int i13 = h6Var2.e;
                    if (i13 == 0) {
                        i13 = h6Var2.f18929c;
                    }
                    h6Var2.e = h6Var2.f18930f;
                    h6Var2.f18930f = h6Var2.f18931g;
                    h6Var2.f18931g = i12;
                    h6Var2.h = i13;
                } else {
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.f18929c;
                    }
                    h6Var2.e = h6Var2.f18930f;
                    h6Var2.f18930f = h6Var2.f18931g;
                    h6Var2.f18931g = i14;
                }
                xd1Var2.V.e(h6Var2.h, 3);
                xd1Var2.V.e(h6Var2.f18931g, 2);
                xd1Var2.V.e(h6Var2.f18930f, 1);
                org.telegram.ui.Components.mq mqVar = xd1Var2.V;
                int i15 = h6Var2.e;
                if (i15 == 0) {
                    i15 = h6Var2.f18929c;
                }
                mqVar.e(i15, 0);
                xd1Var2.K0[1].b(0, h6Var2.e);
                xd1Var2.K0[1].b(1, h6Var2.f18930f);
                xd1Var2.K0[1].b(2, h6Var2.f18931g);
                xd1Var2.K0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.j6.n1(true, true);
                xd1Var2.f39524u0.g1();
                return;
        }
    }
}
