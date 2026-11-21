package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class v61 implements View.OnClickListener {
    public final int f52738a;
    public int f52739b = 0;
    public final x71 f52740c;

    public v61(x71 x71Var, int i7) {
        this.f52738a = i7;
        this.f52740c = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52738a) {
            case 0:
                x71 x71Var = this.f52740c;
                x71Var.H0.setRotation(this.f52739b);
                this.f52739b -= 45;
                x71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f37957g).start();
                n71[] n71VarArr = x71Var.f53778y0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.cb0) {
                        ((org.telegram.ui.Components.cb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53771w;
                        if (x71Var.f53715b == 2) {
                            x71Var.f53743j1 += 45;
                            while (true) {
                                int i7 = x71Var.f53743j1;
                                if (i7 >= 360) {
                                    x71Var.f53743j1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.f53717b1, 0, true);
                                }
                            }
                        } else if (j6Var != null) {
                            j6Var.f29104n += 45;
                            while (true) {
                                int i10 = j6Var.f29104n;
                                if (i10 >= 360) {
                                    j6Var.f29104n = i10 - 360;
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
                x71 x71Var2 = this.f52740c;
                org.telegram.ui.ActionBar.r5 r5Var = x71Var2.T;
                x71Var2.I0.setRotation(this.f52739b);
                this.f52739b -= 45;
                x71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.f37957g).start();
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.f53771w;
                if (j6Var2.f29099i) {
                    if (r5Var.j() != null) {
                        r5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = j6Var2.h;
                if (i11 != 0) {
                    int i12 = j6Var2.f29096e;
                    if (i12 == 0) {
                        i12 = j6Var2.f29095c;
                    }
                    j6Var2.f29096e = j6Var2.f29097f;
                    j6Var2.f29097f = j6Var2.f29098g;
                    j6Var2.f29098g = i11;
                    j6Var2.h = i12;
                } else {
                    int i13 = j6Var2.f29096e;
                    if (i13 == 0) {
                        i13 = j6Var2.f29095c;
                    }
                    j6Var2.f29096e = j6Var2.f29097f;
                    j6Var2.f29097f = j6Var2.f29098g;
                    j6Var2.f29098g = i13;
                }
                x71Var2.X.e(j6Var2.h, 3);
                x71Var2.X.e(j6Var2.f29098g, 2);
                x71Var2.X.e(j6Var2.f29097f, 1);
                org.telegram.ui.Components.mq mqVar = x71Var2.X;
                int i14 = j6Var2.f29096e;
                if (i14 == 0) {
                    i14 = j6Var2.f29095c;
                }
                mqVar.e(i14, 0);
                x71Var2.M0[1].b(0, j6Var2.f29096e);
                x71Var2.M0[1].b(1, j6Var2.f29097f);
                x71Var2.M0[1].b(2, j6Var2.f29098g);
                x71Var2.M0[1].b(3, j6Var2.h);
                org.telegram.ui.ActionBar.m6.t1(true, true);
                x71Var2.f53772w0.g1();
                return;
        }
    }
}
