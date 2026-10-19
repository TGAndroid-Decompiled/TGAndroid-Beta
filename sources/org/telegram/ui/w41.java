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
public final class w41 extends org.telegram.ui.Components.hm0 {
    public final x51 f42463c;

    public w41(x51 x51Var) {
        this.f42463c = x51Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42463c.f43083u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f42463c.f43085v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        x51 x51Var = this.f42463c;
        if (i10 == x51Var.f43038a) {
            return 7;
        }
        if (i10 < x51Var.f43041b || i10 >= x51Var.f43044c) {
            if (i10 < x51Var.d || i10 >= x51Var.e) {
                if (i10 >= x51Var.E && i10 < x51Var.F) {
                    return 1;
                }
                if (i10 >= x51Var.f43075r && i10 < x51Var.f43078s) {
                    return 3;
                }
                if (x51Var.f43094y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (x51Var.f43096z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == x51Var.v) {
                    return 6;
                }
                if (x51Var.f43088w0.indexOfKey(i10) < 0 && i10 != x51Var.f43051f && i10 != x51Var.f43093y && i10 != x51Var.f43066n && i10 != x51Var.h && i10 != x51Var.f43090x) {
                    if (i10 != x51Var.f43087w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w41.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        kd0 kd0Var;
        int o10;
        x51 x51Var = this.f42463c;
        int i11 = x51Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = x51Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = x51Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            kd0Var = new c51(x51Var, context, z10);
        } else if (i10 == 2) {
            kd0Var = new ImageView(x51Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = x51Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35520a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (x51Var.f43055g1) {
                    o10 = org.telegram.ui.ActionBar.h6.v(x51Var.f43053f1, org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false)));
                } else {
                    o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(11.0f), o10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                kd0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(x51Var.getContext());
                org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35272b = t3Var;
                t3Var.b(0.3f, 250L, org.telegram.ui.Components.bs.h);
                t3Var.setTextSize(AndroidUtilities.dp(14.0f));
                t3Var.setTypeface(AndroidUtilities.bold());
                t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
                t3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35271a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
                frameLayout3.addView(t3Var, w7.z5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.z5.c(-1.0f, -1));
                sg.q0 q0Var = new sg.q0(frameLayout2.getContext(), d6Var, false);
                frameLayout2.f35273c = q0Var;
                q0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(q0Var, w7.z5.c(-1.0f, -1));
                kd0Var = frameLayout2;
            } else if (i10 == 6) {
                kd0 kd0Var2 = new kd0(x51Var.getContext(), 3);
                kd0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    kd0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    kd0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    kd0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                kd0Var2.setGravity(17);
                kd0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21377y6, d6Var));
                kd0Var = kd0Var2;
            } else if (i10 == 7) {
                View s3Var = new org.telegram.ui.Cells.s3(x51Var.getContext(), 52);
                s3Var.setTag("searchbox");
                kd0Var = s3Var;
            } else {
                kd0Var = new g51(x51Var, x51Var.getContext());
            }
        } else {
            g51 g51Var = new g51(x51Var, x51Var.getContext());
            if (i10 == 8) {
                g51Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(g51Var);
                g51Var.h = imageReceiver;
                g51Var.f37193r = imageReceiver;
                imageReceiver.setImageBitmap(x51Var.N);
                x51Var.O = g51Var;
                g51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            kd0Var = g51Var;
        }
        if (x51.c(x51Var)) {
            kd0Var.setScaleX(0.0f);
            kd0Var.setScaleY(0.0f);
        }
        return new s4.b1(kd0Var);
    }
}
