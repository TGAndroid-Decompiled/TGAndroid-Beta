package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends org.telegram.ui.Components.ll0 {
    public final Context f40255c;
    public final ai0 d;

    public zh0(ai0 ai0Var, Context context) {
        this.d = ai0Var;
        this.f40255c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42697a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ai0 ai0Var = this.d;
        if (ai0Var.Q != b10 && ai0Var.f31896x != b10) {
            if (b10 < ai0Var.f31897y || b10 >= ai0Var.E) {
                if ((b10 < ai0Var.H || b10 >= ai0Var.I) && b10 != ai0Var.N) {
                    if (b10 >= ai0Var.U && b10 < ai0Var.V) {
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
        ai0 ai0Var = this.d;
        if (i10 == ai0Var.f31890r) {
            return 0;
        }
        if (i10 == ai0Var.f31892s || i10 == ai0Var.L || i10 == ai0Var.S || i10 == ai0Var.P) {
            return 1;
        }
        if (i10 == ai0Var.v) {
            return 2;
        }
        if (i10 == ai0Var.f31896x) {
            return 3;
        }
        if (i10 != ai0Var.f31895w && i10 != ai0Var.J && i10 != ai0Var.M && i10 != ai0Var.R && i10 != ai0Var.T) {
            if (i10 < ai0Var.f31897y || i10 >= ai0Var.E) {
                if (i10 >= ai0Var.H && i10 < ai0Var.I) {
                    return 5;
                }
                if (i10 == ai0Var.F) {
                    return 6;
                }
                if (i10 == ai0Var.K) {
                    return 7;
                }
                if (i10 == ai0Var.N) {
                    return 8;
                }
                if (i10 == ai0Var.O) {
                    return 9;
                }
                if (i10 != ai0Var.Q) {
                    if (i10 < ai0Var.U || i10 >= ai0Var.V) {
                        if (i10 != ai0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.v80 v80Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        ai0 ai0Var = this.d;
        Context context = this.f40255c;
        switch (i10) {
            case 1:
                v80Var = new org.telegram.ui.Cells.l4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.v80 v80Var2 = new org.telegram.ui.Components.v80(this.f40255c, ai0Var, null, true, ai0Var.h);
                v80Var2.setPermanent(true);
                v80Var2.setDelegate(new yh0(this, v80Var2));
                v80Var = v80Var2;
                break;
            case 3:
                f6Var = ((org.telegram.ui.ActionBar.o2) ai0Var).resourceProvider;
                v80Var = new org.telegram.ui.Cells.f2(context, 64, f6Var);
                break;
            case 4:
                v80Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 5:
                v80Var = new xh0(ai0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(9);
                t00Var.f27976w = false;
                v80Var = t00Var;
                break;
            case 7:
                v80Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19082p7, false));
                v80Var = eaVar;
                break;
            case 9:
                v80Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                v80Var = new org.telegram.ui.Cells.a5(8, 6, this.f40255c, null, false);
                break;
            case 11:
                f6Var2 = ((org.telegram.ui.ActionBar.o2) ai0Var).resourceProvider;
                v80Var = new org.telegram.ui.Cells.e9(context, f6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new sh0(context), w7.x5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18919g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ai0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                v80Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(v80Var, v80Var, -1, -2);
    }
}
