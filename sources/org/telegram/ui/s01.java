package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class s01 extends org.telegram.ui.Components.dk0 {
    public final s11 f51812c;

    public s01(s11 s11Var) {
        this.f51812c = s11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51812c.f51870v0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f51812c.f51873w0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        s11 s11Var = this.f51812c;
        if (i7 == s11Var.f51822a) {
            return 7;
        }
        if (i7 < s11Var.f51826b || i7 >= s11Var.f51829c) {
            if (i7 < s11Var.d || i7 >= s11Var.f51834e) {
                if (i7 >= s11Var.F && i7 < s11Var.G) {
                    return 1;
                }
                if (i7 >= s11Var.f51860r && i7 < s11Var.f51863s) {
                    return 3;
                }
                if (s11Var.f51881z0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (s11Var.A0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == s11Var.f51872w) {
                    return 6;
                }
                if (s11Var.f51876x0.indexOfKey(i7) < 0 && i7 != s11Var.f51837f && i7 != s11Var.E && i7 != s11Var.f51852n && i7 != s11Var.h && i7 != s11Var.f51878y) {
                    if (i7 != s11Var.f51875x) {
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
    public final void t(v4.f1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s01.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        nb0 nb0Var;
        int o4;
        s11 s11Var = this.f51812c;
        int i10 = s11Var.f51823a0;
        org.telegram.ui.ActionBar.h6 h6Var = s11Var.f51824a1;
        boolean z10 = false;
        if (i7 == 0) {
            Context context = s11Var.getContext();
            if (i10 == 6) {
                z10 = true;
            }
            nb0Var = new y01(s11Var, context, z10);
        } else if (i7 == 2) {
            nb0Var = new ImageView(s11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = s11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f53581a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (s11Var.f51843h1) {
                    o4 = org.telegram.ui.ActionBar.m6.w(s11Var.f51841g1, org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.Lf), 99);
                }
                if (s11Var.f51843h1) {
                    textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Lf, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.t6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.ma.e(-2, -2, 17));
                nb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(s11Var.getContext());
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f52933b = x3Var;
                x3Var.b(0.3f, 250L, org.telegram.ui.Components.nr.h);
                x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                x3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.t6.Y(x3Var, org.telegram.ui.ActionBar.m6.Ji, h6Var);
                x3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f52932a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.m6.Fi;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 8.0f);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.t6.j(frameLayout3, e10, M, e11, h6Var);
                frameLayout3.addView(x3Var, c8.ma.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.ma.c(-1.0f, -1));
                ug.r0 r0Var = new ug.r0(frameLayout2.getContext(), h6Var, false);
                frameLayout2.f52934c = r0Var;
                r0Var.setIcon(2131624315);
                frameLayout2.addView(r0Var, c8.ma.c(-1.0f, -1));
                nb0Var = frameLayout2;
            } else if (i7 == 6) {
                nb0 nb0Var2 = new nb0(s11Var.getContext(), 4);
                nb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    nb0Var2.setText(org.telegram.messenger.hd.N0(2131745452, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    nb0Var2.setText(org.telegram.messenger.hd.N0(2131746184, null));
                } else {
                    nb0Var2.setText(org.telegram.messenger.hd.N0(2131751164, null));
                }
                nb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(nb0Var2, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
                nb0Var = nb0Var2;
            } else if (i7 == 7) {
                View w3Var = new org.telegram.ui.Cells.w3(s11Var.getContext(), 52);
                w3Var.setTag("searchbox");
                nb0Var = w3Var;
            } else {
                nb0Var = new c11(s11Var, s11Var.getContext());
            }
        } else {
            c11 c11Var = new c11(s11Var, s11Var.getContext());
            if (i7 == 8) {
                c11Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(c11Var);
                c11Var.h = imageReceiver;
                c11Var.f46387r = imageReceiver;
                imageReceiver.w0(s11Var.O);
                s11Var.P = c11Var;
                c11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            nb0Var = c11Var;
        }
        if (s11.c(s11Var)) {
            nb0Var.setScaleX(0.0f);
            nb0Var.setScaleY(0.0f);
        }
        return new v4.f1(nb0Var);
    }
}
