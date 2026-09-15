package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class uc1 implements View.OnClickListener {
    public final int f37977a;
    public int f37978b = 0;
    public final vd1 f37979c;

    public uc1(vd1 vd1Var, int i10) {
        this.f37977a = i10;
        this.f37979c = vd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37977a) {
            case 0:
                vd1 vd1Var = this.f37979c;
                vd1Var.F0.setRotation(this.f37978b);
                this.f37978b -= 45;
                vd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27424g).start();
                kd1[] kd1VarArr = vd1Var.f38572w0;
                kd1 kd1Var = kd1VarArr[0];
                if (kd1Var != null) {
                    Drawable background = kd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = vd1Var.f38562s;
                        if (vd1Var.f38516b == 2) {
                            vd1Var.f38538h1 += 45;
                            while (true) {
                                int i10 = vd1Var.f38538h1;
                                if (i10 >= 360) {
                                    vd1Var.f38538h1 = i10 - 360;
                                } else {
                                    vd1Var.a1(vd1Var.Z0, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f18702n += 45;
                            while (true) {
                                int i11 = g6Var.f18702n;
                                if (i11 >= 360) {
                                    g6Var.f18702n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                kd1 kd1Var2 = kd1VarArr[1];
                if (kd1Var2 != null) {
                    Drawable background2 = kd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                vd1 vd1Var2 = this.f37979c;
                org.telegram.ui.ActionBar.q5 q5Var = vd1Var2.R;
                vd1Var2.G0.setRotation(this.f37978b);
                this.f37978b -= 45;
                vd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27424g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = vd1Var2.f38562s;
                if (g6Var2.f18697i) {
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
                        i13 = g6Var2.f18694c;
                    }
                    g6Var2.e = g6Var2.f18695f;
                    g6Var2.f18695f = g6Var2.f18696g;
                    g6Var2.f18696g = i12;
                    g6Var2.h = i13;
                } else {
                    int i14 = g6Var2.e;
                    if (i14 == 0) {
                        i14 = g6Var2.f18694c;
                    }
                    g6Var2.e = g6Var2.f18695f;
                    g6Var2.f18695f = g6Var2.f18696g;
                    g6Var2.f18696g = i14;
                }
                vd1Var2.V.e(g6Var2.h, 3);
                vd1Var2.V.e(g6Var2.f18696g, 2);
                vd1Var2.V.e(g6Var2.f18695f, 1);
                org.telegram.ui.Components.mq mqVar = vd1Var2.V;
                int i15 = g6Var2.e;
                if (i15 == 0) {
                    i15 = g6Var2.f18694c;
                }
                mqVar.e(i15, 0);
                vd1Var2.K0[1].b(0, g6Var2.e);
                vd1Var2.K0[1].b(1, g6Var2.f18695f);
                vd1Var2.K0[1].b(2, g6Var2.f18696g);
                vd1Var2.K0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.i6.n1(true, true);
                vd1Var2.f38567u0.f1();
                return;
        }
    }
}
