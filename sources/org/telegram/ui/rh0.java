package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rh0 extends org.telegram.ui.Components.vl0 {
    public final Context f37337c;
    public final sh0 d;

    public rh0(sh0 sh0Var, Context context) {
        this.d = sh0Var;
        this.f37337c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42961a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        sh0 sh0Var = this.d;
        if (sh0Var.Q != b10 && sh0Var.f37796x != b10) {
            if (b10 < sh0Var.f37797y || b10 >= sh0Var.E) {
                if ((b10 < sh0Var.H || b10 >= sh0Var.I) && b10 != sh0Var.N) {
                    if (b10 >= sh0Var.U && b10 < sh0Var.V) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.X;
    }

    @Override
    public final int j(int i10) {
        sh0 sh0Var = this.d;
        if (i10 == sh0Var.f37790r) {
            return 0;
        }
        if (i10 == sh0Var.f37792s || i10 == sh0Var.L || i10 == sh0Var.S || i10 == sh0Var.P) {
            return 1;
        }
        if (i10 == sh0Var.v) {
            return 2;
        }
        if (i10 == sh0Var.f37796x) {
            return 3;
        }
        if (i10 != sh0Var.f37795w && i10 != sh0Var.J && i10 != sh0Var.M && i10 != sh0Var.R && i10 != sh0Var.T) {
            if (i10 < sh0Var.f37797y || i10 >= sh0Var.E) {
                if (i10 >= sh0Var.H && i10 < sh0Var.I) {
                    return 5;
                }
                if (i10 == sh0Var.F) {
                    return 6;
                }
                if (i10 == sh0Var.K) {
                    return 7;
                }
                if (i10 == sh0Var.N) {
                    return 8;
                }
                if (i10 == sh0Var.O) {
                    return 9;
                }
                if (i10 != sh0Var.Q) {
                    if (i10 < sh0Var.U || i10 >= sh0Var.V) {
                        if (i10 != sh0Var.G) {
                            return 1;
                        }
                        return 11;
                    }
                    return 10;
                }
                return 10;
            }
            return 5;
        }
        return 4;
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.g90 g90Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        sh0 sh0Var = this.d;
        Context context = this.f37337c;
        switch (i10) {
            case 1:
                g90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.g90 g90Var2 = new org.telegram.ui.Components.g90(this.f37337c, sh0Var, null, true, sh0Var.h);
                g90Var2.setPermanent(true);
                g90Var2.setDelegate(new qh0(this, g90Var2));
                g90Var = g90Var2;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.m2) sh0Var).resourceProvider;
                g90Var = new org.telegram.ui.Cells.g2(context, 64, d6Var);
                break;
            case 4:
                g90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                g90Var = new ph0(sh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(9);
                u00Var.f28662w = false;
                g90Var = u00Var;
                break;
            case 7:
                g90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                g90Var = eaVar;
                break;
            case 9:
                g90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                g90Var = new org.telegram.ui.Cells.b5(8, 6, this.f37337c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.m2) sh0Var).resourceProvider;
                g90Var = new org.telegram.ui.Cells.e9(context, d6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new kh0(context), w7.y5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19117g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (sh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                g90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(g90Var, g90Var, -1, -2);
    }
}
