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
public final class xk0 extends org.telegram.ui.Components.ul0 {
    public final al0 f38768c;

    public xk0(al0 al0Var) {
        this.f38768c = al0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38768c.f31031n;
    }

    @Override
    public final long i(int i10) {
        yk0 yk0Var;
        al0 al0Var = this.f38768c;
        int i11 = al0Var.E;
        if (i10 >= i11 && i10 < al0Var.F) {
            yk0Var = (yk0) al0Var.f31028b.get(i10 - i11);
        } else {
            int i12 = al0Var.f31032r;
            if (i10 >= i12 && i10 < al0Var.f31033s) {
                yk0Var = (yk0) al0Var.f31027a.get(i10 - i12);
            } else {
                yk0Var = null;
            }
        }
        if (yk0Var != null) {
            return yk0Var.f39020c;
        }
        al0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == al0Var.f31036y) {
            return 2L;
        }
        if (i10 == al0Var.v) {
            return 3L;
        }
        if (i10 == al0Var.f31034w) {
            return 4L;
        }
        if (i10 == al0Var.f31035x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        al0 al0Var = this.f38768c;
        if (i10 >= al0Var.E && i10 < al0Var.F) {
            return 0;
        }
        al0Var.getClass();
        if (i10 != 0 && i10 != al0Var.f31036y) {
            if (i10 == al0Var.v) {
                return 2;
            }
            if (i10 != al0Var.f31034w && i10 != al0Var.f31035x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        yk0 yk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        al0 al0Var = this.f38768c;
        org.telegram.ui.ActionBar.f6 f6Var = al0Var.h;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18056k7, f6Var), mode));
                    org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(drawable, drawable2);
                    f2Var.f19105a.l(LocaleController.getString(R.string.UploadSound), false);
                    f2Var.f19106b.setImageDrawable(vqVar);
                    f2Var.f19107c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == al0Var.f31036y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        zk0 zk0Var = (zk0) view;
        int i12 = al0Var.E;
        if (i10 >= i12 && i10 < al0Var.F) {
            yk0Var = (yk0) al0Var.f31028b.get(i10 - i12);
        } else {
            yk0Var = null;
        }
        int i13 = al0Var.f31032r;
        if (i10 >= i13 && i10 < al0Var.f31033s) {
            yk0Var = (yk0) al0Var.f31027a.get(i10 - i13);
        }
        if (yk0Var != null) {
            if (zk0Var.e == yk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (yk0Var == al0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (al0Var.J.get(yk0Var.f39020c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            zk0Var.e = yk0Var;
            zk0Var.f39406a.setText(yk0Var.f39021f);
            if (i10 != al0Var.F - 1) {
                z13 = true;
            }
            zk0Var.d = z13;
            zk0Var.f39407b.a(z11, z10);
            zk0Var.f39408c.a(z12, z10);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f38768c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, f6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, f6Var);
                f2Var.d = 61;
                f2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
                m4Var = f2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f39407b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17983g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18000h7, f6Var));
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
            frameLayout.addView(radioButton, w7.a6.d(22, 22.0f, i20, f7, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(context, 24, f6Var);
            frameLayout.f39408c = tpVar;
            int i22 = org.telegram.ui.ActionBar.j6.f17928d6;
            tpVar.b(-1, i22, org.telegram.ui.ActionBar.j6.f18056k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(tpVar, w7.a6.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            tpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f39406a = textView;
            org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
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
            frameLayout.addView(textView, w7.a6.d(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
            m4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.j(m4Var, m4Var, -1, -2);
    }
}
