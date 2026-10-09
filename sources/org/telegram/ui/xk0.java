package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;
public final class xk0 extends org.telegram.ui.Components.pm0 {
    public final al0 f44057c;

    public xk0(al0 al0Var) {
        this.f44057c = al0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f44057c.f35956n;
    }

    @Override
    public final long i(int i10) {
        yk0 yk0Var;
        al0 al0Var = this.f44057c;
        int i11 = al0Var.E;
        if (i10 >= i11 && i10 < al0Var.F) {
            yk0Var = (yk0) al0Var.f35952b.get(i10 - i11);
        } else {
            int i12 = al0Var.f35957r;
            if (i10 >= i12 && i10 < al0Var.f35958s) {
                yk0Var = (yk0) al0Var.f35951a.get(i10 - i12);
            } else {
                yk0Var = null;
            }
        }
        if (yk0Var != null) {
            return yk0Var.f44362c;
        }
        al0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == al0Var.f35961y) {
            return 2L;
        }
        if (i10 == al0Var.v) {
            return 3L;
        }
        if (i10 == al0Var.f35959w) {
            return 4L;
        }
        if (i10 == al0Var.f35960x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        al0 al0Var = this.f44057c;
        if (i10 >= al0Var.E && i10 < al0Var.F) {
            return 0;
        }
        al0Var.getClass();
        if (i10 != 0 && i10 != al0Var.f35961y) {
            if (i10 == al0Var.v) {
                return 2;
            }
            if (i10 != al0Var.f35959w && i10 != al0Var.f35960x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        yk0 yk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        al0 al0Var = this.f44057c;
        org.telegram.ui.ActionBar.e6 e6Var = al0Var.h;
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
                    Drawable drawable = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.N6, e6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20926k7, e6Var), mode));
                    org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(drawable, drawable2);
                    g2Var.f22110a.l(LocaleController.getString(R.string.UploadSound), false);
                    g2Var.f22111b.setImageDrawable(frVar);
                    g2Var.f22112c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == al0Var.f35961y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        zk0 zk0Var = (zk0) view;
        int i12 = al0Var.E;
        if (i10 >= i12 && i10 < al0Var.F) {
            yk0Var = (yk0) al0Var.f35952b.get(i10 - i12);
        } else {
            yk0Var = null;
        }
        int i13 = al0Var.f35957r;
        if (i10 >= i13 && i10 < al0Var.f35958s) {
            yk0Var = (yk0) al0Var.f35951a.get(i10 - i13);
        }
        if (yk0Var != null) {
            if (zk0Var.f44685e == yk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (yk0Var == al0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (al0Var.J.get(yk0Var.f44362c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            zk0Var.f44685e = yk0Var;
            zk0Var.f44682a.setText(yk0Var.f44364f);
            if (i10 != al0Var.F - 1) {
                z13 = true;
            }
            zk0Var.d = z13;
            zk0Var.f44683b.a(z11, z10);
            zk0Var.f44684c.a(z12, z10);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.f44057c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, e6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                }
            } else {
                org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, e6Var);
                g2Var.d = 61;
                g2Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
                m4Var = g2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f44683b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20854g7, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20870h7, e6Var));
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i20 = i11 | 16;
            int i21 = 20;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 20;
            }
            float f7 = i12;
            if (!z10) {
                i21 = 0;
            }
            frameLayout.addView(radioButton, w7.x5.a(22.0f, f7, 0.0f, i21, 0.0f, 22, i20));
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(context, 24, e6Var);
            frameLayout.f44684c = dqVar;
            int i22 = org.telegram.ui.ActionBar.i6.f20797d6;
            dqVar.b(-1, i22, org.telegram.ui.ActionBar.i6.f20926k7);
            dqVar.setDrawUnchecked(false);
            dqVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i23 = i13 | 16;
            if (z11) {
                i14 = 0;
            } else {
                i14 = 18;
            }
            float f10 = i14;
            if (z11) {
                i15 = 18;
            } else {
                i15 = 0;
            }
            frameLayout.addView(dqVar, w7.x5.a(26.0f, f10, 0.0f, i15, 0.0f, 26, i23));
            dqVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f44682a = textView;
            org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.G6, e6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView.setGravity(i16 | 16);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i19 = 5;
            }
            int i24 = i19 | 16;
            if (z12) {
                i17 = 23;
            } else {
                i17 = 61;
            }
            float f11 = i17;
            if (!z12) {
                i18 = 23;
            }
            frameLayout.addView(textView, w7.x5.a(-2.0f, f11, 0.0f, i18, 0.0f, -2, i24));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i22, e6Var));
            m4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }
}
