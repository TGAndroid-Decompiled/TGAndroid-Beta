package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class vc1 implements View.OnClickListener {
    public final int f42975a;
    public int f42976b = 0;
    public final wd1 f42977c;

    public vc1(wd1 wd1Var, int i10) {
        this.f42975a = i10;
        this.f42977c = wd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42975a) {
            case 0:
                wd1 wd1Var = this.f42977c;
                wd1Var.F0.setRotation(this.f42976b);
                this.f42976b -= 45;
                wd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.is.f27452g).start();
                ld1[] ld1VarArr = wd1Var.f43385w0;
                ld1 ld1Var = ld1VarArr[0];
                if (ld1Var != null) {
                    Drawable background = ld1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.dd0) {
                        ((org.telegram.ui.Components.dd0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = wd1Var.f43375s;
                        if (wd1Var.f43328b == 2) {
                            wd1Var.f43351h1 += 45;
                            while (true) {
                                int i10 = wd1Var.f43351h1;
                                if (i10 >= 360) {
                                    wd1Var.f43351h1 = i10 - 360;
                                } else {
                                    wd1Var.a1(wd1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.f20617n += 45;
                            while (true) {
                                int i11 = f6Var.f20617n;
                                if (i11 >= 360) {
                                    f6Var.f20617n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.h6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                ld1 ld1Var2 = ld1VarArr[1];
                if (ld1Var2 != null) {
                    Drawable background2 = ld1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.dd0) {
                        ((org.telegram.ui.Components.dd0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                wd1 wd1Var2 = this.f42977c;
                org.telegram.ui.ActionBar.o5 o5Var = wd1Var2.R;
                wd1Var2.G0.setRotation(this.f42976b);
                this.f42976b -= 45;
                wd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.is.f27452g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = wd1Var2.f43375s;
                if (f6Var2.f20612i) {
                    if (o5Var.i() != null) {
                        o5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = f6Var2.h;
                if (i12 != 0) {
                    int i13 = f6Var2.f20609e;
                    if (i13 == 0) {
                        i13 = f6Var2.f20608c;
                    }
                    f6Var2.f20609e = f6Var2.f20610f;
                    f6Var2.f20610f = f6Var2.f20611g;
                    f6Var2.f20611g = i12;
                    f6Var2.h = i13;
                } else {
                    int i14 = f6Var2.f20609e;
                    if (i14 == 0) {
                        i14 = f6Var2.f20608c;
                    }
                    f6Var2.f20609e = f6Var2.f20610f;
                    f6Var2.f20610f = f6Var2.f20611g;
                    f6Var2.f20611g = i14;
                }
                wd1Var2.V.e(f6Var2.h, 3);
                wd1Var2.V.e(f6Var2.f20611g, 2);
                wd1Var2.V.e(f6Var2.f20610f, 1);
                org.telegram.ui.Components.cr crVar = wd1Var2.V;
                int i15 = f6Var2.f20609e;
                if (i15 == 0) {
                    i15 = f6Var2.f20608c;
                }
                crVar.e(i15, 0);
                wd1Var2.K0[1].b(0, f6Var2.f20609e);
                wd1Var2.K0[1].b(1, f6Var2.f20610f);
                wd1Var2.K0[1].b(2, f6Var2.f20611g);
                wd1Var2.K0[1].b(3, f6Var2.h);
                org.telegram.ui.ActionBar.h6.o1(true, true);
                wd1Var2.f43380u0.f1();
                return;
        }
    }
}
