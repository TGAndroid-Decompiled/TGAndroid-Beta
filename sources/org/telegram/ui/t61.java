package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class t61 implements View.OnClickListener {
    public final int f52271a;
    public int f52272b = 0;
    public final v71 f52273c;

    public t61(v71 v71Var, int i7) {
        this.f52271a = i7;
        this.f52273c = v71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52271a) {
            case 0:
                v71 v71Var = this.f52273c;
                v71Var.H0.setRotation(this.f52272b);
                this.f52272b -= 45;
                v71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.kr.f36859g).start();
                l71[] l71VarArr = v71Var.f52912y0;
                l71 l71Var = l71VarArr[0];
                if (l71Var != null) {
                    Drawable background = l71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.za0) {
                        ((org.telegram.ui.Components.za0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
                        if (v71Var.f52849b == 2) {
                            v71Var.f52877j1 += 45;
                            while (true) {
                                int i7 = v71Var.f52877j1;
                                if (i7 >= 360) {
                                    v71Var.f52877j1 = i7 - 360;
                                } else {
                                    v71Var.f1(v71Var.f52851b1, 0, true);
                                }
                            }
                        } else if (k6Var != null) {
                            k6Var.f29235n += 45;
                            while (true) {
                                int i10 = k6Var.f29235n;
                                if (i10 >= 360) {
                                    k6Var.f29235n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.n6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                l71 l71Var2 = l71VarArr[1];
                if (l71Var2 != null) {
                    Drawable background2 = l71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.za0) {
                        ((org.telegram.ui.Components.za0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                v71 v71Var2 = this.f52273c;
                org.telegram.ui.ActionBar.s5 s5Var = v71Var2.T;
                v71Var2.I0.setRotation(this.f52272b);
                this.f52272b -= 45;
                v71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.kr.f36859g).start();
                org.telegram.ui.ActionBar.k6 k6Var2 = v71Var2.f52905w;
                if (k6Var2.f29230i) {
                    if (s5Var.j() != null) {
                        s5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = k6Var2.h;
                if (i11 != 0) {
                    int i12 = k6Var2.f29227e;
                    if (i12 == 0) {
                        i12 = k6Var2.f29226c;
                    }
                    k6Var2.f29227e = k6Var2.f29228f;
                    k6Var2.f29228f = k6Var2.f29229g;
                    k6Var2.f29229g = i11;
                    k6Var2.h = i12;
                } else {
                    int i13 = k6Var2.f29227e;
                    if (i13 == 0) {
                        i13 = k6Var2.f29226c;
                    }
                    k6Var2.f29227e = k6Var2.f29228f;
                    k6Var2.f29228f = k6Var2.f29229g;
                    k6Var2.f29229g = i13;
                }
                v71Var2.X.e(k6Var2.h, 3);
                v71Var2.X.e(k6Var2.f29229g, 2);
                v71Var2.X.e(k6Var2.f29228f, 1);
                org.telegram.ui.Components.jq jqVar = v71Var2.X;
                int i14 = k6Var2.f29227e;
                if (i14 == 0) {
                    i14 = k6Var2.f29226c;
                }
                jqVar.e(i14, 0);
                v71Var2.M0[1].b(0, k6Var2.f29227e);
                v71Var2.M0[1].b(1, k6Var2.f29228f);
                v71Var2.M0[1].b(2, k6Var2.f29229g);
                v71Var2.M0[1].b(3, k6Var2.h);
                org.telegram.ui.ActionBar.n6.t1(true, true);
                v71Var2.f52906w0.g1();
                return;
        }
    }
}
