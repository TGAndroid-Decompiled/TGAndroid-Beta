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
public final class y51 extends org.telegram.ui.Components.ll0 {
    public final z61 f39728c;

    public y51(z61 z61Var) {
        this.f39728c = z61Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39728c.f40048u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f39728c.f40050v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        z61 z61Var = this.f39728c;
        if (i10 == z61Var.f40003a) {
            return 7;
        }
        if (i10 < z61Var.f40006b || i10 >= z61Var.f40009c) {
            if (i10 < z61Var.d || i10 >= z61Var.e) {
                if (i10 >= z61Var.E && i10 < z61Var.F) {
                    return 1;
                }
                if (i10 >= z61Var.f40040r && i10 < z61Var.f40043s) {
                    return 3;
                }
                if (z61Var.f40059y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (z61Var.f40061z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == z61Var.v) {
                    return 6;
                }
                if (z61Var.f40053w0.indexOfKey(i10) < 0 && i10 != z61Var.f40016f && i10 != z61Var.f40058y && i10 != z61Var.f40031n && i10 != z61Var.h && i10 != z61Var.f40055x) {
                    if (i10 != z61Var.f40052w) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y51.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bn0 bn0Var;
        int k10;
        z61 z61Var = this.f39728c;
        int i11 = z61Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = z61Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = z61Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            bn0Var = new e61(z61Var, context, z10);
        } else if (i10 == 2) {
            bn0Var = new ImageView(z61Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = z61Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f32525a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (z61Var.f40020g1) {
                    k10 = org.telegram.ui.ActionBar.h6.v(z61Var.f40018f1, org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                bn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(z61Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f32274b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.rr.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f32273a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
                frameLayout3.addView(u3Var, w7.x5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.x5.c(-1.0f, -1));
                rg.p0 p0Var = new rg.p0(frameLayout2.getContext(), d6Var, false);
                frameLayout2.f32275c = p0Var;
                p0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(p0Var, w7.x5.c(-1.0f, -1));
                bn0Var = frameLayout2;
            } else if (i10 == 6) {
                bn0 bn0Var2 = new bn0(z61Var.getContext(), 2);
                bn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    bn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    bn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    bn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                bn0Var2.setGravity(17);
                bn0Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19170y6, d6Var));
                bn0Var = bn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(z61Var.getContext(), 52);
                t3Var.setTag("searchbox");
                bn0Var = t3Var;
            } else {
                bn0Var = new i61(z61Var, z61Var.getContext());
            }
        } else {
            i61 i61Var = new i61(z61Var, z61Var.getContext());
            if (i10 == 8) {
                i61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(i61Var);
                i61Var.h = imageReceiver;
                i61Var.f34038r = imageReceiver;
                imageReceiver.setImageBitmap(z61Var.N);
                z61Var.O = i61Var;
                i61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            bn0Var = i61Var;
        }
        if (z61.c(z61Var)) {
            bn0Var.setScaleX(0.0f);
            bn0Var.setScaleY(0.0f);
        }
        return new s4.c1(bn0Var);
    }
}
