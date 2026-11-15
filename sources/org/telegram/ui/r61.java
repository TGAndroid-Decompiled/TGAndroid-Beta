package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class r61 implements View.OnClickListener {
    public final int f50860a;
    public int f50861b = 0;
    public final t71 f50862c;

    public r61(t71 t71Var, int i7) {
        this.f50860a = i7;
        this.f50862c = t71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50860a) {
            case 0:
                t71 t71Var = this.f50862c;
                t71Var.H0.setRotation(this.f50861b);
                this.f50861b -= 45;
                t71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.er.f34420g).start();
                j71[] j71VarArr = t71Var.f51476y0;
                j71 j71Var = j71VarArr[0];
                if (j71Var != null) {
                    Drawable background = j71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51469w;
                        if (t71Var.f51413b == 2) {
                            t71Var.f51441j1 += 45;
                            while (true) {
                                int i7 = t71Var.f51441j1;
                                if (i7 >= 360) {
                                    t71Var.f51441j1 = i7 - 360;
                                } else {
                                    t71Var.f1(t71Var.f51415b1, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.f28613n += 45;
                            while (true) {
                                int i10 = g6Var.f28613n;
                                if (i10 >= 360) {
                                    g6Var.f28613n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                j71 j71Var2 = j71VarArr[1];
                if (j71Var2 != null) {
                    Drawable background2 = j71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                t71 t71Var2 = this.f50862c;
                org.telegram.ui.ActionBar.p5 p5Var = t71Var2.T;
                t71Var2.I0.setRotation(this.f50861b);
                this.f50861b -= 45;
                t71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.er.f34420g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = t71Var2.f51469w;
                if (g6Var2.f28608i) {
                    if (p5Var.j() != null) {
                        p5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = g6Var2.h;
                if (i11 != 0) {
                    int i12 = g6Var2.f28605e;
                    if (i12 == 0) {
                        i12 = g6Var2.f28604c;
                    }
                    g6Var2.f28605e = g6Var2.f28606f;
                    g6Var2.f28606f = g6Var2.f28607g;
                    g6Var2.f28607g = i11;
                    g6Var2.h = i12;
                } else {
                    int i13 = g6Var2.f28605e;
                    if (i13 == 0) {
                        i13 = g6Var2.f28604c;
                    }
                    g6Var2.f28605e = g6Var2.f28606f;
                    g6Var2.f28606f = g6Var2.f28607g;
                    g6Var2.f28607g = i13;
                }
                t71Var2.X.e(g6Var2.h, 3);
                t71Var2.X.e(g6Var2.f28607g, 2);
                t71Var2.X.e(g6Var2.f28606f, 1);
                org.telegram.ui.Components.dq dqVar = t71Var2.X;
                int i14 = g6Var2.f28605e;
                if (i14 == 0) {
                    i14 = g6Var2.f28604c;
                }
                dqVar.e(i14, 0);
                t71Var2.M0[1].b(0, g6Var2.f28605e);
                t71Var2.M0[1].b(1, g6Var2.f28606f);
                t71Var2.M0[1].b(2, g6Var2.f28607g);
                t71Var2.M0[1].b(3, g6Var2.h);
                org.telegram.ui.ActionBar.j6.t1(true, true);
                t71Var2.f51470w0.g1();
                return;
        }
    }
}
