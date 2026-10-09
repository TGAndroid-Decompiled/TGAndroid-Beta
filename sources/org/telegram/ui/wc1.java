package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class wc1 implements View.OnClickListener {
    public final int f43184a;
    public int f43185b = 0;
    public final xd1 f43186c;

    public wc1(xd1 xd1Var, int i10) {
        this.f43184a = i10;
        this.f43186c = xd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43184a) {
            case 0:
                xd1 xd1Var = this.f43186c;
                xd1Var.F0.setRotation(this.f43185b);
                this.f43185b -= 45;
                xd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.hs.f27119g).start();
                md1[] md1VarArr = xd1Var.f43995w0;
                md1 md1Var = md1VarArr[0];
                if (md1Var != null) {
                    Drawable background = md1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cd0) {
                        ((org.telegram.ui.Components.cd0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.f43985s;
                        if (xd1Var.f43938b == 2) {
                            xd1Var.f43961h1 += 45;
                            while (true) {
                                int i10 = xd1Var.f43961h1;
                                if (i10 >= 360) {
                                    xd1Var.f43961h1 = i10 - 360;
                                } else {
                                    xd1Var.a1(xd1Var.Z0, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f20664n += 45;
                            while (true) {
                                int i11 = g6Var.f20664n;
                                if (i11 >= 360) {
                                    g6Var.f20664n = i11 - 360;
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
                    if (background2 instanceof org.telegram.ui.Components.cd0) {
                        ((org.telegram.ui.Components.cd0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                xd1 xd1Var2 = this.f43186c;
                org.telegram.ui.ActionBar.q5 q5Var = xd1Var2.R;
                xd1Var2.G0.setRotation(this.f43185b);
                this.f43185b -= 45;
                xd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.hs.f27119g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = xd1Var2.f43985s;
                if (g6Var2.f20659i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = g6Var2.h;
                if (i12 != 0) {
                    int i13 = g6Var2.f20656e;
                    if (i13 == 0) {
                        i13 = g6Var2.f20655c;
                    }
                    g6Var2.f20656e = g6Var2.f20657f;
                    g6Var2.f20657f = g6Var2.f20658g;
                    g6Var2.f20658g = i12;
                    g6Var2.h = i13;
                } else {
                    int i14 = g6Var2.f20656e;
                    if (i14 == 0) {
                        i14 = g6Var2.f20655c;
                    }
                    g6Var2.f20656e = g6Var2.f20657f;
                    g6Var2.f20657f = g6Var2.f20658g;
                    g6Var2.f20658g = i14;
                }
                xd1Var2.V.e(g6Var2.h, 3);
                xd1Var2.V.e(g6Var2.f20658g, 2);
                xd1Var2.V.e(g6Var2.f20657f, 1);
                org.telegram.ui.Components.cr crVar = xd1Var2.V;
                int i15 = g6Var2.f20656e;
                if (i15 == 0) {
                    i15 = g6Var2.f20655c;
                }
                crVar.e(i15, 0);
                xd1Var2.K0[1].b(0, g6Var2.f20656e);
                xd1Var2.K0[1].b(1, g6Var2.f20657f);
                xd1Var2.K0[1].b(2, g6Var2.f20658g);
                xd1Var2.K0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.i6.o1(true, true);
                xd1Var2.f43990u0.f1();
                return;
        }
    }
}
