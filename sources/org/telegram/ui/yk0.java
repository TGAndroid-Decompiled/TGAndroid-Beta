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
public final class yk0 extends org.telegram.ui.Components.kl0 {
    public final bl0 f43163c;

    public yk0(bl0 bl0Var) {
        this.f43163c = bl0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f43163c.f34834n;
    }

    @Override
    public final long i(int i10) {
        zk0 zk0Var;
        bl0 bl0Var = this.f43163c;
        int i11 = bl0Var.E;
        if (i10 >= i11 && i10 < bl0Var.F) {
            zk0Var = (zk0) bl0Var.f34830b.get(i10 - i11);
        } else {
            int i12 = bl0Var.f34835r;
            if (i10 >= i12 && i10 < bl0Var.f34836s) {
                zk0Var = (zk0) bl0Var.f34829a.get(i10 - i12);
            } else {
                zk0Var = null;
            }
        }
        if (zk0Var != null) {
            return zk0Var.f43453c;
        }
        bl0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == bl0Var.f34839y) {
            return 2L;
        }
        if (i10 == bl0Var.v) {
            return 3L;
        }
        if (i10 == bl0Var.f34837w) {
            return 4L;
        }
        if (i10 == bl0Var.f34838x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        bl0 bl0Var = this.f43163c;
        if (i10 >= bl0Var.E && i10 < bl0Var.F) {
            return 0;
        }
        bl0Var.getClass();
        if (i10 != 0 && i10 != bl0Var.f34839y) {
            if (i10 == bl0Var.v) {
                return 2;
            }
            if (i10 != bl0Var.f34837w && i10 != bl0Var.f34838x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        zk0 zk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        bl0 bl0Var = this.f43163c;
        org.telegram.ui.ActionBar.f6 f6Var = bl0Var.h;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
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
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20792k7, f6Var), mode));
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
                    f2Var.f21896a.l(LocaleController.getString(R.string.UploadSound), false);
                    f2Var.f21897b.setImageDrawable(oqVar);
                    f2Var.f21898c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == bl0Var.f34839y) {
                l4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        al0 al0Var = (al0) view;
        int i12 = bl0Var.E;
        if (i10 >= i12 && i10 < bl0Var.F) {
            zk0Var = (zk0) bl0Var.f34830b.get(i10 - i12);
        } else {
            zk0Var = null;
        }
        int i13 = bl0Var.f34835r;
        if (i10 >= i13 && i10 < bl0Var.f34836s) {
            zk0Var = (zk0) bl0Var.f34829a.get(i10 - i13);
        }
        if (zk0Var != null) {
            if (al0Var.f34471e == zk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zk0Var == bl0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (bl0Var.J.get(zk0Var.f43453c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            al0Var.f34471e = zk0Var;
            al0Var.f34468a.setText(zk0Var.f43455f);
            if (i10 != bl0Var.F - 1) {
                z13 = true;
            }
            al0Var.d = z13;
            al0Var.f34469b.a(z11, z10);
            al0Var.f34470c.a(z12, z10);
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
        org.telegram.ui.Cells.l4 l4Var;
        org.telegram.ui.ActionBar.f6 f6Var = this.f43163c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, f6Var);
                    l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
                    l4Var = l4Var2;
                } else {
                    l4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, f6Var);
                f2Var.d = 61;
                f2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
                l4Var = f2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f34469b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20719g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20736h7, f6Var));
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
            org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 24, f6Var);
            frameLayout.f34470c = mpVar;
            int i22 = org.telegram.ui.ActionBar.j6.f20663d6;
            mpVar.b(-1, i22, org.telegram.ui.ActionBar.j6.f20792k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(mpVar, w7.x5.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            mpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f34468a = textView;
            org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
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
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
            l4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.l(l4Var, l4Var, -1, -2);
    }
}
