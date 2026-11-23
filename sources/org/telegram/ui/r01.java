package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class r01 extends org.telegram.ui.Components.dk0 {
    public final r11 f51383c;

    public r01(r11 r11Var) {
        this.f51383c = r11Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51383c.f51448v0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f51383c.f51451w0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        r11 r11Var = this.f51383c;
        if (i7 == r11Var.f51400a) {
            return 7;
        }
        if (i7 < r11Var.f51404b || i7 >= r11Var.f51407c) {
            if (i7 < r11Var.d || i7 >= r11Var.f51412e) {
                if (i7 >= r11Var.F && i7 < r11Var.G) {
                    return 1;
                }
                if (i7 >= r11Var.f51438r && i7 < r11Var.f51441s) {
                    return 3;
                }
                if (r11Var.f51459z0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (r11Var.A0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == r11Var.f51450w) {
                    return 6;
                }
                if (r11Var.f51454x0.indexOfKey(i7) < 0 && i7 != r11Var.f51415f && i7 != r11Var.E && i7 != r11Var.f51430n && i7 != r11Var.h && i7 != r11Var.f51456y) {
                    if (i7 != r11Var.f51453x) {
                        return 3;
                    }
                    return 8;
                }
                return 0;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r01.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        nb0 nb0Var;
        int o4;
        r11 r11Var = this.f51383c;
        int i10 = r11Var.f51401a0;
        org.telegram.ui.ActionBar.h6 h6Var = r11Var.f51402a1;
        boolean z10 = false;
        if (i7 == 0) {
            Context context = r11Var.getContext();
            if (i10 == 6) {
                z10 = true;
            }
            nb0Var = new x01(r11Var, context, z10);
        } else if (i7 == 2) {
            nb0Var = new ImageView(r11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = r11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f52900a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (r11Var.f51421h1) {
                    o4 = org.telegram.ui.ActionBar.m6.w(r11Var.f51419g1, org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Lf), 99);
                }
                if (r11Var.f51421h1) {
                    textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Lf, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.t6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.na.e(-2, -2, 17));
                nb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(r11Var.getContext());
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f52665b = x3Var;
                x3Var.b(0.3f, 250L, org.telegram.ui.Components.nr.h);
                x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                x3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.t6.Y(x3Var, org.telegram.ui.ActionBar.m6.Ji, h6Var);
                x3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f52664a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.m6.Fi;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 8.0f);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.t6.j(frameLayout3, e10, M, e11, h6Var);
                frameLayout3.addView(x3Var, c8.na.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.na.c(-1.0f, -1));
                ug.r0 r0Var = new ug.r0(frameLayout2.getContext(), h6Var, false);
                frameLayout2.f52666c = r0Var;
                r0Var.setIcon(2131624315);
                frameLayout2.addView(r0Var, c8.na.c(-1.0f, -1));
                nb0Var = frameLayout2;
            } else if (i7 == 6) {
                nb0 nb0Var2 = new nb0(r11Var.getContext(), 4);
                nb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    nb0Var2.setText(org.telegram.messenger.hd.N0(2131745452, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    nb0Var2.setText(org.telegram.messenger.hd.N0(2131746184, null));
                } else {
                    nb0Var2.setText(org.telegram.messenger.hd.N0(2131751164, null));
                }
                nb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(nb0Var2, org.telegram.ui.ActionBar.m6.f29739y6, h6Var);
                nb0Var = nb0Var2;
            } else if (i7 == 7) {
                View w3Var = new org.telegram.ui.Cells.w3(r11Var.getContext(), 52);
                w3Var.setTag("searchbox");
                nb0Var = w3Var;
            } else {
                nb0Var = new b11(r11Var, r11Var.getContext());
            }
        } else {
            b11 b11Var = new b11(r11Var, r11Var.getContext());
            if (i7 == 8) {
                b11Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(b11Var);
                b11Var.h = imageReceiver;
                b11Var.f45701r = imageReceiver;
                imageReceiver.w0(r11Var.O);
                r11Var.P = b11Var;
                b11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            nb0Var = b11Var;
        }
        if (r11.c(r11Var)) {
            nb0Var.setScaleX(0.0f);
            nb0Var.setScaleY(0.0f);
        }
        return new v4.e1(nb0Var);
    }
}
