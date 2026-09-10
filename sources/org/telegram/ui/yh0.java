package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yh0 extends org.telegram.ui.Components.ul0 {
    public final Context f39002c;
    public final zh0 d;

    public yh0(zh0 zh0Var, Context context) {
        this.d = zh0Var;
        this.f39002c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zh0 zh0Var = this.d;
        if (zh0Var.Q != b10 && zh0Var.f39349x != b10) {
            if (b10 < zh0Var.f39350y || b10 >= zh0Var.E) {
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
        if (i10 == zh0Var.f39343r) {
            return 0;
        }
        if (i10 == zh0Var.f39345s || i10 == zh0Var.L || i10 == zh0Var.S || i10 == zh0Var.P) {
            return 1;
        }
        if (i10 == zh0Var.v) {
            return 2;
        }
        if (i10 == zh0Var.f39349x) {
            return 3;
        }
        if (i10 != zh0Var.f39348w && i10 != zh0Var.J && i10 != zh0Var.M && i10 != zh0Var.R && i10 != zh0Var.T) {
            if (i10 < zh0Var.f39350y || i10 >= zh0Var.E) {
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
        org.telegram.ui.Components.f90 f90Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        zh0 zh0Var = this.d;
        Context context = this.f39002c;
        switch (i10) {
            case 1:
                f90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.f90 f90Var2 = new org.telegram.ui.Components.f90(this.f39002c, zh0Var, null, true, zh0Var.h);
                f90Var2.setPermanent(true);
                f90Var2.setDelegate(new xh0(this, f90Var2));
                f90Var = f90Var2;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.p2) zh0Var).resourceProvider;
                f90Var = new org.telegram.ui.Cells.f2(context, 64, f6Var);
                break;
            case 4:
                f90Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 5:
                f90Var = new wh0(zh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(9);
                a10Var.f21345w = false;
                f90Var = a10Var;
                break;
            case 7:
                f90Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 8:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
                f90Var = gaVar;
                break;
            case 9:
                f90Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 10:
                f90Var = new org.telegram.ui.Cells.b5(8, 6, this.f39002c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) zh0Var).resourceProvider;
                f90Var = new org.telegram.ui.Cells.f9(context, f6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new rh0(context), w7.a6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17985g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (zh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                f90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(f90Var, f90Var, -1, -2);
    }
}
