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
public final class y41 extends org.telegram.ui.Components.hm0 {
    public final z51 f43348c;

    public y41(z51 z51Var) {
        this.f43348c = z51Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43348c.f43649u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f43348c.f43651v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        z51 z51Var = this.f43348c;
        if (i10 == z51Var.f43604a) {
            return 7;
        }
        if (i10 < z51Var.f43607b || i10 >= z51Var.f43610c) {
            if (i10 < z51Var.d || i10 >= z51Var.e) {
                if (i10 >= z51Var.E && i10 < z51Var.F) {
                    return 1;
                }
                if (i10 >= z51Var.f43641r && i10 < z51Var.f43644s) {
                    return 3;
                }
                if (z51Var.f43660y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (z51Var.f43662z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == z51Var.v) {
                    return 6;
                }
                if (z51Var.f43654w0.indexOfKey(i10) < 0 && i10 != z51Var.f43617f && i10 != z51Var.f43659y && i10 != z51Var.f43632n && i10 != z51Var.h && i10 != z51Var.f43656x) {
                    if (i10 != z51Var.f43653w) {
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
    public final void v(s4.b1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y41.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        md0 md0Var;
        int o10;
        z51 z51Var = this.f43348c;
        int i11 = z51Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = z51Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = z51Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            md0Var = new e51(z51Var, context, z10);
        } else if (i10 == 2) {
            md0Var = new ImageView(z51Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = z51Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f36099a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (z51Var.f43621g1) {
                    o10 = org.telegram.ui.ActionBar.h6.v(z51Var.f43619f1, org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), o10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                md0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(z51Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35841b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.bs.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35840a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
                frameLayout3.addView(t3Var, w7.z5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.z5.d(-1.0f, -1));
                sg.p0 p0Var = new sg.p0(frameLayout2.getContext(), d6Var, false);
                frameLayout2.f35842c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.z5.d(-1.0f, -1));
                md0Var = frameLayout2;
            } else if (i10 == 6) {
                md0 md0Var2 = new md0(z51Var.getContext(), 3);
                md0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    md0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    md0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    md0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                md0Var2.setGravity(17);
                md0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21381y6, d6Var));
                md0Var = md0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(z51Var.getContext(), 52);
                s3Var.setTag("searchbox");
                md0Var = s3Var;
            } else {
                md0Var = new i51(z51Var, z51Var.getContext());
            }
        } else {
            i51 i51Var = new i51(z51Var, z51Var.getContext());
            if (i10 == 8) {
                i51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(i51Var);
                i51Var.h = imageReceiver;
                i51Var.f37767r = imageReceiver;
                imageReceiver.setImageBitmap(z51Var.N);
                z51Var.O = i51Var;
                i51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            md0Var = i51Var;
        }
        if (z51.c(z51Var)) {
            md0Var.setScaleX(0.0f);
            md0Var.setScaleY(0.0f);
        }
        return new s4.b1(md0Var);
    }
}
