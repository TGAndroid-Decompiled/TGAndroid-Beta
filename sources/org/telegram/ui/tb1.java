package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class tb1 implements View.OnClickListener {
    public final int f43594a;
    public int f43595b = 0;
    public final vc1 f43596c;

    public tb1(vc1 vc1Var, int i10) {
        this.f43594a = i10;
        this.f43596c = vc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43594a) {
            case 0:
                vc1 vc1Var = this.f43596c;
                vc1Var.G0.setRotation(this.f43595b);
                this.f43595b -= 45;
                vc1Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.f27531g).start();
                kc1[] kc1VarArr = vc1Var.f44309x0;
                kc1 kc1Var = kc1VarArr[0];
                if (kc1Var != null) {
                    Drawable background = kc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.vc0) {
                        ((org.telegram.ui.Components.vc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
                        if (vc1Var.f44249b == 2) {
                            vc1Var.f44274i1 += 45;
                            while (true) {
                                int i10 = vc1Var.f44274i1;
                                if (i10 >= 360) {
                                    vc1Var.f44274i1 = i10 - 360;
                                } else {
                                    vc1Var.b1(vc1Var.f44248a1, 0, true);
                                }
                            }
                        } else if (w6Var != null) {
                            w6Var.f23226n += 45;
                            while (true) {
                                int i11 = w6Var.f23226n;
                                if (i11 >= 360) {
                                    w6Var.f23226n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.y6.q1(false, false);
                                }
                            }
                        }
                    }
                }
                kc1 kc1Var2 = kc1VarArr[1];
                if (kc1Var2 != null) {
                    Drawable background2 = kc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.vc0) {
                        ((org.telegram.ui.Components.vc0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                vc1 vc1Var2 = this.f43596c;
                org.telegram.ui.ActionBar.g6 g6Var = vc1Var2.S;
                vc1Var2.H0.setRotation(this.f43595b);
                this.f43595b -= 45;
                vc1Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.f27531g).start();
                org.telegram.ui.ActionBar.w6 w6Var2 = vc1Var2.v;
                if (w6Var2.f23221i) {
                    if (g6Var.i() != null) {
                        g6Var.i().w(false);
                        return;
                    }
                    return;
                }
                int i12 = w6Var2.h;
                if (i12 != 0) {
                    int i13 = w6Var2.e;
                    if (i13 == 0) {
                        i13 = w6Var2.f23218c;
                    }
                    w6Var2.e = w6Var2.f23219f;
                    w6Var2.f23219f = w6Var2.f23220g;
                    w6Var2.f23220g = i12;
                    w6Var2.h = i13;
                } else {
                    int i14 = w6Var2.e;
                    if (i14 == 0) {
                        i14 = w6Var2.f23218c;
                    }
                    w6Var2.e = w6Var2.f23219f;
                    w6Var2.f23219f = w6Var2.f23220g;
                    w6Var2.f23220g = i14;
                }
                vc1Var2.W.e(w6Var2.h, 3);
                vc1Var2.W.e(w6Var2.f23220g, 2);
                vc1Var2.W.e(w6Var2.f23219f, 1);
                org.telegram.ui.Components.yq yqVar = vc1Var2.W;
                int i15 = w6Var2.e;
                if (i15 == 0) {
                    i15 = w6Var2.f23218c;
                }
                yqVar.e(i15, 0);
                vc1Var2.L0[1].b(0, w6Var2.e);
                vc1Var2.L0[1].b(1, w6Var2.f23219f);
                vc1Var2.L0[1].b(2, w6Var2.f23220g);
                vc1Var2.L0[1].b(3, w6Var2.h);
                org.telegram.ui.ActionBar.y6.q1(true, true);
                vc1Var2.f44303v0.g1();
                return;
        }
    }
}
