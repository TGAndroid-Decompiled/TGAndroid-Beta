package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh0 extends org.telegram.ui.Components.rm0 {
    public final Context f44073c;
    public final yh0 d;

    public xh0(yh0 yh0Var, Context context) {
        this.d = yh0Var;
        this.f44073c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        yh0 yh0Var = this.d;
        if (yh0Var.Q != b10 && yh0Var.f44431x != b10) {
            if (b10 < yh0Var.f44432y || b10 >= yh0Var.E) {
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
        if (i10 == yh0Var.f44425r) {
            return 0;
        }
        if (i10 == yh0Var.f44427s || i10 == yh0Var.L || i10 == yh0Var.S || i10 == yh0Var.P) {
            return 1;
        }
        if (i10 == yh0Var.v) {
            return 2;
        }
        if (i10 == yh0Var.f44431x) {
            return 3;
        }
        if (i10 != yh0Var.f44430w && i10 != yh0Var.J && i10 != yh0Var.M && i10 != yh0Var.R && i10 != yh0Var.T) {
            if (i10 < yh0Var.f44432y || i10 >= yh0Var.E) {
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
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xh0.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.y90 y90Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        yh0 yh0Var = this.d;
        Context context = this.f44073c;
        switch (i10) {
            case 1:
                y90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.y90 y90Var2 = new org.telegram.ui.Components.y90(this.f44073c, yh0Var, null, true, yh0Var.h);
                y90Var2.setPermanent(true);
                y90Var2.setDelegate(new wh0(this, y90Var2));
                y90Var = y90Var2;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.m2) yh0Var).resourceProvider;
                y90Var = new org.telegram.ui.Cells.g2(context, 64, d6Var);
                break;
            case 4:
                y90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                y90Var = new vh0(yh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
                k10Var.setIsSingleCell(true);
                k10Var.setViewType(9);
                k10Var.f27811w = false;
                y90Var = k10Var;
                break;
            case 7:
                y90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
                caVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                caVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21007p7, false));
                y90Var = caVar;
                break;
            case 9:
                y90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                y90Var = new org.telegram.ui.Cells.b5(8, 6, this.f44073c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.m2) yh0Var).resourceProvider;
                y90Var = new org.telegram.ui.Cells.e9(context, d6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new qh0(context), w7.x5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20845g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (yh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.x5.a(-2.0f, 52.0f, 143.0f, 52.0f, 18.0f, -1, 51));
                frameLayout.setTag(-33024);
                y90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(y90Var, y90Var, -1, -2);
    }
}
