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
public final class sk0 extends org.telegram.ui.Components.xl0 {
    public final vk0 f37488c;

    public sk0(vk0 vk0Var) {
        this.f37488c = vk0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f37488c.f38629n;
    }

    @Override
    public final long i(int i10) {
        tk0 tk0Var;
        vk0 vk0Var = this.f37488c;
        int i11 = vk0Var.E;
        if (i10 >= i11 && i10 < vk0Var.F) {
            tk0Var = (tk0) vk0Var.f38626b.get(i10 - i11);
        } else {
            int i12 = vk0Var.f38630r;
            if (i10 >= i12 && i10 < vk0Var.f38631s) {
                tk0Var = (tk0) vk0Var.f38625a.get(i10 - i12);
            } else {
                tk0Var = null;
            }
        }
        if (tk0Var != null) {
            return tk0Var.f37858c;
        }
        vk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == vk0Var.f38634y) {
            return 2L;
        }
        if (i10 == vk0Var.v) {
            return 3L;
        }
        if (i10 == vk0Var.f38632w) {
            return 4L;
        }
        if (i10 == vk0Var.f38633x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        vk0 vk0Var = this.f37488c;
        if (i10 >= vk0Var.E && i10 < vk0Var.F) {
            return 0;
        }
        vk0Var.getClass();
        if (i10 != 0 && i10 != vk0Var.f38634y) {
            if (i10 == vk0Var.v) {
                return 2;
            }
            if (i10 != vk0Var.f38632w && i10 != vk0Var.f38633x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        tk0 tk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        vk0 vk0Var = this.f37488c;
        org.telegram.ui.ActionBar.e6 e6Var = vk0Var.h;
        int i11 = c1Var.f43008f;
        View view = c1Var.f43005a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
                    Drawable drawable = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.N6, e6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19186k7, e6Var), mode));
                    org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(drawable, drawable2);
                    g2Var.f20326a.l(LocaleController.getString(R.string.UploadSound), false);
                    g2Var.f20327b.setImageDrawable(rqVar);
                    g2Var.f20328c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == vk0Var.f38634y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        uk0 uk0Var = (uk0) view;
        int i12 = vk0Var.E;
        if (i10 >= i12 && i10 < vk0Var.F) {
            tk0Var = (tk0) vk0Var.f38626b.get(i10 - i12);
        } else {
            tk0Var = null;
        }
        int i13 = vk0Var.f38630r;
        if (i10 >= i13 && i10 < vk0Var.f38631s) {
            tk0Var = (tk0) vk0Var.f38625a.get(i10 - i13);
        }
        if (tk0Var != null) {
            if (uk0Var.e == tk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (tk0Var == vk0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (vk0Var.J.get(tk0Var.f37858c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            uk0Var.e = tk0Var;
            uk0Var.f38272a.setText(tk0Var.f37859f);
            if (i10 != vk0Var.F - 1) {
                z13 = true;
            }
            uk0Var.d = z13;
            uk0Var.f38273b.a(z11, z10);
            uk0Var.f38274c.a(z12, z10);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f37488c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, e6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                }
            } else {
                org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, e6Var);
                g2Var.d = 61;
                g2Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var));
                m4Var = g2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f38273b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19112g7, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19130h7, e6Var));
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
            frameLayout.addView(radioButton, w7.y5.d(22, 22.0f, i20, f7, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(context, 24, e6Var);
            frameLayout.f38274c = ppVar;
            int i22 = org.telegram.ui.ActionBar.i6.f19057d6;
            ppVar.b(-1, i22, org.telegram.ui.ActionBar.i6.f19186k7);
            ppVar.setDrawUnchecked(false);
            ppVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(ppVar, w7.y5.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            ppVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f38272a = textView;
            org.telegram.messenger.qk.n(org.telegram.ui.ActionBar.i6.G6, e6Var, textView, 1, 16.0f);
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
            frameLayout.addView(textView, w7.y5.d(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i22, e6Var));
            m4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }
}
