package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class v61 implements View.OnClickListener {
    public final int f52709a;
    public int f52710b = 0;
    public final x71 f52711c;

    public v61(x71 x71Var, int i7) {
        this.f52709a = i7;
        this.f52711c = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52709a) {
            case 0:
                x71 x71Var = this.f52711c;
                x71Var.H0.setRotation(this.f52710b);
                this.f52710b -= 45;
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.lr.f37209g).start();
                n71[] n71VarArr = x71Var.f53749y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.bb0) {
                        ((org.telegram.ui.Components.bb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.k6 k6Var = x71Var.f53742w;
                        if (x71Var.f53686b == 2) {
                            x71Var.f53714j1 += 45;
                            while (true) {
                                int i7 = x71Var.f53714j1;
                                if (i7 >= 360) {
                                    x71Var.f53714j1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.f53688b1, 0, true);
                                }
                            }
                        } else if (k6Var != null) {
                            k6Var.f29181n += 45;
                            while (true) {
                                int i10 = k6Var.f29181n;
                                if (i10 >= 360) {
                                    k6Var.f29181n = i10 - 360;
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
                x71 x71Var2 = this.f52711c;
                org.telegram.ui.ActionBar.s5 s5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.f52710b);
                this.f52710b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.lr.f37209g).start();
                org.telegram.ui.ActionBar.k6 k6Var2 = x71Var2.f53742w;
                if (k6Var2.f29176i) {
                    if (s5Var.j() != null) {
                        s5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = k6Var2.h;
                if (i11 != 0) {
                    int i12 = k6Var2.f29173e;
                    if (i12 == 0) {
                        i12 = k6Var2.f29172c;
                    }
                    k6Var2.f29173e = k6Var2.f29174f;
                    k6Var2.f29174f = k6Var2.f29175g;
                    k6Var2.f29175g = i11;
                    k6Var2.h = i12;
                } else {
                    int i13 = k6Var2.f29173e;
                    if (i13 == 0) {
                        i13 = k6Var2.f29172c;
                    }
                    k6Var2.f29173e = k6Var2.f29174f;
                    k6Var2.f29174f = k6Var2.f29175g;
                    k6Var2.f29175g = i13;
                }
                x71Var2.X.e(k6Var2.h, 3);
                x71Var2.X.e(k6Var2.f29175g, 2);
                x71Var2.X.e(k6Var2.f29174f, 1);
                org.telegram.ui.Components.kq kqVar = x71Var2.X;
                int i14 = k6Var2.f29173e;
                if (i14 == 0) {
                    i14 = k6Var2.f29172c;
                }
                kqVar.e(i14, 0);
                x71Var2.M0[1].b(0, k6Var2.f29173e);
                x71Var2.M0[1].b(1, k6Var2.f29174f);
                x71Var2.M0[1].b(2, k6Var2.f29175g);
                x71Var2.M0[1].b(3, k6Var2.h);
                org.telegram.ui.ActionBar.n6.t1(true, true);
                x71Var2.f53743w0.g1();
                return;
        }
    }
}
