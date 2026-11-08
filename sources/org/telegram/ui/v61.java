package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class v61 implements View.OnClickListener {
    public final int f50506a;
    public int f50507b = 0;
    public final v71 f50508c;

    public v61(v71 v71Var, int i7) {
        this.f50506a = i7;
        this.f50508c = v71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50506a) {
            case 0:
                v71 v71Var = this.f50508c;
                v71Var.G0.setRotation(this.f50507b);
                this.f50507b -= 45;
                v71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40367g).start();
                l71[] l71VarArr = v71Var.f50583x0;
                l71 l71Var = l71VarArr[0];
                if (l71Var != null) {
                    Drawable background = l71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = v71Var.f50579w;
                        if (v71Var.f50524b == 2) {
                            v71Var.f50549i1 += 45;
                            while (true) {
                                int i7 = v71Var.f50549i1;
                                if (i7 >= 360) {
                                    v71Var.f50549i1 = i7 - 360;
                                } else {
                                    v71Var.f1(v71Var.f50522a1, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.f27530n += 45;
                            while (true) {
                                int i10 = h6Var.f27530n;
                                if (i10 >= 360) {
                                    h6Var.f27530n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                l71 l71Var2 = l71VarArr[1];
                if (l71Var2 != null) {
                    Drawable background2 = l71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.qa0) {
                        ((org.telegram.ui.Components.qa0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                v71 v71Var2 = this.f50508c;
                org.telegram.ui.ActionBar.q5 q5Var = v71Var2.S;
                v71Var2.H0.setRotation(this.f50507b);
                this.f50507b -= 45;
                v71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40367g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = v71Var2.f50579w;
                if (h6Var2.f27525i) {
                    if (q5Var.j() != null) {
                        q5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = h6Var2.h;
                if (i11 != 0) {
                    int i12 = h6Var2.f27522e;
                    if (i12 == 0) {
                        i12 = h6Var2.f27521c;
                    }
                    h6Var2.f27522e = h6Var2.f27523f;
                    h6Var2.f27523f = h6Var2.f27524g;
                    h6Var2.f27524g = i11;
                    h6Var2.h = i12;
                } else {
                    int i13 = h6Var2.f27522e;
                    if (i13 == 0) {
                        i13 = h6Var2.f27521c;
                    }
                    h6Var2.f27522e = h6Var2.f27523f;
                    h6Var2.f27523f = h6Var2.f27524g;
                    h6Var2.f27524g = i13;
                }
                v71Var2.W.e(h6Var2.h, 3);
                v71Var2.W.e(h6Var2.f27524g, 2);
                v71Var2.W.e(h6Var2.f27523f, 1);
                org.telegram.ui.Components.vp vpVar = v71Var2.W;
                int i14 = h6Var2.f27522e;
                if (i14 == 0) {
                    i14 = h6Var2.f27521c;
                }
                vpVar.e(i14, 0);
                v71Var2.L0[1].b(0, h6Var2.f27522e);
                v71Var2.L0[1].b(1, h6Var2.f27523f);
                v71Var2.L0[1].b(2, h6Var2.f27524g);
                v71Var2.L0[1].b(3, h6Var2.h);
                org.telegram.ui.ActionBar.k6.t1(true, true);
                v71Var2.f50577v0.g1();
                return;
        }
    }
}
