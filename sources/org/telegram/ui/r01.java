package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class r01 extends org.telegram.ui.Components.bk0 {
    public final r11 f51359c;

    public r01(r11 r11Var) {
        this.f51359c = r11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51359c.f51424v0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f51359c.f51427w0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        r11 r11Var = this.f51359c;
        if (i7 == r11Var.f51376a) {
            return 7;
        }
        if (i7 < r11Var.f51380b || i7 >= r11Var.f51383c) {
            if (i7 < r11Var.d || i7 >= r11Var.f51388e) {
                if (i7 >= r11Var.F && i7 < r11Var.G) {
                    return 1;
                }
                if (i7 >= r11Var.f51414r && i7 < r11Var.f51417s) {
                    return 3;
                }
                if (r11Var.f51435z0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (r11Var.A0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == r11Var.f51426w) {
                    return 6;
                }
                if (r11Var.f51430x0.indexOfKey(i7) < 0 && i7 != r11Var.f51391f && i7 != r11Var.E && i7 != r11Var.f51406n && i7 != r11Var.h && i7 != r11Var.f51432y) {
                    if (i7 != r11Var.f51429x) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r01.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        nb0 nb0Var;
        int o4;
        r11 r11Var = this.f51359c;
        int i10 = r11Var.f51377a0;
        org.telegram.ui.ActionBar.i6 i6Var = r11Var.f51378a1;
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
                frameLayout.f52887a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (r11Var.f51397h1) {
                    o4 = org.telegram.ui.ActionBar.n6.w(r11Var.f51395g1, org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Lf), 99);
                }
                if (r11Var.f51397h1) {
                    textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(org.telegram.ui.ActionBar.n6.Lf, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.ma.e(-2, -2, 17));
                nb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(r11Var.getContext());
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f52640b = x3Var;
                x3Var.b(0.3f, 250L, org.telegram.ui.Components.lr.h);
                x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                x3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.u6.Y(x3Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
                x3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f52639a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.n6.Fi;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 8.0f);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.u6.j(frameLayout3, e10, M, e11, i6Var);
                frameLayout3.addView(x3Var, c8.ma.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.ma.c(-1.0f, -1));
                ug.s0 s0Var = new ug.s0(frameLayout2.getContext(), i6Var, false);
                frameLayout2.f52641c = s0Var;
                s0Var.setIcon(2131624315);
                frameLayout2.addView(s0Var, c8.ma.c(-1.0f, -1));
                nb0Var = frameLayout2;
            } else if (i7 == 6) {
                nb0 nb0Var2 = new nb0(r11Var.getContext(), 4);
                nb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    nb0Var2.setText(org.telegram.messenger.gd.M0(2131745453, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    nb0Var2.setText(org.telegram.messenger.gd.M0(2131746185, null));
                } else {
                    nb0Var2.setText(org.telegram.messenger.gd.M0(2131751165, null));
                }
                nb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.u6.U(nb0Var2, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
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
                b11Var.f45717r = imageReceiver;
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
        return new v4.f1(nb0Var);
    }
}
