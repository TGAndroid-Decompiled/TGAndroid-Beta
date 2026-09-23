package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sh0 extends org.telegram.ui.Components.ll0 {
    public final Context f37305c;
    public final th0 d;

    public sh0(th0 th0Var, Context context) {
        this.d = th0Var;
        this.f37305c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        th0 th0Var = this.d;
        if (th0Var.Q != b10 && th0Var.f37682x != b10) {
            if (b10 < th0Var.f37683y || b10 >= th0Var.E) {
                if ((b10 < th0Var.H || b10 >= th0Var.I) && b10 != th0Var.N) {
                    if (b10 >= th0Var.U && b10 < th0Var.V) {
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
        th0 th0Var = this.d;
        if (i10 == th0Var.f37676r) {
            return 0;
        }
        if (i10 == th0Var.f37678s || i10 == th0Var.L || i10 == th0Var.S || i10 == th0Var.P) {
            return 1;
        }
        if (i10 == th0Var.v) {
            return 2;
        }
        if (i10 == th0Var.f37682x) {
            return 3;
        }
        if (i10 != th0Var.f37681w && i10 != th0Var.J && i10 != th0Var.M && i10 != th0Var.R && i10 != th0Var.T) {
            if (i10 < th0Var.f37683y || i10 >= th0Var.E) {
                if (i10 >= th0Var.H && i10 < th0Var.I) {
                    return 5;
                }
                if (i10 == th0Var.F) {
                    return 6;
                }
                if (i10 == th0Var.K) {
                    return 7;
                }
                if (i10 == th0Var.N) {
                    return 8;
                }
                if (i10 == th0Var.O) {
                    return 9;
                }
                if (i10 != th0Var.Q) {
                    if (i10 < th0Var.U || i10 >= th0Var.V) {
                        if (i10 != th0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.w80 w80Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        th0 th0Var = this.d;
        Context context = this.f37305c;
        switch (i10) {
            case 1:
                w80Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.w80 w80Var2 = new org.telegram.ui.Components.w80(this.f37305c, th0Var, null, true, th0Var.h);
                w80Var2.setPermanent(true);
                w80Var2.setDelegate(new rh0(this, w80Var2));
                w80Var = w80Var2;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.n2) th0Var).resourceProvider;
                w80Var = new org.telegram.ui.Cells.f2(context, 64, d6Var);
                break;
            case 4:
                w80Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 5:
                w80Var = new qh0(th0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(9);
                u00Var.f28353w = false;
                w80Var = u00Var;
                break;
            case 7:
                w80Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 8:
                org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
                faVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                faVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
                w80Var = faVar;
                break;
            case 9:
                w80Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 10:
                w80Var = new org.telegram.ui.Cells.b5(8, 6, this.f37305c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.n2) th0Var).resourceProvider;
                w80Var = new org.telegram.ui.Cells.f9(context, d6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new lh0(context), w7.x5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18846g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (th0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                w80Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(w80Var, w80Var, -1, -2);
    }
}
