package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class u61 implements View.OnClickListener {
    public final int f50252a;
    public int f50253b = 0;
    public final u71 f50254c;

    public u61(u71 u71Var, int i7) {
        this.f50252a = i7;
        this.f50254c = u71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50252a) {
            case 0:
                u71 u71Var = this.f50254c;
                u71Var.G0.setRotation(this.f50253b);
                this.f50253b -= 45;
                u71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40330g).start();
                k71[] k71VarArr = u71Var.f50329x0;
                k71 k71Var = k71VarArr[0];
                if (k71Var != null) {
                    Drawable background = k71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50325w;
                        if (u71Var.f50270b == 2) {
                            u71Var.f50295i1 += 45;
                            while (true) {
                                int i7 = u71Var.f50295i1;
                                if (i7 >= 360) {
                                    u71Var.f50295i1 = i7 - 360;
                                } else {
                                    u71Var.f1(u71Var.f50268a1, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f27526n += 45;
                            while (true) {
                                int i10 = h6Var.f27526n;
                                if (i10 >= 360) {
                                    h6Var.f27526n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                k71 k71Var2 = k71VarArr[1];
                if (k71Var2 != null) {
                    Drawable background2 = k71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                u71 u71Var2 = this.f50254c;
                org.telegram.ui.ActionBar.q5 q5Var = u71Var2.S;
                u71Var2.H0.setRotation(this.f50253b);
                this.f50253b -= 45;
                u71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40330g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = u71Var2.f50325w;
                if (h6Var2.f27521i) {
                    if (q5Var.k() != null) {
                        q5Var.k().w(false);
                        return;
                    }
                    return;
                }
                int i11 = h6Var2.h;
                if (i11 != 0) {
                    int i12 = h6Var2.f27518e;
                    if (i12 == 0) {
                        i12 = h6Var2.f27517c;
                    }
                    h6Var2.f27518e = h6Var2.f27519f;
                    h6Var2.f27519f = h6Var2.f27520g;
                    h6Var2.f27520g = i11;
                    h6Var2.h = i12;
                } else {
                    int i13 = h6Var2.f27518e;
                    if (i13 == 0) {
                        i13 = h6Var2.f27517c;
                    }
                    h6Var2.f27518e = h6Var2.f27519f;
                    h6Var2.f27519f = h6Var2.f27520g;
                    h6Var2.f27520g = i13;
                }
                u71Var2.W.e(h6Var2.h, 3);
                u71Var2.W.e(h6Var2.f27520g, 2);
                u71Var2.W.e(h6Var2.f27519f, 1);
                org.telegram.ui.Components.vp vpVar = u71Var2.W;
                int i14 = h6Var2.f27518e;
                if (i14 == 0) {
                    i14 = h6Var2.f27517c;
                }
                vpVar.e(i14, 0);
                u71Var2.L0[1].b(0, h6Var2.f27518e);
                u71Var2.L0[1].b(1, h6Var2.f27519f);
                u71Var2.L0[1].b(2, h6Var2.f27520g);
                u71Var2.L0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.k6.t1(true, true);
                u71Var2.f50323v0.g1();
                return;
        }
    }
}
