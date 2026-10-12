package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class yc1 implements View.OnClickListener {
    public final int f44450a;
    public int f44451b = 0;
    public final zd1 f44452c;

    public yc1(zd1 zd1Var, int i10) {
        this.f44450a = i10;
        this.f44452c = zd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44450a) {
            case 0:
                zd1 zd1Var = this.f44452c;
                zd1Var.F0.setRotation(this.f44451b);
                this.f44451b -= 45;
                zd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.js.f27628g).start();
                od1[] od1VarArr = zd1Var.f44789w0;
                od1 od1Var = od1VarArr[0];
                if (od1Var != null) {
                    Drawable background = od1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.gd0) {
                        ((org.telegram.ui.Components.gd0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = zd1Var.f44779s;
                        if (zd1Var.f44732b == 2) {
                            zd1Var.f44755h1 += 45;
                            while (true) {
                                int i10 = zd1Var.f44755h1;
                                if (i10 >= 360) {
                                    zd1Var.f44755h1 = i10 - 360;
                                } else {
                                    zd1Var.a1(zd1Var.Z0, 0, true);
                                }
                            }
                        } else if (e6Var != null) {
                            e6Var.f20360n += 45;
                            while (true) {
                                int i11 = e6Var.f20360n;
                                if (i11 >= 360) {
                                    e6Var.f20360n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.h6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                od1 od1Var2 = od1VarArr[1];
                if (od1Var2 != null) {
                    Drawable background2 = od1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.gd0) {
                        ((org.telegram.ui.Components.gd0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                zd1 zd1Var2 = this.f44452c;
                org.telegram.ui.ActionBar.o5 o5Var = zd1Var2.R;
                zd1Var2.G0.setRotation(this.f44451b);
                this.f44451b -= 45;
                zd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.js.f27628g).start();
                org.telegram.ui.ActionBar.e6 e6Var2 = zd1Var2.f44779s;
                if (e6Var2.f20355i) {
                    if (o5Var.i() != null) {
                        o5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = e6Var2.h;
                if (i12 != 0) {
                    int i13 = e6Var2.f20352e;
                    if (i13 == 0) {
                        i13 = e6Var2.f20351c;
                    }
                    e6Var2.f20352e = e6Var2.f20353f;
                    e6Var2.f20353f = e6Var2.f20354g;
                    e6Var2.f20354g = i12;
                    e6Var2.h = i13;
                } else {
                    int i14 = e6Var2.f20352e;
                    if (i14 == 0) {
                        i14 = e6Var2.f20351c;
                    }
                    e6Var2.f20352e = e6Var2.f20353f;
                    e6Var2.f20353f = e6Var2.f20354g;
                    e6Var2.f20354g = i14;
                }
                zd1Var2.V.e(e6Var2.h, 3);
                zd1Var2.V.e(e6Var2.f20354g, 2);
                zd1Var2.V.e(e6Var2.f20353f, 1);
                org.telegram.ui.Components.er erVar = zd1Var2.V;
                int i15 = e6Var2.f20352e;
                if (i15 == 0) {
                    i15 = e6Var2.f20351c;
                }
                erVar.e(i15, 0);
                zd1Var2.K0[1].b(0, e6Var2.f20352e);
                zd1Var2.K0[1].b(1, e6Var2.f20353f);
                zd1Var2.K0[1].b(2, e6Var2.f20354g);
                zd1Var2.K0[1].b(3, e6Var2.h);
                org.telegram.ui.ActionBar.h6.o1(true, true);
                zd1Var2.f44784u0.f1();
                return;
        }
    }
}
