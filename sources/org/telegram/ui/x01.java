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
import org.telegram.ui.ih1;
import org.telegram.ui.x01;
public final class x01 extends org.telegram.ui.Cells.a7 {
    public final y01 h;

    public x01(y01 y01Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.h = y01Var;
        this.f21811f = UserConfig.selectedAccount;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f21807a = textView;
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, e6Var));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.x5.t(-1, -2, i11 | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(context, e6Var);
        this.f21808b = fa0Var;
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.J6, e6Var));
        fa0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.K6, e6Var));
        fa0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        fa0Var.setGravity(i12);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(fa0Var, w7.x5.t(-2, -2, i13, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i16 = 0; i16 < 2; i16++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
            w7.z5.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.Sh, e6Var, textView2, 1, 14.0f);
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
                this.f21809c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final x01 f23811b;

                    {
                        this.f23811b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                x01 x01Var = this.f23811b;
                                AndroidUtilities.runOnUIThread(new nd(x01Var, x01Var.f21810e, 25));
                                return;
                            default:
                                x01 x01Var2 = this.f23811b;
                                int i17 = x01Var2.f21810e;
                                ProfileActivity profileActivity = x01Var2.h.f44235e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ih1(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final x01 f23811b;

                    {
                        this.f23811b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                x01 x01Var = this.f23811b;
                                AndroidUtilities.runOnUIThread(new nd(x01Var, x01Var.f21810e, 25));
                                return;
                            default:
                                x01 x01Var2 = this.f23811b;
                                int i17 = x01Var2.f21810e;
                                ProfileActivity profileActivity = x01Var2.h.f44235e;
                                if (i17 == 0) {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new ih1(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}
