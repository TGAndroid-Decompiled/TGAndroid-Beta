package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class v61 implements View.OnClickListener {
    public final int f52720a;
    public int f52721b = 0;
    public final x71 f52722c;

    public v61(x71 x71Var, int i7) {
        this.f52720a = i7;
        this.f52722c = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52720a) {
            case 0:
                x71 x71Var = this.f52722c;
                x71Var.H0.setRotation(this.f52721b);
                this.f52721b -= 45;
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f37918g).start();
                n71[] n71VarArr = x71Var.f53704y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cb0) {
                        ((org.telegram.ui.Components.cb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53697w;
                        if (x71Var.f53641b == 2) {
                            x71Var.f53669j1 += 45;
                            while (true) {
                                int i7 = x71Var.f53669j1;
                                if (i7 >= 360) {
                                    x71Var.f53669j1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.f53643b1, 0, true);
                                }
                            }
                        } else if (j6Var != null) {
                            j6Var.f29073n += 45;
                            while (true) {
                                int i10 = j6Var.f29073n;
                                if (i10 >= 360) {
                                    j6Var.f29073n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.m6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                n71 n71Var2 = n71VarArr[1];
                if (n71Var2 != null) {
                    Drawable background2 = n71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.cb0) {
                        ((org.telegram.ui.Components.cb0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                x71 x71Var2 = this.f52722c;
                org.telegram.ui.ActionBar.r5 r5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.f52721b);
                this.f52721b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f37918g).start();
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.f53697w;
                if (j6Var2.f29068i) {
                    if (r5Var.j() != null) {
                        r5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = j6Var2.h;
                if (i11 != 0) {
                    int i12 = j6Var2.f29065e;
                    if (i12 == 0) {
                        i12 = j6Var2.f29064c;
                    }
                    j6Var2.f29065e = j6Var2.f29066f;
                    j6Var2.f29066f = j6Var2.f29067g;
                    j6Var2.f29067g = i11;
                    j6Var2.h = i12;
                } else {
                    int i13 = j6Var2.f29065e;
                    if (i13 == 0) {
                        i13 = j6Var2.f29064c;
                    }
                    j6Var2.f29065e = j6Var2.f29066f;
                    j6Var2.f29066f = j6Var2.f29067g;
                    j6Var2.f29067g = i13;
                }
                x71Var2.X.e(j6Var2.h, 3);
                x71Var2.X.e(j6Var2.f29067g, 2);
                x71Var2.X.e(j6Var2.f29066f, 1);
                org.telegram.ui.Components.mq mqVar = x71Var2.X;
                int i14 = j6Var2.f29065e;
                if (i14 == 0) {
                    i14 = j6Var2.f29064c;
                }
                mqVar.e(i14, 0);
                x71Var2.M0[1].b(0, j6Var2.f29065e);
                x71Var2.M0[1].b(1, j6Var2.f29066f);
                x71Var2.M0[1].b(2, j6Var2.f29067g);
                x71Var2.M0[1].b(3, j6Var2.h);
                org.telegram.ui.ActionBar.m6.t1(true, true);
                x71Var2.f53698w0.g1();
                return;
        }
    }
}
