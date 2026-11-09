package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class s01 extends org.telegram.ui.Components.pj0 {
    public final s11 f49649c;

    public s01(s11 s11Var) {
        this.f49649c = s11Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49649c.f49706u0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f49649c.f49708v0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        s11 s11Var = this.f49649c;
        if (i7 == s11Var.f49661a) {
            return 7;
        }
        if (i7 < s11Var.f49664b || i7 >= s11Var.f49667c) {
            if (i7 < s11Var.d || i7 >= s11Var.f49672e) {
                if (i7 >= s11Var.E && i7 < s11Var.F) {
                    return 1;
                }
                if (i7 >= s11Var.f49698r && i7 < s11Var.f49701s) {
                    return 3;
                }
                if (s11Var.f49717y0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (s11Var.f49719z0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == s11Var.f49710w) {
                    return 6;
                }
                if (s11Var.f49711w0.indexOfKey(i7) < 0 && i7 != s11Var.f49675f && i7 != s11Var.D && i7 != s11Var.f49690n && i7 != s11Var.h && i7 != s11Var.f49716y) {
                    if (i7 != s11Var.f49713x) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ob0 ob0Var;
        int o4;
        s11 s11Var = this.f49649c;
        int i10 = s11Var.W;
        org.telegram.ui.ActionBar.g6 g6Var = s11Var.Z0;
        boolean z9 = false;
        if (i7 == 0) {
            Context context = s11Var.getContext();
            if (i10 == 6) {
                z9 = true;
            }
            ob0Var = new y01(s11Var, context, z9);
        } else if (i7 == 2) {
            ob0Var = new ImageView(s11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = s11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f51525a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (s11Var.f49679g1) {
                    o4 = org.telegram.ui.ActionBar.l6.w(s11Var.f49677f1, org.telegram.ui.ActionBar.l6.r1(0.4f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.l6.v0(org.telegram.ui.ActionBar.l6.If), 99);
                }
                if (s11Var.f49679g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(org.telegram.ui.ActionBar.l6.If, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.s6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.ha.e(-2, -2, 17));
                ob0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(s11Var.getContext());
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f50816b = w3Var;
                w3Var.b(0.3f, 250L, org.telegram.ui.Components.xq.h);
                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                w3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.s6.Y(w3Var, org.telegram.ui.ActionBar.l6.Gi, g6Var);
                w3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f50815a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.l6.Ci;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 8.0f);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
                org.telegram.ui.ActionBar.o6 e11 = org.telegram.ui.ActionBar.s6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.s6.j(frameLayout3, e10, M, e11, g6Var);
                frameLayout3.addView(w3Var, c8.ha.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.ha.c(-1.0f, -1));
                ug.p0 p0Var = new ug.p0(frameLayout2.getContext(), g6Var, false);
                frameLayout2.f50817c = p0Var;
                p0Var.setIcon(2131624314);
                frameLayout2.addView(p0Var, c8.ha.c(-1.0f, -1));
                ob0Var = frameLayout2;
            } else if (i7 == 6) {
                ob0 ob0Var2 = new ob0(s11Var.getContext(), 4);
                ob0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    ob0Var2.setText(org.telegram.messenger.id.M0(2131745648, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    ob0Var2.setText(org.telegram.messenger.id.M0(2131746380, null));
                } else {
                    ob0Var2.setText(org.telegram.messenger.id.M0(2131751176, null));
                }
                ob0Var2.setGravity(17);
                org.telegram.ui.ActionBar.s6.U(ob0Var2, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
                ob0Var = ob0Var2;
            } else if (i7 == 7) {
                View v3Var = new org.telegram.ui.Cells.v3(s11Var.getContext(), 52);
                v3Var.setTag("searchbox");
                ob0Var = v3Var;
            } else {
                ob0Var = new c11(s11Var, s11Var.getContext());
            }
        } else {
            c11 c11Var = new c11(s11Var, s11Var.getContext());
            if (i7 == 8) {
                c11Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(c11Var);
                c11Var.h = imageReceiver;
                c11Var.f44194r = imageReceiver;
                imageReceiver.w0(s11Var.N);
                s11Var.O = c11Var;
                c11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            ob0Var = c11Var;
        }
        if (s11.c(s11Var)) {
            ob0Var.setScaleX(0.0f);
            ob0Var.setScaleY(0.0f);
        }
        return new v4.d1(ob0Var);
    }
}
