package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class v61 implements View.OnClickListener {
    public final int f52695a;
    public int f52696b = 0;
    public final x71 f52697c;

    public v61(x71 x71Var, int i7) {
        this.f52695a = i7;
        this.f52697c = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52695a) {
            case 0:
                x71 x71Var = this.f52697c;
                x71Var.H0.setRotation(this.f52696b);
                this.f52696b -= 45;
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.lr.f37209g).start();
                n71[] n71VarArr = x71Var.f53737y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.bb0) {
                        ((org.telegram.ui.Components.bb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.k6 k6Var = x71Var.f53730w;
                        if (x71Var.f53674b == 2) {
                            x71Var.f53702j1 += 45;
                            while (true) {
                                int i7 = x71Var.f53702j1;
                                if (i7 >= 360) {
                                    x71Var.f53702j1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.f53676b1, 0, true);
                                }
                            }
                        } else if (k6Var != null) {
                            k6Var.f29179n += 45;
                            while (true) {
                                int i10 = k6Var.f29179n;
                                if (i10 >= 360) {
                                    k6Var.f29179n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.n6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                n71 n71Var2 = n71VarArr[1];
                if (n71Var2 != null) {
                    Drawable background2 = n71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.bb0) {
                        ((org.telegram.ui.Components.bb0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                x71 x71Var2 = this.f52697c;
                org.telegram.ui.ActionBar.s5 s5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.f52696b);
                this.f52696b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.lr.f37209g).start();
                org.telegram.ui.ActionBar.k6 k6Var2 = x71Var2.f53730w;
                if (k6Var2.f29174i) {
                    if (s5Var.j() != null) {
                        s5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = k6Var2.h;
                if (i11 != 0) {
                    int i12 = k6Var2.f29171e;
                    if (i12 == 0) {
                        i12 = k6Var2.f29170c;
                    }
                    k6Var2.f29171e = k6Var2.f29172f;
                    k6Var2.f29172f = k6Var2.f29173g;
                    k6Var2.f29173g = i11;
                    k6Var2.h = i12;
                } else {
                    int i13 = k6Var2.f29171e;
                    if (i13 == 0) {
                        i13 = k6Var2.f29170c;
                    }
                    k6Var2.f29171e = k6Var2.f29172f;
                    k6Var2.f29172f = k6Var2.f29173g;
                    k6Var2.f29173g = i13;
                }
                x71Var2.X.e(k6Var2.h, 3);
                x71Var2.X.e(k6Var2.f29173g, 2);
                x71Var2.X.e(k6Var2.f29172f, 1);
                org.telegram.ui.Components.kq kqVar = x71Var2.X;
                int i14 = k6Var2.f29171e;
                if (i14 == 0) {
                    i14 = k6Var2.f29170c;
                }
                kqVar.e(i14, 0);
                x71Var2.M0[1].b(0, k6Var2.f29171e);
                x71Var2.M0[1].b(1, k6Var2.f29172f);
                x71Var2.M0[1].b(2, k6Var2.f29173g);
                x71Var2.M0[1].b(3, k6Var2.h);
                org.telegram.ui.ActionBar.n6.t1(true, true);
                x71Var2.f53731w0.g1();
                return;
        }
    }
}
