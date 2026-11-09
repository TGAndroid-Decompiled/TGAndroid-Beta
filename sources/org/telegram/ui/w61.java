package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class w61 implements View.OnClickListener {
    public final int f50887a;
    public int f50888b = 0;
    public final w71 f50889c;

    public w61(w71 w71Var, int i7) {
        this.f50887a = i7;
        this.f50889c = w71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50887a) {
            case 0:
                w71 w71Var = this.f50889c;
                w71Var.G0.setRotation(this.f50888b);
                this.f50888b -= 45;
                w71Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40459g).start();
                m71[] m71VarArr = w71Var.f50965x0;
                m71 m71Var = m71VarArr[0];
                if (m71Var != null) {
                    Drawable background = m71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = w71Var.f50961w;
                        if (w71Var.f50906b == 2) {
                            w71Var.f50931i1 += 45;
                            while (true) {
                                int i7 = w71Var.f50931i1;
                                if (i7 >= 360) {
                                    w71Var.f50931i1 = i7 - 360;
                                } else {
                                    w71Var.f1(w71Var.f50904a1, 0, true);
                                }
                            }
                        } else if (i6Var != null) {
                            i6Var.f27582n += 45;
                            while (true) {
                                int i10 = i6Var.f27582n;
                                if (i10 >= 360) {
                                    i6Var.f27582n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.l6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                m71 m71Var2 = m71VarArr[1];
                if (m71Var2 != null) {
                    Drawable background2 = m71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.ra0) {
                        ((org.telegram.ui.Components.ra0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                w71 w71Var2 = this.f50889c;
                org.telegram.ui.ActionBar.r5 r5Var = w71Var2.S;
                w71Var2.H0.setRotation(this.f50888b);
                this.f50888b -= 45;
                w71Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.f40459g).start();
                org.telegram.ui.ActionBar.i6 i6Var2 = w71Var2.f50961w;
                if (i6Var2.f27577i) {
                    if (r5Var.j() != null) {
                        r5Var.j().w(false);
                        return;
                    }
                    return;
                }
                int i11 = i6Var2.h;
                if (i11 != 0) {
                    int i12 = i6Var2.f27574e;
                    if (i12 == 0) {
                        i12 = i6Var2.f27573c;
                    }
                    i6Var2.f27574e = i6Var2.f27575f;
                    i6Var2.f27575f = i6Var2.f27576g;
                    i6Var2.f27576g = i11;
                    i6Var2.h = i12;
                } else {
                    int i13 = i6Var2.f27574e;
                    if (i13 == 0) {
                        i13 = i6Var2.f27573c;
                    }
                    i6Var2.f27574e = i6Var2.f27575f;
                    i6Var2.f27575f = i6Var2.f27576g;
                    i6Var2.f27576g = i13;
                }
                w71Var2.W.e(i6Var2.h, 3);
                w71Var2.W.e(i6Var2.f27576g, 2);
                w71Var2.W.e(i6Var2.f27575f, 1);
                org.telegram.ui.Components.vp vpVar = w71Var2.W;
                int i14 = i6Var2.f27574e;
                if (i14 == 0) {
                    i14 = i6Var2.f27573c;
                }
                vpVar.e(i14, 0);
                w71Var2.L0[1].b(0, i6Var2.f27574e);
                w71Var2.L0[1].b(1, i6Var2.f27575f);
                w71Var2.L0[1].b(2, i6Var2.f27576g);
                w71Var2.L0[1].b(3, i6Var2.h);
                org.telegram.ui.ActionBar.l6.t1(true, true);
                w71Var2.f50959v0.g1();
                return;
        }
    }
}
