package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class rb1 implements View.OnClickListener {
    public final int f43100a;
    public int f43101b = 0;
    public final tc1 f43102c;

    public rb1(tc1 tc1Var, int i10) {
        this.f43100a = i10;
        this.f43102c = tc1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43100a) {
            case 0:
                tc1 tc1Var = this.f43102c;
                tc1Var.G0.setRotation(this.f43101b);
                this.f43101b -= 45;
                tc1Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.f27585g).start();
                ic1[] ic1VarArr = tc1Var.f43796x0;
                ic1 ic1Var = ic1VarArr[0];
                if (ic1Var != null) {
                    Drawable background = ic1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.uc0) {
                        ((org.telegram.ui.Components.uc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
                        if (tc1Var.f43736b == 2) {
                            tc1Var.f43761i1 += 45;
                            while (true) {
                                int i10 = tc1Var.f43761i1;
                                if (i10 >= 360) {
                                    tc1Var.f43761i1 = i10 - 360;
                                } else {
                                    tc1Var.b1(tc1Var.f43735a1, 0, true);
                                }
                            }
                        } else if (w6Var != null) {
                            w6Var.f23223n += 45;
                            while (true) {
                                int i11 = w6Var.f23223n;
                                if (i11 >= 360) {
                                    w6Var.f23223n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.y6.q1(false, false);
                                }
                            }
                        }
                    }
                }
                ic1 ic1Var2 = ic1VarArr[1];
                if (ic1Var2 != null) {
                    Drawable background2 = ic1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.uc0) {
                        ((org.telegram.ui.Components.uc0) background2).w(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                tc1 tc1Var2 = this.f43102c;
                org.telegram.ui.ActionBar.g6 g6Var = tc1Var2.S;
                tc1Var2.H0.setRotation(this.f43101b);
                this.f43101b -= 45;
                tc1Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.ds.f27585g).start();
                org.telegram.ui.ActionBar.w6 w6Var2 = tc1Var2.v;
                if (w6Var2.f23218i) {
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
                        i13 = w6Var2.f23215c;
                    }
                    w6Var2.e = w6Var2.f23216f;
                    w6Var2.f23216f = w6Var2.f23217g;
                    w6Var2.f23217g = i12;
                    w6Var2.h = i13;
                } else {
                    int i14 = w6Var2.e;
                    if (i14 == 0) {
                        i14 = w6Var2.f23215c;
                    }
                    w6Var2.e = w6Var2.f23216f;
                    w6Var2.f23216f = w6Var2.f23217g;
                    w6Var2.f23217g = i14;
                }
                tc1Var2.W.e(w6Var2.h, 3);
                tc1Var2.W.e(w6Var2.f23217g, 2);
                tc1Var2.W.e(w6Var2.f23216f, 1);
                org.telegram.ui.Components.yq yqVar = tc1Var2.W;
                int i15 = w6Var2.e;
                if (i15 == 0) {
                    i15 = w6Var2.f23215c;
                }
                yqVar.e(i15, 0);
                tc1Var2.L0[1].b(0, w6Var2.e);
                tc1Var2.L0[1].b(1, w6Var2.f23216f);
                tc1Var2.L0[1].b(2, w6Var2.f23217g);
                tc1Var2.L0[1].b(3, w6Var2.h);
                org.telegram.ui.ActionBar.y6.q1(true, true);
                tc1Var2.f43790v0.g1();
                return;
        }
    }
}
