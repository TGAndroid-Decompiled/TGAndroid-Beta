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
public final class r01 extends org.telegram.ui.Cells.z6 {
    public final s01 h;

    public r01(s01 s01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = s01Var;
        this.f21677f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f21674a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.x5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, d6Var);
        this.f21675b = d90Var;
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        d90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.K6, d6Var));
        d90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        d90Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(d90Var, w7.x5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.z5.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.q3.p(org.telegram.ui.ActionBar.h6.Sh, d6Var, textView2, 1, 14.0f);
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
            linearLayout.addView(textView2, w7.x5.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f21676c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final r01 f21637b;

                    {
                        this.f21637b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                r01 r01Var = this.f21637b;
                                AndroidUtilities.runOnUIThread(new kd(r01Var, r01Var.e, 24));
                                return;
                            default:
                                r01 r01Var2 = this.f21637b;
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
                    public final r01 f21637b;

                    {
                        this.f21637b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                r01 r01Var = this.f21637b;
                                AndroidUtilities.runOnUIThread(new kd(r01Var, r01Var.e, 24));
                                return;
                            default:
                                r01 r01Var2 = this.f21637b;
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
