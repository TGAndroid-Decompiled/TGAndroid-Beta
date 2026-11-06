package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class u61 implements View.OnClickListener {
    public final int f50251a;
    public int f50252b = 0;
    public final u71 f50253c;

    public u61(u71 u71Var, int i7) {
        this.f50251a = i7;
        this.f50253c = u71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50251a) {
            case 0:
                u71 u71Var = this.f50253c;
                u71Var.G0.setRotation(this.f50252b);
                this.f50252b -= 45;
                u71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40346g).start();
                k71[] k71VarArr = u71Var.f50328x0;
                k71 k71Var = k71VarArr[0];
                if (k71Var != null) {
                    Drawable background = k71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = u71Var.f50324w;
                        if (u71Var.f50269b == 2) {
                            u71Var.f50294i1 += 45;
                            while (true) {
                                int i7 = u71Var.f50294i1;
                                if (i7 >= 360) {
                                    u71Var.f50294i1 = i7 - 360;
                                } else {
                                    u71Var.f1(u71Var.f50267a1, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f27527n += 45;
                            while (true) {
                                int i10 = h6Var.f27527n;
                                if (i10 >= 360) {
                                    h6Var.f27527n = i10 - 360;
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
                u71 u71Var2 = this.f50253c;
                org.telegram.ui.ActionBar.q5 q5Var = u71Var2.S;
                u71Var2.H0.setRotation(this.f50252b);
                this.f50252b -= 45;
                u71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40346g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = u71Var2.f50324w;
                if (h6Var2.f27522i) {
                    if (q5Var.k() != null) {
                        q5Var.k().w(false);
                        return;
                    }
                    return;
                }
                int i11 = h6Var2.h;
                if (i11 != 0) {
                    int i12 = h6Var2.f27519e;
                    if (i12 == 0) {
                        i12 = h6Var2.f27518c;
                    }
                    h6Var2.f27519e = h6Var2.f27520f;
                    h6Var2.f27520f = h6Var2.f27521g;
                    h6Var2.f27521g = i11;
                    h6Var2.h = i12;
                } else {
                    int i13 = h6Var2.f27519e;
                    if (i13 == 0) {
                        i13 = h6Var2.f27518c;
                    }
                    h6Var2.f27519e = h6Var2.f27520f;
                    h6Var2.f27520f = h6Var2.f27521g;
                    h6Var2.f27521g = i13;
                }
                u71Var2.W.e(h6Var2.h, 3);
                u71Var2.W.e(h6Var2.f27521g, 2);
                u71Var2.W.e(h6Var2.f27520f, 1);
                org.telegram.ui.Components.vp vpVar = u71Var2.W;
                int i14 = h6Var2.f27519e;
                if (i14 == 0) {
                    i14 = h6Var2.f27518c;
                }
                vpVar.e(i14, 0);
                u71Var2.L0[1].b(0, h6Var2.f27519e);
                u71Var2.L0[1].b(1, h6Var2.f27520f);
                u71Var2.L0[1].b(2, h6Var2.f27521g);
                u71Var2.L0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.k6.t1(true, true);
                u71Var2.f50322v0.g1();
                return;
        }
    }
}
