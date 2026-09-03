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
public final class v51 extends org.telegram.ui.Components.ql0 {
    public final x61 f39007c;

    public v51(x61 x61Var) {
        this.f39007c = x61Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39007c.f39889r0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f39007c.f39892s0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        x61 x61Var = this.f39007c;
        if (i10 == x61Var.f39851a) {
            return 7;
        }
        if (i10 < x61Var.f39854b || i10 >= x61Var.f39857c) {
            if (i10 < x61Var.d || i10 >= x61Var.e) {
                if (i10 >= x61Var.B && i10 < x61Var.C) {
                    return 1;
                }
                if (i10 >= x61Var.f39888r && i10 < x61Var.f39891s) {
                    return 3;
                }
                if (x61Var.f39898v0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (x61Var.f39901w0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == x61Var.v) {
                    return 6;
                }
                if (x61Var.f39894t0.indexOfKey(i10) < 0 && i10 != x61Var.f39864f && i10 != x61Var.f39906y && i10 != x61Var.f39879n && i10 != x61Var.h && i10 != x61Var.f39903x) {
                    if (i10 != x61Var.f39900w) {
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
    public final void v(f2.l1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v51.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ym0 ym0Var;
        int k10;
        x61 x61Var = this.f39007c;
        int i11 = x61Var.T;
        org.telegram.ui.ActionBar.f6 f6Var = x61Var.W0;
        boolean z4 = false;
        if (i10 == 0) {
            Context context = x61Var.getContext();
            if (i11 == 6) {
                z4 = true;
            }
            ym0Var = new b61(x61Var, context, z4);
        } else if (i10 == 2) {
            ym0Var = new ImageView(x61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = x61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f32480a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (x61Var.f39861d1) {
                    k10 = org.telegram.ui.ActionBar.j6.v(x61Var.f39859c1, org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, k7.b6.e(-2, -2, 17));
                ym0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(x61Var.getContext());
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f40406b = s3Var;
                s3Var.b(0.3f, 250L, org.telegram.ui.Components.mr.h);
                s3Var.setTextSize(AndroidUtilities.dp(14.0f));
                s3Var.setTypeface(AndroidUtilities.bold());
                s3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
                s3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f40405a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
                frameLayout3.addView(s3Var, k7.b6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, k7.b6.c(-1.0f, -1));
                eg.c1 c1Var = new eg.c1(frameLayout2.getContext(), f6Var, false);
                frameLayout2.f40407c = c1Var;
                c1Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(c1Var, k7.b6.c(-1.0f, -1));
                ym0Var = frameLayout2;
            } else if (i10 == 6) {
                ym0 ym0Var2 = new ym0(x61Var.getContext(), 1);
                ym0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    ym0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    ym0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    ym0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                ym0Var2.setGravity(17);
                ym0Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var));
                ym0Var = ym0Var2;
            } else if (i10 == 7) {
                View r3Var = new org.telegram.ui.Cells.r3(x61Var.getContext(), 52);
                r3Var.setTag("searchbox");
                ym0Var = r3Var;
            } else {
                ym0Var = new f61(x61Var, x61Var.getContext());
            }
        } else {
            f61 f61Var = new f61(x61Var, x61Var.getContext());
            if (i10 == 8) {
                f61Var.N = true;
                ImageReceiver imageReceiver = new ImageReceiver(f61Var);
                f61Var.h = imageReceiver;
                f61Var.f33968r = imageReceiver;
                imageReceiver.setImageBitmap(x61Var.K);
                x61Var.L = f61Var;
                f61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            ym0Var = f61Var;
        }
        if (x61.c(x61Var)) {
            ym0Var.setScaleX(0.0f);
            ym0Var.setScaleY(0.0f);
        }
        return new f2.l1(ym0Var);
    }
}
