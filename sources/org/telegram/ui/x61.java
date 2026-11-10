package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class x61 implements View.OnClickListener {
    public final int f51548a;
    public int f51549b = 0;
    public final x71 f51550c;

    public x61(x71 x71Var, int i7) {
        this.f51548a = i7;
        this.f51550c = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51548a) {
            case 0:
                x71 x71Var = this.f51550c;
                x71Var.G0.setRotation(this.f51549b);
                this.f51549b -= 45;
                x71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wq.f40047g).start();
                n71[] n71VarArr = x71Var.f51624x0;
                n71 n71Var = n71VarArr[0];
                if (n71Var != null) {
                    Drawable background = n71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f51620w;
                        if (x71Var.f51565b == 2) {
                            x71Var.f51590i1 += 45;
                            while (true) {
                                int i7 = x71Var.f51590i1;
                                if (i7 >= 360) {
                                    x71Var.f51590i1 = i7 - 360;
                                } else {
                                    x71Var.f1(x71Var.f51563a1, 0, true);
                                }
                            }
                        } else if (j6Var != null) {
                            j6Var.f27620n += 45;
                            while (true) {
                                int i10 = j6Var.f27620n;
                                if (i10 >= 360) {
                                    j6Var.f27620n = i10 - 360;
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
                    if (background2 instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                x71 x71Var2 = this.f51550c;
                org.telegram.ui.ActionBar.s5 s5Var = x71Var2.S;
                x71Var2.H0.setRotation(this.f51549b);
                this.f51549b -= 45;
                x71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.wq.f40047g).start();
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.f51620w;
                if (j6Var2.f27615i) {
                    if (s5Var.j() != null) {
                        s5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = j6Var2.h;
                if (i11 != 0) {
                    int i12 = j6Var2.f27612e;
                    if (i12 == 0) {
                        i12 = j6Var2.f27611c;
                    }
                    j6Var2.f27612e = j6Var2.f27613f;
                    j6Var2.f27613f = j6Var2.f27614g;
                    j6Var2.f27614g = i11;
                    j6Var2.h = i12;
                } else {
                    int i13 = j6Var2.f27612e;
                    if (i13 == 0) {
                        i13 = j6Var2.f27611c;
                    }
                    j6Var2.f27612e = j6Var2.f27613f;
                    j6Var2.f27613f = j6Var2.f27614g;
                    j6Var2.f27614g = i13;
                }
                x71Var2.W.e(j6Var2.h, 3);
                x71Var2.W.e(j6Var2.f27614g, 2);
                x71Var2.W.e(j6Var2.f27613f, 1);
                org.telegram.ui.Components.vp vpVar = x71Var2.W;
                int i14 = j6Var2.f27612e;
                if (i14 == 0) {
                    i14 = j6Var2.f27611c;
                }
                vpVar.e(i14, 0);
                x71Var2.L0[1].b(0, j6Var2.f27612e);
                x71Var2.L0[1].b(1, j6Var2.f27613f);
                x71Var2.L0[1].b(2, j6Var2.f27614g);
                x71Var2.L0[1].b(3, j6Var2.h);
                org.telegram.ui.ActionBar.m6.t1(true, true);
                x71Var2.f51618v0.g1();
                return;
        }
    }
}
