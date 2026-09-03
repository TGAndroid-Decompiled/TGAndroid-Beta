package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v51 extends org.telegram.ui.Components.rl0 {
    public final w61 f42013c;

    public v51(w61 w61Var) {
        this.f42013c = w61Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42013c.f42341r0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f42013c.f42344s0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        w61 w61Var = this.f42013c;
        if (i10 == w61Var.f42302a) {
            return 7;
        }
        if (i10 < w61Var.f42305b || i10 >= w61Var.f42308c) {
            if (i10 < w61Var.d || i10 >= w61Var.f42313e) {
                if (i10 >= w61Var.B && i10 < w61Var.C) {
                    return 1;
                }
                if (i10 >= w61Var.f42340r && i10 < w61Var.f42343s) {
                    return 3;
                }
                if (w61Var.f42350v0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (w61Var.f42353w0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == w61Var.v) {
                    return 6;
                }
                if (w61Var.f42346t0.indexOfKey(i10) < 0 && i10 != w61Var.f42316f && i10 != w61Var.f42358y && i10 != w61Var.f42331n && i10 != w61Var.h && i10 != w61Var.f42355x) {
                    if (i10 != w61Var.f42352w) {
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
    public final void v(f2.m1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v51.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ym0 ym0Var;
        int k10;
        w61 w61Var = this.f42013c;
        int i11 = w61Var.T;
        org.telegram.ui.ActionBar.g6 g6Var = w61Var.W0;
        boolean z4 = false;
        if (i10 == 0) {
            Context context = w61Var.getContext();
            if (i11 == 6) {
                z4 = true;
            }
            ym0Var = new b61(w61Var, context, z4);
        } else if (i10 == 2) {
            ym0Var = new ImageView(w61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = w61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35045a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (w61Var.f42312d1) {
                    k10 = org.telegram.ui.ActionBar.k6.v(w61Var.f42310c1, org.telegram.ui.ActionBar.k6.l1(0.4f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, k7.c6.e(-2, -2, 17));
                ym0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(w61Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f43805b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.pr.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f43804a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{8.0f}, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
                frameLayout3.addView(t3Var, k7.c6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, k7.c6.c(-1.0f, -1));
                fg.b1 b1Var = new fg.b1(frameLayout2.getContext(), g6Var, false);
                frameLayout2.f43806c = b1Var;
                b1Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(b1Var, k7.c6.c(-1.0f, -1));
                ym0Var = frameLayout2;
            } else if (i10 == 6) {
                ym0 ym0Var2 = new ym0(w61Var.getContext(), 1);
                ym0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    ym0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    ym0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    ym0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                ym0Var2.setGravity(17);
                ym0Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, g6Var));
                ym0Var = ym0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(w61Var.getContext(), 52);
                s3Var.setTag("searchbox");
                ym0Var = s3Var;
            } else {
                ym0Var = new f61(w61Var, w61Var.getContext());
            }
        } else {
            f61 f61Var = new f61(w61Var, w61Var.getContext());
            if (i10 == 8) {
                f61Var.N = true;
                ImageReceiver imageReceiver = new ImageReceiver(f61Var);
                f61Var.h = imageReceiver;
                f61Var.f36683r = imageReceiver;
                imageReceiver.setImageBitmap(w61Var.K);
                w61Var.L = f61Var;
                f61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            ym0Var = f61Var;
        }
        if (w61.c(w61Var)) {
            ym0Var.setScaleX(0.0f);
            ym0Var.setScaleY(0.0f);
        }
        return new f2.m1(ym0Var);
    }
}
