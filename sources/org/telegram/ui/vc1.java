package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class vc1 implements View.OnClickListener {
    public final int f41515a;
    public int f41516b = 0;
    public final wd1 f41517c;

    public vc1(wd1 wd1Var, int i10) {
        this.f41515a = i10;
        this.f41517c = wd1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41515a) {
            case 0:
                wd1 wd1Var = this.f41517c;
                wd1Var.F0.setRotation(this.f41516b);
                this.f41516b -= 45;
                wd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.f29468g).start();
                ld1[] ld1VarArr = wd1Var.f41975w0;
                ld1 ld1Var = ld1VarArr[0];
                if (ld1Var != null) {
                    Drawable background = ld1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.f41965s;
                        if (wd1Var.f41918b == 2) {
                            wd1Var.f41941h1 += 45;
                            while (true) {
                                int i10 = wd1Var.f41941h1;
                                if (i10 >= 360) {
                                    wd1Var.f41941h1 = i10 - 360;
                                } else {
                                    wd1Var.a1(wd1Var.Z0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f20502n += 45;
                            while (true) {
                                int i11 = h6Var.f20502n;
                                if (i11 >= 360) {
                                    h6Var.f20502n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                ld1 ld1Var2 = ld1VarArr[1];
                if (ld1Var2 != null) {
                    Drawable background2 = ld1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                wd1 wd1Var2 = this.f41517c;
                org.telegram.ui.ActionBar.q5 q5Var = wd1Var2.R;
                wd1Var2.G0.setRotation(this.f41516b);
                this.f41516b -= 45;
                wd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.pr.f29468g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = wd1Var2.f41965s;
                if (h6Var2.f20497i) {
                    if (q5Var.i() != null) {
                        q5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = h6Var2.h;
                if (i12 != 0) {
                    int i13 = h6Var2.f20494e;
                    if (i13 == 0) {
                        i13 = h6Var2.f20493c;
                    }
                    h6Var2.f20494e = h6Var2.f20495f;
                    h6Var2.f20495f = h6Var2.f20496g;
                    h6Var2.f20496g = i12;
                    h6Var2.h = i13;
                } else {
                    int i14 = h6Var2.f20494e;
                    if (i14 == 0) {
                        i14 = h6Var2.f20493c;
                    }
                    h6Var2.f20494e = h6Var2.f20495f;
                    h6Var2.f20495f = h6Var2.f20496g;
                    h6Var2.f20496g = i14;
                }
                wd1Var2.V.e(h6Var2.h, 3);
                wd1Var2.V.e(h6Var2.f20496g, 2);
                wd1Var2.V.e(h6Var2.f20495f, 1);
                org.telegram.ui.Components.lq lqVar = wd1Var2.V;
                int i15 = h6Var2.f20494e;
                if (i15 == 0) {
                    i15 = h6Var2.f20493c;
                }
                lqVar.e(i15, 0);
                wd1Var2.K0[1].b(0, h6Var2.f20494e);
                wd1Var2.K0[1].b(1, h6Var2.f20495f);
                wd1Var2.K0[1].b(2, h6Var2.f20496g);
                wd1Var2.K0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.j6.n1(true, true);
                wd1Var2.f41970u0.e1();
                return;
        }
    }
}
