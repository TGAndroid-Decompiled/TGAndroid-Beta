package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yh0 extends org.telegram.ui.Components.vl0 {
    public final Context f39825c;
    public final zh0 d;

    public yh0(zh0 zh0Var, Context context) {
        this.d = zh0Var;
        this.f39825c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42929a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zh0 zh0Var = this.d;
        if (zh0Var.Q != b10 && zh0Var.f40173x != b10) {
            if (b10 < zh0Var.f40174y || b10 >= zh0Var.E) {
                if ((b10 < zh0Var.H || b10 >= zh0Var.I) && b10 != zh0Var.N) {
                    if (b10 >= zh0Var.U && b10 < zh0Var.V) {
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
        zh0 zh0Var = this.d;
        if (i10 == zh0Var.f40167r) {
            return 0;
        }
        if (i10 == zh0Var.f40169s || i10 == zh0Var.L || i10 == zh0Var.S || i10 == zh0Var.P) {
            return 1;
        }
        if (i10 == zh0Var.v) {
            return 2;
        }
        if (i10 == zh0Var.f40173x) {
            return 3;
        }
        if (i10 != zh0Var.f40172w && i10 != zh0Var.J && i10 != zh0Var.M && i10 != zh0Var.R && i10 != zh0Var.T) {
            if (i10 < zh0Var.f40174y || i10 >= zh0Var.E) {
                if (i10 >= zh0Var.H && i10 < zh0Var.I) {
                    return 5;
                }
                if (i10 == zh0Var.F) {
                    return 6;
                }
                if (i10 == zh0Var.K) {
                    return 7;
                }
                if (i10 == zh0Var.N) {
                    return 8;
                }
                if (i10 == zh0Var.O) {
                    return 9;
                }
                if (i10 != zh0Var.Q) {
                    if (i10 < zh0Var.U || i10 >= zh0Var.V) {
                        if (i10 != zh0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.e90 e90Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i11;
        zh0 zh0Var = this.d;
        Context context = this.f39825c;
        switch (i10) {
            case 1:
                e90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.e90 e90Var2 = new org.telegram.ui.Components.e90(this.f39825c, zh0Var, null, true, zh0Var.h);
                e90Var2.setPermanent(true);
                e90Var2.setDelegate(new xh0(this, e90Var2));
                e90Var = e90Var2;
                break;
            case 3:
                e6Var = ((org.telegram.ui.ActionBar.n2) zh0Var).resourceProvider;
                e90Var = new org.telegram.ui.Cells.g2(context, 64, e6Var);
                break;
            case 4:
                e90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                e90Var = new wh0(zh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(9);
                t00Var.f28272w = false;
                e90Var = t00Var;
                break;
            case 7:
                e90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19283p7, false));
                e90Var = eaVar;
                break;
            case 9:
                e90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                e90Var = new org.telegram.ui.Cells.b5(8, 6, this.f39825c, null, false);
                break;
            case 11:
                e6Var2 = ((org.telegram.ui.ActionBar.n2) zh0Var).resourceProvider;
                e90Var = new org.telegram.ui.Cells.e9(context, e6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new rh0(context), w7.y5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19119g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (zh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                e90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(e90Var, e90Var, -1, -2);
    }
}
