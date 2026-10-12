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
import org.telegram.ui.kh1;
import org.telegram.ui.z01;
public final class z01 extends org.telegram.ui.Cells.z6 {
    public final a11 h;

    public z01(a11 a11Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = a11Var;
        this.f23573f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f23569a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, c6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.w5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(context, c6Var);
        this.f23570b = ia0Var;
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J6, c6Var));
        ia0Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.K6, c6Var));
        ia0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        ia0Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(ia0Var, w7.w5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.w5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
            w7.y5.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.h6.Sh, c6Var, textView2, 1, 14.0f);
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
            linearLayout.addView(textView2, w7.w5.m(0.5f, 0, 44, i14, i15, 0));
            if (i16 == 0) {
                this.f23571c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final z01 f23541b;

                    {
                        this.f23541b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                z01 z01Var = this.f23541b;
                                AndroidUtilities.runOnUIThread(new nd(z01Var, z01Var.f23572e, 25));
                                return;
                            default:
                                z01 z01Var2 = this.f23541b;
                                int i17 = z01Var2.f23572e;
                                ProfileActivity profileActivity = z01Var2.h.f35664e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new kh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final z01 f23541b;

                    {
                        this.f23541b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                z01 z01Var = this.f23541b;
                                AndroidUtilities.runOnUIThread(new nd(z01Var, z01Var.f23572e, 25));
                                return;
                            default:
                                z01 z01Var2 = this.f23541b;
                                int i17 = z01Var2.f23572e;
                                ProfileActivity profileActivity = z01Var2.h.f35664e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new kh1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
