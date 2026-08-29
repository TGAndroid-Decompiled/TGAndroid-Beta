package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cg1;
import org.telegram.ui.uz0;
public final class uz0 extends org.telegram.ui.Cells.w6 {
    public final vz0 h;

    public uz0(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = vz0Var;
        this.f25874f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f25870a = textView;
        th.n(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, i7.f6.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, c6Var);
        this.f25871b = y80Var;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        y80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K6, c6Var));
        y80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        y80Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(y80Var, i7.f6.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, i7.f6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
            i7.h6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            b.w(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView2, 1, 14.0f);
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
            linearLayout.addView(textView2, i7.f6.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f25872c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final uz0 f25832b;

                    {
                        this.f25832b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                uz0 uz0Var = this.f25832b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(uz0Var, uz0Var.f25873e, 25));
                                return;
                            default:
                                uz0 uz0Var2 = this.f25832b;
                                int i17 = uz0Var2.f25873e;
                                ProfileActivity profileActivity = uz0Var2.h.f43803e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.i(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new cg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final uz0 f25832b;

                    {
                        this.f25832b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                uz0 uz0Var = this.f25832b;
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(uz0Var, uz0Var.f25873e, 25));
                                return;
                            default:
                                uz0 uz0Var2 = this.f25832b;
                                int i17 = uz0Var2.f25873e;
                                ProfileActivity profileActivity = uz0Var2.h.f43803e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.i(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new cg1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
