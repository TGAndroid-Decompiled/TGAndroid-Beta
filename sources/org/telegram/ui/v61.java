package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class v61 implements View.OnClickListener {
    public final int f52742a;
    public int f52743b = 0;
    public final x71 f52744c;

    public v61(x71 x71Var, int i7) {
        this.f52742a = i7;
        this.f52744c = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52742a) {
            case 0:
                x71 x71Var = this.f52744c;
                x71Var.H0.setRotation(this.f52743b);
                this.f52743b -= 45;
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f37961g).start();
                n71[] n71VarArr = x71Var.f53782y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cb0) {
                        ((org.telegram.ui.Components.cb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53775w;
                        if (x71Var.f53719b == 2) {
                            x71Var.f53747j1 += 45;
                            while (true) {
                                int i7 = x71Var.f53747j1;
                                if (i7 >= 360) {
                                    x71Var.f53747j1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.f53721b1, 0, true);
                                }
                            }
                        } else if (j6Var != null) {
                            j6Var.f29107n += 45;
                            while (true) {
                                int i10 = j6Var.f29107n;
                                if (i10 >= 360) {
                                    j6Var.f29107n = i10 - 360;
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
                x71 x71Var2 = this.f52744c;
                org.telegram.ui.ActionBar.r5 r5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.f52743b);
                this.f52743b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f37961g).start();
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.f53775w;
                if (j6Var2.f29102i) {
                    if (r5Var.j() != null) {
                        r5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = j6Var2.h;
                if (i11 != 0) {
                    int i12 = j6Var2.f29099e;
                    if (i12 == 0) {
                        i12 = j6Var2.f29098c;
                    }
                    j6Var2.f29099e = j6Var2.f29100f;
                    j6Var2.f29100f = j6Var2.f29101g;
                    j6Var2.f29101g = i11;
                    j6Var2.h = i12;
                } else {
                    int i13 = j6Var2.f29099e;
                    if (i13 == 0) {
                        i13 = j6Var2.f29098c;
                    }
                    j6Var2.f29099e = j6Var2.f29100f;
                    j6Var2.f29100f = j6Var2.f29101g;
                    j6Var2.f29101g = i13;
                }
                x71Var2.X.e(j6Var2.h, 3);
                x71Var2.X.e(j6Var2.f29101g, 2);
                x71Var2.X.e(j6Var2.f29100f, 1);
                org.telegram.ui.Components.mq mqVar = x71Var2.X;
                int i14 = j6Var2.f29099e;
                if (i14 == 0) {
                    i14 = j6Var2.f29098c;
                }
                mqVar.e(i14, 0);
                x71Var2.M0[1].b(0, j6Var2.f29099e);
                x71Var2.M0[1].b(1, j6Var2.f29100f);
                x71Var2.M0[1].b(2, j6Var2.f29101g);
                x71Var2.M0[1].b(3, j6Var2.h);
                org.telegram.ui.ActionBar.m6.t1(true, true);
                x71Var2.f53776w0.g1();
                return;
        }
    }
}
