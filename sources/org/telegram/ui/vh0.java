package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vh0 extends org.telegram.ui.Components.yl0 {
    public final Context f41751c;
    public final wh0 d;

    public vh0(wh0 wh0Var, Context context) {
        this.d = wh0Var;
        this.f41751c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46523a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        wh0 wh0Var = this.d;
        if (wh0Var.Q != b10 && wh0Var.f42494x != b10) {
            if (b10 < wh0Var.f42495y || b10 >= wh0Var.E) {
                if ((b10 < wh0Var.H || b10 >= wh0Var.I) && b10 != wh0Var.N) {
                    if (b10 >= wh0Var.U && b10 < wh0Var.V) {
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
        wh0 wh0Var = this.d;
        if (i10 == wh0Var.f42488r) {
            return 0;
        }
        if (i10 == wh0Var.f42490s || i10 == wh0Var.L || i10 == wh0Var.S || i10 == wh0Var.P) {
            return 1;
        }
        if (i10 == wh0Var.v) {
            return 2;
        }
        if (i10 == wh0Var.f42494x) {
            return 3;
        }
        if (i10 != wh0Var.f42493w && i10 != wh0Var.J && i10 != wh0Var.M && i10 != wh0Var.R && i10 != wh0Var.T) {
            if (i10 < wh0Var.f42495y || i10 >= wh0Var.E) {
                if (i10 >= wh0Var.H && i10 < wh0Var.I) {
                    return 5;
                }
                if (i10 == wh0Var.F) {
                    return 6;
                }
                if (i10 == wh0Var.K) {
                    return 7;
                }
                if (i10 == wh0Var.N) {
                    return 8;
                }
                if (i10 == wh0Var.O) {
                    return 9;
                }
                if (i10 != wh0Var.Q) {
                    if (i10 < wh0Var.U || i10 >= wh0Var.V) {
                        if (i10 != wh0Var.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vh0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.j90 j90Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        wh0 wh0Var = this.d;
        Context context = this.f41751c;
        switch (i10) {
            case 1:
                j90Var = new org.telegram.ui.Cells.m4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.j90 j90Var2 = new org.telegram.ui.Components.j90(this.f41751c, wh0Var, null, true, wh0Var.h);
                j90Var2.setPermanent(true);
                j90Var2.setDelegate(new uh0(this, j90Var2));
                j90Var = j90Var2;
                break;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.n2) wh0Var).resourceProvider;
                j90Var = new org.telegram.ui.Cells.g2(context, 64, d6Var);
                break;
            case 4:
                j90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 5:
                j90Var = new th0(wh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
                w00Var.setIsSingleCell(true);
                w00Var.setViewType(9);
                w00Var.f32416w = false;
                j90Var = w00Var;
                break;
            case 7:
                j90Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21039p7, false));
                j90Var = eaVar;
                break;
            case 9:
                j90Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 10:
                j90Var = new org.telegram.ui.Cells.b5(8, 6, this.f41751c, null, false);
                break;
            case 11:
                d6Var2 = ((org.telegram.ui.ActionBar.n2) wh0Var).resourceProvider;
                j90Var = new org.telegram.ui.Cells.e9(context, d6Var2);
                break;
            default:
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(new oh0(context), w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20875g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (wh0Var.h) {
                    i11 = R.string.PrimaryLinkHelpChannel;
                } else {
                    i11 = R.string.PrimaryLinkHelp;
                }
                textView.setText(LocaleController.getString(i11));
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                frameLayout.setTag(-33024);
                j90Var = frameLayout;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(j90Var, j90Var, -1, -2);
    }
}
