package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class wc1 implements View.OnClickListener {
    public final int f43230a;
    public int f43231b = 0;
    public final xd1 f43232c;

    public wc1(xd1 xd1Var, int i10) {
        this.f43230a = i10;
        this.f43232c = xd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43230a) {
            case 0:
                xd1 xd1Var = this.f43232c;
                xd1Var.F0.setRotation(this.f43231b);
                this.f43231b -= 45;
                xd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.is.f27444g).start();
                md1[] md1VarArr = xd1Var.f44041w0;
                md1 md1Var = md1VarArr[0];
                if (md1Var != null) {
                    Drawable background = md1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.dd0) {
                        ((org.telegram.ui.Components.dd0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f44031s;
                        if (xd1Var.f43984b == 2) {
                            xd1Var.f44007h1 += 45;
                            while (true) {
                                int i10 = xd1Var.f44007h1;
                                if (i10 >= 360) {
                                    xd1Var.f44007h1 = i10 - 360;
                                } else {
                                    xd1Var.a1(xd1Var.Z0, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f20668n += 45;
                            while (true) {
                                int i11 = g6Var.f20668n;
                                if (i11 >= 360) {
                                    g6Var.f20668n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                md1 md1Var2 = md1VarArr[1];
                if (md1Var2 != null) {
                    Drawable background2 = md1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.dd0) {
                        ((org.telegram.ui.Components.dd0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                xd1 xd1Var2 = this.f43232c;
                org.telegram.ui.ActionBar.q5 q5Var = xd1Var2.R;
                xd1Var2.G0.setRotation(this.f43231b);
                this.f43231b -= 45;
                xd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.is.f27444g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = xd1Var2.f44031s;
                if (g6Var2.f20663i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = g6Var2.h;
                if (i12 != 0) {
                    int i13 = g6Var2.f20660e;
                    if (i13 == 0) {
                        i13 = g6Var2.f20659c;
                    }
                    g6Var2.f20660e = g6Var2.f20661f;
                    g6Var2.f20661f = g6Var2.f20662g;
                    g6Var2.f20662g = i12;
                    g6Var2.h = i13;
                } else {
                    int i14 = g6Var2.f20660e;
                    if (i14 == 0) {
                        i14 = g6Var2.f20659c;
                    }
                    g6Var2.f20660e = g6Var2.f20661f;
                    g6Var2.f20661f = g6Var2.f20662g;
                    g6Var2.f20662g = i14;
                }
                xd1Var2.V.e(g6Var2.h, 3);
                xd1Var2.V.e(g6Var2.f20662g, 2);
                xd1Var2.V.e(g6Var2.f20661f, 1);
                org.telegram.ui.Components.cr crVar = xd1Var2.V;
                int i15 = g6Var2.f20660e;
                if (i15 == 0) {
                    i15 = g6Var2.f20659c;
                }
                crVar.e(i15, 0);
                xd1Var2.K0[1].b(0, g6Var2.f20660e);
                xd1Var2.K0[1].b(1, g6Var2.f20661f);
                xd1Var2.K0[1].b(2, g6Var2.f20662g);
                xd1Var2.K0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.i6.o1(true, true);
                xd1Var2.f44036u0.f1();
                return;
        }
    }
}
