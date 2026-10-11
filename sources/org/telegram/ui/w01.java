package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hh1;
import org.telegram.ui.w01;
public final class w01 extends org.telegram.ui.Cells.a7 {
    public final x01 h;

    public w01(x01 x01Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = x01Var;
        this.f21835f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f21831a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.x5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(context, d6Var);
        this.f21832b = ea0Var;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, d6Var));
        ea0Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.K6, d6Var));
        ea0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        ea0Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(ea0Var, w7.x5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.z5.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.h6.Sh, d6Var, textView2, 1, 14.0f);
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
                this.f21833c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final w01 f23835b;

                    {
                        this.f23835b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                w01 w01Var = this.f23835b;
                                AndroidUtilities.runOnUIThread(new nd(w01Var, w01Var.f21834e, 25));
                                return;
                            default:
                                w01 w01Var2 = this.f23835b;
                                int i17 = w01Var2.f21834e;
                                ProfileActivity profileActivity = w01Var2.h.f43950e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new hh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final w01 f23835b;

                    {
                        this.f23835b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                w01 w01Var = this.f23835b;
                                AndroidUtilities.runOnUIThread(new nd(w01Var, w01Var.f21834e, 25));
                                return;
                            default:
                                w01 w01Var2 = this.f23835b;
                                int i17 = w01Var2.f21834e;
                                ProfileActivity profileActivity = w01Var2.h.f43950e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new hh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
