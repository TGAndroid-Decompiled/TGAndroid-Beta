package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh0 extends org.telegram.ui.Components.kl0 {
    public final Context f39629c;
    public final yh0 d;

    public xh0(yh0 yh0Var, Context context) {
        this.d = yh0Var;
        this.f39629c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42671a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        yh0 yh0Var = this.d;
        if (yh0Var.Q != b10 && yh0Var.f39879x != b10) {
            if (b10 < yh0Var.f39880y || b10 >= yh0Var.E) {
                if ((b10 < yh0Var.H || b10 >= yh0Var.I) && b10 != yh0Var.N) {
                    if (b10 >= yh0Var.U && b10 < yh0Var.V) {
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
        yh0 yh0Var = this.d;
        if (i10 == yh0Var.f39873r) {
            return 0;
        }
        if (i10 == yh0Var.f39875s || i10 == yh0Var.L || i10 == yh0Var.S || i10 == yh0Var.P) {
            return 1;
        }
        if (i10 == yh0Var.v) {
            return 2;
        }
        if (i10 == yh0Var.f39879x) {
            return 3;
        }
        if (i10 != yh0Var.f39878w && i10 != yh0Var.J && i10 != yh0Var.M && i10 != yh0Var.R && i10 != yh0Var.T) {
            if (i10 < yh0Var.f39880y || i10 >= yh0Var.E) {
                if (i10 >= yh0Var.H && i10 < yh0Var.I) {
                    return 5;
                }
                if (i10 == yh0Var.F) {
                    return 6;
                }
                if (i10 == yh0Var.K) {
                    return 7;
                }
                if (i10 == yh0Var.N) {
                    return 8;
                }
                if (i10 == yh0Var.O) {
                    return 9;
                }
                if (i10 != yh0Var.Q) {
                    if (i10 < yh0Var.U || i10 >= yh0Var.V) {
                        if (i10 != yh0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.v80 v80Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i11;
        yh0 yh0Var = this.d;
        Context context = this.f39629c;
        switch (i10) {
            case 1:
                v80Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.v80 v80Var2 = new org.telegram.ui.Components.v80(this.f39629c, yh0Var, null, true, yh0Var.h);
                v80Var2.setPermanent(true);
                v80Var2.setDelegate(new wh0(this, v80Var2));
                v80Var = v80Var2;
                break;
            case 3:
                e6Var = ((org.telegram.ui.ActionBar.n2) yh0Var).resourceProvider;
                v80Var = new org.telegram.ui.Cells.f2(context, 64, e6Var);
                break;
            case 4:
                v80Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 5:
                v80Var = new vh0(yh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(9);
                t00Var.f28015w = false;
                v80Var = t00Var;
                break;
            case 7:
                v80Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19053p7, false));
                v80Var = eaVar;
                break;
            case 9:
                v80Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                v80Var = new org.telegram.ui.Cells.b5(8, 6, this.f39629c, null, false);
                break;
            case 11:
                e6Var2 = ((org.telegram.ui.ActionBar.n2) yh0Var).resourceProvider;
                v80Var = new org.telegram.ui.Cells.e9(context, e6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new qh0(context), w7.x5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18891g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (yh0Var.h) {
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
