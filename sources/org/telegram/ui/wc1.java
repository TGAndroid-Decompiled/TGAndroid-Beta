package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class wc1 implements View.OnClickListener {
    public final int f38689a;
    public int f38690b = 0;
    public final xd1 f38691c;

    public wc1(xd1 xd1Var, int i10) {
        this.f38689a = i10;
        this.f38691c = xd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38689a) {
            case 0:
                xd1 xd1Var = this.f38691c;
                xd1Var.F0.setRotation(this.f38690b);
                this.f38690b -= 45;
                xd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27384g).start();
                md1[] md1VarArr = xd1Var.f39595w0;
                md1 md1Var = md1VarArr[0];
                if (md1Var != null) {
                    Drawable background = md1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.f39585s;
                        if (xd1Var.f39539b == 2) {
                            xd1Var.f39561h1 += 45;
                            while (true) {
                                int i10 = xd1Var.f39561h1;
                                if (i10 >= 360) {
                                    xd1Var.f39561h1 = i10 - 360;
                                } else {
                                    xd1Var.a1(xd1Var.Z0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f18731n += 45;
                            while (true) {
                                int i11 = h6Var.f18731n;
                                if (i11 >= 360) {
                                    h6Var.f18731n = i11 - 360;
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
                    if (background2 instanceof org.telegram.ui.Components.cc0) {
                        ((org.telegram.ui.Components.cc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                xd1 xd1Var2 = this.f38691c;
                org.telegram.ui.ActionBar.r5 r5Var = xd1Var2.R;
                xd1Var2.G0.setRotation(this.f38690b);
                this.f38690b -= 45;
                xd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.qr.f27384g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var2.f39585s;
                if (h6Var2.f18726i) {
                    if (r5Var.i() != null) {
                        r5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = h6Var2.h;
                if (i12 != 0) {
                    int i13 = h6Var2.e;
                    if (i13 == 0) {
                        i13 = h6Var2.f18723c;
                    }
                    h6Var2.e = h6Var2.f18724f;
                    h6Var2.f18724f = h6Var2.f18725g;
                    h6Var2.f18725g = i12;
                    h6Var2.h = i13;
                } else {
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.f18723c;
                    }
                    h6Var2.e = h6Var2.f18724f;
                    h6Var2.f18724f = h6Var2.f18725g;
                    h6Var2.f18725g = i14;
                }
                xd1Var2.V.e(h6Var2.h, 3);
                xd1Var2.V.e(h6Var2.f18725g, 2);
                xd1Var2.V.e(h6Var2.f18724f, 1);
                org.telegram.ui.Components.mq mqVar = xd1Var2.V;
                int i15 = h6Var2.e;
                if (i15 == 0) {
                    i15 = h6Var2.f18723c;
                }
                mqVar.e(i15, 0);
                xd1Var2.K0[1].b(0, h6Var2.e);
                xd1Var2.K0[1].b(1, h6Var2.f18724f);
                xd1Var2.K0[1].b(2, h6Var2.f18725g);
                xd1Var2.K0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.j6.n1(true, true);
                xd1Var2.f39590u0.g1();
                return;
        }
    }
}
