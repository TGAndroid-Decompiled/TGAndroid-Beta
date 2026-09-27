package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.kd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r01;
import org.telegram.ui.zg1;
public final class r01 extends org.telegram.ui.Cells.a7 {
    public final s01 h;

    public r01(s01 s01Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = s01Var;
        this.f20030f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f20027a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, e6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.y5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, e6Var);
        this.f20028b = p90Var;
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        p90Var.setTextSize(1, 14.0f);
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        p90Var.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.K6, e6Var));
        p90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        p90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(p90Var, w7.y5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.y5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
            w7.a6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.i6.Sh, e6Var, textView2, 1, 14.0f);
            if (i16 == 0) {
                i14 = 0;
            } else {
                i14 = 4;
            }
            if (i16 == 0) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            linearLayout.addView(textView2, w7.y5.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f20029c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final r01 f21916b;

                    {
                        this.f21916b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                r01 r01Var = this.f21916b;
                                AndroidUtilities.runOnUIThread(new kd(r01Var, r01Var.e, 23));
                                return;
                            default:
                                r01 r01Var2 = this.f21916b;
                                int i17 = r01Var2.e;
                                ProfileActivity profileActivity = r01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new zg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final r01 f21916b;

                    {
                        this.f21916b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                r01 r01Var = this.f21916b;
                                AndroidUtilities.runOnUIThread(new kd(r01Var, r01Var.e, 23));
                                return;
                            default:
                                r01 r01Var2 = this.f21916b;
                                int i17 = r01Var2.e;
                                ProfileActivity profileActivity = r01Var2.h.e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new zg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
