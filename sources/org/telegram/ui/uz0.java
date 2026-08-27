package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.xl;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uz0;
import org.telegram.ui.zf1;

public final class uz0 extends org.telegram.ui.Cells.v6 {
    public final vz0 h;

    public uz0(vz0 vz0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = vz0Var;
        this.f25813f = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f25809a = textView;
        org.telegram.ui.Cells.pa.m(15.0f, 1, textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        addView(textView, h7.z5.t(-1, -2, (LocaleController.isRTL ? 5 : 3) | 48, 21, 15, 21, 0));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, c6Var);
        this.f25810b = p80Var;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
        p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K6, c6Var));
        p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        p80Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(p80Var, h7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        final int i11 = 0;
        linearLayout.setOrientation(0);
        addView(linearLayout, h7.z5.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i12 = 0;
        while (i12 < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
            h7.b6.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            org.telegram.messenger.rl.w(org.telegram.ui.ActionBar.g6.Sh, c6Var, textView2, 1, 14.0f);
            linearLayout.addView(textView2, h7.z5.m(0.5f, 0, 44, i12 == 0 ? 0 : 4, i12 == 0 ? 4 : 0, 0));
            if (i12 == 0) {
                this.f25811c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {

                    public final uz0 f25705b;

                    {
                        this.f25705b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                uz0 uz0Var = this.f25705b;
                                AndroidUtilities.runOnUIThread(new xl(uz0Var, uz0Var.f25812e, 22));
                                break;
                            default:
                                uz0 uz0Var2 = this.f25705b;
                                int i13 = uz0Var2.f25812e;
                                ProfileActivity profileActivity = uz0Var2.h.f43554e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new zf1(8, null));
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                }
                                break;
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {

                    public final uz0 f25705b;

                    {
                        this.f25705b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                uz0 uz0Var = this.f25705b;
                                AndroidUtilities.runOnUIThread(new xl(uz0Var, uz0Var.f25812e, 22));
                                break;
                            default:
                                uz0 uz0Var2 = this.f25705b;
                                int i13 = uz0Var2.f25812e;
                                ProfileActivity profileActivity = uz0Var2.h.f43554e;
                                if (i13 != 0) {
                                    profileActivity.presentFragment(new zf1(8, null));
                                } else {
                                    profileActivity.presentFragment(new org.telegram.ui.h(3));
                                }
                                break;
                        }
                    }
                });
            }
            i12++;
        }
    }
}
