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
public final class yk0 extends org.telegram.ui.Components.vm0 {
    public final bl0 f44499c;

    public yk0(bl0 bl0Var) {
        this.f44499c = bl0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f44499c.f36198n;
    }

    @Override
    public final long i(int i10) {
        zk0 zk0Var;
        bl0 bl0Var = this.f44499c;
        int i11 = bl0Var.E;
        if (i10 >= i11 && i10 < bl0Var.F) {
            zk0Var = (zk0) bl0Var.f36194b.get(i10 - i11);
        } else {
            int i12 = bl0Var.f36199r;
            if (i10 >= i12 && i10 < bl0Var.f36200s) {
                zk0Var = (zk0) bl0Var.f36193a.get(i10 - i12);
            } else {
                zk0Var = null;
            }
        }
        if (zk0Var != null) {
            return zk0Var.f44867c;
        }
        bl0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == bl0Var.f36203y) {
            return 2L;
        }
        if (i10 == bl0Var.v) {
            return 3L;
        }
        if (i10 == bl0Var.f36201w) {
            return 4L;
        }
        if (i10 == bl0Var.f36202x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        bl0 bl0Var = this.f44499c;
        if (i10 >= bl0Var.E && i10 < bl0Var.F) {
            return 0;
        }
        bl0Var.getClass();
        if (i10 != 0 && i10 != bl0Var.f36203y) {
            if (i10 == bl0Var.v) {
                return 2;
            }
            if (i10 != bl0Var.f36201w && i10 != bl0Var.f36202x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        zk0 zk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        bl0 bl0Var = this.f44499c;
        org.telegram.ui.ActionBar.c6 c6Var = bl0Var.h;
        int i11 = d1Var.f47893f;
        View view = d1Var.f47889a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
                    Drawable drawable = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, c6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20688k7, c6Var), mode));
                    org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(drawable, drawable2);
                    g2Var.f21882a.l(LocaleController.getString(R.string.UploadSound), false);
                    g2Var.f21883b.setImageDrawable(hrVar);
                    g2Var.f21884c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == bl0Var.f36203y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        al0 al0Var = (al0) view;
        int i12 = bl0Var.E;
        if (i10 >= i12 && i10 < bl0Var.F) {
            zk0Var = (zk0) bl0Var.f36194b.get(i10 - i12);
        } else {
            zk0Var = null;
        }
        int i13 = bl0Var.f36199r;
        if (i10 >= i13 && i10 < bl0Var.f36200s) {
            zk0Var = (zk0) bl0Var.f36193a.get(i10 - i13);
        }
        if (zk0Var != null) {
            if (al0Var.f35898e == zk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zk0Var == bl0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (bl0Var.J.get(zk0Var.f44867c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            al0Var.f35898e = zk0Var;
            al0Var.f35895a.setText(zk0Var.f44869f);
            if (i10 != bl0Var.F - 1) {
                z13 = true;
            }
            al0Var.d = z13;
            al0Var.f35896b.a(z11, z10);
            al0Var.f35897c.a(z12, z10);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f44499c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, c6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, c6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                }
            } else {
                org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, c6Var);
                g2Var.d = 61;
                g2Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, c6Var));
                m4Var = g2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f35896b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20616g7, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20632h7, c6Var));
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
            frameLayout.addView(radioButton, w7.w5.a(22.0f, f7, 0.0f, i21, 0.0f, 22, i20));
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(context, 24, c6Var);
            frameLayout.f35897c = fqVar;
            int i22 = org.telegram.ui.ActionBar.h6.f20559d6;
            fqVar.b(-1, i22, org.telegram.ui.ActionBar.h6.f20688k7);
            fqVar.setDrawUnchecked(false);
            fqVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(fqVar, w7.w5.a(26.0f, f10, 0.0f, i15, 0.0f, 26, i23));
            fqVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f35895a = textView;
            org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.G6, c6Var, textView, 1, 16.0f);
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
            frameLayout.addView(textView, w7.w5.a(-2.0f, f11, 0.0f, i18, 0.0f, -2, i24));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i22, c6Var));
            m4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }
}
