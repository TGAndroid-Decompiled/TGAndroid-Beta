package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class t01 extends org.telegram.ui.Components.oj0 {
    public final t11 f50007c;

    public t01(t11 t11Var) {
        this.f50007c = t11Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f50007c.f50062u0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f50007c.f50064v0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        t11 t11Var = this.f50007c;
        if (i7 == t11Var.f50017a) {
            return 7;
        }
        if (i7 < t11Var.f50020b || i7 >= t11Var.f50023c) {
            if (i7 < t11Var.d || i7 >= t11Var.f50028e) {
                if (i7 >= t11Var.E && i7 < t11Var.F) {
                    return 1;
                }
                if (i7 >= t11Var.f50054r && i7 < t11Var.f50057s) {
                    return 3;
                }
                if (t11Var.f50073y0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (t11Var.f50075z0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == t11Var.f50066w) {
                    return 6;
                }
                if (t11Var.f50067w0.indexOfKey(i7) < 0 && i7 != t11Var.f50031f && i7 != t11Var.D && i7 != t11Var.f50046n && i7 != t11Var.h && i7 != t11Var.f50072y) {
                    if (i7 != t11Var.f50069x) {
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
    public final void t(v4.d1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        pb0 pb0Var;
        int o4;
        t11 t11Var = this.f50007c;
        int i10 = t11Var.W;
        org.telegram.ui.ActionBar.h6 h6Var = t11Var.Z0;
        boolean z9 = false;
        if (i7 == 0) {
            Context context = t11Var.getContext();
            if (i10 == 6) {
                z9 = true;
            }
            pb0Var = new z01(t11Var, context, z9);
        } else if (i7 == 2) {
            pb0Var = new ImageView(t11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = t11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f51857a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (t11Var.f50035g1) {
                    o4 = org.telegram.ui.ActionBar.m6.w(t11Var.f50033f1, org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.If), 99);
                }
                if (t11Var.f50035g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.If, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.t6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.ha.e(-2, -2, 17));
                pb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(t11Var.getContext());
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f51488b = w3Var;
                w3Var.b(0.3f, 250L, org.telegram.ui.Components.wq.h);
                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                w3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.t6.Y(w3Var, org.telegram.ui.ActionBar.m6.Gi, h6Var);
                w3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f51487a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.m6.Ci;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 8.0f);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.t6.j(frameLayout3, e10, M, e11, h6Var);
                frameLayout3.addView(w3Var, c8.ha.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.ha.c(-1.0f, -1));
                ug.p0 p0Var = new ug.p0(frameLayout2.getContext(), h6Var, false);
                frameLayout2.f51489c = p0Var;
                p0Var.setIcon(2131624314);
                frameLayout2.addView(p0Var, c8.ha.c(-1.0f, -1));
                pb0Var = frameLayout2;
            } else if (i7 == 6) {
                pb0 pb0Var2 = new pb0(t11Var.getContext(), 4);
                pb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    pb0Var2.setText(org.telegram.messenger.id.M0(2131745648, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    pb0Var2.setText(org.telegram.messenger.id.M0(2131746380, null));
                } else {
                    pb0Var2.setText(org.telegram.messenger.id.M0(2131751176, null));
                }
                pb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.t6.U(pb0Var2, org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
                pb0Var = pb0Var2;
            } else if (i7 == 7) {
                View v3Var = new org.telegram.ui.Cells.v3(t11Var.getContext(), 52);
                v3Var.setTag("searchbox");
                pb0Var = v3Var;
            } else {
                pb0Var = new d11(t11Var, t11Var.getContext());
            }
        } else {
            d11 d11Var = new d11(t11Var, t11Var.getContext());
            if (i7 == 8) {
                d11Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(d11Var);
                d11Var.h = imageReceiver;
                d11Var.f44877r = imageReceiver;
                imageReceiver.w0(t11Var.N);
                t11Var.O = d11Var;
                d11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            pb0Var = d11Var;
        }
        if (t11.c(t11Var)) {
            pb0Var.setScaleX(0.0f);
            pb0Var.setScaleY(0.0f);
        }
        return new v4.d1(pb0Var);
    }
}
