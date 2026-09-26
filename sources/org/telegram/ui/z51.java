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
public final class z51 extends org.telegram.ui.Components.vl0 {
    public final a71 f40341c;

    public z51(a71 a71Var) {
        this.f40341c = a71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42963f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40341c.f32054u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f40341c.f32056v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        a71 a71Var = this.f40341c;
        if (i10 == a71Var.f32009a) {
            return 7;
        }
        if (i10 < a71Var.f32012b || i10 >= a71Var.f32015c) {
            if (i10 < a71Var.d || i10 >= a71Var.e) {
                if (i10 >= a71Var.E && i10 < a71Var.F) {
                    return 1;
                }
                if (i10 >= a71Var.f32046r && i10 < a71Var.f32049s) {
                    return 3;
                }
                if (a71Var.f32065y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (a71Var.f32067z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == a71Var.v) {
                    return 6;
                }
                if (a71Var.f32059w0.indexOfKey(i10) < 0 && i10 != a71Var.f32022f && i10 != a71Var.f32064y && i10 != a71Var.f32037n && i10 != a71Var.h && i10 != a71Var.f32061x) {
                    if (i10 != a71Var.f32058w) {
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
    public final void v(s4.c1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zm0 zm0Var;
        int k10;
        a71 a71Var = this.f40341c;
        int i11 = a71Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = a71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = a71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            zm0Var = new f61(a71Var, context, z10);
        } else if (i10 == 2) {
            zm0Var = new ImageView(a71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = a71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f33281a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (a71Var.f32026g1) {
                    k10 = org.telegram.ui.ActionBar.h6.v(a71Var.f32024f1, org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.y5.e(-2, -2, 17));
                zm0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(a71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f33043b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.rr.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f33042a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
                frameLayout3.addView(u3Var, w7.y5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.y5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                frameLayout2.f33044c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.y5.c(-1.0f, -1));
                zm0Var = frameLayout2;
            } else if (i10 == 6) {
                zm0 zm0Var2 = new zm0(a71Var.getContext(), 2);
                zm0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    zm0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    zm0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    zm0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                zm0Var2.setGravity(17);
                zm0Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19442y6, d6Var));
                zm0Var = zm0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(a71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                zm0Var = t3Var;
            } else {
                zm0Var = new j61(a71Var, a71Var.getContext());
            }
        } else {
            j61 j61Var = new j61(a71Var, a71Var.getContext());
            if (i10 == 8) {
                j61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(j61Var);
                j61Var.h = imageReceiver;
                j61Var.f34667r = imageReceiver;
                imageReceiver.setImageBitmap(a71Var.N);
                a71Var.O = j61Var;
                j61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            zm0Var = j61Var;
        }
        if (a71.c(a71Var)) {
            zm0Var.setScaleX(0.0f);
            zm0Var.setScaleY(0.0f);
        }
        return new s4.c1(zm0Var);
    }
}
