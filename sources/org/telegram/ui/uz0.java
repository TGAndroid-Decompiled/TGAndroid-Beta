package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.qd;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.uz0;
public final class uz0 extends org.telegram.ui.Cells.y6 {
    public final vz0 h;

    public uz0(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.h = vz0Var;
        this.f25999f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f25995a = textView;
        j3.r0.u(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, g7.e6.t(-1, -2, i10 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, b6Var);
        this.f25996b = l80Var;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
        l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K6, b6Var));
        l80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l80Var.setGravity(i11);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(l80Var, g7.e6.t(-2, -2, i12, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i15 = 0; i15 < 2; i15++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
            g7.g6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.Sh, b6Var, textView2, 1, 14.0f);
            if (i15 == 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            if (i15 == 0) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            linearLayout.addView(textView2, g7.e6.m(0.5f, 0, 44, i13, i14, 0));
            if (i15 == 0) {
                this.f25997c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final uz0 f25946b;

                    {
                        this.f25946b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                uz0 uz0Var = this.f25946b;
                                AndroidUtilities.runOnUIThread(new qd(uz0Var, uz0Var.f25998e, 23));
                                return;
                            default:
                                uz0 uz0Var2 = this.f25946b;
                                int i16 = uz0Var2.f25998e;
                                ProfileActivity profileActivity = uz0Var2.h.f43616e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ag1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final uz0 f25946b;

                    {
                        this.f25946b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                uz0 uz0Var = this.f25946b;
                                AndroidUtilities.runOnUIThread(new qd(uz0Var, uz0Var.f25998e, 23));
                                return;
                            default:
                                uz0 uz0Var2 = this.f25946b;
                                int i16 = uz0Var2.f25998e;
                                ProfileActivity profileActivity = uz0Var2.h.f43616e;
                                if (i16 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ag1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
