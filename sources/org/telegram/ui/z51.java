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
public final class z51 extends org.telegram.ui.Components.yl0 {
    public final a71 f43700c;

    public z51(a71 a71Var) {
        this.f43700c = a71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46542f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43700c.f34766u0;
    }

    @Override
    public final long i(int i10) {
        return Math.abs(((Long) this.f43700c.f34768v0.get(i10)).longValue());
    }

    @Override
    public final int j(int i10) {
        a71 a71Var = this.f43700c;
        if (i10 == a71Var.f34720a) {
            return 7;
        }
        if (i10 < a71Var.f34723b || i10 >= a71Var.f34726c) {
            if (i10 < a71Var.d || i10 >= a71Var.f34731e) {
                if (i10 >= a71Var.E && i10 < a71Var.F) {
                    return 1;
                }
                if (i10 >= a71Var.f34758r && i10 < a71Var.f34761s) {
                    return 3;
                }
                if (a71Var.f34777y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (a71Var.f34779z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == a71Var.v) {
                    return 6;
                }
                if (a71Var.f34771w0.indexOfKey(i10) < 0 && i10 != a71Var.f34734f && i10 != a71Var.f34776y && i10 != a71Var.f34749n && i10 != a71Var.h && i10 != a71Var.f34773x) {
                    if (i10 != a71Var.f34770w) {
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
        dn0 dn0Var;
        int k10;
        a71 a71Var = this.f43700c;
        int i11 = a71Var.W;
        org.telegram.ui.ActionBar.d6 d6Var = a71Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = a71Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            dn0Var = new f61(a71Var, context, z10);
        } else if (i10 == 2) {
            dn0Var = new ImageView(a71Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = a71Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f35973a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (a71Var.f34738g1) {
                    k10 = org.telegram.ui.ActionBar.i6.v(a71Var.f34736f1, org.telegram.ui.ActionBar.i6.l1(0.4f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)));
                } else {
                    k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Te, false), 99);
                }
                textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(11.0f), k10));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                frameLayout.addView(textView, w7.z5.e(-2, -2, 17));
                dn0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(a71Var.getContext());
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f35669b = u3Var;
                u3Var.b(0.3f, 250L, org.telegram.ui.Components.tr.h);
                u3Var.setTextSize(AndroidUtilities.dp(14.0f));
                u3Var.setTypeface(AndroidUtilities.bold());
                u3Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, d6Var));
                u3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f35668a = frameLayout3;
                frameLayout3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
                frameLayout3.addView(u3Var, w7.z5.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.z5.c(-1.0f, -1));
                rg.q0 q0Var = new rg.q0(frameLayout2.getContext(), d6Var, false);
                frameLayout2.f35670c = q0Var;
                q0Var.setIcon(R.raw.unlock_icon);
                frameLayout2.addView(q0Var, w7.z5.c(-1.0f, -1));
                dn0Var = frameLayout2;
            } else if (i10 == 6) {
                dn0 dn0Var2 = new dn0(a71Var.getContext(), 2);
                dn0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    dn0Var2.setText(LocaleController.getString(R.string.SelectTopicIconHint));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    dn0Var2.setText(LocaleController.getString(R.string.ReactionsLongtapHint));
                } else {
                    dn0Var2.setText(LocaleController.getString(R.string.EmojiLongtapHint));
                }
                dn0Var2.setGravity(17);
                dn0Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21214y6, d6Var));
                dn0Var = dn0Var2;
            } else if (i10 == 7) {
                View t3Var = new org.telegram.ui.Cells.t3(a71Var.getContext(), 52);
                t3Var.setTag("searchbox");
                dn0Var = t3Var;
            } else {
                dn0Var = new j61(a71Var, a71Var.getContext());
            }
        } else {
            j61 j61Var = new j61(a71Var, a71Var.getContext());
            if (i10 == 8) {
                j61Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(j61Var);
                j61Var.h = imageReceiver;
                j61Var.f37587r = imageReceiver;
                imageReceiver.setImageBitmap(a71Var.N);
                a71Var.O = j61Var;
                j61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            dn0Var = j61Var;
        }
        if (a71.c(a71Var)) {
            dn0Var.setScaleX(0.0f);
            dn0Var.setScaleY(0.0f);
        }
        return new s4.c1(dn0Var);
    }
}
