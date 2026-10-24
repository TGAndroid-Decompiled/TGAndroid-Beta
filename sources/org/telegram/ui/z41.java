package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z41 extends org.telegram.ui.Components.km0 {
    public final a61 f44019c;

    public z41(a61 a61Var) {
        this.f44019c = a61Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44019c.f35649u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f44019c.f35651v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        a61 a61Var = this.f44019c;
        if (i10 == a61Var.f35604a) {
            return 7;
        }
        if (i10 < a61Var.f35607b || i10 >= a61Var.f35610c) {
            if (i10 < a61Var.d || i10 >= a61Var.e) {
                if (i10 >= a61Var.E && i10 < a61Var.F) {
                    return 1;
                }
                if (i10 >= a61Var.f35641r && i10 < a61Var.f35644s) {
                    return 3;
                }
                if (a61Var.f35660y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (a61Var.f35662z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == a61Var.v) {
                    return 6;
                }
                if (a61Var.f35654w0.indexOfKey(i10) < 0 && i10 != a61Var.f35617f && i10 != a61Var.f35659y && i10 != a61Var.f35632n && i10 != a61Var.h && i10 != a61Var.f35656x) {
                    if (i10 != a61Var.f35653w) {
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
    public final void v(s4.b1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z41.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        sm0 sm0Var;
        int o10;
        a61 a61Var = this.f44019c;
        int i11 = a61Var.W;
        org.telegram.ui.ActionBar.g6 g6Var = a61Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = a61Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            sm0Var = new f51(a61Var, context, z10);
        } else if (i10 == 2) {
            sm0Var = new ImageView(a61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = a61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f36810a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (a61Var.f35621g1) {
                    o10 = org.telegram.ui.ActionBar.k6.v(a61Var.f35619f1, org.telegram.ui.ActionBar.k6.o1(0.4f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Te, false), 99);
                }
                if (a61Var.f35621g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(11.0f), o10));
                } else {
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(11.0f), o10);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Te, 99);
                    textView.setBackground(c02);
                    org.telegram.ui.ActionBar.r6.k(textView, c02, h, null, null);
                }
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                sm0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(a61Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f36479b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.zr.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                org.telegram.ui.ActionBar.r6.a0(t3Var, org.telegram.ui.ActionBar.k6.Sh, g6Var);
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f36478a = frameLayout3;
                int i12 = org.telegram.ui.ActionBar.k6.Oh;
                org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                org.telegram.ui.ActionBar.n6 f7 = org.telegram.ui.ActionBar.r6.f(i12);
                frameLayout3.setBackground(e);
                org.telegram.ui.ActionBar.r6.k(frameLayout3, e, O, f7, g6Var);
                frameLayout3.addView(t3Var, w7.z5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.z5.c(-1.0f, -1));
                sg.p0 p0Var = new sg.p0(frameLayout2.getContext(), g6Var, false);
                frameLayout2.f36480c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.z5.c(-1.0f, -1));
                sm0Var = frameLayout2;
            } else if (i10 == 6) {
                sm0 sm0Var2 = new sm0(a61Var.getContext(), 2);
                sm0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    sm0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    sm0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    sm0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                sm0Var2.setGravity(17);
                org.telegram.ui.ActionBar.r6.W(sm0Var2, org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
                sm0Var = sm0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(a61Var.getContext(), 52);
                s3Var.setTag("searchbox");
                sm0Var = s3Var;
            } else {
                sm0Var = new j51(a61Var, a61Var.getContext());
            }
        } else {
            j51 j51Var = new j51(a61Var, a61Var.getContext());
            if (i10 == 8) {
                j51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(j51Var);
                j51Var.h = imageReceiver;
                j51Var.f38467r = imageReceiver;
                imageReceiver.setImageBitmap(a61Var.N);
                a61Var.O = j51Var;
                j51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            sm0Var = j51Var;
        }
        if (a61.c(a61Var)) {
            sm0Var.setScaleX(0.0f);
            sm0Var.setScaleY(0.0f);
        }
        return new s4.b1(sm0Var);
    }
}
