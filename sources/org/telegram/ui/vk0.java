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
public final class vk0 extends org.telegram.ui.Components.kl0 {
    public final yk0 f38576c;

    public vk0(yk0 yk0Var) {
        this.f38576c = yk0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38576c.f39900n;
    }

    @Override
    public final long i(int i10) {
        wk0 wk0Var;
        yk0 yk0Var = this.f38576c;
        int i11 = yk0Var.E;
        if (i10 >= i11 && i10 < yk0Var.F) {
            wk0Var = (wk0) yk0Var.f39897b.get(i10 - i11);
        } else {
            int i12 = yk0Var.f39901r;
            if (i10 >= i12 && i10 < yk0Var.f39902s) {
                wk0Var = (wk0) yk0Var.f39896a.get(i10 - i12);
            } else {
                wk0Var = null;
            }
        }
        if (wk0Var != null) {
            return wk0Var.f39250c;
        }
        yk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == yk0Var.f39905y) {
            return 2L;
        }
        if (i10 == yk0Var.v) {
            return 3L;
        }
        if (i10 == yk0Var.f39903w) {
            return 4L;
        }
        if (i10 == yk0Var.f39904x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        yk0 yk0Var = this.f38576c;
        if (i10 >= yk0Var.E && i10 < yk0Var.F) {
            return 0;
        }
        yk0Var.getClass();
        if (i10 != 0 && i10 != yk0Var.f39905y) {
            if (i10 == yk0Var.v) {
                return 2;
            }
            if (i10 != yk0Var.f39903w && i10 != yk0Var.f39904x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        wk0 wk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        yk0 yk0Var = this.f38576c;
        org.telegram.ui.ActionBar.e6 e6Var = yk0Var.h;
        int i11 = c1Var.f42674f;
        View view = c1Var.f42671a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.N6, e6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18962k7, e6Var), mode));
                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
                    f2Var.f20054a.l(LocaleController.getString(R.string.UploadSound), false);
                    f2Var.f20055b.setImageDrawable(pqVar);
                    f2Var.f20056c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == yk0Var.f39905y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        xk0 xk0Var = (xk0) view;
        int i12 = yk0Var.E;
        if (i10 >= i12 && i10 < yk0Var.F) {
            wk0Var = (wk0) yk0Var.f39897b.get(i10 - i12);
        } else {
            wk0Var = null;
        }
        int i13 = yk0Var.f39901r;
        if (i10 >= i13 && i10 < yk0Var.f39902s) {
            wk0Var = (wk0) yk0Var.f39896a.get(i10 - i13);
        }
        if (wk0Var != null) {
            if (xk0Var.e == wk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (wk0Var == yk0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (yk0Var.J.get(wk0Var.f39250c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            xk0Var.e = wk0Var;
            xk0Var.f39648a.setText(wk0Var.f39251f);
            if (i10 != yk0Var.F - 1) {
                z13 = true;
            }
            xk0Var.d = z13;
            xk0Var.f39649b.a(z11, z10);
            xk0Var.f39650c.a(z12, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38576c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, e6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, e6Var);
                f2Var.d = 61;
                f2Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                m4Var = f2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f39649b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18889g7, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18906h7, e6Var));
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
            frameLayout.addView(radioButton, w7.x5.d(22, 22.0f, i20, f7, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 24, e6Var);
            frameLayout.f39650c = npVar;
            int i22 = org.telegram.ui.ActionBar.i6.f18834d6;
            npVar.b(-1, i22, org.telegram.ui.ActionBar.i6.f18962k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(npVar, w7.x5.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            npVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f39648a = textView;
            org.telegram.messenger.vl.o(org.telegram.ui.ActionBar.i6.G6, e6Var, textView, 1, 16.0f);
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
            frameLayout.addView(textView, w7.x5.d(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i22, e6Var));
            m4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }
}
