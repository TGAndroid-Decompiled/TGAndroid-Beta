package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class zc1 implements View.OnClickListener {
    public final int f39259a;
    public int f39260b = 0;
    public final ae1 f39261c;

    public zc1(ae1 ae1Var, int i10) {
        this.f39259a = i10;
        this.f39261c = ae1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39259a) {
            case 0:
                ae1 ae1Var = this.f39261c;
                ae1Var.F0.setRotation(this.f39260b);
                this.f39260b -= 45;
                ae1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wr.f28820g).start();
                pd1[] pd1VarArr = ae1Var.f30973w0;
                pd1 pd1Var = pd1VarArr[0];
                if (pd1Var != null) {
                    Drawable background = pd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.lc0) {
                        ((org.telegram.ui.Components.lc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = ae1Var.f30963s;
                        if (ae1Var.f30917b == 2) {
                            ae1Var.f30939h1 += 45;
                            while (true) {
                                int i10 = ae1Var.f30939h1;
                                if (i10 >= 360) {
                                    ae1Var.f30939h1 = i10 - 360;
                                } else {
                                    ae1Var.a1(ae1Var.Z0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f17802n += 45;
                            while (true) {
                                int i11 = h6Var.f17802n;
                                if (i11 >= 360) {
                                    h6Var.f17802n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                pd1 pd1Var2 = pd1VarArr[1];
                if (pd1Var2 != null) {
                    Drawable background2 = pd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.lc0) {
                        ((org.telegram.ui.Components.lc0) background2).x(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ae1 ae1Var2 = this.f39261c;
                org.telegram.ui.ActionBar.r5 r5Var = ae1Var2.R;
                ae1Var2.G0.setRotation(this.f39260b);
                this.f39260b -= 45;
                ae1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wr.f28820g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = ae1Var2.f30963s;
                if (h6Var2.f17797i) {
                    if (r5Var.i() != null) {
                        r5Var.i().x(false);
                        return;
                    }
                    return;
                }
                int i12 = h6Var2.h;
                if (i12 != 0) {
                    int i13 = h6Var2.e;
                    if (i13 == 0) {
                        i13 = h6Var2.f17794c;
                    }
                    h6Var2.e = h6Var2.f17795f;
                    h6Var2.f17795f = h6Var2.f17796g;
                    h6Var2.f17796g = i12;
                    h6Var2.h = i13;
                } else {
                    int i14 = h6Var2.e;
                    if (i14 == 0) {
                        i14 = h6Var2.f17794c;
                    }
                    h6Var2.e = h6Var2.f17795f;
                    h6Var2.f17795f = h6Var2.f17796g;
                    h6Var2.f17796g = i14;
                }
                ae1Var2.V.e(h6Var2.h, 3);
                ae1Var2.V.e(h6Var2.f17796g, 2);
                ae1Var2.V.e(h6Var2.f17795f, 1);
                org.telegram.ui.Components.sq sqVar = ae1Var2.V;
                int i15 = h6Var2.e;
                if (i15 == 0) {
                    i15 = h6Var2.f17794c;
                }
                sqVar.e(i15, 0);
                ae1Var2.K0[1].b(0, h6Var2.e);
                ae1Var2.K0[1].b(1, h6Var2.f17795f);
                ae1Var2.K0[1].b(2, h6Var2.f17796g);
                ae1Var2.K0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.j6.n1(true, true);
                ae1Var2.f30968u0.e1();
                return;
        }
    }
}
